-- Normalization
-- What is it? 
-- A design technique to reduce redundancy in the data.
-- We want to organise our tables  to minize the amount of redundant data in them 
-- this allows for more efficient storage and querying. 

-- 1NF -> 6NF  
-- The industry standard is upto 3rd Normal Form 


-- 1NF:
-- We need a primary key column 
-- Atomic columns 


-- Primary key: unique identifier for row/record 
-- Foreign key: primary key of another table, that our table references. 
-- Candidate key: is a column, that can act as a primary key (but is NOT a primary key)
-- Composite key: is multiple columns that can act as a primary key 

-- 2NF
-- We need at least 1 NF 
-- We need to have no partial dependencies

-- 3NF
-- We need at least 2 NF. 
-- We can't have transitive dependencies

--The key, the whole key, nothing but the key 

	-- a > b 
	-- b > c 
	----> a > c
