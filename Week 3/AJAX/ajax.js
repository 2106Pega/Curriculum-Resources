/**
 * 
 * AJAX - A technique for accessing web servers asynchronously from a web page.
 * 
 * AJAX - Asynchrnous JavaScript and XML. 
 * 
 * AJAX consists of: 
 *      - brower sbuild-in XMLHTTPRequest Object (request data from the web server) 
 *      - JavaScript 
 *      - DOM (to display the data)
 * 
 * 
 */

window.onload = function(){
    document.getElementById("pokemonSubmit").addEventListener('click',getPokemon);
}

const PokeURL =  "https://pokeapi.co/api/v2/pokemon/";

function getPokemon(){
    console.log("We're hunting pokemons now!")

    let pokemonId = document.getElementById("pokemonId").value;
    // console.log(pokemonId);

    //Getting the Pokemon Object!
    /**
     * How does AJAX work ?
     *      1) An even occurs in the web page (button is clicked or page is loaded, or some mouseevent)
     *      2) An XMLHttpRequest object is created in JS 
     *      3) XMLHttpRequest object sends a request to a web server. 
     *      4) Server processes the request 
     *      5) Request is finished and response is ready. 
     */

    let xhttp = new XMLHttpRequest();


    xhttp.onreadystatechange = function(){
        console.log("My state is changing" + xhttp.readyState);

        /**
         * 0 - request is not initialized
         * 1 - server conneciton established 
         * 2 - request received 
         * 3 - processing request 
         * 4 - request is finished and response is ready  
         */

        //readystate has to be 4 (i.e. request and response is complete)
        // We want the process to be a success (i.e. status = 200)
        if(xhttp.readyState == 4 && xhttp.status == 200){
            // console.log(xhttp.response);

            let poke = JSON.parse(xhttp.responseText);

            console.log(poke);
            DOMManipulation(poke);
        }
    }


    xhttp.open("GET", PokeURL + pokemonId);

    xhttp.send();
    //What do we need to provide the xhttp? 
    // provide a verb
    // provide a header 
    // uri 


    
}

function DOMManipulation(poke){

    //setting the name
    document.getElementById("pokemonName").innerHTML = poke.name;

    //setting the image
    document.getElementById("pokemonImg").setAttribute("src", poke.sprites.front_default);
    document.getElementById("pokemonImg").setAttribute("title", poke.abilities[0].ability.name);

}