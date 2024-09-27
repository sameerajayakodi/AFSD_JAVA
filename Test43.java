class Test43{
	public static void main(String []){
		
	}
}


class Book{
	String title;
	String author;
	int yearOfPublication;
	
	public Book(String title,String author,int yearOfPublication){
		this.title = title;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
	}
	
	public void displayDetails(){
		System.out.println("Book Title : "+title+"Book Author : "+author+" Year of Publication : "+yearOfPublication);
	}
	
	
}
