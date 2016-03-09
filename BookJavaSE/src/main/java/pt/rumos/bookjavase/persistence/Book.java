/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.rumos.bookjavase.persistence;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@NamedQueries({
    @NamedQuery(name = Book.ALL_BOOKS_QUERY, query = Book.QUERIES_LIST_ALL),
    @NamedQuery(name = Book.BOOK_BY_TITLE_LIKE, query = Book.QUERIES_LIST_ALL)
})
@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public  static final String ALL_BOOKS_QUERY = "LIST ALL BOOKS";
    public  static final String BOOK_BY_TITLE_LIKE = "LIST BOOKS WITH NAME LIKE";
    
    public  static final String QUERIES_LIST_ALL = "SELECT b FROM Book b";
    public  static final String QUERIES_TITLE_LIKE = "SELECT b FROM Book b WHERE b.";


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;//

    @Column(nullable = false)
    private String title;
    private Float price;
    @Column(length = 2000)
    private String description;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;
    private Integer availableInStock;
    
    public Book() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the availableInStock
     */
    public Integer getAvailableInStock() {
        return availableInStock;
    }

    /**
     * @param availableInStock the availableInStock to set
     */
    public void setAvailableInStock(Integer availableInStock) {
        this.availableInStock = availableInStock;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the nbOfPage
     */
    public Integer getNbOfPage() {
        return nbOfPage;
    }

    /**
     * @param nbOfPage the nbOfPage to set
     */
    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    /**
     * @return the illustrations
     */
    public Boolean getIllustrations() {
        return illustrations;
    }

    /**
     * @param illustrations the illustrations to set
     */
    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", price=" + price + 
                ", description=" + description + ", isbn=" + isbn + ", nbOfPage=" 
                + nbOfPage + ", illustrations=" + illustrations + '}';
    }

}
