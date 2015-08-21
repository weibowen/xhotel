Ext.onReady(function() {
	// Ext.
	Ext.getCmp();

	// Ext.
	var tab = Ext.create('Ext.tab.Panel', {
		region : 'center',
		margins : '3,3,3,0',
		activeTab : 0,
		id : 'mainTab',
		items : [ {
			title : '首页',
			closable : false,
			html : '<iframe' + ' frameborder="0" width="100%" height="100%"'
					+ '  src="main.jsp"/>'
		} ]

	});

	var store = Ext.create('Ext.data.TreeStore', {
		proxy : {
			type : 'ajax',
			api : {
				read : 'menu.do'
			}
		},

		writer : {
			type : 'json',
			writeAllFields : true,
			encode : false
		},
		autoSync : true
	});

	function tree_event(node, event) {
		var nodeId = event.data.id;
		var nodeURL = event.data.url;
		// console.log("nodeId:"+nodeId);
		var panel = tab.getComponent(nodeId);
		// 如果没有则tab.add一个panel
		if (!panel && event.data.leaf) {
			tab.add({
				title : event.data.text,
				id : nodeId,
				html : '<iframe '
						+ 'frameborder="0" width="100%" height="100%" '
						+ 'src="' + nodeURL + '.jsp"></iframe>',
				closable : true
			});
		}
		tab.setActiveTab(nodeId);// 设置panel标签页作为当前活动标签页
		tab.doLayout();// 强制容器的布局管理器重新计算布局

	}
	;

	var myTree = Ext.create('Ext.tree.Panel', {
		// title : 'Simple Tree',
		width : '100%',
		height : '100%',
		store : store,
		rootVisible : false,
		listeners : {
			'itemclick' : tree_event
		},
		renderTo : Ext.getBody()
	});
	var nav = Ext.create('Ext.panel.Panel', {
		title : '导航栏',
		region : 'west',
		split : true,
		width : 200,
		collapsible : true,// 允许伸缩
		margins : '3,0,3,3',
		cmargins : '3,3,3,',
		items : [ myTree ]
	});
	var mainWindow = Ext.create('Ext.Window', {
		// title : '管理系统',
		width : '99.5%',
		height : '99.5%',
		closable : false,
		//   : false,
		// plain : true,
		draggable : false,
		layout : 'border',
		// closeAction : 'hide',
		items : [ {
			region : 'north',
			xtype : 'component',
			cls : 'appBanner',
			padding : 10,
			height : 80,
			html : '<img src="logo.jpg" width="90" height="50" />创新，改变世界'
		}, nav, tab ]
	}).show();

	var task = {
		run : function() {
			Ext.Ajax.request({
				url : "url",
				success : function(res) {
					// 请求响应
				},
				failure : function(res) {
					Ext.create('widget.uxNotification', {
						title : '通知',
						position : 't',
						manager : mainWindow,
						// cls : 'ux-notification-error',
						iconCls : 'ux-notification-icon-error',
						html : '监控告警'
					}).show();
				}
			});
		},
		interval : 10000000
	};
	Ext.TaskManager.start(task);
});
