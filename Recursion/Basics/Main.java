
//ssum of n natural numbers

// public class Main{
//     public static int sum(int n){
//         if(n == 0){
//             return 0;
//         }
//         return sum(n-1)+n;
        
//     }
//     public static void main(String[] args){
//         System.out.print(sum(8));
//     }
// }



//factorial of n numbers;

class Main{
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return factorial(n-1)*n;
    }
    public static void main(String[] args){
        System.out.print(factorial(5));
    }
}


// power a^b
class Main{
    public static int power(int a, int p){
        if(p == 1){
            return a;
        }
        
        return a*power(a,p-1);
    }
    public static void main(String[] args){
        System.out.print(power(5,3));
    }
}



//fabonic of a number

public class Main{
    public static int fabonic(int n){
        if(n == 0){
            return 0;
        }
        
        if(n ==1){
            return 1;
        }
        return fabonic(n-1)+fabonic(n-2);
    }
	public static void main(String[] args) {
	    int n  = 8;
	    for(int i = 0; i < 8; i++){
	        System.out.print(fabonic(i)+ " ");
	    }
	}
}


///Reverse String

public class Main{
    public static void reverse(String s,int n){
        if(n < 0){
            return;
        }
        System.out.print(s.charAt(n));
        reverse(s,n-1);
    }
	public static void main(String[] args) {
	    String s = "Hello";
	    reverse(s,s.length()-1);
	}
}


//8. Check Palindrome

public class Main{
    public static boolean palindrome(String s,int start, int end){
        if(start >= end){
            return true;
        }
        
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        
        return palindrome(s,start+1, end-1);
        
    }
	public static void main(String[] args) {
	    String s = "apsdpa";
	    System.out.print(palindrome(s,0,s.length()-1));
	    
	}
}


//sum of integer

public class Main{
    public static int sumofint(int n){
        if(n == 0){
            return 0;
        }
        return (n%10)+sumofint(n/10);
    }
	public static void main(String[] args) {
	    System.out.print(sumofint(654123));
	    
	}
}

//count of the numbers in a integer

public class Main{
    public static int count(int n){
        if(n == 0){
            return 0;
        }
        int count = 0;
        return 1+ count(n/10);
    }
	public static void main(String[] args) {
		System.out.println(count(8412652));
	}
}


//check whether palindrome or not

public class Main{
    public static int reverse(int n ,int reverse1){
        if(n ==0){
            return reverse1;
        }
        reverse1 = reverse1*10+(n%10);
        return reverse(n/10,reverse1);
        
    }
	public static void main(String[] args) {
	    int reverse1 = 0;
	    int orginal = 123745221;
		reverse1=reverse(orginal,reverse1);
		
		if(orginal == reverse1){
		    System.out.print("it is palindrome");
		}else{
		    System.out.print("it is not palindrom");
		}
	}
}




public class Main{
    public static boolean palindrome(String s, int start, int end){
        if(start >= end){
            return true;
        }
        
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        
        return palindrome(s,start+1,end-1);
       
    }
	public static void main(String[] args) {
	   String S = "sunnus";
	   System.out.print(palindrome(S,0,S.length()-1));
	}
}


//Sum of Digits

// public class Main{
//     public static int sumof(int n,int sum){
//         if(n == 0){
//             return sum;
//         }
//         sum = sum+(n%10);
//         return sumof(n/10,sum);
//     }
    
// 	public static void main(String[] args) {
	    
// 		int n = 8426;
// 		int sum = 0;
// 		int result = sumof(n,sum);
// 		System.out.print(result);
// 	}
// }


//count of Digits
public class Main{
    public static int sumof(int n,int sum){
        if(n == 0){
            return sum;
        }
        sum++;
        return sumof(n/10,sum);
    }
    
	public static void main(String[] args) {
		int n = 8426;
		int sum = 0;
		int result = sumof(n,sum);
		System.out.print(result);
	}
}


//binary search
public class Main{
    public static int binaryssearch(int[] arr,int l, int h, int target){
        int mid = (l+h)/2;
        
        if(arr[mid] == target){
            return mid;
        }else if(l == h){
            return -1;
            
        }else if(arr[mid] < target){
            l = mid+1;
        }else{
            h=  mid-1;
        }
        return binaryssearch(arr,l,h,target);
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int target = 9;
		int result =binaryssearch(arr,0,arr.length-1,target);
		System.out.print(result);
	}
}


//subsequenc of the string

import java.util.*;

public class Main{
    public static void subsequece(String s, String s1){
        if(s.isEmpty()){
            System.out.print(s1+" ");
            return;
        }
        subsequece(s.substring(1),s1);
        
        s1 += s.charAt(0);
        subsequece(s.substring(1),s1);
    }
	public static void main(String[] args) {
	    String s = "abc";
	    String s1 = "";
		subsequece(s,s1);
	}
}




// check the array sorted or not

import java.util.*;

public class Main{
    public static boolean checksortedornot(int[] arr, int n){
        if(n == 0){
            return true;
        }
        if(arr[n] < arr[n-1]){
            return false;
        }
        return checksortedornot(arr, n-1);   
    }
	public static void main(String[] args) {
	    int[] arr = {1,2,3,9,5,6,7};
	    
	    System.out.print(checksortedornot(arr,arr.length-1));
	    
	}
}


//50. Pow(x, n)
class Solution {
    public double myPow(double x, int n) {
        long pow = n;
        if(pow < 0){
            x = 1/x;
            pow = -pow;
        }
        return power(x,pow,1);
    }
    public static double power(double x,long n,double ans){  
        if(n==0){
            return ans;
        }
        if(n%2 != 0 ){
            ans *= x;
        }
        return power(x*x,n/2,ans);
    }
}

