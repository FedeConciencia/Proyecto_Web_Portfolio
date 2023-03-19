create database proyecto_portfolio;

SET SQL_SAFE_UPDATES = 0;

use proyecto_portfolio;

#---------------------------------------

#Query Nativo para obtener por Id_Persona un Usuario (1:1) =>
Select u.* from usuario as u inner join persona as p on u.id_persona = p.id where p.id = 1;

#Query Nativo para obtener por Id_Persona un Domicilio (1:1)=>
Select d.* from domicilio as d inner join persona as p on d.id_persona = p.id where p.id = 1;

#Query Nativo para obtener por Id_Persona una Lista Imagenes (1:N)=>
Select i.* from imagen as i inner join persona as p on i.id_persona = p.id where p.id = 1;

#Query Nativo para obtener por Id_Persona una Lista de Idiomas (N:N)=>
Select i.* from idioma as i inner join detalle_idioma as d on d.id_idioma = i.id inner join persona as p on p.id = d.id_persona where p.id = 1;

#Query Nativo para obtener por Id_Persona una Lista RedSocial (1:N)=>
Select r.* from red_social as r inner join persona as p on r.id_persona = p.id where p.id = 1;

#Query Nativo para obtener por Id_Persona una Lista de ProSkill (N:N)=>
Select s.* from pro_skill as s inner join detalle_pro_skill as d on d.id_pro_skill = s.id inner join persona as p on p.id = d.id_pro_skill where p.id = 1;

#Query Nativo para obtener por Id_Persona una Lista de PersonalSkill (N:N)=>
Select s.* from personal_skill as s inner join detalle_personal_skill as d on d.id_personal_skill = s.id inner join persona as p on p.id = d.id_personal_skill where p.id = 1;

#Query Nativo para obtener por Id_Persona una FormacionAcademica (1:N)=>
Select f.* from formacion_academica as f inner join persona as p on f.id_persona = p.id where p.id = 1;

#Query Nativo para obtener por Id_Persona una FormacionComplementaria (1:N)=>
Select f.* from formacion_complementaria as f inner join persona as p on f.id_persona = p.id where p.id = 1;

#Query Nativo para obtener por Id_Persona una Lista Experiencia_Laboral (1:N) =>
Select ex.* from experiencia_laboral as ex inner join persona as p on ex.id_persona = p.id where p.id = 1;

#Query Nativo para obtener por Id_ExperienciaLab una Descripcion Laboral  (1:N)=>
Select d.* from descripcion_laboral as d inner join experiencia_laboral as e on d.id_experiencia = e.id where e.id = 1;


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