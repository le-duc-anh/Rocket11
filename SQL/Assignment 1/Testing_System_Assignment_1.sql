DROP DATABASE IF EXISTS Assignment1;
CREATE DATABASE Assignment1;
USE Assignment1;

CREATE TABLE Department(
	Department_ID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name 		VARCHAR(50) NOT NULL UNIQUE KEY
);

CREATE TABLE `Position`(
	Position_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Position_Name			ENUM('Dev','Test','Scrum Master','PM') NOT NULL UNIQUE KEY
);

CREATE TABLE `Account`(
	Account_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email					VARCHAR(50) NOT NULL UNIQUE KEY,
    Username				VARCHAR(50) NOT NULL UNIQUE KEY,
    Full_Name				VARCHAR(50) NOT NULL,
    Department_ID 			TINYINT UNSIGNED NOT NULL,
    Position_ID				TINYINT UNSIGNED NOT NULL,
    Create_Date				DATETIME DEFAULT NOW(),
    FOREIGN KEY(Department_ID) REFERENCES Department(Department_ID),
    FOREIGN KEY(Position_ID) REFERENCES `Position`(Position_ID)
);

CREATE TABLE `Group`(
	Group_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Group_Name				VARCHAR(50) NOT NULL UNIQUE KEY,
    Creator_ID				TINYINT UNSIGNED NOT NULL,
    Create_Date				DATETIME DEFAULT NOW(),
    FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)
);
CREATE TABLE GroupAccount(
	Group_ID				TINYINT UNSIGNED NOT NULL,
    Account_ID				TINYINT UNSIGNED NOT NULL,
    Join_Date				DATETIME DEFAULT NOW(),
    FOREIGN KEY(Group_ID) REFERENCES `Group`(Group_ID),
    FOREIGN KEY(Account_ID) REFERENCES `Account`(Account_ID),
    PRIMARY KEY (Group_ID, Account_ID)
);

CREATE TABLE TypeQuestion(
    Type_ID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Type_Name 				ENUM('Esay','Multiple-Choice') NOT NULL UNIQUE KEY
);

CREATE TABLE CategoryQuestion(
    Category_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
    Category_Name			VARCHAR(50) NOT NULL UNIQUE KEY
);

CREATE TABLE Question(
    Question_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content					VARCHAR(50) NOT NULL,
    Category_ID				TINYINT UNSIGNED NOT NULL,
    Type_ID					TINYINT UNSIGNED NOT NULL,
    Creator_ID				TINYINT UNSIGNED NOT NULL UNIQUE KEY,
    Create_Date				DATETIME DEFAULT NOW(),
    FOREIGN KEY(Category_ID	) REFERENCES CategoryQuestion(Category_ID),
    FOREIGN KEY(Type_ID) REFERENCES TypeQuestion(Type_ID),
    FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)
);

CREATE TABLE Answer(
    Answers_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content					VARCHAR(50) NOT NULL,
    Question_ID				TINYINT UNSIGNED NOT NULL,
    isCorrect				BIT NOT NULL,
    FOREIGN KEY(Question_ID) REFERENCES Question(Question_ID)
);

CREATE TABLE Exam(
    Exam_ID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Code					VARCHAR(50) NOT NULL,
    Title					VARCHAR(50) NOT NULL,
    Category_ID				TINYINT UNSIGNED NOT NULL,
    Duration				TINYINT UNSIGNED NOT NULL,
    Creator_ID				TINYINT UNSIGNED NOT NULL,
    Create_Date				DATETIME DEFAULT NOW(),
    FOREIGN KEY(Category_ID) REFERENCES CategoryQuestion(Category_ID),
    FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)
);

CREATE TABLE ExamQuestion(
    Exam_ID					TINYINT UNSIGNED NOT NULL,
	Question_ID				TINYINT UNSIGNED NOT NULL,
	FOREIGN KEY(Question_ID) REFERENCES Question(Question_ID),
    FOREIGN KEY(Exam_ID) REFERENCES Exam(Exam_ID),
    PRIMARY KEY (Exam_ID, Question_ID)
);

INSERT INTO Department	(Department_ID		,Department_Name)
VALUES 					('1'				,'Marketing'	),		
						('2'				,'Sale'			),
                        ('3'				,'Bảo vệ'		),
                        ('4'				,'Nhân sự'		),
                        ('5'				,'Kỹ thuật'		),
                        ('6' 				,'Tài chính' 	),
                        ('7'				,'Phó giám đốc'	),
                        ('8'				,'Giám đốc'		),
                        ('9' 				,'Thư kí'		),
                        ('10'				,'Bán hàng'		);

INSERT INTO `Position`	(Position_ID		,Position_Name)
VALUES 					('1'				,'Dev'			),		
						('2'				,'Test'			),
                        ('3'				,'Scrum Master'	),
                        ('4'				,'PM'			);

INSERT INTO `Account`	(Account_ID			,Email								, Username			, Full_Name				, Department_ID	, Position_ID, Create_Date)
VALUES 					('1'				,'haidang29productions@gmail.com'	, 'dangblack'		,'Nguyễn hải Đăng'		,   '5'			,   '1'		,'2020-03-05'),
						('2'				,'account1@gmail.com'				, 'quanganh'		,'Nguyen Chien Thang2'	,   '1'			,   '2'		,'2020-03-05'),
						('3'				,'account2@gmail.com'				, 'vanchien'		,'Nguyen Van Chien'		,   '2'			,   '3'		,'2020-03-07'),
						('4'				,'account3@gmail.com'				, 'cocoduongqua'	,'Duong Do'				,   '3'			,   '4'		,'2020-03-08'),
						('5'				,'account4@gmail.com'				, 'doccocaubai'		,'Nguyen Chien Thang1'	,   '4'			,   '4'		,'2020-03-10'),
						('6'				,'dapphatchetngay@gmail.com'		, 'khabanh'			,'Ngo Ba Kha'			,   '6'			,   '3'		,'2020-04-05'),
						('7'				,'sontungmtp@gmail.com'				, 'tungnui'			,'Nguyen Thanh Tung'	,   '8'			,   '1'		,'2020-04-07'),
						('8'				,'duongghuu@gmail.com'				, 'duongghuu'		,'Duong Van Huu'		,   '9'			,   '2'		,'2020-04-07'),
						('9'				,'vtiaccademy@gmail.com'			, 'vtiaccademy'		,'Vi Ti Ai'				,   '10'		,   '1'		,'2020-04-09');

INSERT INTO `Group`		(Group_ID			,Group_Name				,Creator_ID			,Create_Date)		
VALUES 					('1'				,'DDD'					,'2'				,'2020-03-07'),		
						('2'				,'Amenoma'				,'3'				,'2020-03-10'),
                        ('3'				,'The Roderick Firm'	,'6'				,'2020-04-07'),
                        ('4'				,'Blue Impact'			,'5'				,'2020-04-10'),
                        ('5'				,'Canossa'				,'7'				,'2020-05-10');

INSERT INTO GroupAccount(Group_ID			,Account_ID				,Join_Date)
VALUES					('1'				,'1'					,'2020-03-07'),	
						('2'				,'4'					,'2020-03-10'),	
                        ('3'				,'8'					,'2020-04-07'),	
                        ('4'				,'9'					,'2020-04-10'),	
                        ('5'				,'2'					,'2020-05-10');

INSERT INTO TypeQuestion(Type_ID			,Type_Name)
VALUES 					('1'				,'Esay'				),
						('2'				,'Multiple-Choice'	);
INSERT INTO CategoryQuestion	(Category_ID		,Category_Name)
VALUES 	                     	('1'				,'Java'		),
								('2'				,'.NET'		),                                
                                ('3'				,'SQL'		),
                                ('4'				,'Postman'	),
                                ('5'				,'Ruby'		);

INSERT INTO Question	(Question_ID		,Content													,Category_ID		,Type_ID 	,Creator_ID	,Create_Date)
VALUES  				('1'				,'Garbage Collection is manual process'						,'1'				,'2'		,'1'		,'2020-05-10'),
						('2'				,'Which of the following is not a Java features?'			,'1'				,'2'		,'2'		,'2020-05-10'),
						('3'				,'What is the full form of SQL?'							,'3'				,'2'		,'3'		,'2020-05-10'),
						('4'				,'SQL Views are also known as'								,'3'				,'2'		,'4'		,'2020-05-10'),
						('5'				,'How many Primary keys can have in a table?'				,'3'				,'2'		,'5'		,'2020-05-10');

INSERT INTO Answer		( Answers_ID		,Content					,Question_ID	 	,isCorrect)
VALUES                  ('1'				,'False'					,'1'				,'1'),
						('2'				,'Use of pointers'			,'2'				,'1'),
                        ('3'				,'Structure Query Language'	,'3'				,'1'),
                        ('4'				,'Virtual tables'			,'4'				,'1'),
                        ('5'				,'Only 1'					,'5'				,'1');

INSERT INTO Exam				(Exam_ID		,Code	,Title		,Category_ID	,Duration	,Creator_ID	,Create_Date)
VALUES                        	('1'			,'001'	,'Exam1'	,'1'			,'90'		,'5'		,'2020-05-10'),
								('2'			,'002'	,'Exam1'	,'1'			,'90'		,'6'		,'2020-05-10'),
                                ('3'			,'001'	,'Exam2'	,'3'			,'60'		,'7'		,'2020-05-10'),
                                ('4'			,'002'	,'Exam2'	,'3'			,'60'		,'9'		,'2020-05-10'),
                                ('5'			,'001'	,'Exam3'	,'3'			,'30'		,'8'		,'2020-05-10');

INSERT INTO ExamQuestion(Exam_ID    		,Question_ID)                    
VALUES         			('1'				,'1'	),
						('2'				,'2'	),
                        ('3'				,'5'	),
                        ('4'				,'4'	),
                        ('5'				,'3'	);
                        
                        
            