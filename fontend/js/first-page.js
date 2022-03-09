$(".submit_button").click(function () {
    var ouname = $("uname").val();
    var opass = $("upass").val();
    $.ajax({
        type="POST",
        url="",
        data: { "username": ouname, "password": opass },
        success: function (data) {
            alert("登录成功");
            window.location.href = "/personal_page.html"
        },
        fail: function (data) {
            alert("用户名或密码错误");
            window.location.href = "/firstpage.html"
        },
    })
})