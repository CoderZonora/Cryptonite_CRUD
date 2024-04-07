package com.example.CRUD;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface Product_Reposiitory extends CrudRepository<Product,Long> 
//'Product'  is name of class managed by the repo and 'Long' is the data typr of its primary key.
{
    //List<Product> findByName(String name);   // Have not implemented these, will have to try
    //List<Product> findByAuthor(String author);
}
