Ext.onReady(function() {
	Ext.create("Ext.form.Panel", {
		title : "结账退房",
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
					style : "padding:1px",
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
				xtype : "button",
				text : "查询"
			} ]
		}, {
			xtype : 'fieldset',
			title : '客户信息',
			items : [ {
				fieldLabel : "姓名"
			}, {
				fieldLabel : "证件类型"
			}, {
				fieldLabel : "证件号码"
			}, {
				fieldLabel : "性别"
			}, {
				fieldLabel : "生日"
			}, {
				fieldLabel : "地址"
			}, {
				fieldLabel : "客户来源"
			} ]
		}, {
			xtype : 'fieldset',
			title : '房间信息',
			items : [ {
				fieldLabel : "房型"
			}, {
				fieldLabel : "房价"
			}, {
				fieldLabel : "折扣"
			}, {
				fieldLabel : "入住日期"
			}, {
				fieldLabel : "离店日期"
			}, {
				fieldLabel : "房间号"
			}, {
				fieldLabel : "挂账"
			} ]
		}, {
			xtype : 'fieldset',
			title : '费用信息',
			items : [ {
				fieldLabel : "已住天数"
			}, {
				fieldLabel : "房费总计"
			}, {
				fieldLabel : "其他费用总计"
			}, {
				fieldLabel : "已收押金"
			} ]
		} ],
		buttons : [ {
			text : '结账退房'
		}, {
			text : '退房挂账'
		} ]

	});
});