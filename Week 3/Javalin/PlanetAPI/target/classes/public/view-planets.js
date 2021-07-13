/**
 * 
 */
 
 console.log("hello!");
 
 const url = "planet";
 
window.onload = function(){
	//console.log("Inside onload function!");
	grabPlanets();
	
	let updateButton = document.getElementById("updateButton");
	updateButton.addEventListener('click',updatePlanet);
	
	
	
	
	
}

function updateButton(event){
	console.log(event);
	console.log(event.srcElement.id);
	
	let name = document.getElementById(event.srcElement.id + "name").innerHTML;
	let ring = document.getElementById(event.srcElement.id + "rings").innerHTML;
	
	console.log(name);
	console.log(!ring);
}

function updatePlanet(){
	
	
	let xhr = new XMLHttpRequest();
	
	let name = document.getElementById("name").value;
	let rings = document.getElementById("rings").value;
	
	xhr.onreadystatechange = function(){
		
		switch(xhr.readyState){
			
			case 0:
				console.log("nothing, not initalized yet!");
				break;
			case 1: 
				console.log("connection established");
				break;
			case 2:
				console.log("request sent");
				break;
			case 3:
				console.log("awaiting request");
				break;
			case 4: 
				console.log(xhr.status)
				
				if(xhr.status == 200){
					grabPlanets();
				}
		}
		
		
		
	}
	
	xhr.open("PUT",url);
	
	let planet = {};
	planet.name = name;
	planet.rings = rings;
	xhr.send(
		JSON.stringify(planet)
	);
	
}


function grabPlanets(){
	
	let xhr = new XMLHttpRequest();
	
	//const url = "localhost:9000/planet"
	const url = "planet";
	
	xhr.onreadystatechange = function(){
		
		console.log("hi!");
		
		switch(xhr.readyState){
			
			case 0:
				console.log("nothing, not initalized yet!");
				break;
			case 1: 
				console.log("connection established");
				break;
			case 2:
				console.log("request sent");
				break;
			case 3:
				console.log("awaiting request");
				break;
			case 4: 
				console.log(xhr.status)
				
				if(xhr.status == 200){
					console.log(xhr.responseText);
					
					let planetList = JSON.parse(xhr.responseText);
					
					console.log(planetList);
					
					planetList.forEach(
						element => {
							addRow(element);
						}
						
					)
					
					let arrayOfButtons = document.getElementsByClassName("btn btn-primary");
	

					for(let i = 0; i < arrayOfButtons.length; i++){
						arrayOfButtons[i].addEventListener('click',updateButton);
						console.log(arrayOfButtons[i]);
					}
				}
		}
		
		
		
	}
	
	xhr.open("GET",url);
		xhr.send();
}



function addRow(planet){
	
	
	let table = document.getElementById("planet-table")
	
	let tableRow = document.createElement("tr");
	let iDCol = document.createElement("td");
	let nameCol = document.createElement("td");
	let descriptionCol = document.createElement("td");
	let numberOfMoonsCol = document.createElement("td");
	let ringCol = document.createElement("td");
	let deleteCol = document.createElement("td");
	
	
	tableRow.appendChild(iDCol);
	tableRow.appendChild(nameCol);
	tableRow.appendChild(descriptionCol);
	tableRow.appendChild(numberOfMoonsCol);
	tableRow.appendChild(ringCol);
	tableRow.appendChild(deleteCol);
	
	table.appendChild(tableRow);
	
	iDCol.innerHTML = planet.id;
	nameCol.innerHTML = planet.name;
	nameCol.setAttribute("id",planet.id + "name");
	
	descriptionCol.innerHTML = planet.description;
	
	numberOfMoonsCol.innerHTML = planet.numberOfMoons;
	
	ringCol.innerHTML = planet.rings;
	ringCol.setAttribute("id",planet.id + "rings");
	
	deleteCol.innerHTML = `<button id = "${planet.id}" type="submit" class="btn btn-primary">Update Button</button>`;
	
	};
	
function resetTable(){
	//deletes the table 
	//then call the grabplanet function.
}
	
	