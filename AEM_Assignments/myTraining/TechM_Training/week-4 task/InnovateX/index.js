document.addEventListener("DOMContentLoaded", function () {
    const menuToggle = document.querySelector(".menu-toggle");
    const navMenu = document.querySelector(".nav-menu");

    menuToggle.addEventListener("click", function () {
        navMenu.classList.toggle("show");
    });

    document.querySelectorAll("a").forEach(link => {
        link.addEventListener("click", function (event) {
            event.preventDefault();
            let target = this.href;
            document.body.style.animation = "fadeOut 0.5s ease-in-out";
            setTimeout(() => {
                window.location.href = target;
            }, 500);
        });
    });
});
