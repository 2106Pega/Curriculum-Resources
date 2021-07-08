
/**
 * 
 * DOM?
 *      Document Object Model 
 *      DOM is the virtual representation of the HTML page - it follows a tree like structure. With the root being the html tag. 
 * 
 */

console.log("it works!!!");

console.log(document);

console.log(document.all);

console.log(document.links);

/**
 * We can select element by their position, but this is incredibly unstable way of doing it. 
 * 
 * 
 */

let ptag14 = document.all[13];
ptag14.innerHTML = "Modified paragraph!";

/**
 * What does it mean for a webpage to by dynamic?
 * 
 *      Manipulate text!
 *          WE want to display a username. 
 */

let username = "Bobby";

let welcomeMessage = document.getElementById("WelcomeMessage");

welcomeMessage.innerHTML = ` <strike>Welcome ${username}</strike>`;

console.log(welcomeMessage);


// I Want to strike everything I click 

let pTags = document.getElementsByTagName("p");

console.log(pTags);

for(let i = 0; i < pTags.length; i++){
    // pTags[i].innerHTML = "Hello again, this is all the p tags";
    // pTags[i].innerHTML = ` <strike> ${pTags[i].innerHTML}<strike>`;
    // pTags[i].style = "color:blue";

    pTags[i].addEventListener('click',DOMManipulation )
}

let i = 0;

function DOMManipulation(event){
    
    console.log(event.offsetX);
    console.log(event.offsetY);

    pTags[i].style = "color:green"
    i++;

    // for(let i = 0; i < pTags.length; i++){
    //     // pTags[i].innerHTML = "Hello again, this is all the p tags";
    //     // pTags[i].innerHTML = ` <strike> ${pTags[i].innerHTML}<strike>`;
    //     pTags[i].style = "color:green";
    
    //     // pTags[i].addEventListener('click',DOMManipulation )
    // }
}


//Selecting a element by class and tag, then adding an element!

let firstClassDiv = document.querySelector('div.myFirstClass'); //will select the first element it sees. 
    // let firstClassDiv = document.getElementsByClassName('myFirstClass');

function appendingParagraphs(event){

    console.log(event);
    
    ///CREATING ELEMENTS
    
    //1) Creating our new element
    let ptag = document.createElement('p');
    
    //2) Populating and modifing our elment
    ptag.id = "myFirstCreatedParagraph";
    ptag.setAttribute("title","new paragraph!");
    ptag.innerText = "New Paragraph is generated";
    
    //3) Find an existing element and append to it. 
    firstClassDiv.appendChild(ptag);

}


/**
 * There are many types of events in JS, 
 * onsubmit, click, onchange, mouserover, mouseout,moousemove, .... 
 */
firstClassDiv.addEventListener('mouseover',appendingParagraphs);
// let image = document.querySelector('img');


// let body = document.body;
// body.appendChild(firstClassDiv);






