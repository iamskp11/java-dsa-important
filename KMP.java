
public class KMP {
	public static int get_patterns(String s, String pat) {
		String z_string = pat + "#" + s;

		int len = z_string.length();
		int ans = 0;
		int []pre = new int[len+5];
		pre[0] = 0;
		for(int i=1;i<len;i++) {
			int j = pre[i-1];
			while(j>0 && z_string.charAt(j) != z_string.charAt(i)) {
				j=pre[j-1];
			}
			if(z_string.charAt(j)==z_string.charAt(i)) j++;
			pre[i]=j;

			if(pre[i]==pat.length()) {
				ans+=1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String s = "abcdefghijkabcdefghijk";
		String pat = "jka";
		System.out.println(get_patterns(s, pat));

	}
}