package Lab3;

import java.util.ArrayList;

public class ArrayList_3A {
    public static void main(String[] args) {
        Lab3aMethod();
    }
    public static void Lab3aMethod(){
        //Declare an ArrayList of String objects called progLanguage
        ArrayList<String> progLanguage = new ArrayList<String>();

        //Add language(objects) in proLanguage
        progLanguage.add("Java");
        progLanguage.add("C#");
        progLanguage.add("Python");
        progLanguage.add("BASIC");
        progLanguage.add("Cobol");
        progLanguage.add("Ada");

        //insert FORTRAN at index 0
        progLanguage.add(0,"FORTRAN");

        System.out.println("The array size list is " + progLanguage.size());

        //Remove element at index 4
        progLanguage.remove(4);
        System.out.println("The array size list is now " + progLanguage.size());

        //check if the array contains Adaa
        if(progLanguage.contains("Ada")){
            System.out.println("The array contains ada");
        }else {
            System.out.println("The array does not contain Ada");
        }
        //check the index of Cobol and store in index variable
        int index = progLanguage.indexOf("Cobol");
        progLanguage.set(index, "COBOL");
        System.out.println("ArrayList: " + progLanguage);

    }
}
