package com.salil.learnings;
import java.util.List;
public interface IProductService 
{
List<Product> findAll();

void addProduct(Product product);
}
