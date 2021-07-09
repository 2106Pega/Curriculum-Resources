/**
 * 
 */
 
 console.log("hello!");
 
 
 
window.onload = function(){
	//console.log("Inside onload function!");
	grabPlanets();
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
				console.log("FINISHED!!!!")
				
				if(xhr.status == 418){
					console.log(xhr.responseText);
					
					let planetList = JSON.parse(xhr.responseText);
					
					console.log(planetList);
					
					planetList.forEach(
						element => {
							addRow(element);
						}
						
					)
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
	
	
	tableRow.appendChild(iDCol);
	tableRow.appendChild(nameCol);
	tableRow.appendChild(descriptionCol);
	tableRow.appendChild(numberOfMoonsCol);
	
	table.appendChild(tableRow);
	
	iDCol.innerHTML = planet.id;
	nameCol.innerHTML = planet.name;
	descriptionCol.innerHTML = planet.description;
	numberOfMoonsCol.innerHTML = planet.numberOfMoons;
	
	};
	
	