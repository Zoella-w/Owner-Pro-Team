$(".submit_button").click(function(){
    var ouname=$("uname").val();
    var opass=$("upass").val();
    $.ajax({
        type="POST",
        url="",
        data:{"username":ouname,"password":opass},
        success:function(data){
            alert("注册成功");
            window.location.href="/personal_page.html"
        },
        fail:function(data){
            alert("用户名或密码有问题，请重新注册");
            window.location.href="/firstpage.html"
        },
    })
})