package com.company;

public class Main {
    //Declare and initialize variables
    public static void main(String[] args) {
	boolean [] locker = new boolean[100];

	//Set each lockers to false
     for(int i = 0; i < 100; i++) {
         locker[i] = false;
     }

	//Loop goes over each locker
    for(int j = 1; j <=100; j++) {
        for (int k = j; k <= 100; k += j) {
            if (locker[k-1] == false){
                locker[k-1] = true;
            }
            else if(locker[k-1] == true){
                locker[k-1] = false;

            }
        }
    }

     //Print out the open lockers
    for(int i = 0; i < 100; i++) {
         if(locker[i]==true){
             System.out.println("Locker " + (i+1) + " is open");
         }
    }
    }
}
