select class from Courses
group By class
having  count(*)>=5;