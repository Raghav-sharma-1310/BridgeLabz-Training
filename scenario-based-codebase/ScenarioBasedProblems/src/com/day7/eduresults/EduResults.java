package com.day7.eduresults;

public class EduResults {
    static Student[] mergeSort(Student[] arr, int left, int right) {

    	      if (left > right) {
              return new Student[0];
          }

          if (left == right) {
              return new Student[]{ arr[left] };
          }

	      int mid = left + (right - left) / 2;

	      Student[] leftArr = mergeSort(arr, left, mid);
	      Student[] rightArr = mergeSort(arr, mid + 1, right);

	      return merge(leftArr, rightArr);
    }

    static Student[] merge(Student[] a, Student[] b) {
        Student[] result = new Student[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i].marks >= b[j].marks) { // descending for rank list
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        Student[] district1 = {
            new Student("Aman", 95),
            new Student("Riya", 90),
            new Student("Zaid", 85),
            new Student("Anaya", 92)
        };

        Student[] district2 = {
            new Student("Neha", 96),
            new Student("Karan", 89)
        };

        Student[] a = mergeSort(district1, 0, district1.length-1);
        Student[] b = mergeSort(district2, 0, district2.length-1);
        Student[] finalRank = merge(a, b);

        for (Student s : finalRank)
            System.out.println(s.name + " " + s.marks);
    }
}