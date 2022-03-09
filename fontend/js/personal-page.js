$(function () {
    $(".like i").click(function () {
        $(".like i, .like span").toggleClass("press", 1000);
    });
});