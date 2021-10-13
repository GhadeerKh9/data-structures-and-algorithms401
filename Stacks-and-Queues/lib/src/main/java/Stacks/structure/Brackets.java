package Stacks.structure;


 public class Brackets {
     
     public boolean bracketValidation(String string) {

         Stack stack = new Stack();



         for (int i = 0; i < string.length(); i++) {


             if (string.charAt(i)== '{' || string.charAt(i) == '(' || string.charAt(i) == '[') {

                 stack.push(string.charAt(i) + "");
                 
             } else if (string.charAt(i) == '}' || string.charAt(i) == ')' || string.charAt(i) == ']') {

                 String node = stack.peek();

                 if (( (string.charAt(i) + "").equals(')' + "") && node.equals('(' + "")

                         || (string.charAt(i) + "").equals('}' + "") && node.equals('{' + "")

                         || (string.charAt(i) + "").equals(']' + "") && node.equals('[' + ""))
                         && !stack.isEmpty()) {

                     stack.pop();

                 } else {
                     return false;
                 }
             }
         }
         return stack.isEmpty();

     }

 }