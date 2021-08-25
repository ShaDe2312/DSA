package com.loopsandconditionals;

public class Temp {
    public static void main(String[] args) {

        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};

        int maxsum= 0;
        int currsum=0;

        for(int i=0 ; i< accounts.length; i++){

            for(int j=0; j<accounts[i].length; j++)
            {
                currsum+=accounts[i][j];
            }

            if(currsum>maxsum){
                maxsum=currsum;
                currsum=0;
            }

        }

        System.out.println(maxsum);;
    }
}
