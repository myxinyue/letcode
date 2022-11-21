package com.chang.d11_6;

public class _1678 {
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
        int [] arr = new int[ ]{ 1,2,1};
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
    public static String interpret(String command) {
    byte [] arr = command.getBytes();
    String res = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='G'){
                res+='G';

            }
            else if( arr[i]=='('&& arr[i+1]==')' ){
                res+='o';
                i+=1;
            }else{
                res+="al";
                i+=3;
            }
        }
        return res;


    }
}
