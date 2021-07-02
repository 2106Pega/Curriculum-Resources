--TCL Transaction Control Language 
-- Transaction bundle together operations so that they all execute in a single all-or-nothing operation 
-- (A query is a single sql statement, underl DML)

-- In PostgresSQL a transaction is surrounded with a begin and a commit command. 

-- SAVEPOINT: creates a checkpoint, that we can "rollback" into. 
-- ROLLBACK: revert to a previous savepoint. 
-- COMMIT : which will persist the information into the db for all users. 



begin;
	
	insert into planets (planet_name) values
		('Saturn'),
		('Neptune'),
		('Pluto');
	
	savepoint part_of_solar_system;

	delete from planets;

	rollback to part_of_solar_system;

	delete from planets where planet_name = 'Pluto';	
commit;
end;

select * from planets;