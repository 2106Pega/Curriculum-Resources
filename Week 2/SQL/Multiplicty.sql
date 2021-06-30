-- Multiplicity 
-- An attribute defining the cardinality of the database. 
-- Relationships between tables. 
-- 1-1
-- 1-Many
-- Many-1
-- Many-Many 


--One to many relationship 
drop table if exists planets cascade;

create table planets(
	planet_id serial primary key, 
	planet_name varchar(30),
	planet_description varchar(30)
);

drop table if exists moons cascade; 
create table moons(
	moon_id serial primary key, 
	moon_name varchar(30),
	p_id int references planets(planet_id)
);

insert into planets(planet_name, planet_description) values ('Earth','blue and green');

select * from planets;

insert into moons(moon_name,p_id) values ('The Moon',
		(select planet_id from planets where planet_name = 'Earth'));
	
insert into moons(moon_name,p_id) values ('The Moon 2',3);
select * from moons;


-- One to One 
-- Standard SQL does not offer a ready made way to build a one-to-one relationship, easily. 
create table civilization(
	civ_id serial primary key, 
	civ_name varchar(30)
);

drop table if exists planets; -- We'll end up with orphan records that reference tables/columns that don't exist
-- we add cascade to make sure, the operations "cascade" to other table tables and remove/update the records. 
drop table if exists planets cascade; 

create table planets(
	planet_id serial primary key, 
	planet_name varchar(30),
	planet_description varchar(30),
	life int references civilization(civ_id) unique 
);

-- Many to Many 
-- A many to many, as the name suggests maps entities to multiple other entities 
-- A normal exmaple would be a student has many professors, and a professor has many students. 


drop table if exists planets cascade; 
drop table if exists features cascade;

create table features ( 
	feature_id serial primary key, 
	feature_name varchar(30)
);

create table planets( 
	planet_id serial primary key, 
	planet_name varchar(30)
);

--A Junction table 
-- Junction table will hold all the references to each other 

create table planet_features( 
	p_id int references planets(planet_id),
	f_id int references features(feature_id)
);


insert into planets(planet_name) values
	('Earth'),('Mars'),('Jupiter'),('Saturn');
	
insert into features(feature_name) values
	('Mountains'),('Deserts'),('Planet Scale Storms'),('Rings'),('Oceans');
	
insert into planet_features values
((select planet_id from planets where planet_name = 'Earth') ,
(select feature_id from features where feature_name = 'Mountains'));

insert into planet_features values 
	(1,2),(1,5),(2,1),(2,2),(2,3);