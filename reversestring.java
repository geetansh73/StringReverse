class reversestring
{
    static String reverse(String str)
    {
StringBuilder sb=new StringBuilder(str);
sb.reverse();
String s=new String(sb);
return s;
}

public static void main(String g[])
{
String str="Hello";
String r=reverse(str);
System.out.println(r);
String str1="java";
char arr[]=str1.toCharArray();
char arr1[]=new char[arr.length];
int j=0;
for(int i=arr.length-1;i>=0;i--)
{
arr1[j++]=arr[i];
}
String sr=new String(arr1);
System.out.println(sr);
}
}
