select * from cinema where 
id % 2 !=0 && description not in("boring")
order by rating desc;
