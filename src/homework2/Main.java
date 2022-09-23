package homework2;

public class Main {

	public static void main(String[] args) {
		// Variable Arguments ile Çalışmak
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		int toplam2=topla2();
		System.out.println(toplam);
		System.out.println(toplam2);

	}

	public static void ekle() {
		System.out.println("Eklendi.");

	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
