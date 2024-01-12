/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    //count digits
	public static int count_digits(int n)
	{
	    int count=0;
	    while(n>0)
	    {
	        n=n/10;
	        count++;
	    }
	    return count;
	}
	
	//Palindrome
	public static boolean is_Palindrome(int n)
	{
	    int rev=0;
	    int temp=n;
	    while(temp!=0)
	    {
	        int last_digit=temp%10;
	        rev=(rev*10)+last_digit;
	        temp=temp/10;
	    }
	    return (rev==n);
	}
	
	//factorial
	public static int factorial(int n)
	{
	    if(n==0)
	    {
	        return 1;
	    }
	    return n*(fact(n-1));
	}
	
	
	//trailing zeros in factorial
	public static int trailing_zeros_factorail(int n)
	{
	    if(n<=1)
	    {
	        return -1;
	    }
	    int count=0;
	    for(int i=5; n/i>=1; i*=5)
	    {
	        count+=n/i;
	    }
	    return count;
	}
	
	//gcd(method naive)
	public static int gcd(int a, int b)
	{
	    int res = Math.min(a,b);
	    while(res>0)
	    {
	        if((a%res==0) && (b%res)==0)
	        {
	            break;
	        }
	        res--;
	    }
	    return res;
	}
	
	//gcd(method 2----eucledian)
	public static int gcd(int a, int b)
	{
	    while(a!=b)
	    {
	        if(a>b)
	        {
	            a=a-b;
	        }
	        else
	        {
	            b=b-a;
	        }
	        return a;
	    }
	    return b;
	} 
	
	//lcm
	public static int lcm(int a, int b)
	{
	    int res = Math.max(a,b)
	    while(res>0)
	    {
	        if((res%a==0) && (res%b==0))
	        {
	            break;
	        }
	        res++;
	    }
	    return res;
	}
	//check for prime
	public static int is_Prime(int n)
	{
	    if(n==1)
	    {
	        return false;
	    }
	    for(int i=0; i*i<=n; i++)
	    {
	        if(n%i==0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
	//prime factors
	public static int prime_factors(int n)
	{
	    if(n<=1)
	    {
	        return 0;
	    }
	    for(int i=2; i*i<n; i++)
	    {
	        while(n%i==0)
	        {
	            print(i);
	            n=n/i;
	        }
	    }
	    if(n>1)
	    {
	        print(n);
	    }
	}
	//all divisors
	print divisors(int n)
	{
	    for(int i=1; i<=Math.sqrt(n); i++)
	    {
	        if(n%i==0)
	        {
	            if(n/i==1)
	            {
	                SOP(" "+i);
	            }
	            else
	            {
	                SOP(i+" "+n/i+" ");
	            }
	        }
	    }
	}
	//sieve algorithm
	void sieve(int n)
	{
	    boolean prime[] = new boolean[n+1];
	    for(int i=0; i<=n; i++)
	    {
	        prime[i]=true;
	    }
	    for(int p=2; p*p<=n; p++)
	    {
	        if(prime[p]==true)
	        {
	            for(int i=p*p; i<=n; i++)
	            {
	                prime[i]=false;
	            }
	        }
	    }
	}
	//computing power
	int power(int x, int n)
	{
	    int res=1;
	    for(int i=0; i<n; i++)
	    {
	        res=res*x;
	    }
	    return res;
	}

    //msb of a Number
    public int find_msb(int n)
    {
        if(n<=1)
        {
            return -1;
        }
        int msb=0;
        if(n>0)
        {
            n=n>>1;
            msb++;
        }
        int msb_value = 1<<msb;
        return msb_value;
    }
    
    //kth bit is set or not
    void is_set(int n, int k)
    {
        int x=1;
        for(int i=0; i<(k-1); i++)
        {
            x=x*2;
            if((n&x)!=0)
            {
                print("yes");
            }
            else
            {
                print("no");
            }
        }
    }
    
    //kth set bit(using operators)
    void is_set(int n, int k)
    {
        int x = (1<<(k-1)); // or int x = (n>>(k-1))
        if((n%x)!=0)
        {
            print("yes");
        }
        else
        {
            print("no");
        }
    }
    
    //count bits(all one ex--0010011 output: 3)
    //using brian-kernigun's
    int count_bits(int n)
    {
        int res=0;
        while(n>0)
        {
            n=n&(n-1);
            res++;
        }
        return res;
    }
    
    //lookup Table
    public void look_table(int n)
    {
        static int[] tbl = new int[256];
        void initialize()
        {
            tbl[0]=0;
            for(int i=0; i<256; i++)
            {
                tbl[i]=(i&1)+tbl[i/2];
            }
        }
        public static int countSetBits(int n){
		return (tbl[n & 0xff]
				+ tbl[(n >> 8) & 0xff]
				+ tbl[(n >> 16) & 0xff]
				+ tbl[n >> 24]);
	    }
    }
    
    //power_of_2
    boolean powers_of_2(int n)
    {
        // int ans1 = n;
        // int ans2 = n-1
        // if((n&(n-1))==0)
        // {
        //     return true;
        // }
        // return false;
        
            //or
        
        if(n==0)
        {
            return false;
        }
        while(n!=1)
        {
            if(n%2!=0)
            {
                return false;
            }
            n=n/2;
        }
        return true;
    }
    
    // (one) odd-occurring
    int findOdd(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            int count=0;
            for(int j=0; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count%2!=0)
            {
                return arr[i];
            }
        }
    }
    
    // (one) odd-occuring
    int odd_occur(int arr[], int n)
    {
        int res=arr[0];
        for(int i=0; i<n; i++)
        {
            res=res^arr[i];
        }
        return res;
    }
    
    // (two) odd-occurring
    int oddAppearing(int arr[], int n)
    {
        int x = arr[0];
        for(int i=0; i<n; i++)
        {
            x=x^arr[i];
        }
        int k = (x&(~(x-1)));
        int res=1;
        int res2=0;
        for(int i=0; i<n; i++)
        {
            if((arr[i]&k)!=0)
            {
                res1=res1^arr[i];
            }
            res2=res2^arr[i];
        }
        return res1,res2;
    }
    
    // (two) naive solution of odd-occurring
    int odd_occuring(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            int count=0;
            for(int j=0; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count%2==0)
            {
                return (arr[i]);
            }
        }
    }
    
    
    //power set
    int power_set(String s) //abc
    {
        int n = s.length;   //3
        int p_size=(1<<n);  //8
        for(int i=0; i<p_size; i++)     //0<8(correct)              //1<8(correct)
        {
            for(int j=0; j<n; j++)      //0<3(correct)              //1<3(correct)
            {
                if(i&(1<<j)==0)         //(0&(1<<0))=(0&0)=0        //(1&(1<<1))==(1&2)=0
                {
                    print(a[j]);         //0                           //print(a[0]==a)
                }
            }                           //print's 0
        }
    }
    public static void main(String[] args)
	{
	    int ans = count_digits(100);
	    System.out.println(ans);
	    
	}
}
