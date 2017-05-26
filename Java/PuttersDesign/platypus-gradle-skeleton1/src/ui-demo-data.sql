CREATE USER IF NOT EXISTS SA SALT 'f6e293b0d7d6a619' HASH '50007d9c9583418d29b0d79144556ca7ce646060aacc1af32ffbe2dbf9a4d55e' ADMIN;
CREATE CACHED TABLE PUBLIC.OWNERS(
    OWNERS_ID DECIMAL(18, 0) NOT NULL,
    FIRSTNAME VARCHAR(100),
    LASTNAME VARCHAR(100),
    ADDRESS VARCHAR(100),
    CITY VARCHAR(100),
    TELEPHONE VARCHAR(100),
    EMAIL VARCHAR(100)
);
ALTER TABLE PUBLIC.OWNERS ADD CONSTRAINT PUBLIC.OWNERS_PK PRIMARY KEY(OWNERS_ID);
-- 2 +/- SELECT COUNT(*) FROM PUBLIC.OWNERS;
INSERT INTO PUBLIC.OWNERS(OWNERS_ID, FIRSTNAME, LASTNAME, ADDRESS, CITY, TELEPHONE, EMAIL) VALUES
(142841788496711, 'Ivan', 'Ivanov', 'Ivanovskaya st.', 'Ivanovo', '+79011111111', 'sample@example.com'),
(142841834950629, 'Petr', 'Petrov', 'Petrovskaya', 'Saint Petersburg', '+79022222222', 'test@test.ru');
CREATE CACHED TABLE PUBLIC.PETS(
    PETS_ID DECIMAL(18, 0) NOT NULL,
    OWNER_ID DECIMAL(65535, 32767) NOT NULL,
    TYPE_ID DECIMAL(65535, 32767) NOT NULL,
    NAME VARCHAR(100),
    BIRTHDATE TIMESTAMP
);
ALTER TABLE PUBLIC.PETS ADD CONSTRAINT PUBLIC.PETS_PK PRIMARY KEY(PETS_ID);
-- 3 +/- SELECT COUNT(*) FROM PUBLIC.PETS;
INSERT INTO PUBLIC.PETS(PETS_ID, OWNER_ID, TYPE_ID, NAME, BIRTHDATE) VALUES
(142841880961396, 142841788496711, 142841300122653, 'Druzhok', NULL),
(142841883974964, 142841834950629, 142841300155478, 'Vasya', TIMESTAMP '2015-04-29 00:00:00.0'),
(143059430815594, 142841788496711, 142850046716850, 'Pik', NULL);
CREATE CACHED TABLE PUBLIC.PETTYPES(
    PETTYPES_ID DECIMAL(18, 0) NOT NULL,
    NAME VARCHAR(100)
);
ALTER TABLE PUBLIC.PETTYPES ADD CONSTRAINT PUBLIC.PETTYPES_PK PRIMARY KEY(PETTYPES_ID);
-- 3 +/- SELECT COUNT(*) FROM PUBLIC.PETTYPES;
INSERT INTO PUBLIC.PETTYPES(PETTYPES_ID, NAME) VALUES
(142841300122653, 'Dog'),
(142841300155478, 'Cat'),
(142850046716850, 'Mouse');
CREATE CACHED TABLE PUBLIC.TEMP(
    TEMP_ID DECIMAL(18, 0) NOT NULL,
    FIELD1 BLOB(100) NOT NULL
);
ALTER TABLE PUBLIC.TEMP ADD CONSTRAINT PUBLIC.CONSTRAINT_2 PRIMARY KEY(TEMP_ID);
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.TEMP;
CREATE CACHED TABLE PUBLIC.DUMMYTABLE(
    DUMMY DECIMAL(18, 0)
);
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.DUMMYTABLE;
CREATE CACHED TABLE PUBLIC.VISIT(
    VISIT_ID DECIMAL(18, 0) NOT NULL,
    PET_ID DECIMAL(65535, 32767) NOT NULL,
    FROMDATE TIMESTAMP,
    TODATE TIMESTAMP,
    DESCRIPTION VARCHAR(100),
    ISPAID BOOLEAN
);
ALTER TABLE PUBLIC.VISIT ADD CONSTRAINT PUBLIC.VISIT_PK PRIMARY KEY(VISIT_ID);
-- 3 +/- SELECT COUNT(*) FROM PUBLIC.VISIT;
INSERT INTO PUBLIC.VISIT(VISIT_ID, PET_ID, FROMDATE, TODATE, DESCRIPTION, ISPAID) VALUES
(143023673259940, 142841883974964, TIMESTAMP '2015-04-28 18:58:52.604', TIMESTAMP '2015-04-29 00:00:00.0', STRINGDECODE('\u044b\u0430\u0432\u043a\u043f'), NULL),
(143031982989403, 142841880961396, TIMESTAMP '2015-04-29 18:03:49.898', NULL, NULL, NULL),
(143029901200462, 142841883974964, TIMESTAMP '2015-04-29 12:16:52.008', TIMESTAMP '2015-04-30 00:00:00.0', '1234', NULL);
ALTER TABLE PUBLIC.PETS ADD CONSTRAINT PUBLIC.FK_143039780889568 FOREIGN KEY(TYPE_ID) REFERENCES PUBLIC.PETTYPES(PETTYPES_ID) ON DELETE CASCADE ON UPDATE CASCADE NOCHECK;
ALTER TABLE PUBLIC.PETS ADD CONSTRAINT PUBLIC.FK_137568650945995 FOREIGN KEY(OWNER_ID) REFERENCES PUBLIC.OWNERS(OWNERS_ID) ON DELETE CASCADE ON UPDATE CASCADE NOCHECK;
ALTER TABLE PUBLIC.VISIT ADD CONSTRAINT PUBLIC.FK_137568671360207 FOREIGN KEY(PET_ID) REFERENCES PUBLIC.PETS(PETS_ID) ON DELETE CASCADE ON UPDATE CASCADE NOCHECK;
