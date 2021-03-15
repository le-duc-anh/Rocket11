DROP DATABASE IF EXISTS FinalExam;
CREATE DATABASE FinalExam;
USE FinalExam;

CREATE TABLE Country(
	CountryID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CountryName 		VARCHAR(50) NOT NULL UNIQUE KEY
);

CREATE TABLE Location(
	LocationID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    StreetAddress		VARCHAR(50) NOT NULL,
    PostalCode			VARCHAR(50) NOT NULL,
    CountryID			TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY (CountryID) REFERENCES  Country(CountryID) ON DELETE CASCADE
);

CREATE TABLE Employee(
	EmployeeID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    FullName			VARCHAR(50) NOT NULL,
    Email				VARCHAR(50) NOT NULL,
    LocationID			TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY (LocationID) REFERENCES  Location(LocationID) ON DELETE CASCADE
);
                    
INSERT INTO	Country	(CountryID		,CountryName)
VALUES 				(1				,'Vietnam'					),		
					(2				,'Japan'					),
					(3				,'United Kingdom'			);

INSERT INTO	Location(StreetAddress								,PostalCode  	,CountryID)
VALUES 				('Magdalen Centre, The Oxford Science Park'	,'OX9 9ZB'		,3			),		
					('2017 Shinjuku-ku'							,'1689' 		,2			),
					('68 Phu Tho'  								,'98199'		,1			);
                    
INSERT INTO	Employee(FullName		, Email		  				,LocationID)
VALUES 				('Nguyen Nam'	,'nn03@gmail.com'			,3			),		
					('Franco Durham','Durhammm2s2@gmail.com' 	,1			),
					('Iha Yasu'  	,'yasuiha777@gmail.com'		,2			);
                    
SELECT 		FullName
FROM 		Employee E
JOIN		Location L 	ON 	L.LocationID = 	E.LocationID
JOIN		Country C 	ON 	C.CountryID =	L.CountryID
WHERE 		C.CountryName = 'Vietnam';

SELECT 		CountryName
FROM 		Country  C
JOIN		Location L 	ON 	L.CountryID = 	C.CountryID
JOIN		Employee E	ON 	E.LocationID =	L.LocationID
WHERE 		E.Email	 = 'nn03@gmail.com';

SELECT		CountryID, LocationID, COUNT(EmployeeID) 
FROM		Employee E
JOIN		Location L 	ON 	L.LocationID = 	E.LocationID
JOIN		Country C 	ON 	C.CountryID =	L.CountryID
GROUP BY	E.EmployeeID
ORDER BY	E.EmployeeID ASC;

DROP TRIGGER IF EXISTS Max_Employee_In_Country;
DELIMITER $$
CREATE TRIGGER Max_Employee_In_Country
BEFORE INSERT ON Employee
FOR EACH ROW
BEGIN
		IF (SELECT 		CountryID, Count(EmployeeID)
			FROM		Employee E
			JOIN		Location L 	ON 	L.LocationID = 	E.LocationID
			JOIN		Country C 	ON 	C.CountryID =	L.CountryID
			GROUP BY 	EmployeeID
            HAVING		Count(EmployeeID) >= 10) THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'Max is 10 employee per country';
        END IF;
END $$
DELIMITER ;





