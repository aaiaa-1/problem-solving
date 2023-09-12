/*  
    Given an array of n integers, your task is to proccess q queries of the form : 
    what is the sum of the value in range [a,b]
*/

//vulnerable solution
int solve ( vector<int> & a, int l, int r ){
  for (int i=l; i<r ; i++){
    sum += a[i];
  }
  return sum;
}
//this solution is simple but takes O(n) time => Time Limit Exceeded 

//Solution with --- Prefix sum concept ---
int solve( vector<int> & a, int l, int r ){
    //p[0] = a[0]
    //p[1] = a[0]+a[1] = p[0]+a[1]
    //p[4] = a[0]+a[1]+a[2]+a[3]+a[4] = p[3]+a[4]
    //    => p[i]=p[i-1]+a[i]

    p[0]=a[0];
    for(int i=1; i<n; i++){
        p[i]=p[i-1]+a[i];
    }

    int sum = p[r] - (l ? p[l-1] : 0);  //if l=0 this will give error 'out of bounds'

    return sum;
}