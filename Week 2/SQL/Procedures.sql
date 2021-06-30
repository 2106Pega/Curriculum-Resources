-- Functions vs Methods vs Procedures. 
-- Functions vs Methods?
--  Functions are code blocks that we can reference to utilise their logic. 
--  Methods are functions that are associated with a Class. 
--  Both of them can take in arguments and return something (we can set the return to void)

--Procedures will take in arguments but will not return anything. 
-- This is part of plpgsql that allows us to do programmatic logic. 

--creating stored procedure

-- PL/SQL procedural language extension for SQL
-- plpgsql procedural language extension for postgres SQL 
create or replace procedure insert_into_features_and_planets(p_name varchar(30),f_name varchar(30))
	language sql 
	as $$
		insert into planets (planet_name) values (p_name);
		insert into features (feature_name) values (f_name);
		insert into planet_features values
			((select planet_id from planets where planet_name = p_name),
			(select feature_id from features where feature_name = f_name));
	$$;
	
--call insert_into_features_planets
call insert_into_features_and_planets('Earth', 'Mountains'); 


	
