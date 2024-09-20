#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *file;
    
    // Open file in read/write binary mode
    file = fopen("example.bin", "wb+"); // 'b' for binary mode
    if (file == NULL) {
        printf("Error opening file\n");
        return 1;
    }

    // Write some data to the file
    fseek(file, 0, SEEK_SET); // Move to the beginning
    fwrite("Hello, World!\n", 1, 14, file); // Write 14 bytes

    // Move the file pointer to position 7
    fseek(file, 7, SEEK_SET);
    fwrite("Random", 1, 6, file); // Overwrite part of the content

    // Move back to the start of the file and read it
    char buffer[20];
    fseek(file, 0, SEEK_SET);
    fread(buffer, 1, 20, file);
    buffer[19] = '\0'; // Null-terminate the string
    printf("File Content: %s\n", buffer);

    // Close the file
    fclose(file);
    
    return 0;
}
