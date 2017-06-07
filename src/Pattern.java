
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, d, x = 0;
		char k;
		for (i = 1; i <= 5; i++) {
			k = 'a';
			for (j = 1, d=0; j <= 5; j++) {
				// increasing
				if (i < 4) {
					if (j >= 4 - i && j <= 2 + i) {
						System.out.print(k);
						if (j < 3) {
							k++;
						} else {
							k--;
						}
					} else {
						System.out.print(" ");
					}
				} else {
					
					// decreasing					
					if (j>i-3 && j <= 5-d) {
						
						System.out.print(k);
						if (j<3) {
							k++;
						} else {
							k--;
						}
					} else {
						System.out.print(" ");
						d++;
					}
				}

			}

			System.out.println();
		}
	}

}