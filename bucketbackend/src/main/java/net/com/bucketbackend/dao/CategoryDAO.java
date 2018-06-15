package net.com.bucketbackend.dao;

import java.util.List;

import net.com.bucketbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);

}
