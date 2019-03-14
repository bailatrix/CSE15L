#include <stdio.h>

int my_abs(int a) {
    if (-a < 0) {
        a = -a;
    }

    return a;
}

int main() {
    int input = 0;
    int output = 0;

    input = -53;
    output = my_abs(input);

    fprintf(stderr, "expected: %d\n", 53);
    fprintf(stdout, "output: %d\n", output);
    
    return 1;
}
