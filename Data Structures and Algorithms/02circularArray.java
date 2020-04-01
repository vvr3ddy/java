import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        
        Scanner read = new Scanner(System.in);
        
        // obtain the size of array from the no of array elements
        int length = Integer.parseInt(args[0]);
        int[] arr = new int[length];
        
        // read the array elements
        for(int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();
        }
        
        // read the no of rotations required
        int rotate = read.nextInt();
        
        // perform the iterations
        for(int i = 0; i < rotate; i++) {
            int j, last;
            last = arr[arr.length - 1];
            for(j=arr.length -1; j>0; j--) { 
                arr[j] = arr[j-1];
            }
            arr[0]= last;
        }
        
        // print the modified array
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}

// todo
// check the validity of code
