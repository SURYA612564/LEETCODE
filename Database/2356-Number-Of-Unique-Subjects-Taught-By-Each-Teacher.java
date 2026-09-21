// Problem Number: 2356
// Problem Name: Number of Unique Subjects Taught by Each Teacher
// Topic: Database
// Time Complexity: O(1)
// Space Complexity: O(1)

# Write your MySQL query statement below
select teacher_id,count(distinct subject_id) as 'cnt' from Teacher 
group by teacher_id;