/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Didar Soyunov.)
 * @version (Feb 4,2019.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    public int pages;
    private String refNumber;
    private int borrowed;
    int borrowed;
    
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle , int bookpages , String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookpages;
        refNumber = "";
        
    }

    /**
     * Provide access to the string holding the author
     */
    public String getauthor()
        {
           return author;
        
       }
    
    public String getTitle()
        {
          return title;
          
        }
    
    public int getPages()
        {
            return pages;
            
        }
    
    public String getrefNumber()
        {
            return refNumber;
         
        }
    public int getBorrowed()
	{
	    return borrowed;
	}
    public void setRefNumber(String ref)
	{
	   if (ref.length() >=3)
	{
	   refNumber = ref;
        }
        else
        {
            System.out.println("Reference #”);
        }
    }
        
    public void printAuthor()
        {
            System.out.println("Didar Soyunov" + author);
            
        }
    
    public void printTitle()
        {
            System.out.println("The Rich dad and poor dad" + title);
            
        }
    
    public void printDetails()
        {
            System.out.println("Title:" + title + "Author:" + author + "Pages:" + pages);
         
        }
    if (refNumber.length() > 0)
        {
            System.out.println("Reference number: " + refNumber);
        }
        else
        {
            System.out.println("ZZZ");
        }
        
        System.out.println("\"" + title + "\" has been borrowed " + borrowed + " times");
    }
}
