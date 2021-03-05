SELECT 		*
FROM 		Department;

SELECT 		*
FROM 		Department 
WHERE 		Department_Name = 'Sale';

SELECT 		Full_Name, LENGTH(Full_Name)
FROM 		`Account` 
WHERE 		LENGTH(Full_Name) = (SELECT MAX(LENGTH(Full_Name)) FROM `Account`);

SELECT 		*
FROM 		`Group` 
WHERE 		Create_Date < '2019-12-20';

SELECT 		*, COUNT(Question_ID)
FROM 		Answer
GROUP BY 	Question_ID
HAVING 		COUNT(Question_ID) >= 4;

SELECT 		* 
FROM 		`Group`
ORDER BY 	Create_Date DESC 
LIMIT 		5;

DELETE 
FROM 		Exam 
WHERE 		Create_Date < '2019-12-20';

UPDATE 		`Account` 
SET 		Full_Name 	= 	'Nguyễn Bá Lộc', 
			Email 		= 	'loc.nguyenba@vti.com.vn'
WHERE 		Account_ID 	= 	5;

SELECT 		*
FROM 		`Account` a 
JOIN 		Department d	ON 	a.Department_ID = d.Department_ID;

SELECT		*
FROM		`Account` a 
JOIN 		Position p ON a.Position_ID = p.Position_ID
WHERE		p.Position_Name = 'Dev';

SELECT 		*
FROM 		`Account` a
JOIN 		Department d ON d.Department_ID = a.Department_ID
GROUP BY 	a.Department_ID
HAVING 		COUNT(a.Department_ID) > 3;

SELECT 		*
FROM		Question q 
JOIN 		ExamQuestion e ON q.Question_ID = e.Question_ID
GROUP BY	q.Content
HAVING		COUNT(q.Content) = (SELECT	MAX(COUNT(q.Question_ID))
								FROM		(SELECT 		COUNT(q.Question_ID) 
											FROM			ExamQuestion e 
											JOIN 			Question q ON e.Question_ID = e.Question_ID
											GROUP BY		q.Question_ID));
	
SELECT		*
FROM		CategoryQuestion cq 
LEFT JOIN 	Question q ON cq.Category_ID = q.Category_ID
GROUP BY	cq.Category_ID
ORDER BY	cq.Category_ID ASC;

SELECT 		*
FROM		Question q 
JOIN 		Answer a ON	q.Question_ID = A.Question_ID
GROUP BY	a.Question_ID
HAVING		COUNT(a.Question_ID) =	(SELECT 	MAX(COUNT(a.Question_ID))
									 FROM		(SELECT 		COUNT(a.Question_ID) 
												FROM			Answer a 
												RIGHT JOIN  	Question q ON a.Question_ID = q.Question_ID 
												GROUP BY		a.Question_ID));

SELECT 		*
FROM		Position p
JOIN 		`Account` a ON p.Position_ID = a.Position_ID
GROUP BY 	p.Position_ID
HAVING		COUNT(A.Position_ID)	=	(SELECT 	MIN(COUNT(p.Position_ID))
										FROM		(SELECT 	COUNT(p.Position_ID) 
													FROM		Position p 
													JOIN 		`Account` a ON p.Position_ID = a.Position_ID		
													GROUP BY	p.Position_ID));
 
 SELECT 
    t1.Department_ID,
    t1.Position_ID,
    IF((t2.number_of_account IS NULL), 0, t2.number_of_account) AS number_of_account
FROM
    (SELECT 	d.Department_ID, p.Position_ID
    FROM		department d
    CROSS JOIN 	`position` p
    WHERE		p.position_name IN ('Developer' , 'Tester', 'Scrum Master', 'Project Manager')
    ORDER BY 	d.Department_ID , p.Position_ID) AS t1
LEFT JOIN
    (SELECT 
        d.Department_ID,
		p.Position_ID,
		COUNT	(a.Account_ID) AS number_of_account
    FROM		position p
    LEFT JOIN 	`account` a ON p.Position_ID = a.Position_ID
    RIGHT JOIN 	department d ON a.Department_ID = d.Department_ID
    WHERE		p.Position_Name IN ('Developer' , 'Tester', 'Scrum Master', 'Project Manager')
    GROUP BY 	d.Department_ID , p.Position_ID) AS t2 ON t1.Department_ID = t2.Department_ID
AND 		t1.Position_ID = t2.Position_ID
GROUP BY 	t1.Department_ID , t1.Position_ID
ORDER BY 	t1.Department_ID , t1.Position_ID;     
      
SELECT 		*
FROM		Question q 
JOIN 		Answer a ON	q.Question_ID = a.Question_ID
JOIN		TypeQuestion t ON q.Type_ID = t.Type_ID;


       
SELECT		t.Type_Name, COUNT(Type_ID) 
FROM		Question q 
JOIN 	TypeQuestion t ON q.Type_ID = t.Type_ID
GROUP BY	q.Type_ID;

