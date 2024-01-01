#Way 1 :

select distinct(city) from STATION where lower(RIGHT(city,1)) IN ('a','e','i','o','u');



#Way 2:

select distinct(city) from STATION where lower(RIGHT(city,1)) IN ('a','e','i','o','u')