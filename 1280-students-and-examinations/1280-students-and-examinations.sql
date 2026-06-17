# Write your MySQL query statement below
Select Students.student_id, Students.student_name, Subjects.subject_name, count(Examinations.student_id) as attended_exams 
from Students 
Join Subjects
Left join Examinations 
on Students.student_id = Examinations.student_id
and Subjects.subject_name = Examinations.subject_name
group by students.student_id, subjects.subject_name
order by student_id asc, subject_name asc;