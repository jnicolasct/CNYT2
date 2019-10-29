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

### Pruebas
Prueba del experimento de marbles con una matriz boleana (0 y 1).  

    @Test

    public void marblesIntCorrecto() {
        int[][] mat1 = new int[6][6];
        int[] vec1 = new int[6];
        int[] vecResp = new int[6];
        mat1 = prueba.llenarInt(mat1);
        mat1[2][1] = 1; mat1[2][5]=1; mat1[3][3]=1;mat1[4][2]=1;mat1[5][0]=1;mat1[5][4]=1;
        vec1[0]=6;vec1[1]=2;vec1[2]=1;vec1[3]=5;vec1[4]=3;vec1[5]=10;
        vecResp[0]=0;vecResp[1]=0;vecResp[2]=12;vecResp[3]=5;vecResp[4]=1;vecResp[5]=9;
        int[] vecDado = prueba.marblesint(1, mat1, vec1);
        assertTrue(prueba.igualesVecInt(vecResp, vecDado));
    }
    
Prueba del experimento de marbles con una matriz de numero reales.    
@Test
        public void marblesDobCorrecto() {
        double[][] mat1 = new double[3][3];
        double[] vec1 = new double[3];
        double[] vecResp = new double[3];
        mat1 = prueba.llenarDob(mat1);
        mat1[0][1] = ((double) 1/6); mat1[0][2]=((double) 5/6); mat1[1][0]=((double) 1/3);mat1[1][1]=((double) 1/2);mat1[1][2]=((double) 1/6);mat1[2][0]=((double) 2/3);mat1[2][1]=((double) 1/3);
        vec1[0]=1/6;vec1[1]=1/6;vec1[2]=2/3;
        vecResp[0]=21/36;vecResp[1]=9/36;vecResp[2]=6/36;
        double[] vecDado = prueba.marblesDob(1, mat1, vec1);
        assertTrue(prueba.igualesVecDob(vecResp, vecDado));
    }
        
 Prueba del experimento de marbles con una matriz de numero complejos.       
 
        @Test
        public void marblesCompCorrecto() {
        Complejo[][] mat1 = new Complejo[3][3];
        Complejo[] vec1 = new Complejo[3];
        Complejo[] vecResp = new Complejo[3];
        mat1 = prueba.llenarComp(mat1);
        double z = 1/Math.sqrt(2);
        double z1 = 1/Math.sqrt(3);
        double z2 = 2/Math.sqrt(15);
        double z3 = Math.sqrt(2/5);
        double z4 = 0.408248290463863;
        double z5 = 0.36514837167011066;
        double z6 = -0.36514837167011066;
        double z7 = -0.408248290463863;
        Complejo a = new Complejo(z,0.0);Complejo b = new Complejo(z,0.0);Complejo c = new Complejo(0.0,0.0);
        Complejo d = new Complejo(0.0,-z);Complejo e = new Complejo(0.0,z);Complejo f = new Complejo(0.0,0.0);
        Complejo g = new Complejo(0.0,0.0);Complejo h = new Complejo(0.0,0.0);Complejo k = new Complejo(0.0,1.0);
        Complejo l = new Complejo(z1,0.0);Complejo m = new Complejo(0.0,z2);Complejo n = new Complejo(z3,0.0);
        Complejo o = new Complejo(z4,z5);Complejo p = new Complejo(z6,z7);Complejo q = new Complejo(0.0,0.0);        
        mat1[0][0]= a;mat1[0][1] = b; mat1[0][2]=c; mat1[1][0]=d;mat1[1][1]=e;mat1[1][2]=f;mat1[2][0]=g;mat1[2][1]=h;mat1[2][2]=k;
        vec1[0]=l;vec1[1]=m;vec1[2]=n;
        vecResp[0]=o;vecResp[1]=p;vecResp[2]=q;
        Complejo[] vecDado = prueba.marblesCom(1, mat1, vec1);
        assertTrue(prueba.igualesVec(vecResp, vecDado));
    }
        
Prueba del experimento de doble rendija con numeros reales. 

        @Test
        public void rendijasDobCorrecto() {
        double[][] mat1 = new double[8][8];
        double[] vecResp = new double[8];
        mat1 = prueba.llenarDob(mat1);
        mat1[3][0] = ((double) 1/6); mat1[3][1]=((double) 1/3); mat1[3][3]=((double) 1.0);mat1[4][0]=((double) 1/6);mat1[4][1]=((double) 1/3);mat1[4][4]=((double) 1.0);mat1[5][0]=((double) 1/3);mat1[5][1]=((double) 1/3);mat1[5][2]=((double) 1/3);mat1[5][5]=((double) 1.0);mat1[6][0]=((double) 1/6);mat1[6][2]=((double) 1/3);mat1[6][6]=((double) 1.0);mat1[7][0]=((double) 1/6);mat1[7][2]=((double) 1/3);mat1[7][7]=((double) 1.0);
        vecResp[0]=0.0;vecResp[1]=0.0;vecResp[2]=0.0;vecResp[3]=1.0/6.0;vecResp[4]=1.0/6.0;vecResp[5]=1.0/3.0;vecResp[6]=1.0/6.0;vecResp[7]=1.0/6.0;
        double[] vecDado = prueba.rendijas(2, 5, 1.0/3.0);
        double[][] matDad = prueba.rendijasMat(2, 5, 1.0/3.0);
        boolean flag= prueba.igualesMatDob(mat1, matDad);
        boolean flag2 = prueba.igualesVecDob(vecResp, vecDado);
        assertTrue(flag && flag2);
    }
        
Prueba del experimento de doble rendija con numeros complejos.        

        @Test
        public void rendijasCompCorrecto() {
        Complejo[][] mat1 = new Complejo[8][8];
        Complejo[] vecResp = new Complejo[8];
        mat1 = prueba.llenarComp(mat1);
        Complejo a = new Complejo(-0.2886751345948129,0.2886751345948129); /*12 - + */
        Complejo b = new Complejo(-0.4082482904638631,0.4082482904638631);/*6 - + */
        Complejo c = new Complejo(-0.5773502691896258,0.5773502691896258);/*6 - - */
        Complejo f = new Complejo(1.0,0.0);
        Complejo e = new Complejo(0.0,0.0);
        mat1[3][0] = a; mat1[3][1]=b; mat1[3][3]=f;mat1[4][0]=a;mat1[4][1]=b;mat1[4][4]=f;mat1[5][0]=c;mat1[5][1]=b;mat1[5][2]=b;mat1[5][5]=f;mat1[6][0]=a;mat1[6][2]=b;mat1[6][6]=f;mat1[7][0]=a;mat1[7][2]=b;mat1[7][7]=f;
        vecResp[0]=e;vecResp[1]=e;vecResp[2]=e;vecResp[3]=a;vecResp[4]=a;vecResp[5]=c;vecResp[6]=a;vecResp[7]=a;
        Complejo[] vecDado = prueba.rendijasComp(2, 5, b);
        Complejo[][] matDad = prueba.rendijasMatComp(2, 5, b);
        boolean flag= prueba.igualesMat(mat1, matDad);
        boolean flag2 = prueba.igualesVec(vecResp, vecDado);
        assertTrue(flag && flag2);
    }   
   
   
Prueba de porbabilidad de ket

     @Test
        public void probabilidadCorecta(){
            Complejo a = new Complejo(-3,-1);
            Complejo b = new Complejo(0,-2);
            Complejo c = new Complejo(0,1);
            Complejo d = new Complejo(2,0);
            Complejo[] ket = new Complejo[4];
            ket[0]=a;
            ket[1]=b;
            ket[2]=c;
            ket[3]=d;
            double resp = 0.05263157894736842;
            double dado =prueba.probabilidadK(4, ket, 2);
            assertTrue(resp==dado);
        }


Prueba de porbabilidad de doble ket
        
        @Test
        public void dobleKetCorecto(){
            Complejo a = new Complejo(0,-1);
            Complejo b = new Complejo(1,0);
            Complejo[] ket = new Complejo[2];
            ket[0]=a;
            ket[1]=b;
            Complejo[] ket1 = new Complejo[2];
            ket1[0]=b;
            ket1[1]=a;
            Complejo resp = new Complejo (0,-1);
            Complejo dado =prueba.dobleKet(ket, ket1);
            boolean flag = false;
            if (resp.getEntero()== dado.getEntero() && resp.getImaginario() == dado.getImaginario()){
                flag = true;
            }       
            assertTrue(flag);
        }
        
Prueba de calculo de una varianza

         @Test
        public void varianzaCorrecta(){
            Complejo a = new Complejo(0.0,-1.0);
            Complejo b = new Complejo(1.0,0.0);
            Complejo c = new Complejo(0.0,1.0);
            Complejo d = new Complejo(2.0,0.0);
            Complejo e = new Complejo((Math.sqrt(2)/2.0),0.0);
            Complejo f = new Complejo(0.0,(Math.sqrt(2)/2.0));
            Complejo[] ket = new Complejo[2];
            ket[0]=e;
            ket[1]=f;
            Complejo[][] obs = new Complejo[2][2];
            obs[0][0]=b;
            obs[0][1]=a;
            obs[1][0]=c;
            obs[1][1]=d;
            Complejo resp = new Complejo ((Math.sqrt(2)*Math.sqrt(2)),0.0);
            Complejo dado =prueba.varianza(obs, ket);
            boolean flag = false;
            if (resp.getEntero()== dado.getEntero() && resp.getImaginario() == dado.getImaginario()){
                flag = true;
            }       
            assertTrue(flag);
        }


Prueba de los eigenvalues de un ket

        @Test
            public void eigenValuesCorresto(){
                Complejo a = new Complejo(-1.0, 0.0);
                Complejo b = new Complejo(-1.0,-1.0);
                Complejo c = new Complejo(0.0,-1.0);
                Complejo d = new Complejo(1.0,0.0);
                Complejo e = new Complejo(0.0,1.0);
                Complejo f = new Complejo(-1.0,-2.0);
                Complejo[] ket = new Complejo[2];
                Complejo[][] obs = new Complejo[2][2];
                ket[0]=a;
                ket[1]=b;
                obs[0][0]=a;
                obs[0][1]=c;
                obs[1][0]=e;
                obs[1][1]=d;
                Complejo[] resp = new Complejo[2];
                resp[0]=e;
                resp[1]=f;
                Complejo[] dado = prueba.eaginvalues(obs, ket);
                assertTrue(prueba.igualesVec(resp, dado));
                        
                        
            }
         
         
Prueba de probabilidad de los eigenvalues    

        @Test
            public void eigenProbabilidadCorresto(){
                Complejo a = new Complejo(-1.0, 0.0);
                Complejo b = new Complejo(-1.0,-1.0);
                Complejo c = new Complejo(0.0,-1.0);
                Complejo d = new Complejo(1.0,0.0);
                Complejo e = new Complejo(0.0,1.0);
                Complejo f = new Complejo(-1.0,-2.0);
                Complejo[] ket = new Complejo[2];
                Complejo[][] obs = new Complejo[2][2];
                ket[0]=a;
                ket[1]=b;
                obs[0][0]=a;
                obs[0][1]=c;
                obs[1][0]=e;
                obs[1][1]=d;
                double resp = 0.5;
                double dado = prueba.eaginProbabilidad(obs, ket);
                assertTrue(resp==dado);
                        
                        
            }
            
            
Prueba ed un estado dinamico

        @Test
            public void dinamicaCorresto(){
                Complejo a = new Complejo(0.0, 0.0);
                Complejo b = new Complejo(1.0,1.0);
                Complejo d = new Complejo(1.0,0.0);
                Complejo c = new Complejo((Math.sqrt(2)/2.0),0.0);
                Complejo e = new Complejo((Math.sqrt(2)/2.0)*-1,0.0);
                Complejo[] ket = new Complejo[2];
                Complejo[][] obs = new Complejo[2][2];
                Complejo[][] obs1 = new Complejo[2][2];
                ket[0]=d;
                ket[1]=a;
                obs[0][0]=a;
                obs[0][1]=d;
                obs[1][0]=d;
                obs[1][1]=a;
                obs1[0][0]=c;
                obs1[0][1]=c;
                obs1[1][0]=c;
                obs1[1][1]=e;
                ArrayList<Complejo[][]> obs3 = new ArrayList<Complejo[][]>();
                obs3.add(obs);
                obs3.add(obs1);
                Complejo[] resp = new Complejo[2];
                resp[0] = new Complejo(0.7071067811865476, 0.0);
                resp[1] = new Complejo(-0.7071067811865476, 0.0);
                Complejo[] dado = prueba.dinamica(obs3, ket);
                assertTrue(prueba.igualesVec(resp, dado));
                        
                        
            }

Preuba de un estado dinamico con un valor dado

        @Test
            public void dinamicaExactaCorresto(){
                Complejo a = new Complejo(0.0, 0.0);
                Complejo b = new Complejo(1.0,1.0);
                Complejo d = new Complejo(1.0,0.0);
                Complejo c = new Complejo((Math.sqrt(2)/2.0),0.0);
                Complejo e = new Complejo((Math.sqrt(2)/2.0)*-1,0.0);
                Complejo[] ket = new Complejo[2];
                Complejo[][] obs = new Complejo[2][2];
                Complejo[][] obs1 = new Complejo[2][2];
                ket[0]=d;
                ket[1]=a;
                obs[0][0]=a;
                obs[0][1]=d;
                obs[1][0]=d;
                obs[1][1]=a;
                obs1[0][0]=c;
                obs1[0][1]=c;
                obs1[1][0]=c;
                obs1[1][1]=e;
                ArrayList<Complejo[][]> obs3 = new ArrayList<Complejo[][]>();
                obs3.add(obs);
                obs3.add(obs1);
                Complejo[] resp = new Complejo[2];
                resp[0] = new Complejo(0.0, 0.0);
                resp[1] = new Complejo(1.0, 0.0);
                Complejo[] dado = prueba.dinamicaExacta(obs3, ket, 1);
                assertTrue(prueba.igualesVec(resp, dado));


## Autor
Johan Nicolas Cortes Torres
