function myFunc(){
    console.log("I'm logging to the console");
    console.warn("I'm logging too much")
};

let title = document.getElementById("myTitleSection");
title.addEventListener('click',myFunc);

console.log(title);