package pt.rumos.bookjavase.persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pt.rumos.bookjavase.persistence.Book;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

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
        tx.begin();
        em.persist(book);
        tx.commit();
        assertThat("Book id should not be null", book, is(notNullValue(Book.class)));
    }
    
    @Test
    public void findBookById() {//hint em
        
    }
    
    @Test
    public void deleteBook() {//hint em
        
    }
    
    @Test
    public void updateBook() {//hint em
        
    }
}
