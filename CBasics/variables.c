#include <stdio.h>
#include <string.h>


int main() {
    int num=5;
    char var1=129;
    char name[]="All is well";
    const float PI = 3.14159;//Constanct 
    num=10;
 
 int address [5][2] = { {1002,2}, {1004,4}, {1006,6}, {1008,8} };
    printf("pointer %d", *(*(address+2)+1));
    printf("num %d\n",sizeof(num)); 
    printf("var %d\n",var1);    
    printf("name %s\n",name);    
    strcpy(name, "Good try");
    printf("name %s\n",name); 
}
