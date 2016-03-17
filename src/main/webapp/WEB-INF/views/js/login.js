define([], function() {

    'use strict';

    function init() {

        initLogin();

    }

    function initLogin() {
        $('#loginAndRegisterForm').dialog({
            title: '用户登录',
            width: 240,
            height: 150,
            closable: false,
            cache: false,
            modal: true,
            buttons: [ {
                text: '登录',
                iconCls: 'icon-ok',
                width: 70,
                height: 30,
                handler: function() {
                    loginHandle();
                }
            }, {
                text: '重置',
                iconCls: 'icon-ok',
                width: 70,
                height: 30,
                handler: function() {
                    doReset('loginForm');
                }
            } ]

        });

        function doReset(formId) {
            $(':input', '#' + formId).not(':button, :submit, :reset, :hidden').val('').removeAttr('checked').removeAttr('selected');
        }

        function loginHandle() {
            $.ajax({
                url: 'login',
                data: $('#loginForm').serialize(),
                cahe: false,
                dataType: 'json',
                success: function(returnData) {
                    if (returnData == 1) {
                        $('#loginAndRegisterForm').dialog('close');
                        $.messager.show({
                            title: '消息',
                            msg: "登录成功"
                        });
                        $("#content").html("Hello");
                    } else {
                        $.messager.alert('消息', "登录失败");
                    }
                }
            });
        }
    }

    return {
        "init": init
    };
});
