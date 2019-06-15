$().ready(function() {
    var content = $("#pageContext").val();
    ue.ready(function(){
        ue.setContent(content);
    });
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		update();
	}
});
function update() {
    $("#pageContext").val(ue.getContent());
	$.ajax({
		cache : true,
		type : "POST",
		url : "/pc/page/update",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : icon + "请输入名字"
			}
		}
	})
}
//上传图片
layui.use('upload', function () {
    var upload = layui.upload;
    //执行实例
    var uploadInst = upload.render({
        elem: '.layui-btn', //绑定元素
        url: '/common/sysFile/upload', //上传接口
        size: 1000,
        accept: 'file',
        done: function (r) {
            $("#pageGbPic").val(r.fileName)
            layer.msg(r.msg);
        },
        error: function (r) {
            layer.msg(r.msg);
        }
    });
});

function openImg(srcUrl) {
    perContent = layer.open({
        type: 2,
        title: '图片',
        maxmin: true,
        shadeClose: false, // 点击遮罩关闭层
        area: ['1100px', '520px'],
        content: srcUrl // iframe的url
    });
    layer.full(perContent);
}