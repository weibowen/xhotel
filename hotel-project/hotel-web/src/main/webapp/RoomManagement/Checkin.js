Ext.onReady(function() {
	Ext.create("Ext.form.Panel", {
		title : "登记信息",
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
			title : '客户信息',
			name : "infoCust",
			id : "infoCust",
			items : [ {
				name : "custName",
				fieldLabel : "姓名"
			}, getCombox("证件类型", "idType", "idType"), {
				name : "idCode",
				fieldLabel : "证件号码"
			}, {
				name : "sex",
				fieldLabel : "性别"
			}, {
				name : "birthday",
				fieldLabel : "生日",
				xtype : "datefield",
				format : 'Y-m-d',
			}, {
				name : "addr",
				fieldLabel : "地址"
			}, {
				name : "channel",
				fieldLabel : "客户来源"
			} ]
		}, {
			xtype : 'fieldset',
			title : '房间信息',
			items : [ {
				name : "roomType",
				fieldLabel : "房型"
			}, {
				fieldLabel : "房价",
				name : "discountPrice"
			}, {
				fieldLabel : "折扣",
				xtype : "numberfield",
				step : 0.1,
				maxValue : 1,
				minValue : 0,
				value : 1
			}, {
				id : "checkinDate",
				xtype : "datefield",
				format : 'Y-m-d H:i:s',
				fieldLabel : "入住日期"
			}, {
				xtype : "datefield",
				format : 'Y-m-d H:i:s',
				value : Ext.Date.add(getSelectedTimeDate(), Ext.Date.DAY, 2),
				minValue : new Date(),
				fieldLabel : "离店日期"
			}, {
				fieldLabel : "房间号",
				name : "roomCode"
			} ]
		} ],
		buttons : [ {
			xtype : "button",
			text : "办理入住",
			handler : function() {
				var form = this.up('form').getForm();
				console.log(getJSON("infoCust"));
				if (form.isValid()) {
					var recordData = {};
					recordData.infoCust = getJSON("infoCust");
					Ext.Ajax.request({
						url : 'Room/checkin.do',
						headers : {
							'Content-Type' : 'application/json; charset=utf-8'
						},
						method : 'POST',
						jsonData : recordData,
						success : function(response) {
							var result = Ext
									.decode(response.responseText);
							if (result.success) {
								Ext.msg.alert('成功', '处理成功');
								form.reset();
							} else {
								Ext.Msg.alert('失败', result.Msg);
							}
							Ext.getBody().unmask();
						},
						failure : function(response) {
							var result = Ext
									.decode(response.responseText);
							Ext.Msg.alert('失败', result.Msg);
							Ext.getBody().unmask();
						}
					});
				} else {
					Ext.Msg.alert('警告', '请把必填项填写完成后再保存提交');
				}
			}
		} ]
	});
	setDBDate("checkinDate");
});