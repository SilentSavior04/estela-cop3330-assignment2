package ex30;

public class MultTable {
    public static void main(String[] args){
        for (int a=1; a<=12; a++){
            for(int b=1; b<=12; b++){
                System.out.print((a*b)+"\t");
            }
            System.out.println();
        }
    }
}