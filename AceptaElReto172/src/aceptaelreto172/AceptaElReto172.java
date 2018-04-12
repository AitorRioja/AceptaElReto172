
package aceptaelreto172;

import java.util.Scanner;

public class AceptaElReto172 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sillas = sc.nextInt();
        while (sillas != 0){
          String sillitas = sc.nextLine();  
    boolean I = false;
    boolean D = false;
        for(int i = 0; i<sillitas.length(); i++){
            if(sillitas.charAt(i)== 'I'){
                I = true;
            }// if
            if (sillitas.charAt(i) == 'D'){
          
            D = true;
            }
            }// for
            if (I&&D){
                System.out.println("ALGUNO NO COME");
            }else{
                System.out.println("TODOS COMEN");
            }
            
        sillas = sc.nextInt();
        }// while
    }// main
}
