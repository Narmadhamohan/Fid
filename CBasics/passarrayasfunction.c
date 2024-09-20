#include <stdio.h>

void modifyArray(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        arr[i] += 10; // Modify each element
    }
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    printf("size %d ", sizeof(arr));//total size in bytes
    printf("size %d ", sizeof(arr[0])); //size of 1 in bytes
    printf("\n");
    modifyArray(arr, size); // Pass the array to the function

    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
