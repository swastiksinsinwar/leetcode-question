class Solution {
    public double myPow(double x, long n) {//int n ko long n mai kardo isse easily pass hojaga 
       if(n==0) return 1;//yaha pe base case check hoga
       //long bin=n;//isko  isliye karte hai kyui ye -ve ko store karleta hai easily(way no.1)
       if(n<0){
        return 1/myPow(x,-n);//isse hmm number ko 1/x^n mai le aate hai but bin ko hame INT mai typecast karna padta hai(for way no.1)
       }
       double call=myPow(x,n/2);//same goes here 
       if(n%2==0){
        return call*call;
       }
       else{
        return x*call*call;
       } 
    }
}
    