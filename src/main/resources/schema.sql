CREATE TABLE IF NOT EXISTS source(
   sourceId INTEGER   NOT NULL AUTO_INCREMENT,
   repositoryId INTEGER NOT NULL,
   name VARCHAR(128) NOT NULL,
   authorName VARCHAR(128),
   callNbr VARCHAR(50),
   webSite VARCHAR(128),
   notes VARCHAR(128),
   PRIMARY KEY (sourceId )

CREATE TABLE IF NOT EXISTS repository(
   repositoryId INTEGER   NOT NULL AUTO_INCREMENT,
   name VARCHAR(128) NOT NULL,
   streetAddress VARCHAR(128),
   city VARCHAR(128),
   state VARCHAR(2),
   zip VARCHAR(10),
   webSite VARCHAR(128),
   emailAddress VARCHAR(128),
   PRIMARY KEY (libraryId )

CREATE TABLE IF NOT EXISTS researchLog(
   researchLogId INTEGER   NOT NULL AUTO_INCREMENT,
   sourceId INTEGER   NOT NULL,
   repositoryId INTEGER NOT NULL,
   typeId INTEGER NOT NULL, 
   researchInformation VARCHAR(128),
   timeFrame VARCHAR(20),
   family VARCHAR(30),
   researchDate DATE
   PRIMARY KEY (researchLogId )
