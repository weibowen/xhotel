Ext.onReady(function() {
	Ext.create("Ext.form.Panel", {
		title : "预定",
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
			title : '预订信息',
			items : [ {
				fieldLabel : "预订人"
			}, {
				fieldLabel : "预订手机"
			}, {
				fieldLabel : "保留时效"
			}, {
				fieldLabel : "下订时间"
			} , {
				fieldLabel : "备注"
			}]
		} ,{
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
			} , {
				fieldLabel : "离店日期"
			}, {
				fieldLabel : "房间号"
			}]
		}],
		buttons : [ {
			text : '确定'
		} ]

	});
});