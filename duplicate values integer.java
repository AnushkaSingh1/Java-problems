public class Main {  
    public static void main(String[] args) {      
          
        int [] arr = new int [] {1, 2, 23, 11, 1, 22, 2, 3 };   
          
        System.out.println("Duplicate elements in given array: ");  
         
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  
//Write a Java program to find the duplicate values of an array of integer values. 
//test 
//1 2 23 11 1 22 2 3 
//output 
//1 
//2 
// since 1 and 2 has duplicate entry
