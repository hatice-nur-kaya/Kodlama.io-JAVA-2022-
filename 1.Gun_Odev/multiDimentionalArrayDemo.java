public class multiDimentionalArrayDemo {
    public static void main(String[] args) {
		//İki boyutlu yapı gibi düşün alttaki örneği. 3 x 3'lük
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("---------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

		//Üç boyulu çalışsaydık String[][][] boyutlar = new String[3][3][3];
		//yapabilirdik...
	}
}
