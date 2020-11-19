//PROBLEMA #8.
//ELABORAR UN ALGORITMO QUE CALCULE EL VALOR DE R DE ACUERDO A LA SIGUIENTE RELACION:
//R=(A*B)/(C*D) SI X*i>0
//R=(A+B)/(C+D) SI X*i=0
//R=(A+B)-C+D SI X*i<0

Algoritmo OchoSegundaParte
	
	definir A,B,C,D,X,i,R, condicion como real;
	
	Escribir "ingrese un valor para A";
	leer A;
	Escribir "ingrese un valor para B";
	leer B;
	Escribir "ingrese un valor para C";
	leer C;
	escribir "ingrese un valor para D";
	leer D;
	Escribir "ingrese un valor para X";
	leer X;
	Escribir "ingrese un valor para i";
	leer i;
	
	Escribir " ";
	si (X*i>0) entonces
		R<-((A*B)/(C*D));
		Escribir "el valor de R es ", R;
	SiNo
		si(X*i=0) entonces
			R<-((A+B)/(C+D));
			escribir "el valor de R es ", R;
		SiNo
			R<-((A+B)-C+D);
			Escribir "el valor de R es ", R;
		FinSi
	FinSi

FinAlgoritmo
