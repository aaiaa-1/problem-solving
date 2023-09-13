/*
    Given an array of n integers, your task is to process q queries of the form:
    what is the xor sum of values in range [a,b]
*/


//same solution with --- Prefix xor concept ---
int solve( vector<int> & a, int l, int r ){
    //p[0] = a[0]
    //p[1] = a[0]+a[1] = p[0]+a[1]
    //p[4] = a[0]+a[1]+a[2]+a[3]+a[4] = p[3]+a[4]
    //    => p[i]=p[i-1]+a[i]

    p[0]=a[0];
    for(int i=1; i<n; i++){
        p[i]=p[i-1]^a[i];
    }

    int sum = p[r] ^ (l ? p[l-1] : 0);  //if l=0 this will give error 'out of bounds'
   //negation de + c est - // negation de xor c'est xor 

    return sum;
}
