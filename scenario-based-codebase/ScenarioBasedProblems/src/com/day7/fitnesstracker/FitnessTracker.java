package com.day7.fitnesstracker;

public class FitnessTracker {
	public static People[] bubbleSort(People[] arr) {
		int n = arr.length;
		People temp;
		
		for(int i=0; i<n-1; i++) {
			boolean isSorted = false;
			for(int j=0; j<n-i-1; j++) {
				if (arr[j].steps > arr[j + 1].steps) {
					temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
					isSorted = true;
				}
			}
			if(!isSorted) {
				break;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		People[] people = {
				new People("Naman", 4500),
				new People("Aman", 4600),
				new People("Priya", 3200),
				new People("Ananya", 850)
		};
		People[] finalResult = bubbleSort(people);
		for(People p : finalResult) {
			System.out.println(p.name + " " + p.steps);
		}
		
	}

}
