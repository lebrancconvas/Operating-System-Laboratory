#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>

void *runner(void *param);

int i = 0;
int csum = 0;
int msum = 0;

int main(int argc, char *argv[]) {
    pthread_t tid;
    pthread_attr_t attr;

    pthread_attr_init(&attr);                        /* create the thread */
    pthread_create(&tid, &attr, runner, argv[1]);    /* thread call function runner */
    
    for(int m = 0; m<=atoi(argv[1]); m++) {
        msum += m;
    }
    
    pthread_join(tid, NULL);
    
    int dif_csum_msum = csum - msum;
    //printf("csum is %d\n", csum);
    //printf("msum is %d\n", msum);
    printf("Different between csum and msum is %d\n", dif_csum_msum);
}

/* the thread will begin control in this function */
void *runner (void *param) {
    i = atoi(param);        //access global variable i
    for(int c = 0; c <= i*2; c++) {
        csum += c;
    }
    pthread_exit(0);
    return NULL;
}
