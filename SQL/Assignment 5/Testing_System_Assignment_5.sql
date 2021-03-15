DROP TRIGGER IF EXISTS not_insert_group_1year_previous;
DELIMITER $$
	CREATE TRIGGER not_insert_group_1year_previous
    BEFORE INSERT ON `Group`
    FOR EACH ROW
    BEGIN
		IF (NEW.Create_Date< DATE_SUB(CURRENT_DATE, INTERVAL 1 YEAR)) THEN
			SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Can  not add';
		END IF;
    END$$
DELIMITER ;

DROP TRIGGER IF EXISTS not_accept_add_sale;
DELIMITER $$
	CREATE TRIGGER not_accept_add_sale
    BEFORE INSERT ON `Department`
    FOR EACH ROW
    BEGIN
			IF (NEW.Department_Name = 'Sale') THEN
				SIGNAL SQLSTATE '12345'
				SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
			END IF;
    END$$
DELIMITER ;

DROP TRIGGER IF EXISTS max_1group_5users;
DELIMITER $$
CREATE TRIGGER max_1group_5users
BEFORE INSERT ON `ExamQuestion`
FOR EACH ROW
BEGIN
		IF (SELECT 	Group_ID 
			FROM Group_Account 
            GROUP BY Group_ID 
            HAVING Count(Account_ID) >= 5) THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = '1 group with max is 5 users';
        END IF;
END $$
DELIMITER ;
INSERT INTO `GroupAccount`	(  Group_ID	, Account_ID	, Join_Date	 )
VALUE 						(	1		,    1			,'2019-03-05');