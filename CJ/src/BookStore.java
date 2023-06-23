
public class BookStore {
	private static Book[] bookData;
	
	static {
		bookData = new Book[3];
		Book b1 = new Book();
		Book b2 = new Book(102, "Let us C", 500);
		Book b3 = new Book(103, "Let us C++", 600);
		bookData[0] = b1;
		bookData[1] = b2;
		bookData[2] = b3;
	}
	
	public static String[] getAllBookTitles() {
		int size = bookData.length;
		String titles[] = new String[size];
		int index = 0;
		for(Book currentBook : bookData) {
			String currentTitle = currentBook.getTitle();
			titles[index] = currentTitle;
			index++;			
		}
		return titles;
	}
	
	public static float getAvgPrice() {
		float[] f = new float[bookData.length];
		float sum = 0;
		float ps = 0;
		int index = 0;
		for(Book p : bookData)
			 ps = p.getPrice();
			f[index] = ps;
			sum = f[index] + sum;
		    index++;
		    float avg = sum/bookData.length;
		return avg;
	}

}



