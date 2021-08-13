package com.company;

public class ArraySorting {

    public static void main(String[] args) {
        int [] array = new int[] { 54, 52, 62, 89, 12, 15, 95, 35, 81, 12, 77};

        int minValue = array[0];//variable with minimum element; "[0]" is a firs variable of array's
        int minIndex = 0; //Number of min element's

        for(int i = 1; i < array.length; i++ ) //starts from second "1" element ;to the end of the array
        {
            if (array[i] < minValue)//if our element is less than array,then new cell number "i"
            {
                minValue = array[i];
                minIndex = i;

            }
        }
        System.out.println("min value:" + minValue);
        System.out.println("min index:" + minIndex);

    }
}
