Ext.onReady(function() {
	Ext.create("Ext.form.Panel", {
		title : "消费",
		id : "CreateUser",
		margin : 10,
		style : "padding:5px",
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
				tdAttrs : {
					style : "padding:5px",
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
				fieldLabel : "项目"
			}, {
				fieldLabel : "金额"
			} ]
		} ],
		buttons : [ {
			text : '确定'
		} ]

	});
});