package com.day4.eventmanager;

public class TicketSorter {

    public void quickSort(Ticket[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(Ticket[] arr, int low, int high) {

        double pivot = arr[high].price; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].price <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(Ticket[] arr, int i, int j) {
        Ticket temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void displayTickets(Ticket[] arr, int limit) {
        for (int i = 0; i < limit; i++) {
            arr[i].display();
        }
    }
}
