create database proyecto_portfolio;

SET SQL_SAFE_UPDATES = 0;

use proyecto_portfolio;

#---------------------------------------

#Query Nativo para obtener por Id_Persona Experiencia_Laboral =>
Select ex.* from experiencia_laboral as ex inner join persona as p on ex.id_persona = p.id;

#---------------------------------------

#ENTIDAD Persona  =>

SELECT * FROM persona;

SELECT * FROM persona WHERE id = 1;

DELETE FROM persona WHERE id = 1;

UPDATE persona set codigo = "0001" where id = 1;

DELETE FROM persona;

alter table persona auto_increment = 1;

#---------------------------------------

#ENTIDAD Usuario  =>

SELECT * FROM usuario;

SELECT * FROM usuario WHERE id = 1;

DELETE FROM usuario WHERE id = 1;

UPDATE usuario set codigo = "0001" where id = 1;

DELETE FROM usuario;

alter table usuario auto_increment = 1;

#---------------------------------------

#ENTIDAD Domicilio  =>

SELECT * FROM domicilio;

SELECT * FROM domicilio WHERE id = 1;

DELETE FROM domicilio WHERE id = 1;

UPDATE domicilio set codigo = "0001" where id = 1;

DELETE FROM domicilio;

alter table domicilio auto_increment = 1;


#---------------------------------------

#ENTIDAD Imagen  =>

SELECT * FROM imagen;

SELECT * FROM imagen WHERE id = 1;

DELETE FROM imagen WHERE id = 1;

UPDATE imagen set codigo = "0001" where id = 1;

DELETE FROM imagen;

alter table imagen auto_increment = 1;


#---------------------------------------

#ENTIDAD RedSocial  =>

SELECT * FROM red_social;

SELECT * FROM red_social WHERE id = 1;

DELETE FROM red_social WHERE id = 1;

UPDATE red_social set codigo = "0001" where id = 1;

DELETE FROM red_social;

alter table red_social auto_increment = 1;

#---------------------------------------

#ENTIDAD Idioma  =>

SELECT * FROM idioma;

SELECT * FROM idioma WHERE id = 1;

DELETE FROM idioma WHERE id = 1;

UPDATE idioma set codigo = "0001" where id = 1;

DELETE FROM idioma;

alter table idioma auto_increment = 1;

#---------------------------------------

#ENTIDAD DetalleIdioma  =>

SELECT * FROM detalle_idioma;

SELECT * FROM detalle_idioma WHERE id = 1;

DELETE FROM detalle_idioma WHERE id = 1;

UPDATE detalle_idioma set codigo = "0001" where id = 1;

DELETE FROM detalle_idioma;

alter table detalle_idioma auto_increment = 1;

#---------------------------------------

#ENTIDAD ProSkill  =>

SELECT * FROM pro_skill;

SELECT * FROM pro_skill WHERE id = 1;

DELETE FROM pro_skill WHERE id = 1;

UPDATE pro_skill set codigo = "0001" where id = 1;

DELETE FROM pro_skill;

alter table pro_skill auto_increment = 1;

#---------------------------------------

#ENTIDAD DetalleProSkill  =>

SELECT * FROM detalle_pro_skill;

SELECT * FROM detalle_pro_skill WHERE id = 1;

DELETE FROM detalle_pro_skill WHERE id = 1;

UPDATE detalle_pro_skill set codigo = "0001" where id = 1;

DELETE FROM detalle_pro_skill;

alter table detalle_pro_skill auto_increment = 1;

#---------------------------------------

#ENTIDAD PersonalSkill  =>

SELECT * FROM personal_skill;

SELECT * FROM personal_skill WHERE id = 1;

DELETE FROM personal_skill WHERE id = 1;

UPDATE personal_skill set codigo = "0001" where id = 1;

DELETE FROM personal_skill;

alter table personal_skill auto_increment = 1;

#---------------------------------------

#ENTIDAD DetallePersonalSkill  =>

SELECT * FROM detalle_personal_skill;

SELECT * FROM detalle_personal_skill WHERE id = 1;

DELETE FROM detalle_personal_skill WHERE id = 1;

UPDATE detalle_personal_skill set codigo = "0001" where id = 1;

DELETE FROM detalle_personal_skill;

alter table detalle_personal_skill auto_increment = 1;

#---------------------------------------

#ENTIDAD Formacion Academica  =>

SELECT * FROM formacion_academica;

SELECT * FROM formacion_academica WHERE id = 1;

DELETE FROM formacion_academica WHERE id = 1;

UPDATE formacion_academica set codigo = "0001" where id = 1;

DELETE FROM formacion_academica;

alter table formacion_academica auto_increment = 1;

#---------------------------------------

#ENTIDAD Formacion Complementaria  =>

SELECT * FROM formacion_complementaria;

SELECT * FROM formacion_complementaria WHERE id = 1;

DELETE FROM formacion_complementaria WHERE id = 1;

UPDATE formacion_complementaria set codigo = "0001" where id = 1;

DELETE FROM formacion_complementaria;

alter table formacion_complementaria auto_increment = 1;

#---------------------------------------

#ENTIDAD Experiencia Laboral  =>

SELECT * FROM experiencia_laboral;

SELECT * FROM experiencia_laboral WHERE id = 1;

DELETE FROM experiencia_laboral WHERE id = 1;

UPDATE experiencia_laboral set codigo = "0001" where id = 1;

DELETE FROM experiencia_laboral;

alter table experiencia_laboral auto_increment = 1;

#---------------------------------------

#ENTIDAD Descripcion Laboral  =>

SELECT * FROM descripcion_laboral;

SELECT * FROM descripcion_laboral WHERE id = 1;

DELETE FROM descripcion_laboral WHERE id = 1;

UPDATE descripcion_laboral set codigo = "0001" where id = 1;

DELETE FROM descripcion_laboral;

alter table experiencia_laboral auto_increment = 1;