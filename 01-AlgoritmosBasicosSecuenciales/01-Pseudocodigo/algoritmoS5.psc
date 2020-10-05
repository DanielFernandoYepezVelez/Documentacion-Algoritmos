//problema #5.
//CALCULAR EL SALARIO NETO DE UN TRABAJADOR SABIENDO QUE SE LE DEBE 
//HACER UNA RETENCION DEL 3% PARA PENSION Y 5% PARA SALUD.EL SALARIO
//SE CALCULA APARTIR DEL VALOR DE CADA HORA TRABAJADA Y EL NUMERO 
//DE HORAS TRABAJAS POR EL EMPLEADO.

Algoritmo CincoSegundaParte
	
	Definir horaTrabajada, horasTrabajadas, salario, retencion, retencionSalud, salarioNeto como real;
	
	Escribir "valor de cada hora trabajada";
	leer horaTrabajada;
	Escribir "numero de horas trabajadas";
	leer horasTrabajadas;
	
	salario<-horaTrabajada*horasTrabajadas;
	retencion<-salario*0.03;
	retencionSalud<-salario*0.05;
	salarioNeto<-salario-(retencion+retencionSalud);
	
	Escribir "el salario neto es: ", + salarioNeto;
	
FinAlgoritmo
