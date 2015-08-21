Ext.require([ 'Ext.data.*', 'Ext.grid.*' ]);

Ext.define('Person', {
	extend : 'Ext.data.Model',
	fields : [ {
		name : 'id',
		type : 'int',
		useNull : true
	}, 'email', 'first', 'last' ],
	validations : [ {
		type : 'length',
		field : 'email',
		min : 1
	}, {
		type : 'length',
		field : 'first',
		min : 1
	}, {
		type : 'length',
		field : 'last',
		min : 1
	} ]
});

Ext.onReady(function() {
	var store = Ext.create('Ext.data.Store', {
		model : 'Person',
		proxy : {
			type : 'rest',
			url : 'app.php/users',
			reader : {
				type : 'json',
				rootProperty : 'data'
			},
			writer : {
				type : 'json'
			}
		},
		listeners : {
			write : function(store, operation) {
				var record = operation.getRecords()[0], name = Ext.String
						.capitalize(operation.action), verb;

				if (name == 'Destroy') {
					verb = 'Destroyed';
				} else {
					verb = name + 'd';
				}
				Ext.example.msg(name, Ext.String.format("{0} user: {1}", verb,
						record.getId()));

			}
		}
	});

	var rowEditing = Ext.create('Ext.grid.plugin.RowEditing', {
		listeners : {
			cancelEdit : function(rowEditing, context) {
				// Canceling editing of a locally added, unsaved record: remove
				// it
				if (context.record.phantom) {
					store.remove(context.record);
				}
			}
		}
	});

	var grid = Ext.create('Ext.grid.Panel', {
		// renderTo : "formArea",
		plugins : [ rowEditing ],
		store : store,
		defaults : {
			width : 70
		},
		columns : [ {
			text : '订单号',
			width : 70,
			sortable : true,
			dataIndex : 'id',
			renderer : function(v, meta, rec) {
				return rec.phantom ? '' : v;
			}
		}, {
			text : '宾客姓名',
			width : 80,
			sortable : true,
			dataIndex : 'email',
			field : {
				xtype : 'textfield'
			}
		}, {
			text : '宾客手机',
			width : 80,
		}, {
			text : '订单状态',
			width : 80,
		}, {
			text : '房型',
			width : 70,
		}, {
			text : '房号',
			width : 70,
		}, {
			text : '房价',
			width : 70,
		}, {
			text : '预付款',
			width : 70,
		}, {
			text : '消费总额',
			width : 80,
		}, {
			text : '余额',
			width : 70,
		}, {
			text : '入住日期',
			//width : 90,
		}, {
			text : '离店日期',
//			/width : 90,
		} ],
		dockedItems : [ {
			xtype : 'toolbar',
			items : [
					{
						text : '订单详情',
						handler : function() {
							// empty record
							store.insert(0, new Person());
							rowEditing.startEdit(0, 0);
						}
					},
					'-',
					{
						itemId : 'delete',
						text : '结账退房',
						handler : function() {
							var selection = grid.getView().getSelectionModel()
									.getSelection()[0];
							if (selection) {
								store.remove(selection);
							}
						}
					},
					{
						text : '换房',
						handler : function() {
							var selection = grid.getView().getSelectionModel()
									.getSelection()[0];
							if (selection) {
								store.remove(selection);
							}
						}
					} ]
		} ]
	});
	grid.getSelectionModel().on('selectionchange',
			function(selModel, selections) {
				grid.down('#delete').setDisabled(selections.length === 0);
			});

	Ext.create("Ext.form.Panel", {
		title : "订单查询",
		id : "CreateUser",
		margin : 10,
		renderTo : 'formArea',
		border : true,
		defaultType : 'textfield',
		allowBlank : false,
		defaults : {
			margin : 10,
			defaultType : 'textfield',
			layout : {
				type : 'table',
				columns : 3,
				tableAttrs : {
					style : {
						width : '100%'
					}
				},
				tdAttrs : {
					style : 'padding: 5 0 0 5;'
				}
			},
		},
		items : [ {
			xtype : 'fieldset',
			title : '查询条件',
			items : [ {
				fieldLabel : "姓名"
			}, {
				fieldLabel : "房号"
			}, {
				fieldLabel : "客人来源"
			}, {
				fieldLabel : "订单状态"
			}, {
				fieldLabel : "开始时间"
			}, {
				fieldLabel : "结束时间"
			}, {
				xtype : "button",
				text : "查询"
			} ]
		}, {
			xtype : 'fieldset',
			title : '查询结果',
			items : [ grid ]
		} ],

	});
});