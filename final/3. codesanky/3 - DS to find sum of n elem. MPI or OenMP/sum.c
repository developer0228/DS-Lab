#include<stdio.h>
#include<omp.h>

int main() {

    int a[5] = {10,20,30,40,50};
    int sum = 0;

    #pragma omp parallel for reduction(+:sum)

    for(int i=0; i<5; i++) {

        printf("Processor %d adding %d\n",
        omp_get_thread_num(), a[i]);

        sum = sum + a[i];
    }

    printf("Total Sum = %d\n", sum);

    return 0;
}