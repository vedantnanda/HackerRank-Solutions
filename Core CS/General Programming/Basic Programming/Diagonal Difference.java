#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main()
{
    int n,i,j,sum1=0;;
    scanf("%d",&n);
    int a[n][n];
    for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
            {
        scanf("%d",&a[i][j]);
        }
    }
    int sum=0,k,l;
    {
        for(k=0;k<n;k++)
        {
        for(l=0;l<n;l++)
            {
            if(k==l)
                {
                sum=sum+a[k][l];
            }
        }
    }
        int m,p;
        for(m=0;m<n;m++)
        {
        for(p=0;p<n;p++)
            {
            if((m+p)==(n-1))
                {
                sum1=sum1+a[m][p];
            }
        }
    }
    }
    int z=abs(sum1-sum);
    printf("%d",z);
    return 0;
}