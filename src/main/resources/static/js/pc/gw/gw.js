
var prefix = "/pc/gw"
$(function() {
    load();
});

function load() {
    $('#exampleTable')
        .bootstrapTable(
            {
                method : 'post', // 服务器数据的请求方式 get or post
                url : prefix + "/list", // 服务器数据的加载地址
                showRefresh : true,
                iconSize : 'outline',
                toolbar : '#exampleToolbar',
                striped : true, // 设置为true会有隔行变色效果
                dataType : "json", // 服务器返回的数据类型
                pagination : true, // 设置为true会在底部显示分页条
                // queryParamsType : "limit",
                // //设置为limit则会发送符合RESTFull格式的参数
                singleSelect : false, // 设置为true将禁止多选
                // contentType : "application/x-www-form-urlencoded",
                // //发送到服务器的数据编码类型
                pageSize : 10, // 如果设置了分页，每页数据条数
                pageNumber : 1, // 如果设置了分布，首页页码
                //search : true, // 是否显示搜索框
                showColumns : false, // 是否显示内容下拉框（选择显示的列）
                sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                queryParams : function(params) {
                    return {
                        pageType:pageStr,
                        gwTitle:$('#searchName').val(),
                        startTime:$('#startTime').val(),
                        endTime:$('#endTime').val(),
                        gwType:$('#gwType').val(),
                        limit: params.limit,
                        offset:params.offset,
                    };
                },
                columns : [
                    {
                        checkbox : true
                    },{
                        field : 'gwType',
                        title : '类型'
                    },
                    {
                        field : 'gwTitle',
                        title : '标题'
                    },
                    {
                        field : 'gwCount',
                        title : '点击次数'
                    },
                    {
                        field : 'gwSubtitle',
                        title : '副标题'
                    },
                    {
                        field : 'gwMem',
                        title : '简介'
                    },{
                        field : 'gwImg1',
                        title : '默认图1',
                        events:operateEvents,
                        formatter : function(value, row, index) {
                            if(value!=null && value.length>10){
                                return '<img src="'+value+'" width="45" height="45"/>';
                            }else {
                                return '-';
                            }
                        }},{
                        field : 'gwImg2',
                        title : '图2',
                        events:operateEvents,
                        formatter : function(value, row, index) {
                            if(value!=null && value.length>10){
                                return '<img src="'+value+'" width="45" height="45"/>';
                            }else {
                                return '-';
                            }
                        }},
                    {
                        field : 'gwImg3',
                        title : '图3',
                        events:operateEvents,
                        formatter : function(value, row, index) {
                            if(value!=null && value.length>10){
                                return '<img src="'+value+'" width="45" height="45"/>';
                            }else {
                                return '-';
                            }
                        }},
                    {
                        field : 'gwImg4',
                        title : '图4',
                        events:operateEvents,
                        formatter : function(value, row, index) {
                            if(value!=null && value.length>10){
                                return '<img src="'+value+'" width="45" height="45"/>';
                            }else {
                                return '-';
                            }
                        }},{
                        field : 'gwImg5',
                        title : '图5',
                        events:operateEvents,
                        formatter : function(value, row, index) {
                            if(value!=null && value.length>10){
                                return '<img src="'+value+'" width="45" height="45"/>';
                            }else {
                                return '-';
                            }
                        }},{
                        field : 'gwImg6',
                        title : '图6',
                        events:operateEvents,
                        formatter : function(value, row, index) {
                            if(value!=null && value.length>10){
                                return '<img src="'+value+'" width="45" height="45"/>';
                            }else {
                                return '-';
                            }
                        }},{
                        field : 'gwImg7',
                        title : '图7',
                        events:operateEvents,
                        formatter : function(value, row, index) {
                            if(value!=null && value.length>10){
                                return '<img src="'+value+'" width="45" height="45"/>';
                            }else {
                                return '-';
                            }
                        }},
                    {
                        field : 'gwChangeStartTime',
                        title : '开始',
                        formatter:function (value,row,index) {
                            if(value!=null)
                                return new Date(value).format('yyyy-MM-dd');
                        }
                    },{
                        field : 'createtime',
                        title : '创建时间',
                        formatter:function (value,row,index) {
                            if(value!=null)
                                return new Date(value).format('yyyy-MM-dd hh:mm');
                        }
                    },{
                        field : 'gwSort',
                        title : '排序'
                    },{
                        title : '操作',
                        field : 'id',
                        align : 'center',
                        formatter : function(value, row, index) {
                            var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
                                + row.id
                                + '\')"><i class="fa fa-edit"></i></a> ';
                            var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
                                + row.id
                                + '\')"><i class="fa fa-remove"></i></a> ';
                            var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
                                + row.id
                                + '\')"><i class="fa fa-key"></i></a> ';
                            return e + d ;
                        }
                    } ]
            });
}
function reLoad() {
    $('#exampleTable').bootstrapTable('refresh');
}
function add() {
    perContent=  layer.open({
        type : 2,
        title : '增加',
        maxmin : true,
        shadeClose : false, // 点击遮罩关闭层
        area : [ '1100px', '520px' ],
        content : prefix + '/add?pageType='+pageStr // iframe的url
    });
    layer.full(perContent);
}
function edit(id) {
    perContent=  layer.open({
        type : 2,
        title : '编辑',
        maxmin : true,
        shadeClose : false, // 点击遮罩关闭层
        area : [ '1100px', '520px' ],
        content : prefix + '/edit/' + id // iframe的url
    });
    layer.full(perContent);
}
function remove(id) {
    layer.confirm('确定要删除选中的记录？', {
        btn : [ '确定', '取消' ]
    }, function() {
        $.ajax({
            url : prefix+"/remove",
            type : "post",
            data : {
                'id' : id
            },
            success : function(r) {
                if (r.code==0) {
                    layer.msg(r.msg);
                    reLoad();
                }else{
                    layer.msg(r.msg);
                }
            }
        });
    })
}

function resetPwd(id) {
}
function batchRemove() {
    var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
    if (rows.length == 0) {
        layer.msg("请选择要删除的数据");
        return;
    }
    layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
        btn : [ '确定', '取消' ]
        // 按钮
    }, function() {
        var ids = new Array();
        // 遍历所有选择的行数据，取每条数据对应的ID
        $.each(rows, function(i, row) {
            ids[i] = row['id'];
        });
        $.ajax({
            type : 'POST',
            data : {
                "ids" : ids
            },
            url : prefix + '/batchRemove',
            success : function(r) {
                if (r.code == 0) {
                    layer.msg(r.msg);
                    reLoad();
                } else {
                    layer.msg(r.msg);
                }
            }
        });
    }, function() {

    });
}
window.operateEvents = {
    'click img': function (e, value, row, index) {
        if(value!=null && value.length>10) {
            perContent = layer.open({
                type: 2,
                title: '图片',
                maxmin: true,
                shadeClose: false, // 点击遮罩关闭层
                area: ['1100px', '520px'],
                content: value // iframe的url
            });
            layer.full(perContent);
        }
        return false;
    }
};