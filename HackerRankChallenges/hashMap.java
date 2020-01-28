
 *  Copyrights ©  VVR 2020
 *  Learn Java by programming on the go.
 *  File Name    : hashMap.java
 *  Author       : Vishnuvardhan Reddy
 */

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name,phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(myMap.containsKey(s)){
                System.out.println(s+"="+ myMap.get(s));
            }
            else
            System.out.println("Not found");
        }
        in.close();
    }
}

