# StudentsBankOfIndia
“Students Bank of India”. It consisting of following 5 modules.
1.	Bank Adminstration: Only authorize bank employee can access “Students Bank of India OLTP modules”. New admin can register them-self using Registration form.

2.	Welcome module: This module welcomes the authorized bank employee for OLTP and provides basic information for using this system through text and video.

3.	Create Account :  Login bank employee can create account for new customers of the bank using “Create Account Form”.

4.	Deposit / Withdraw : Login bank employee can deposit or withdraw from any already existing account of the bank. 


5.	Account Transaction :  Login bank employee can process transaction to & from any two already existing accounts of the bank.

6.	Bank Statement : Login bank employee can view bank statement between any period of time of any already existing customer of the bank.


7.	Authorization of Credit Card: Login bank employee can authorize credit card for any existing accounts of the bank if and only if maximum amount limit of the credit card is to be less the current amount balance of said account. 
Note: This project consists of a web service for authorizing credit cards.

Database Tables Schema:
1.	Bank_Admin:	

CREATE TABLE BANK_ADMIN(
EMP_ID INT PRIMARY KEY,
EMP_FNAME VARCHAR(20) NOT NULL,
EMP_MNAME VARCHAR(20),
EMP_LNAME VARCHAR(20),
EMP_DESIGN VARCHAR(10) NOT NULL,
USER_NAME VARCHAR(16) NOT NULL UNIQUE,
PASSWORD VARCHAR(10) NOT NULL
)


2.	Customer_Account: 	

CREATE TABLE CUSTOMER_ACCOUNT(
CUST_ID INT PRIMARY KEY AUTO_INCREMENT,
CNAME VARCHAR(20) NOT NULL,
DOB DATE NOT NULL,
ADDR_L1 VARCHAR(100) NOT NULL,
ADDR_L2 VARCHAR(100) NOT NULL,
STATE VARCHAR(10) NOT NULL,
REG_EMAIL VARCHAR(40) NOT NULL UNIQUE,
ACCOUNT_NO INT NOT NULL UNIQUE,
ACC_TYPE VARCHAR(10) NOT NULL
)

3.	Account Net Balance:	
CREATE TABLE ACC_NETBAL (
ACCOUNT_NO INT PRIMARY KEY REFERENCES CUSTOMER_ACCOUNT(ACCOUNT_NO),
ACC_BAL INT DEFAULT 0
);

4.	Account Transaction:   

 CREATE TABLE ACCOUNT_TRANSACTION(
TRANS_ID INT PRIMARY KEY AUTO_INCREMENT,
ACCOUNT_NO INT REFERENCES CUSTOMER_ACCOUNT(ACCOUNT_NO),
DEBIT INT ,
CREDIT INT ,
TRANS_DATE DATE NOT NULL,
DESCRIPTION VARCHAR(40)
)

5.	Authorized Credit Card:

CREATE TABLE AUTHORIZED_CREDITCARD (
CC_ID INT PRIMARY KEY AUTO_INCREMENT,
CNAME VARCHAR(20) NOT NULL,
ACCOUNT_NO INT REFERENCES CUSTOMER_ACCOUNT(ACCOUNT_NO),
CC_NUMBER VARCHAR(15) NOT NULL UNIQUE,
CVV VARCHAR(10) NOT NULL,
AMOUNT INT(10) NOT NULL
)
