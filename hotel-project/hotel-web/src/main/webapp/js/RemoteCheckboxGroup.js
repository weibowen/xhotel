// ----------------------继承了CheckboxGroup使其能够取 remote
// 数据源开始----------------------//
Ext.onReady(function() {
	Ext.namespace("Ext.ux");
	Ext.define("Ext.ux.RemoteCheckboxGroup", {
		extend : 'Ext.form.CheckboxGroup',
		alias : "remotecheckboxgroup",
		/*initComponent : function() {
			this.callParent(arguments);// 我最喜欢这个了，比以前少写多少东西？
		},*/
		url : '',
		boxLabel : '',
		inputValue : '',
		setValue : function(val) {
			if (val.split) {
				val = val.split(',');
			}
			this.reset();
			for (var i = 0; i < val.length; i++) {
				this.items.each(function(c) {
							if (c.inputValue == val[i]) {
								c.setValue(true);
							}
						});
			}
		},
		reset : function() {
			this.items.each(function(c) {
						c.setValue(false);
					});
		},
		getValue : function() {
			var val = [];
			this.items.each(function(c) {
						if (c.getValue() == true)
							val.push(c.inputValue);
					});
			return val.join(',');
		},
		onRender : function(ct, position) {
			var items = [];
			if (!this.items) { // 如果没有指定就从URL获取
				Ext.Ajax.request({
							url : this.url,
							scope : this,
							async : false,
							success : function(response) {
								var data = Ext.util.JSON
										.decode(response.responseText);
								var Items2 = this.items;
								if (this.panel) {
									var columns = this.panel.items;
									if (columns) {
										for (var i = 0; i < columns.items.length; i++) {
											column = columns.items[i];
											column.removeAll();
										}
										Items2.clear();
									}
								}
								for (var i = 0; i < data.length; i++) {
									var d = data[i];
									var chk = {
										boxLabel : d[this.boxLabel],
										name : this.name,
										inputValue : d[this.inputValue]
									};
									items.push(chk);
								}
							}
						});
				this.items = items;
			}
			/*Ext.ux.RemoteCheckboxGroup.superclass.onRender.call(this, ct,
					position);*/
		}
	});
		// Ext.reg('remotecheckboxgroup', Ext.ux.RemoteCheckboxGroup);
});