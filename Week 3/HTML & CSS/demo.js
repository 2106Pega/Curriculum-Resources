//This is an inline comment 

/**
 * This is a block comment 
 * 
 * 
 * Created in 1995 by Brandan Eich (created in 10 days)
 * 
 * JavaScript is a loosely typed, interpreted, object-based, scripting language (that's also dynamic)
 * 
 * Initally created to add functionality to webpages.
 * 
 * 
 * Scripting vs programming?
 *      
 *      Compiled language?
 *          Language that needs to be complied into a lower level code before it's run - creating an executable.
 * 
 *          In Java we need the JVM to rund Java code. That's because we don't compile into machine code (i.e. an executable)
 *          instead we get to bytecode (advantage: platform indpendent, slightly slower performance).
 * 
 *          Better performance for the application. 
 * 
 *          Harder to initally build applications for compiled languages. 
 * 
 *      Interpreted language?
 *          Read your code line by line. It requires an environment to run the code. With JS, we need a broswer to 
 *          either read the code for us ("interpret it") or we need something like node (the V8 engine from chrome that is 
 *          ripped out from the browser)
 * 
 *          V8 chrome engine, actually compiles JS into machine code. Then executes it. 
 * 
 *          Perforamnce is a lot worse (machine is interpreting the language line by line as opposed it's native machine code)
 * 
 *          Little bit easier to develop for, because they are typically meant for "support"
 * 
 */

// console.log("Hello World!");


//Declaring and assigning values 
// We don't need to declare a datatype and the variable is not tied to a datatype (loosely typed). 
var a = 1;
a = "string";
a = true;

//ASCI : Automatic semi colon insertion (DONT USE THIS FEATURE)

/**
 * JS primitve datatypes: 
 *      number 
 *      boolean 
 *      String 
 *      undefined 
 *      null
 * 
 * non primitive datatypes: 
 *      Object 
 *      function
 */

a = a + 1; 
a = false;
a = a + 1;

//JavaScript goes with the flow, it will try its best to make everything work so it's best you follow rigid structures. 

a = "string" + 1 + 1;
a = 1 + 1 + "string";





// console.log(a);
// console.log(1 == 1);
// console.log("1" == 1); //with a ==, JS will automatilly convert the values into matching datatypes. 
// console.log(true == 1);
// console.log("1" === 1); 


//CREATING AN ARRAY IN JS
//Before we begin: 
// What is an array in Java?
//  a collection of data. 
//  it has to be a set length.
//  it has to have the same datatypes. 

var arrayOfPlanets = [1, "Venus",["Earth",1]]; //arrays with different datatypes

// console.log(arrayOfPlanets);
// console.log(arrayOfPlanets[2][0]); //arrays within arrays

arrayOfPlanets[7] = "Uranus"; //define any position within the array (making it dynamic in size)
// console.log(arrayOfPlanets);
// console.log(arrayOfPlanets[7]);

arrayOfPlanets[8] = arrayOfPlanets; //can have recursive arrays 


//CREATING AN OBJECT 

var myObject = {}; //we've just made an object 

var earth = {
    name: "Earth",
    "distance": 1,
    humans: true 
};

earth.rings = false;
earth.miniEarth = earth;

//dynamic - we can modify the number of attributes of an object during runtime. 
earth.rings = true;
earth.solarSystem = arrayOfPlanets;
arrayOfPlanets[6] = earth;

delete earth.name;

// console.log(earth);

// console.log("Does Earth have humans? " + earth.humans); //dot notation
// console.log("How far is Earth from the Sun? " + earth["distance"]); //bracket notations
// console.log("What is the planet's name? " + earth["name"]);
// console.log("Does Earth have rings? " + earth.rings);
// console.log(earth.miniEarth);

function Planet(name,distance,humanStatus){
    this.name = name;
    this.distance = distance;
    this.humanStatus = humanStatus;
}

var venus = new Planet("Venus","0.4","true");

// console.log(venus);

// printStuff();

// What is happening at the moment?????
// Hoisting. 
// Whenever we define a variable or a function in JavaScript, the declaration gets automatically brought to the 
// top of its scope.  
// which scopes do we have?
//     block scopes (control flow statements)
//     global scope ( accessible anywhere)
//     local scope ( function or object scope.)

// console.log(fruit);

var fruit = "apples";

// printStuff();

//FUNCTIONS
function printStuff(){ //in the case of a function, the funciton body is also brought up to the top of the scope. 
    //var g;

    var g = 7; // g = 7;
    console.log(g);
}

// console.log(add("4",4));

function add(x,y){
    console.log(typeof(x));
    return x+y;
};

/**
 * 
 * What is NaN?
 *      Not a keyword or data type. It is a property of the global object
 *      isNaN - function that returns true if vraiable is not a type of number
 * 
 *      1) division of zero by zero 
 *      2) division of infinity by inifitiy
 *      3) multiplication of inifity by zero 
 *      4) convertinga  non-numeric string or undefined!
 * 
 */

// console.log("What is the datatype of NaN " + typeof(NaN)); //NaN is not a number, with the datatype being number

// console.log(isNaN(NaN)); //will check if a String or a number can be coerced into a number value. 


//Defining an ANONYMOUS FUNCTIONS, to be stored within a variable. 
var anon = function(a,b){return a*b};

// console.log(anon(100,2));

anon = 3;

anon = function(){ console.log("Hi, I'm an anonymous function!")};

// CALL BACK FUNCTIONS 
// Are functions that are passed in as parameters. 
function travel(destination, myFunc){ 
    console.log("travelling to " + destination);
    myFunc();
    printStuff();
    // return myFunc;
}

// var aFunc = travel("Barcelona", printStuff);
// aFunc = travel("Berlin", anon);

// aFunc();

//SELF INVOKING FUNCTION
//this function will be invoked immediately because we have paranthesis afterwards. 
// let func1 = function(){
//     console.log("Inside IIFE: Immediately invokable function expressions!");
// }();



// ES6/ EcmaScript2015  features 
// This is a regulatory body that sets the standard for scripting languages and what features they should have. 
//
// One of the most useful feature is let and const

/**
 * let vs var?
 *      let has support for Global, Local and Block scopes. 
 *      var ONLY has support for Global and Local. Var has scope bleed when it comes to block scopes. 
 * 
 * const vs var?
 *      const also has support for Global, Local and Block scopes. 
 *      const acts as a final keyword in Java, we can't reassign the variable once it's been assigned. 
 */
// 

if("-1"){
    var letVAriable = 1;

    letVAriable = "Apples";
    
}

if("false"){
    console.log(letVAriable);
}

if(10){
    const finalVariable = 10;
    // finalVariable = "final variable";
    console.log(finalVariable);
}

console.log(letVAriable);

// console.log(letVAriable);


/**
 * Fat arrow notation. 
 *      Very useful feature, and very popular with JS developers. 
 */

let div = (x,y) => {return x/y};
// We will be using this kind of syntax a lot because JS is mostly used as a functional language, not an OOP language. 


/**
 * Template literals
 */

const finalVariable = "Final variable";

console.log(`
        ${finalVariable}
            is 
                a 
                    feature 
                            from                                                ES6.

`)

/**
 * 
 * REview 
 *      Truthy and Falsy values 
 * 
 *      Control flow statements: 
 *          swtich 
 *          if and else if 
 *          while 
 *          for loops (traditional and non-traditional)
 * 
 */

