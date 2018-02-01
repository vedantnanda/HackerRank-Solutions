	// Add your code here
    Difference(int[] a)
    {
        elements=new int[a.length];
        elements=a;
        Arrays.sort(elements);
    }
    public void computeDifference()
    {
        maximumDifference=elements[elements.length-1]-elements[0];
    }