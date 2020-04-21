import com.capgemini.tests.pages.Homepage;
import com.capgemini.tests.pages.Page;
import com.capgemini.tests.pages.SearchResults;

public class JavaBasics {

  public static void main(String[] args) {
    System.out.println("IS IT WORKING?!");

    Homepage homepage = new Homepage();
    homepage.open();

    System.out.println(homepage.getTitle());

    SearchResults searchResults = new SearchResults();
    searchResults.open();
  }
}
