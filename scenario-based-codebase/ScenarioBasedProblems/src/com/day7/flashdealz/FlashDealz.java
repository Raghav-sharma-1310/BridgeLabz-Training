package com.day7.flashdealz;

public class FlashDealz {
	public static void quickSort(Product[] arr, int low, int high) {
	    if (low< high) {
	    	   int p = partition(arr, low, high);
	    	   quickSort(arr, low, p-1);
	    	   quickSort(arr, p+1, high);
	    }
	}
	
	static int partition(Product[] arr, int low, int high) {
		int pivot =arr[high].discount;
		int i =low-1;
		
		for(int j= low; j<high; j++) {
			if(arr[j].discount > pivot) {
				i++;
				Product temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		    }
		}
		Product temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i + 1;
	}
	public static void main(String[] args) {
		Product[] products = {
	            new Product("Mobile", 40),
	            new Product("Laptop", 30),
	            new Product("Headphones", 60)
	    };
		quickSort(products, 0, products.length - 1);
        for (Product p : products)
            System.out.println(p.name + " " + p.discount + "%");
	}

}
