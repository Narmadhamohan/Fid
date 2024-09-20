#include <stdio.h>

void  main(){

// Batch output, fewer system calls
char buffer[35];
int pos = 0;

for (int i = 0; i < 10; i++) {
    printf("Iteration: %d\n", i); // System call for every iteration
}

for (int i = 0; i < 2; i++) {
    pos += sprintf(buffer + pos, "Iteration: %d\n", i); // No system call yet
}
printf("%s", buffer); // One system call at the end
}