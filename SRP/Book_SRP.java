class BookSRP {
    private String title;
    private String author;
    private String content;

    public BookSRP(String title, String author, String content){
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getContent(){return content;}

    public static void main(String[] args) {
        // 1. Création du livre
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Revision des principes SOLID");

        // 2. Instanciation des services pour utiliser leurs méthodes
        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookbusinessLogic logic = new BookbusinessLogic();

        // 3. Appels des méthodes via les bons objets
        printer.printToScreen(book);
        printer.printToHTML(book); // Vous pouvez maintenant tester le HTML facilement
        
        saver.saveToDatabase(book);
        
        logic.emprunter(book, "Marcial");
    }
}
    class BookPrinter{
        public void printToScreen(BookSRP book){
        System.out.println(" === Print to Screen === ");
        System.out.println("Titre:" + book.getTitle());
        System.out.println("Auteur:" + book.getAuthor());
        System.out.println("Contenu:" + book.getContent());
    }
    public void printToHTML(BookSRP book){
        System.out.println(" === Print to HTML === ");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par " + book.getAuthor() +"</h2>");
        System.out.println("<p>" + book.getContent() +"</p>");
    }

    }

    class BookSaver{
    public void saveToDatabase(BookSRP book){
        System.out.println("\nSauvegarde de"+ book.getTitle() +"en base de donnee...");
    }
    public void saveToFile(BookSRP book, String filename){
        System.err.println("\nSauvegarde de"+ book.getTitle() +" dans " + filename);
    }
}
    class BookbusinessLogic{
         public void emprunter(BookSRP book, String lecteur){
        System.err.println("\nEmprunt du livre"+ book.getTitle() +" par " + lecteur);
    }
     public void autreService(BookSRP book){
        System.err.println("\nAutre logique metier sur le livre"+ book.getTitle());
    }
    }
 

    


