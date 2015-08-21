function getSelectedDateStore(startDate, size) {
	Ext.define('Room', {
		extend : 'Ext.data.Model',
		fields : [ 'title', 'day1', 'day2', 'day3' ]
	});
	var roomStore = Ext.create('Ext.data.Store', {
		model : 'Room',
		data : [ {
			title : '001',
			day1 : '空闲',
			day2 : '预定',
			day3 : '预定',
		}, {
			title : '002',
			day1 : '空闲',
			day2 : '预定',
			day3 : '预定',
		}, {
			title : '003',
			day1 : '空闲',
			day2 : '预定',
			day3 : '预定',
		}, {
			title : '004',
			day1 : '空闲',
			day2 : '预定',
			day3 : '预定',
		} ]
	});
}
Ext.onReady(function() {
	Ext.define('Room', {
		extend : 'Ext.data.Model',
		fields : [ 'roomNo', 'day1', 'day2', 'day3' ]
	});
	var roomStore = Ext.create('Ext.data.Store', {
		model : 'Room',
		data : [ {
			roomNo : '001',
			day1 : '空闲',
			day2 : '预定',
			day3 : '预定',
		}, {
			roomNo : '002',
			day1 : '空闲',
			day2 : '预定',
			day3 : '预定',
		}, {
			roomNo : '003',
			day1 : '空闲',
			day2 : '预定',
			day3 : '预定',
		}, {
			roomNo : '004',
			day1 : '空闲',
			day2 : '预定',
			day3 : '预定',
		} ]
	});
	Ext.create('Ext.panel.Panel', {
		margin : 10,
		title : '查询条件',
		renderTo : "formArea",
		items : [
				{
					id : "startDate",
					xtype : "datefield",
					value : new Date(),
					format : 'Y-m-d',
					fieldLabel : "入住日期"
				},
				{
					xtype : "button",
					text : "查询",
					handler : function() {
						var startDate = Ext.getCmp("startDate").getValue();
						grid.reconfigure(roomStore, [
								{
									text : '房间号',
									dataIndex : 'roomNo'
								},
								{
									text : Ext.Date.format(startDate, "Y-m-d"),
									dataIndex : 'day1'
								},
								{
									text : Ext.Date.format(Ext.Date.add(
											startDate, Ext.Date.DAY, 1),
											"Y-m-d"),
									dataIndex : 'day2'
								},
								{
									text : Ext.Date.format(Ext.Date.add(
											startDate, Ext.Date.DAY, 2),
											"Y-m-d"),
									dataIndex : 'day3'
								} ])
					}
				}, {
					xtype : "button",
					text : "前一天"
				}, {
					xtype : "button",
					text : "后一天"
				}, {
					xtype : "button",
					text : "前一周"
				}, {
					xtype : "button",
					text : "后一周"
				} ]
	});
	var grid = Ext.create('Ext.grid.Panel', {
		title : '查询结果',
		margin : 10,
		renderTo : "formArea",
		store : roomStore,
		selType : 'cellmodel',
		columns : [
				{
					header : '房间号',
					dataIndex : 'roomNo',
					locked : true,
				},
				{
					header : Ext.Date.format(Ext.Date.add(new Date(),
							Ext.Date.DAY, 0), "Y-m-d"),
					dataIndex : 'day1'
				},
				{
					header : Ext.Date.format(Ext.Date.add(new Date(),
							Ext.Date.DAY, 1), "Y-m-d"),
					dataIndex : 'day2'
				},
				{
					header : Ext.Date.format(Ext.Date.add(new Date(),
							Ext.Date.DAY, 0), "Y-m-d"),
					dataIndex : 'day3'
				} ],
		listeners : {
			cellclick : function(me, td, cellIndex, record, tr, rowIndex, e,
					eOpts) {
				console.log("房间号："+record.data.roomNo);
				console.log(grid.columns[cellIndex+1].text);
				console.log("===========================");
			}
		}

	});
});
