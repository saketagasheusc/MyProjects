class maxSumSpecial {

  static int Maxsum(int c1, int c2, int c3, int c4){
  	int sum = 0;
  	int two34 = Math.min(c2,Math.min(c3, c4));

  	sum = two34 * 234;
  	c2 -= two34;
  	sum +=Math.min(c2, c1) * 12;

  	return sum;
  }

    public static void main(String[] args) { 
    	int c1 = 5, c2 = 2, c3 = 3, c4 = 4;

    	System.out.println(Maxsum(c1, c2, c3, c4));
    }
}
