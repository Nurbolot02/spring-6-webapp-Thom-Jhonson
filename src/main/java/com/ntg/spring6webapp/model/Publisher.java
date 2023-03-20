package com.ntg.spring6webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    @OneToMany(mappedBy = "publisher")
    @ToString.Exclude
    @Builder.Default
    private Set<Book> books = new HashSet<>();
    public void addBook(Book book) {
        this.books.add(book);
        book.setPublisher(this);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Publisher publisher = (Publisher) o;
        return getId() != null && Objects.equals(getId(), publisher.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
