function getCombox(comboxName, comboxKey, name,allowBlank) {
	var store = Ext.create('Ext.data.Store', {
		proxy : {
			type : 'ajax',
			api : {
				read : 'Common/queryComboxStore.do?comboxKey=' + comboxKey
			}
		},
		fields : [ 'paramCode', 'paramValue' ],
		autoLoad : true
	});

	var combox = Ext.create('Ext.form.ComboBox', {
		fieldLabel : comboxName,
		store : store,
		name :name,
		displayField : 'paramCode',
		valueField : 'paramValue',
		queryMode : 'local',
		forceSelection : true,
		allowBlank : undefined == allowBlank ? false : true,
		autoSelect : true
	});
	return combox;
}

function setDBDate(id) {
	Ext.Ajax.request({
		url : 'getDBDate.do',
		method : 'GET',
		success : function(response, options) {
			Ext.getCmp(id).setValue(response.responseText);
		},
		failure : function(response, options) {
		}
	});
}
function getDBDate() {
	Ext.Ajax.request({
		url : 'getDBDate.do',
		method : 'GET',
		success : function(response, options) {
			return response.responseText;
		},
		failure : function(response, options) {
		}
	});
}
function getSelectedTimeDate(H, M, S, MS) {
	var t = new Date();
	t.setHours(undefined == H ? 12 : H, undefined == M ? 0 : M,
			undefined == S ? 0 : S, undefined == MS ? 0 : MS);
	return t;
}

function getJSON(cmpId) {
	var fieldSetME = Ext.getCmp(cmpId);
	var recordData = {};
	fieldSetME.items.each(function(fsItem) {
				var k = fsItem.getName();
				var v = fsItem.getValue();
				recordData["" + k + ""] = v;
			});
	return recordData;
}