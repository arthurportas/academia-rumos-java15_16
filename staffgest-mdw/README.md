
JAVA practice with CRUD system

1 - Draw a small app to perform a CRUD on Employees for a SOHO(small office, home office)

TIPS:

-Draw domain models
-apply OOP concerns like:
	-inheritance
	-encapsulation
-draw contracts(interfaces, abstract)
-override toString
-use method overloading

-draw an utils class with static methods

-draw a menu using do-while loop that reads input from stdIn, and write to stdOut

----------------------------------------------------------------------------------------
WEB-PRESENTATION-HTML/JSON/XML
----
DOMAIN--BUSINESS 
----MDW
PERSISTENCE

------------------------------------------
Domain - 		PERSISTENCE

Employees		  employee
id int            id int Primary KEY AUTO_INCREMENT
firstName String  first_name text/varchar(40)
lastName String   last_name text/varchar(40)
JOB job           job_name text/varchar(40)
                  job_key_resp text/varchar(200)
				 
salary BigDecimal salary , ?

JOB
name String
List<String> keyResponsabilities 