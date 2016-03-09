package pt.rumos.bookjavase.persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Ignore;

/**
 *
 * @author Utilizador
 */
public class BookUT {

    private Book book;
    static EntityManagerFactory emf;
    static EntityManager em;
    static EntityTransaction tx;

    private static final String TITLE = "Beggining JAVA EE6 Plattform";

    @BeforeClass
    public static void setUpClass() {
        // Gets an entity manager and a transaction
        emf = Persistence.createEntityManagerFactory("chapter02PU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }

    @AfterClass
    public static void tearDownClass() {

        em.close();
        emf.close();

    }

    @Before
    public void setUp() {
        book = new Book();
        book.setTitle(TITLE);
        //....

    }

    @After
    public void tearDown() {
    }
//CRUD

    @Test
    public void persistBook() {
        persistNewBook();
        assertThat("Book should not be null", book, is(notNullValue(Book.class)));
    }

    private void persistNewBook() {
        tx.begin();
        em.persist(book);
        tx.commit();
    }
    
    @Test
    @Ignore
    public void findBookById() {//hint em
        persistNewBook();
        book = em.find(Book.class, 151L);
        assertThat("Book id should not be null", book.getId(), is(equalTo(151L)));
    }
    
    @Test
    public void deleteBook() {//hint em
        tx.begin();
        em.remove(book);
        tx.commit();
    }
    
    @Test
    @Ignore
    public void updateBook() {//hint em
        persistNewBook();
        //TODO: develop a search by name partially
        book = em.find(Book.class, 151L);
        book.setIsbn("123456789");
        tx.begin();
        em.merge(book);
        tx.commit();
        assertThat("Book isbn should be '123456789'", book.getIsbn(), is(equalTo("123456789")));
    }
    
    @Test
    public void findAllBooks() {
        
        
        
        persistNewBook();
        List<Book> result = em.createNamedQuery(Book.ALL_BOOKS_QUERY)
                .getResultList();
        assertThat("Number of Books persisted should be 1", result.size(), is(equalTo(1)));
    }
}
