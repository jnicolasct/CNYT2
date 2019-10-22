[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

# Libreria de lo clasico a lo cuantico

## Uso General
Para utilizar dicha libreria se debe tener instalado un IDE, ya sea Netbeans, Eclipse, etc, se puede clonar el proyecto utilizando git bash y el comando git clone seguido del link del proyecto, despues de esto se abre algun IDE y se abre el proyecto o se puede descargar el proyecto y abrirlo desde algun IDE.

Para ejecutar las pruebas se puede abrir el paquete "escuelaing.edu.test", que se encuentra en el paquete "Test Package" y ejecutar la clase "CNY2Test" desde algun IDE. Otra opcion es abrir CMD desde la carpeta del proyecto y ejecutar el comando "mvn test".

## Contenido
### Numeros Comlpejos:
Suma, el metodo de esta es: public Complejo sumaComp(Complejo a, Complejo b)

Producto, el metodo de esta es: public Complejo multComp(Complejo a, Complejo b)

Resta, el metodo de esta es: public Complejo restaComp(Complejo a, Complejo b)

División, el metodo de esta es: public Complejo divComp(Complejo a, Complejo b)

Módulo, el metodo de esta es: public double modulo (Complejo a)

Conjugado, el metodo de esta es: public Complejo conjugado(Complejo a)

Conversión entre representaciones polar y cartesiano, el metodo de esta es: de polar a cartesiano public Complejo poCar(Complejo a) y de cartesiano a polar public Complejo caPol(Complejo a)

Retornar la fase de un número complejo., el metodo de esta es: public double fase(Complejo a)

### Vectores Comlpejos:
Adición de vectores complejos, el metodo de esta es: public ArrayList<Complejo> sumaVec(ArrayList<Complejo> vec1, ArrayList<Complejo>vec2)
  
Inversa de vectores complejos, el metodo de esta es: public ArrayList<Complejo> inversaVec(ArrayList<Complejo> vec1)
  
Multiplicación escalar de vectores complejos, el metodo de esta es:  public ArrayList<Complejo> multEscaVec(ArrayList<Complejo> vec1, Complejo a)

### Matrices Comlpejas:
Adición de matrices complejos, el metodo de esta es: public ArrayList<ArrayList<Complejo>> sumaMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2)
  
Inversa de matrices complejos, el metodo de esta es: public ArrayList<ArrayList<Complejo>> inversaMat(ArrayList<ArrayList<Complejo>> mat1)
  
Multiplicación escalar de matrices complejas, el metodo de esta es: public ArrayList<ArrayList<Complejo>> multEscaMat(ArrayList<ArrayList<Complejo>> mat1, Complejo a)
  
Matriz transpuesta, el metodo de esta es: public ArrayList<ArrayList<Complejo>> transpuestaMat(ArrayList<ArrayList<Complejo>> mat1)
  
Matriz conjugada, el metodo de esta es: public ArrayList<ArrayList<Complejo>> conjugadoMat(ArrayList<ArrayList<Complejo>> mat1)
  
Matriz adjunta, el metodo de esta es: public ArrayList<ArrayList<Complejo>> adjuntaMat(ArrayList<ArrayList<Complejo>> mat1)
  
Función para calcular la "acción" de una matriz sobre un vector, el metodo de esta es:  public ArrayList<Complejo> accionMatVec(ArrayList<ArrayList<Complejo>> mat1, ArrayList<Complejo> vec1 )
  
Norma de matrices, el metodo de esta es: public Complejo normaMat(ArrayList<ArrayList<Complejo>> mat1)
  
Distancia entrematrices, el metodo de esta es: public Complejo distMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2)
  
Revisar si es unitaria, el metodo de esta es: public boolean unitariaMat(ArrayList<ArrayList<Complejo>> mat1)
  
Revisar si es Hermitian, el metodo de esta es: public boolean hermitianMat(ArrayList<ArrayList<Complejo>> mat1)
  
Producto tensor, el metodo de esta es:  public ArrayList<ArrayList<Complejo>> productoTensorMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2)
  

### Marbles

Experimento de marbles en donde mediante una matriz de probabilidad y un vector de estado nos permite nos permite saber cual es la probabilida de que una marble este en una posicion despues de cierta cantidad de tiempo (clicks)

Experimento de marbles con matriz y vector de numeros entero, el metodo de este es: public int[] marblesint(int clicks, int[][] probabilidad, int[] estado). 

Experimento de marbles con matriz y vector de numeros decimales, el metodo de este es: public double[] marblesDob(int clicks, double[][] probabilidad, double[] estado)

Experimento de marbles con matriz y vector de numeros complejos, el metodo de este es: public Complejo[] marblesCom(int clicks, Complejo[][] probabilidad, Complejo[] estado)

### Rendijas
Experimento de rendijas que hay en una pared y la cantidad de blancos que hay despues de esta, en donde mediante una matriz de probabilidades de que se se pase por cierta rendija y que de cierta rendija golpee un blanco y un estado inicial de donde empiezan las balas.

Experimento de rendijas con matriz y vector de numeros decimales que retorna el estado actual, el metodo de este es:  public double[] rendijas (int rendijas , int blancos, double probabilidad)

Experimento de rendijas con matriz y vector de numeros decimales que retorna la probabilidad actual, el metodo de este es: public double[][] rendijasMat (int rendijas , int blancos, double probabilidad)

Experimento de rendijas con matriz y vector de numeros complejos que retorna el estado actual, el metodo de este es: public Complejo[] rendijasComp (int rendijas , int blancos, Complejo probabilidad)

Experimento de rendijas con matriz y vector de numeros complejos que retorna la probabilidad actual, el metodo de este es: public Complejo[][] rendijasMatComp (int rendijas , int blancos, Complejo probabilidad)

### Simulacion de quantum system
Simulacion de un sistema cuatico basico donde se a la probabilidad de que un particula este en el punto dado, el metodo de este es: public double probabilidadK(int puntos, Complejo[] ket, int posicion)

Simulacion de el avance de un ket a otro ket, el metodo de este es: public Complejo dobleKet(Complejo[] ket, Complejo[] ket1)

Simulacion de calcular el mean value de un sistema cuantico dado un observable, el metodo de este es: public Complejo meanValue(Complejo[][] obs, Complejo[] ket)

Simulacion de calcular la varianza de un sistema cuantico dado un observable, el metodo de este es: public Complejo varianza(Complejo[][] obs, Complejo[] ket)

Simulacion de calcular los eigenvalues de un sistema cuantico dado un observable, el metodo de este es: public Complejo[] eaginvalues(Complejo[][] obs, Complejo[]ket)

Simulacion de calcular la probabilidad de cada eigenvalues de un sistema cuantico dado un observable, el metodo de este es: public double eaginProbabilidad(Complejo[][] obs, Complejo[]ket)

Simulacion de un sistema dinamico, mostrando el estado de este despues de avanzar en todas las matrices unitarias, el metodo de este es: Complejo[] dinamica(ArrayList<Complejo[][]> obs, Complejo[]ket)

Simulacion de un sistema dinamico exacto, mostrando el estado de este despues de avanzar en cierta cantidad de matrices unitarias, el metodo de este es: public Complejo[] dinamicaExacta(ArrayList<Complejo[][]> obs, Complejo[]ket, int tmp)

## Autor
Johan Nicolas Cortes Torres
