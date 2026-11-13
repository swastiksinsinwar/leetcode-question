class Solution {
    public int mySqrt(int x) {
        //baaki iss question mai binary search and overflow ka concept jada lagega 
            int srt=0;
            int end=x;
            int ans=0;
            while(srt<=end){
                int mid=(srt+end)/2;
                long target=(long)mid*mid;//isme hamne isko isliye long store karya hai kyuki ye overflow na kare and mid*mid ko bhi long mai TYPECAST karna hoata hai jisse probelm na ho
                if(target==x){
                    return mid;
                }
                else if(target>x){
                    end=mid-1;
                }
                else{
                    srt=mid+1;
                    ans=mid;//ye hamne isliye laga ya hai kyuki hm directly 8 ka square root nhi search kar skate but near root nikal skte hai isliye isko use karte hai hmm
                }
            }
      return ans;  
    }
}