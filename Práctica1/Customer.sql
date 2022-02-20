
DROP TABLE IF EXISTS Customer;
CREATE TABLE IF NOT EXISTS Cliente(
   Custumer_id          INT  NOT NULL PRIMARY KEY
  ,Nombre               VARCHAR(50) NOT NULL
  ,Surname              VARCHAR(30) NOT NULL
  ,Email                VARCHAR(50) NOT NULL
  ,RFC                  VARCHAR(13) NOT NULL
);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3547,'Byrann','Le Huquet','blehuquet0@google.cn',3756412389046);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3548,'Nicol','Gommery','ngommery1@netlog.com',3756412389047);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3549,'Dina','Beeken','dbeeken2@moonfruit.com',3756412389048);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3550,'Georgie','Crouse','gcrouse3@adobe.com',3756412389049);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3551,'Jilli','Dibley','jdibley4@lycos.com',3756412389050);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3552,'Vasilis','Leefe','vleefe5@mlb.com',3756412389051);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3553,'Neal','Bareford','nbareford6@alibaba.com',3756412389052);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3554,'Gabbie','Burchnall','gburchnall7@networkadvertising.org',3756412389053);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3555,'Alyse','Cadogan','acadogan8@hugedomains.com',3756412389054);
INSERT INTO Customer(Customer_id,Nombre,Surname,Email,RFC) VALUES (3556,'Gayel','Bremmer','gbremmer9@independent.co.uk',3756412389055);


COMMENT ON TABLE Customer IS 'Tabla con la información del Cliente';
COMMENT ON TABLE Customer.Customer_id IS 'Número único del Cliente';
COMMENT ON TABLE Customer.Nombre IS 'Nombre del Cliente';
COMMENT ON TABLE Customer.Surname IS 'Apellido del Cliente';
COMMENT ON TABLE Customer.Email IS 'Correo electrónico del Cliente';
COMMENT ON TABLE Customer.RFC IS 'RFC del Cliente';
