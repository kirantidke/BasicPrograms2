package Bridgelabz;

public class CouponNumber {

	public static void main(String[] args) {
		char[] chars = "123456789".toCharArray();
		int max = 1000;
		int random = (int)(Math.random()* max );
		
		StringBuffer s = new StringBuffer();
		while (random > 0) {
			s.append(chars[random % chars.length]);
			random /= chars.length;
		}
		String couponCode = s.toString();
		System.out.println("coupon code = "+ couponCode);
		
	}

}
