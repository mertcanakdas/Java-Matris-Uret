/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrisuret;

import java.util.Random;

/**
 *
 * @author dell
 */
public class MatrisUret {
    public static int [][] matrisUret(int x,int y){
        int[][] dizi = new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                dizi[i][j] =(int) (Math.random()*10);
                System.out.print(dizi[i][j]+" ");
            }System.out.println();
        }
        return dizi;
    }
    public static int [][] satirsütünTop(int [][] dizi){
        int satir=0,sütün=0;
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[0].length;j++){
                satir += dizi[i][j];
            }System.out.println((i+1)+".satırın toplamı:"+satir);
             satir = 0;
        }
        System.out.println("\n");
        
        for(int i=0;i<dizi[0].length;i++){
            for(int j=0;j<dizi.length;j++){
                sütün += dizi[j][i];
                
            }System.out.println((i+1)+".sütünun toplamı:"+sütün);
            sütün = 0;
        }
          
        return dizi;
    }
    public static void main(String[] args) {
        int x,y;
        Random num = new Random();
        x = num.nextInt(10)+1;
        y = num.nextInt(10)+1;
       
        satirsütünTop(matrisUret(x, y));
    }
    
}
