-- DML and DQL 
-- These are the sublangages that cover the commands for manipulation of records in our table. 
-- CRUD : 
--	Create: INSERT 
-- 	Read : SELECT
--  Update: UPDATE 
--  Delete : DELETE 

-- DML vs DQL?
-- Technially DQL only contains a single command, SELECT. This is because select does not manipulate 
-- the data so it should not be considered under DML. 
-- DML is contains CUD, and being able to query is an important aspect, so we have CRUD also under DML. 



select * from planets;

insert into planets values('Mars', 'kinda red',false,0);

insert into planets( planet_name, planet_description, has_rings)
	values('Mars', 'kinda red',false);
	
insert into planets( planet_name, planet_description, has_rings)
	values
	('Venus',' very hot and acidy',false),
	('Earth', 'alright',false);