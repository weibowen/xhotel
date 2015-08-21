Ext.onReady(function() {
	Ext.create("Ext.form.Panel", {
		title : "联房",
		id : "CreateUser",
		margin : 10,
		style : "padding:5px",
		renderTo : 'formArea',
		border : true,
		defaultType : 'textfield',
		allowBlank : false,
		defaults : {
			margin : 10,
		},
		layout : 'hbox',
		items : [ {
			xtype : 'fieldset',
			title : '目标房号',
			defaultType : 'radio',
			items : [ {
				boxLabel : '1001',
				name : 'fav-animal-dog',
				inputValue : 'dog'
			}, {
				boxLabel : '1002',
				name : 'fav-animal-dog',
				inputValue : 'cat'
			}, {
				checked : true,
				boxLabel : '1003',
				name : 'fav-animal-dog',
				inputValue : 'monkey'
			} ]
		}, {
			xtype : 'fieldset',
			title : '联房房号',
			defaultType : 'checkbox',
			items : [ {
				boxLabel : '1001',
				name : 'fav-animal-dog',
				inputValue : 'dog'
			}, {
				boxLabel : '1002',
				name : 'fav-animal-cat',
				inputValue : 'cat'
			}, {
				checked : true,
				boxLabel : '1003',
				name : 'fav-animal-monkey',
				inputValue : 'monkey'
			} ]
		} ],
		buttons : [ {
			text : '确定'
		} ]

	});
});