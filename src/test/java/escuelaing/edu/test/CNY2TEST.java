/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.edu.test;
import escuelaing.edu.cnyt2.*;
import java.util.ArrayList;
import org.junit.*;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

/**
 *
 * @author 2125824
 */
public class CNY2TEST {
    CNYT2 prueba = new CNYT2();
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
                        
                        
            }
        
     
}
