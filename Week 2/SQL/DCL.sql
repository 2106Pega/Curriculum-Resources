--DCL: 
-- Data Control Language - it is used to provide privileges to users. 
-- GRANT and REVOKE 


create role another_person LOGIN password 'p4ssword';

--grant all privileges on schema public to another_person;

grant select on table public.planets to another_person;
grant insert on table public.planets to another_person;

revoke select on table public.planets from another_person;