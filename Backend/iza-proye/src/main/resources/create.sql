create table IF NOT EXISTS cliente(id int auto_increment primary key, nombre varchar(255),apellido varchar (255),correo varchar (255), telefono int);
create table IF NOT EXISTS servicio(id int auto_increment primary key,nombreServicio varchar(255), costo int);
create table IF NOT EXISTS cita(id int auto_increment primary key, cliente_id int, servicio_id int);

