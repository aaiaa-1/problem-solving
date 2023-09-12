/*  
    Given an array of n integers, your task is to proccess q queries of the form : 
    what is the sum of the value in range [a,b]
*/

//vulnerable solution
int solve ( vector<int> & a, int l, int r){
  for (int i=l; i<r ; i++){
    sum += a[i];
  }
}
//this solution is simple but takes O(n) time => Time Limit Exceeded 