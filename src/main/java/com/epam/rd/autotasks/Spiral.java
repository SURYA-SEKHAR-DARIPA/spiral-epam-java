package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix=new int[rows][columns];
        int count=1;
        int startrow=0,startcol=0;
        int endrow=rows-1;
        int endcol=columns-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int i=startcol;i<=endcol;i++){
                matrix[startrow][i]=count;
                count++;
            }
            if(count>rows*columns){
                break;
            }
            else{
            startrow++;
            for(int j=startrow;j<=endrow;j++){
                matrix[j][endcol]=count;
                count++;
            }
            endcol--;
            for(int k=endcol;k>=startcol;k--){
                matrix[endrow][k]=count;
                count++;
            }
            endrow--;
            for(int l=endrow;l>=startrow;l--){
                matrix[l][startcol]=count;
                count++;
            }
            startcol++;
        }
    }
        return matrix;
    }
}
