package org.example;
import java.util.*;
public class Main {
    public static void ex1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        int arr2_elements = 0;
        System.out.print("Enter the size for the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n-1; i++) {
            System.out.print("Enter num ("+(i+1)+"): ");
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i <= n-1; i++) {
            if (i == 0){
                arr2[arr2_elements] = arr[i];
                arr2_elements++;
            } else {
                if (arr[i] != arr[i-1]) {
                    arr2[arr2_elements] = arr[i];
                    arr2_elements++;
                }
            }
        }
        for (int i = 0; i <= arr2_elements-1; i++) {
            if (i == 0){
                System.out.print("[");
            }
            if (i > 0){
                System.out.print(", ");
            }
            System.out.print(arr2[i]);
            if (i == arr2_elements-1){
                System.out.print("]");
            }
        }
    }
    public static int[] removeKeyOccurrences(int[] originalArray, int key) {
        int count = 0;
        for (int element : originalArray) {
            if (element == key) {
                count++;
            }
        }
        int newSize = originalArray.length - count;
        int[] newArray = new int[newSize];
        int newArrayIndex = 0;
        for (int element : originalArray) {
            if (element != key) {
                newArray[newArrayIndex] = element;
                newArrayIndex++;
            }
        }
        return newArray;
    }
    public static void ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  array elements separated by spaces : ");
        String inputLine = scanner.nextLine();
        String[] parts = inputLine.trim().split("\\s+");
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            try {
                array[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter only integers.");
                return;
            }
        }
        System.out.print("Enter the key to remove :");
        int key;
        try {
            key = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input for key. Please enter an integer.");
            return;
        }
        System.out.println("InInput Array: " + Arrays.toString(array) + ", Key: " + key);
        int[] result = removeKeyOccurrences(array, key);
        System.out.println("Output (Array after removal): " + Arrays.toString(result));
        scanner.close();
    }
    public static void ex4(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            numbers.add(num);
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum of elements: " + sum);
    }
    public static void ex5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size for the arraylist: ");
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= n-1; i++) {
            System.out.print("Enter num ("+(i+1)+"): ");
            arr.add(scanner.nextInt());
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i <= n-1; i++) {
            if (i == 0){
                arr2.add(arr.get(i));
            } else {
                if (!arr.get(i).equals(arr.get(i-1))) {
                    arr2.add(arr.get(i));
                }
            }
        }
        for (int i = 0; i <= arr2.size()-1; i++) {
            if (i == 0){
                System.out.print("[");
            }
            if (i > 0){
                System.out.print(", ");
            }
            System.out.print(arr2.get(i));
            if (i == arr2.size()-1){
                System.out.print("]");
            }
        }
    }
    public static void removeKeyOccurrences(ArrayList<Integer> list, int key) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == key) {
                list.remove(i);
            }
        }
    }
    public static void ex6(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter The  ArrayList elements separated by spaces : ");
        String inputLine = scanner.nextLine();
        String[] parts = inputLine.trim().split("\\s+");
        for (String part : parts) {
            if (!part.isEmpty()) {
                try {
                    arrayList.add(Integer.parseInt(part));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter only integers.");
                    return;
                }
            }
        }
        System.out.print("Enter the key to remove : ");
        int key;
        try {
            key = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input for key. Please enter an integer.");
            return;
        }
        System.out.println("InInput ArrayList : " + arrayList + ", Key: " + key);
        removeKeyOccurrences(arrayList, key);
        System.out.println("Output : " + arrayList);
        scanner.close();
    }
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
    }
}
