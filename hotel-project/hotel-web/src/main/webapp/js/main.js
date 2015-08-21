Ext.onReady(function() {
	var centerPanel = Ext.create("Ext.panel.Panel", {
		title : "<center>查询结果</center>",
		region : 'center',
		bodyPadding : "5",
		border : true,
		autoScroll : true,
		layout : {
			type : 'table',
			columns : 5,
			tableAttrs : {
				style : {
					width : '100%'
				}
			},
			tdAttrs : {
				style : 'padding: 5px 5px;'
			}
		// pack : 'center'
		},
		defaultType : "button",
		defaults : {
			frame : true,
			width : 105,
			height : 100,
			bodyPadding : '15 20',
			border : true
		},
		items : [ {
			text : "1000<br/> 大床房<br/>空闲",
		}, {
			text : "1000<br/> 大床房<br/>空闲",
		}, {
			text : "1000<br/> 大床房<br/>空闲",
		} ]
	});

	/*var panel = */Ext.create("Ext.form.FormPanel", {
		title : "<center>房间状态</center>",
		//width : 930,
		height : 450,
		margin : 10,
		layout : 'border',
		border : true,
		margin : 10,
		style: "padding:5px",
		bodyStyle : 'background:white; padding:10px;',
		items : [ {
			title : '<center>查询条件</center>',
			region : 'west',
			width : 220,
			xtype : 'panel',
			bodyPadding : "5",
			border : true,
			vertical : true,
			// split : true,
			split : {
				style : 'background:white;',
				width : 10
			},
			// collapsible : true, // 可折叠/展开
			items : [ {
				xtype : 'fieldset',
				title : '房间过滤',
				items : [ {
					xtype : "combobox",
					name : "Gender",
					editable : false,
					displayField : "Name",
					valueField : "Value",
					emptyText : "--请选择房型--",
					queryMode : "local",
				}, {
					xtype : "combobox",
					name : "Gender",
					editable : false,
					displayField : "Name",
					valueField : "Value",
					emptyText : "--请选择客源--",
					queryMode : "local",
				} ]
			}, {
				xtype : 'fieldset',
				title : '房间状态',
				id : 'HYKJBXX',
				items : [ {
					xtype : "checkboxgroup",
					columns : 1,
					items : [ {
						boxLabel : "空房",
						name : "Interest",
						inputValue : "1"
					}, {
						boxLabel : "在住",
						name : "Interest",
						inputValue : "2"
					}, {
						boxLabel : "预离店",
						name : "Interest",
						inputValue : "3"
					}, {
						boxLabel : "脏房",
						name : "Interest",
						inputValue : "4"
					}, {
						boxLabel : "维修房",
						name : "Interest",
						inputValue : "4"
					}, {
						boxLabel : "预到达",
						name : "Interest",
						inputValue : "4"
					} ]
				} ]
			} ],
			buttons : [ {
				text : "生成",
				handler : function() {
					console.log("1");
					// centerPanel.removeAll();
					centerPanel.add([ {
						text : '1000<br/> 标间<br/>在住',
						style : 'border:20px solid;border-color:red'
					}, {
						text : '1000<br/> 标间<br/>空闲'
					} ]);
				}
			}, {
				text : "查询",
				glyph:'xf002@FontAwesome',
				handler : function() {
					var form = this.up('form').getForm();
					console.log("=======" + form.getValues());
					Ext.getBody().mask("请稍等，正在处理中...");
					Ext.Ajax.request({
						url : 'RoomManagement/queryRoom.do',
						method : "GET",
						params : form.getValues(),
						success : function(response) {
							var result = Ext.decode(response.responseText);
							if (result.success) {
								Ext.Msg.alert('成功', '处理成功');
								form.reset();
							} else {
								Ext.Msg.alert('失败', result.Msg);
							}
							Ext.getBody().unmask();
						},
						failure : function(response,opts) {
							Ext.Msg.alert('异常', "状态码："+ response.status
									+"<br/>状态描述:"+response.statusText);
							Ext.getBody().unmask();
						}
					});
				}
			}, {
				text : "重置",
				handler : function() {
					window.location.reload();
				}
			} ]
		}, centerPanel ],
		renderTo : "searchArea"
	});

});
