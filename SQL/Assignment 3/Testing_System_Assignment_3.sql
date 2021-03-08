CREATE VIEW List_of_sales_staff AS
SELECT		*
FROM 		`Account` a
JOIN 		`Department` d ON a.Department_ID = d.Department_ID
WHERE		D.Department_Name = 'Sale';
SELECT 		* 
FROM 		List_of_sales_staff;

CREATE VIEW Accounts_join_the_most_groups AS
SELECT 		Account_ID, COUNT(ga.Account_ID) 
FROM		`Account` a 
JOIN 		GroupAccount ga ON a.Account_ID = ga.Account_ID
GROUP BY	a.Account_ID
HAVING		COUNT(ga.Account_ID) = (SELECT 		COUNT(ga.Account_ID) 
									FROM		`Account` a 
									JOIN 		GroupAccount ga ON a.Account_ID = ga.Account_ID
									GROUP BY	a.Account_ID
									ORDER BY	COUNT(ga.Account_ID) DESC
									LIMIT		1);
SELECT 		* 
FROM 		Accounts_join_the_most_groups;
                                    
CREATE VIEW Questions_with_too_long_content AS
SELECT 		LENGTH(Content)
FROM		Question
WHERE		LENGTH(Content) > 300;
SELECT 		* 
FROM 		Questions_with_too_long_content;
    
CREATE VIEW Department_with_the_most_employees AS
SELECT 		*, COUNT(Department_ID)
FROM		Department d 
JOIN 		`Account` a ON d.Department_ID = a.Department_ID
GROUP BY	d.Department_ID
HAVING		COUNT(a.DepartmentID) = (SELECT 	COUNT(a.Department_ID)
										FROM		Department d 
										INNER JOIN 	`Account` a ON d.Department_ID = a.Department_ID
										GROUP BY	d.Department_ID
										HAVING		COUNT(a.Department_ID)
										ORDER BY	COUNT(a.Department_ID) DESC
										LIMIT		1);
SELECT 		* 
FROM 		Department_with_the_most_employees;
                                        
CREATE VIEW Users_with_last_name_Nguyen AS
SELECT 		*
FROM 		Question q 
JOIN 		`Account` a ON q.Creator_ID = a.Account_ID
WHERE		SUBSTRING_INDEX(Full_Name,' ',1) = 'Nguyen';
SELECT 		* 
FROM 		Users_with_last_name_Nguyen;


                                    
                                    

                            