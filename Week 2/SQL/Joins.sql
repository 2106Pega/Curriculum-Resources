--Joins 
-- Useful to combine tables that references another table 
-- combine both to get informatino from the reference table. 

-- Normalization allows us to efficiently store information while minimizing redundant data
-- Joins allows us to query data more effectively by combining these normalized tables. 

select count(*) from album;

select * from artist;

select * from customer;

------ INNER JOIN (only matching values will be shown)

select count(*) from artist, album where artist.artist_id = album.artist_id;

select count(*) from album a inner join artist b on a.artist_id = b.artist_id; -- aliases and the "on" keyword 

select count(*) from artist a, customer c where a.artist_id = c.customer_id ;

----- LEFT OUTER JOIN (all the values from the left table will be shown)

select * from artist a left outer join album b on a.artist_id = b.artist_id order by a.artist_id asc;

select * from album a left outer join artist b on a.artist_id = b.artist_id ;

----- RIGHT OUTER JOIN (all the values from the right table will be shown)

select * from artist a right outer join album b on a.artist_id = b.artist_id order by a.artist_id asc;

select * from album a right outer join artist b on a.artist_id = b.artist_id ;

----- FULL OUTER JOIN (all the values from the left and right table will be shown )

select * from artist a full outer join album b on a.artist_id = b.artist_id ;

----- SELF JOIN

select e.first_name, e.last_name , e.title , manager.first_name , manager .last_name, manager.title 
	from employee e inner join employee manager on e.reports_to = manager.employee_id ;

----- CROSS JOINS 
select count(*) from album a cross join artist a2;

