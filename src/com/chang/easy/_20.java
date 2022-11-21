package com.chang.easy;

import java.util.Stack;

public class _20 {
    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }

    public  static boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        char[] sarr = s.toCharArray();
        for (char c : sarr) {
            if (c == '(' || c == '{' || c =='[') {
                characters.push(c);
            }else{   //为右括号
                if(!characters.isEmpty()){   //栈不为空
                    if(c ==']'){   //是这个右括号 ，出栈如果出栈的结果不是对应的左括号直接结束返回false。
                        if(characters.pop()!='[')
                        return false;

                    } else if(c =='}'){

                        if(characters.pop()!='{' )
                        return false;
                    }else if(c ==')'){
                        if(characters.pop()!='(' )
                        return false;
                    }

                }else{    //栈为空
                    return false;
                }
            }




        }
        return  characters.isEmpty();

    }
}
