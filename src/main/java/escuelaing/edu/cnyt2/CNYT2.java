/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.edu.cnyt2;

/**
 *
 * @author 2125824
 */
import java.util.ArrayList;

/**
 *
 * @author 2125824
 */
public class CNYT2 {

/*
    * Retorna la suma de dos numero complejos
    * a primero numero complejo
    * b segundo numero complejo
    */
    public Complejo sumaComp(Complejo a, Complejo b){
        double parteE = a.getEntero()+ b.getEntero();
        double parteI = a.getImaginario() + b.getImaginario();
        Complejo resultado = new Complejo(parteE,parteI);
        return resultado;
    }
    
    /*
    * Retorna la resta de dos numero complejos
    * a primero numero complejo
    * b segundo numero complejo
    */    
    public Complejo restaComp(Complejo a, Complejo b){
        double parteE = a.getEntero()- b.getEntero();
        double parteI = a.getImaginario() - b.getImaginario();
        Complejo resultado = new Complejo(parteE,parteI);
        return resultado;
    }    
    
    /*
    * Retorna el producto de dos numero complejos
    * a primero numero complejo
    * b segundo numero complejo
    */    
    public Complejo multComp(Complejo a, Complejo b){
        double parteE = (a.getEntero()* b.getEntero())+(a.getImaginario()* b.getImaginario()*-1.0);
        double parteI = (a.getEntero()* b.getImaginario())+(a.getImaginario()* b.getEntero());
        Complejo resultado = new Complejo(parteE,parteI);
        return resultado;
    }
    
    /*
    * Retorna la division de dos numero complejos
    * a divendo numero complejo
    * b divisor numero complejo
    */    
    public Complejo divComp(Complejo a, Complejo b){
        Complejo nuevo = new Complejo (b.getEntero(),(b.getImaginario()*-1));
        Complejo divisor = multComp(b,nuevo);
        Complejo dividendo = multComp(a,nuevo);
        double parteE = dividendo.getEntero() / divisor.getEntero();
        double parteI = dividendo.getImaginario() + divisor.getImaginario();
        Complejo resultado = new Complejo(parteE,parteI);
        return resultado;
    }
    
    /*
    * Retorna el modulo de un numero complejo
    * a numero complejo
    */    
    public double modulo (Complejo a){
        return a.modulo();
    }
    
    /*
    * Retorna el conjugado de un numero complejo
    * a numero complejo
    */
    public Complejo conjugado(Complejo a){
        return new Complejo(a.getEntero(),(a.getImaginario()*-1));
    }
    
    /*
    * Retorna un numero complejo dada la conversion de polar a cartesiano de un numero complejo
    * a numero complejo en forma polar
    */
    public Complejo poCar(Complejo a){
        double entero = a.getEntero()* Math.cos(a.getImaginario());
        double imaginario = a.getEntero() * Math.sin(a.getImaginario());
        return new Complejo(entero,imaginario);
    }
    
    /*
    * Retorna un numero complejo dada la conversion de cartesiano a polar de un numero complejo
    * a numero complejo en forma cartesiana
    */
    public Complejo caPol(Complejo a){
        double longitud = modulo(a);
        double angulo = Math.atan2(a.getImaginario(),a.getEntero());
        return new Complejo (longitud, angulo);
    }
    
    /*
    * Retorna la fase de un numero complejo
    * a numero complejo 
    */
    public double fase(Complejo a){
        return a.fase();
    }
    
    /*
    * Retorna el vector dado una suma de dos vectores
    * vec1 primer vector complejo
    * vec2 segundo vector complejo
    */
    public Complejo[] sumaVec(Complejo[] vec1, Complejo[] vec2){
        Complejo[] respuesta = new Complejo[vec1.length];
        for (int i=0;i<vec1.length;i++){
            respuesta[i] =(sumaComp(vec1[i], vec2[i]));
        }
        return respuesta;
    }
    
    /*
    * Retorna la inversa de un vector 
    * vec1 vector  a invertir
    */
    public Complejo[] inversaVec(Complejo[] vec1){
        Complejo[] respuesta = new Complejo[vec1.length];
        for (int i=0;i<vec1.length;i++){
            Complejo z = new Complejo(vec1[i].getEntero()*-1, vec1[i].getImaginario()*-1);
            respuesta[i] = z;
        }
        return respuesta;
    }
    
    /*
    * Retorna el vector de un producto entre un vector y un escalar
    * vec1 vector complejo
    * a escalar complejo
    */
    public Complejo[] multEscaVec(Complejo[] vec1, Complejo a){
        Complejo[] respuesta = new Complejo[vec1.length];
        for (int i=0;i<vec1.length;i++){
            Complejo z = multComp(a, vec1[i]);
            respuesta[i] = z;
        }
        return respuesta;
    }
    
    /*
    * Retorna la suma de dos matrices 
    * mat1 primer matriz compleja
    * mat2 segunda matriz compleja
    */
    public Complejo[][] sumaMat(Complejo[][] mat1, Complejo[][] mat2){
        Complejo[][] respuesta = new Complejo[mat1.length][mat1[0].length];
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
                respuesta[i][j] = sumaComp(mat1[i][j], mat2[i][j]);
            }
        }
        return respuesta;
    }
    
    /*
    * Retorna la inversa de una matriz
    * mat1 matriz compleja a invertir
    */
    public Complejo[][] inversaMat(Complejo[][] mat1){
        Complejo[][] respuesta = new Complejo[mat1.length][mat1[0].length];
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
            Complejo z = new Complejo (mat1[i][j].getEntero()*-1, mat1[i][j].getImaginario()*-1);
            respuesta[i][j] = z;
            }
        }
        return respuesta;
    }
    
    
    /*
    * Retorna la multiplicacion de una matriz y un escalar 
    * mat1 matriz compleja
    * a escalar complejo
    */
    public Complejo[][] multEscaMat(Complejo[][] mat1, Complejo a){
        Complejo[][] respuesta = new Complejo[mat1.length][mat1[0].length];
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
            Complejo z = multComp(mat1[i][j],a);
            respuesta[i][j] = z;
            }
        }
        return respuesta;
    }
    
    /*
    * Retorna la transpuesta de una matriz
    * mat1 matriz compleja a transponer
    */
    public Complejo[][] transpuestaMat(Complejo[][] mat1){
        Complejo[][] respuesta = new Complejo[mat1.length][mat1[0].length];
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
                respuesta[i][j] = mat1[j][i];
            }
        }
        return respuesta;
    }
    
    /*
    * Retorna el  conjugado de una matriz
    * mat1 matriz compleja a conjugar
    */
    public Complejo[][] conjugadoMat(Complejo[][] mat1){
        Complejo[][] respuesta = new Complejo[mat1.length][mat1[0].length];
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
            Complejo z = conjugado(mat1[i][j]);
            respuesta[i][j] = z;
            }
        }
        return respuesta;
    }
    
    /*
    * Retorna la adjunta de una matriz
    * mat1 matriz compleja
    */
    public Complejo[][] adjuntaMat(Complejo[][] mat1){
        Complejo[][] res = transpuestaMat(mat1);
        Complejo[][] respuesta = conjugadoMat(res);
        return respuesta;
    }
    
    /*
    * Retorna la accion de una matriz sobre un vector
    * mat1 matriz compleja
    * vec1 vector complejo
    */
    public Complejo[] accionMatVec(Complejo[][] mat1, Complejo[] vec1 ){
        Complejo[] respuesta = new Complejo[vec1.length];
        Complejo suma = new Complejo(0,0);
        for (int i=0;i<mat1.length;i++){
            suma = new Complejo(0,0);
            for (int j=0;j<mat1[0].length;j++){
               suma = sumaComp(suma, multComp(mat1[i][j], vec1[j]));
            }
            respuesta[i] = suma;
        }
        return respuesta;
    }
    
    /*
    * Retorna la norma de una matriz
    * mat1 matriz compleja
    */
    public Complejo normaMat(Complejo[][] mat1){
        Complejo respuesta;
        Complejo suma = new Complejo(0,0);
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
            suma = sumaComp(suma, multComp(mat1[i][j], mat1[i][j]));
            }
        }
        if (suma.getEntero()<0){
            suma.setEntero(suma.getEntero()*-1);
        }
        if (suma.getImaginario()<0){
            suma.setImaginario(suma.getImaginario()*-1);
        }
        respuesta = new Complejo(Math.sqrt(suma.getEntero()), Math.sqrt(suma.getImaginario()));
        return respuesta;
    }
    
    /*
    * Retorna la distancia entre dos matrices
    * mat1 primer matriz compleja
    * mat2 segunda matriz compleja
    */
    public Complejo distMat(Complejo[][] mat1, Complejo[][] mat2){
        Complejo[][] nv1 = inversaMat(mat2);
        Complejo[][] nv2 = sumaMat(mat1,nv1);
        Complejo respuesta = normaMat(nv2);
        return respuesta;
    }
    
    /*
    * Retorna la multiplicacion de dos matrices
    * mat1 primer matriz compleja
    * mat2 segunda matriz compleja
    */
    public Complejo[][] multMat(Complejo[][] mat1, Complejo[][] mat2){
        Complejo[][] respuesta = new Complejo[mat1.length][mat2[0].length];
        Complejo suma;
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat2[0].length;j++){
                suma = new Complejo(0,0);
                for (int k=0;k<mat1[0].length;k++){
                suma= sumaComp(suma, multComp(mat1[i][k], mat2[k][j]));
                }
            respuesta[i][j] = suma;    
            }
        }
        return respuesta;
    }
    
    /*
    * Retorna si dos matrices son iguales
    * mat1 primer matriz compleja
    * mat2 segunda matriz complejo
    */
    public boolean igualesMat(Complejo[][] mat1, Complejo[][] mat2){
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
                if (mat1[i][j].getEntero()!= mat2[i][j].getEntero() || mat1[i][j].getImaginario()!= mat2[i][j].getImaginario() ){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean igualesMatDob(double [][] mat1, double[][] mat2){
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
                if (mat1[i][j]!= mat2[i][j] || mat1[i][j]!= mat2[i][j] ){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean igualesMatInt(int[][] mat1, int[][] mat2){
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
                if (mat1[i][j]!= mat2[i][j] || mat1[i][j]!= mat2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    /*
    * Retorna si dos vectores son iguales
    * vec1 primer vector complejo
    * vec2 segundo vector complejo
    */
    public boolean igualesVec(Complejo[] vec1,Complejo[] vec2){
        
        for (int i=0;i<vec1.length;i++){
            if (vec1[i].getEntero()!= vec2[i].getEntero() || vec1[i].getImaginario()!= vec2[i].getImaginario() ){
                    return false;
            }
        }
        return true;
    }

    public boolean igualesVecDob(double[] vec1, double[] vec2){ 
        for (int i=0;i<vec1.length;i++){
            if (vec1[i]!= vec2[i] || vec1[i]!= vec2[i]){
                    return false;
            }
        }
        return true;
    }

    public boolean igualesVecInt(int[] vec1, int[] vec2){
        
        for (int i=0;i<vec1.length;i++){
            if (vec1[i]!= vec2[i] || vec1[i]!= vec2[i]){
                    return false;
            }
        }
        return true;
    }    
    /*
    * Retorna si una matriz es unitaria
    * mat1 matriz compleja a verificar
    */
    public boolean unitariaMat(Complejo[][] mat1){
        Complejo[][] adjunta = adjuntaMat(mat1);
        Complejo[][] res1 = multMat(mat1, adjunta);
        Complejo[][] res2 = multMat(adjunta,mat1);
        return igualesMat(res1,res2);
    }
    
    /*
    * Retorna si una matriz es hermitiana
    * mat1 matriz compleja a verificar
    */
    public boolean hermitianMat(Complejo[][] mat1){
        Complejo[][] adjunta = adjuntaMat(mat1);
        return igualesMat(mat1,adjunta);
    }    
    
    /*
    * Retorna el producto tensor de dos matrices
    * mat1 primer matriz compleja
    * mat2 segunda matriz compleja
    */
    public Complejo[][] productoTensorMat(Complejo[][] mat1, Complejo[][] mat2){
        Complejo[][] respuesta = new Complejo[mat1.length*mat2.length][mat1[0].length*mat2[0].length]; 
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[0].length;j++){
                for (int k=0;k<mat2.length;k++){
                    for (int z=0; z<mat2[0].length; z++){
                       respuesta[i * mat2.length + k][j * mat2[0].length + z] = multComp(mat1[i][j], mat2[k][z]);
                    }
                }
            }
        }
        return respuesta;
    }
    
    public int[] accionMatVecInt(int[][] mat1, int[] vec1 ){
        int[] respuesta = new int[vec1.length];
        int suma;
        for (int i=0;i<mat1.length;i++){
            suma = 0;
            for (int j=0;j<mat1[0].length;j++){
               suma = suma + mat1[i][j]* vec1[j];
            }
            respuesta[i] = suma;
        }
        return respuesta;
    }
    
    public int[][] multMatInt(int[][] mat1, int[][] mat2){
        int[][] respuesta = new int[mat1.length][mat2[0].length];
        int suma;
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat2[0].length;j++){
                suma = 0;
                for (int k=0;k<mat1[0].length;k++){
                suma= suma + mat1[i][k]*mat2[k][j];
                }
            respuesta[i][j] = suma;    
            }
        }
        return respuesta;
    }
    
    public int[] marblesint(int clicks, int[][] probabilidad, int[] estado){
        if (clicks ==1){
            return accionMatVecInt(probabilidad, estado);
        }
        int[][] respuesta = multMatInt(probabilidad, probabilidad);
        for (int i=2; i<clicks;i++){
            respuesta = multMatInt(respuesta, respuesta);
        }
        return accionMatVecInt(probabilidad, estado);
    }
    
    public double[] accionMatVecDob(double[][] mat1, double[] vec1 ){
        double[] respuesta = new double[vec1.length];
        double suma;
        for (int i=0;i<mat1.length;i++){
            suma = 0.0;
            for (int j=0;j<mat1[0].length;j++){
               suma = suma + mat1[i][j]* vec1[j];
            }
            respuesta[i] = suma;
        }
        return respuesta;
    }
    
    public double[][] multMatDob(double[][] mat1, double[][] mat2){
        double[][] respuesta = new double[mat1.length][mat2[0].length];
        double suma;
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat2[0].length;j++){
                suma = 0.0;
                for (int k=0;k<mat1[0].length;k++){
                suma= suma + mat1[i][k]*mat2[k][j];
                }
            respuesta[i][j] = suma;    
            }
        }
        return respuesta;
    }
    
    public double[] marblesDob(int clicks, double[][] probabilidad, double[] estado){
        if (clicks ==1){
            return accionMatVecDob(probabilidad, estado);
        }
        double[][] respuesta = multMatDob(probabilidad, probabilidad);
        for (int i=2; i<clicks;i++){
            respuesta = multMatDob(respuesta, respuesta);
        }
        return accionMatVecDob(probabilidad, estado);
    }
    
    public int[][] llenarInt(int[][] mat){
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[0].length;j++){
                mat[i][j]=0;
            }
        }
        return mat;
    }
    
    public double[][] llenarDob(double[][] mat){
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[0].length;j++){
                mat[i][j]=0.0;
            }
        }
        return mat;
    }
    
    public Complejo[][] llenarComp(Complejo[][] mat){
        Complejo a = new Complejo(0.0,0.0);
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[0].length;j++){
                mat[i][j]= a;
            }
        }
        return mat;
    }
    
    public Complejo[] marblesCom(int clicks, Complejo[][] probabilidad, Complejo[] estado){
        if (clicks ==1){
            return accionMatVec(probabilidad, estado);
        }
        Complejo[][] respuesta = multMat(probabilidad, probabilidad);
        for (int i=2; i<clicks;i++){
            respuesta = multMat(respuesta, respuesta);
        }
        return accionMatVec(probabilidad, estado);
    }
    
    public double[] rendijas (int rendijas , int blancos, double probabilidad){
        double[][] respuesta = new double[rendijas+blancos+1][rendijas+blancos+1];
        respuesta = llenarDob(respuesta);
        double[] vector = new double [rendijas+blancos+1];
        double pr1 =1.0/rendijas;
        for (int i=1;i<=rendijas;i++){
            respuesta[i][0]= pr1;
        }
        int a = (int) Math.ceil(blancos/rendijas)+1;
        int b = a+rendijas;
        int h = 1;
        int j = rendijas + 1;
        while (h<=rendijas){
            respuesta [j][h] = probabilidad;
            if (j==b){
                h+=1;
                b = j+a-1;
            }
            else{
                j +=1;
            }
        }
        for (int x=rendijas+1; x<rendijas+blancos+1;x++){
            respuesta[x][x] = 1.0;
        }
        respuesta = multMatDob(respuesta, respuesta);
        for (int y=0; y< rendijas + blancos +1 ; y++){
            if (y==0){
                vector[y]=1.0;
            }
            else{
                vector[y]=0.0;
            }
        }
        
        return accionMatVecDob(respuesta, vector);
    }
    
    public double[][] rendijasMat (int rendijas , int blancos, double probabilidad){
        double[][] respuesta = new double[rendijas+blancos+1][rendijas+blancos+1];
        respuesta = llenarDob(respuesta);
        double[] vector = new double [rendijas+blancos+1];
        double pr1 =1.0/rendijas;
        for (int i=1;i<=rendijas;i++){
            respuesta[i][0]= pr1;
        }

        int a = (int) Math.ceil(blancos/rendijas)+1;
        int b = a+rendijas;
        int h = 1;
        int j = rendijas + 1;
        while (h<=rendijas){
            respuesta [j][h] = probabilidad;
            if (j==b){
                h+=1;
                b = j+a-1;
            }
            else{
                j +=1;
            }
        }
        
        for (int x=rendijas+1; x<rendijas+blancos+1;x++){
            respuesta[x][x] = 1.0;
        }
        
        return multMatDob(respuesta, respuesta);
    }
    
    public Complejo[] rendijasComp (int rendijas , int blancos, Complejo probabilidad){
        Complejo[][] respuesta = new Complejo[rendijas+blancos+1][rendijas+blancos+1];
        respuesta = llenarComp(respuesta);
        Complejo[] vector = new Complejo [rendijas+blancos+1];
        Complejo pr1 = new Complejo ((1.0/Math.sqrt(rendijas)), 0.0);
        for (int i=1;i<=rendijas;i++){
            respuesta[i][0]= pr1;
        }
        int a = (int) Math.ceil(blancos/rendijas)+1;
        int b = a+rendijas;
        int h = 1;
        int j = rendijas + 1;
        while (h<=rendijas){
            respuesta [j][h] = probabilidad;
            if (j==b){
                h+=1;
                b = j+a-1;
            }
            else{
                j +=1;
            }
        }
        for (int x=rendijas+1; x<rendijas+blancos+1;x++){
            respuesta[x][x] = new Complejo (1.0,0.0);
        }
        
        respuesta = multMat(respuesta, respuesta);
        for (int y=0; y< rendijas + blancos +1 ; y++){
            if (y==0){
                vector[y]= new Complejo(1.0,0.0);
            }
            else{
                vector[y]=new Complejo (0.0,0.0);
            }
        }
        return accionMatVec(respuesta, vector);
    }
    
    public Complejo[][] rendijasMatComp (int rendijas , int blancos, Complejo probabilidad){
        Complejo[][] respuesta = new Complejo[rendijas+blancos+1][rendijas+blancos+1];
        respuesta = llenarComp(respuesta);
        Complejo[] vector = new Complejo [rendijas+blancos+1];
        Complejo pr1 = new Complejo ((1.0/Math.sqrt(rendijas)), 0);
        for (int i=1;i<=rendijas;i++){
            respuesta[i][0]= pr1;
        }
        int a = (int) Math.ceil(blancos/rendijas)+1;
        int b = a+rendijas;
        int h = 1;
        int j = rendijas + 1;
        while (h<=rendijas){
            respuesta [j][h] = probabilidad;
            if (j==b){
                h+=1;
                b = j+a-1;
            }
            else{
                j +=1;
            }
        }
        for (int x=rendijas+1; x<rendijas+blancos+1;x++){
            respuesta[x][x] = new Complejo (1.0,0.0);
        }
        return multMat(respuesta, respuesta);
    }
}

