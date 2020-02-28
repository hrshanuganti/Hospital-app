
CREATE TABLE PATIENT
        (
       id NUMBER(10) NOT NULL,
       patientname VARCHAR2(50) NOT NULL,
       patientsurname VARCHAR2(50) NOT NULL,
       patientemail VARCHAR2(50) NOT NULL,
       height NUMBER(10)  NOT NULL,
       weight NUMBER(10)  NOT NULL,
       bmi NUMBER(10)   NULL,
       capturedby VARCHAR2(50) NOT NULL,
       systolicbloodpressure NUMBER(10) NOT NULL,
       diastolicbloodpressure NUMBER(10) NOT NULL,
        );



CREATE TABLE REGISTRATION
        (
       id NUMBER(10) NOT NULL,
       username VARCHAR2(50) NOT NULL,
       userpassword VARCHAR2(50) NOT NULL,
       usertype VARCHAR2(50) NOT NULL,
      
       );
