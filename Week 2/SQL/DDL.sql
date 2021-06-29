--DDL: Data Definition Language
-- Allows us define the structure of our data 
-- Each of these commands are associated with modifing/creating the WHOLE table 
-- CREATE, DROP, TRUNCATE, ALTER 

-- What is a schema? 
-- 	Schema defines the tables in the database, it's a blueprint for all the tables
--	and their relationships. Within the schema data structure (tables) can reference each other. 
--	Databases can have multiple schema. 
-- Schemas are important for relational databases, because we want to establish relationships. 


drop table planets; -- this will remove the data in the table and the table structure itself.

drop table if exists basic;
create table basic(); -- this table has no columns, so we can't actually store information here


create table if not exists upgraded(
	user_id int,
	user_name varchar(30)
);

drop table upgraded;


--I like planets, so I'm creating a planets table
drop table planets;

create table planets(
--		column name | column type | constraints 
		planet_id serial2 primary key, -- not null + unique , it defines a unique way to select a record. 
		planet_name varchar(30) unique not null,
		planet_description varchar(60) not null,
		has_rings boolean not null, 
		number_of_moons smallint check(number_of_moons > -1)
--		number_of_red_moons smallint check(number_of_red_moons <= number_of_moons) check(number_of_red_moons > -1)
);



truncate table planets; -- desinged to remove all the data from our table, but leave the sturcture intact 

alter table if exists planets rename has_rings to rings;
