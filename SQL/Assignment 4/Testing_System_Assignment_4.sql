DELIMITER $$
CREATE PROCEDURE account_dp(IN in_dpname NVARCHAR(50))
BEGIN

	SELECT 		*
    FROM		Department d 
	JOIN 		`Account` a ON d.Department_ID = a.Department_ID
    WHERE		Department_Name = in_dpname;
	
END$$
DELIMITER ;
CALL account_dp('Sale');

DELIMITER $$
CREATE PROCEDURE account_gr(IN in_groupid TINYINT UNSIGNED)
BEGIN

	SELECT 		Group_ID, COUNT(Account_ID)
    FROM		GroupAccount 
    WHERE		Group_ID = in_groupid
    GROUP BY	Group_ID;
	
END$$
DELIMITER ;
CALL account_gr();

DELIMITER $$
CREATE PROCEDURE question_month()
BEGIN

	SELECT		COUNT(Type_ID)
    FROM		Question
    WHERE		MONTH(Create_Date) = Month(NOW());
	
END$$
DELIMITER ;
CALL question_month();

DELIMITER $$
CREATE PROCEDURE tq_max(OUT out_typeid TINYINT)
BEGIN
	
    SELECT		Type_ID INTO out_typeid, COUNT(Type_ID)
	FROM		Question 
    GROUP BY	Type_ID
    HAVING 		COUNT(Type_ID) =(		SELECT		COUNT(Type_ID)
										FROM		Question 
										GROUP BY	Type_ID
										ORDER BY	COUNT(Type_ID) DESC
										LIMIT 		1);
END$$
DELIMITER ;
CALL tq_max();

DELIMITER $$
CREATE PROCEDURE search_tp(OUT out_typeid TINYINT)
BEGIN

	SELECT		Type_ID INTO out_typeid, COUNT(Type_ID),Type_Name
	FROM		Question q
    GROUP BY	Type_ID
    JOIN 		TypeQuestion tq ON q.Type_ID = tq.Type_ID
    HAVING 		COUNT(Type_ID) =(		SELECT		COUNT(Type_ID)
										FROM		Question 
										GROUP BY	Type_ID
										ORDER BY	COUNT(Type_ID) DESC
										LIMIT 		1);	
	
END$$
DELIMITER ;
CALL search_tp();

DELIMITER $$
CREATE PROCEDURE grname_or_username(IN in_inputstring VARCHAR(50))
BEGIN
		SELECT 	Group_Name, Username
        FROM	`Group`
        JOIN 	GroupAccount ga ON g.Group_ID = ga.Group_ID
        JOIN 	`Account` a ON ga.Account_ID = a.Account_ID
		WHERE	g.Group_Name LIKE CONCAT('%', in_inputstring, '%') OR a.Username LIKE CONCAT('%', in_inputstring, '%');
END$$
DELIMITER ;
CALL grname_or_username()

DELIMITER $$
CREATE PROCEDURE insert_inf(IN in_email VARCHAR(50), IN in_fullname NVARCHAR(50))						
BEGIN
	DECLARE Username VARCHAR(50) DEFAULT SUBSTRING_INDEX(in_email,'@',1);
    DECLARE position_id TINYINT UNSIGNED DEFAULT 0;
    DECLARE department_id TINYINT UNSIGNED DEFAULT 0;
	
	INSERT INTO `Account` 	(Email		,Username, Full_Name		, Department_ID,	Position_ID)
    VALUE					(in_email	,Username, in_fullname		, department_id, 	position_id);
	
    SELECT 	*
    FROM 	`Account`a
    WHERE	a.Username = Username;
	
END$$
DELIMITER ;
CALL import_inf();

DELIMITER $$
CREATE PROCEDURE max_content(IN in_typename VARCHAR(15))
BEGIN
	IF (in_typename = 'Essay') THEN
		SELECT	Content, MAX(LENGTH(Content))
		FROM	Question
		WHERE	Type_ID = 1;
	ELSEIF (in_typename = 'Multiple-Choice') THEN
		SELECT	Content, MAX(LENGTH(Content))
		FROM	Question
		WHERE	Type_ID = 2;
	END IF;
END$$
DELIMITER ;
CALL max_content();

DELIMITER $$
CREATE PROCEDURE delete_exam(IN in_examid TINYINT UNSIGNED)
BEGIN
	DELETE 	
    FROM 	Exam 
    WHERE	Exam_ID = in_examid;	
END$$
DELIMITER ;
CALL delete_exam();

DELIMITER $$
CREATE PROCEDURE delete_3_years()
BEGIN
	DELETE FROM Exam
	WHERE 	(YEAR(NOW()) - YEAR(Create_Date)) > 3;
END$$
DELIMITER ;
CALL delete_3_years();

DELIMITER $$
CREATE PROCEDURE delete_dp(IN in_dpname NVARCHAR(50))
BEGIN
	UPDATE 	`Account`
    SET		Department_ID = 10
    WHERE	Department_ID = (SELECT Department_ID	
							FROM	Department
							WHERE 	Department_Name = in_dpname);
	DELETE 
    FROM	Department
    WHERE	Department_Name = in_dpname;
END$$
DELIMITER ;
CALL delete_dp();

DELIMITER $$
CREATE PROCEDURE count_question()
BEGIN
		SELECT month_year.MONTH, COUNT(Question_ID) AS COUNT
		FROM
		(
             SELECT 1 AS MONTH
             UNION SELECT 2 AS MONTH
             UNION SELECT 3 AS MONTH
             UNION SELECT 4 AS MONTH
             UNION SELECT 5 AS MONTH
             UNION SELECT 6 AS MONTH
             UNION SELECT 7 AS MONTH
             UNION SELECT 8 AS MONTH
             UNION SELECT 9 AS MONTH
             UNION SELECT 10 AS MONTH
             UNION SELECT 11 AS MONTH
             UNION SELECT 12 AS MONTH
        ) AS month_year
		LEFT JOIN Question ON month_year.MONTH = MONTH(Create_Date)
		GROUP BY month_year.MONTH
		ORDER BY month_year.MONTH ASC;
END$$
DELIMITER ;
CALL count_question();

DELIMITER $$
CREATE PROCEDURE count_6_month()
BEGIN
		SELECT prev_6_month.MONTH, COUNT(Question_ID) AS COUNT
		FROM
		(
			SELECT MONTH(CURRENT_DATE - INTERVAL 5 MONTH) AS MONTH
			UNION
			SELECT MONTH(CURRENT_DATE - INTERVAL 4 MONTH) AS MONTH
			UNION
			SELECT MONTH(CURRENT_DATE - INTERVAL 3 MONTH) AS MONTH
			UNION
			SELECT MONTH(CURRENT_DATE - INTERVAL 2 MONTH) AS MONTH
			UNION
			SELECT MONTH(CURRENT_DATE - INTERVAL 1 MONTH) AS MONTH
			UNION
			SELECT MONTH(CURRENT_DATE - INTERVAL 0 MONTH) AS MONTH
        ) AS prev_6_month
		LEFT JOIN Question ON prev_6_month.MONTH = MONTH(Create_Date)
		GROUP BY prev_6_month.MONTH
		ORDER BY prev_6_month.MONTH ASC;
END$$
DELIMITER ;
CALL count_6_month();