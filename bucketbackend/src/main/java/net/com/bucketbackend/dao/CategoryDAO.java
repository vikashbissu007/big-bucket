package net.com.bucketbackend.dao;

import java.util.List;

import net.com.bucketbackend.dto.Category;

public interface CategoryDAO {

	boolean add(Category category);

	List<Category> list();

	Category get(int id);

}
