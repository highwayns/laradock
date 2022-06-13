package com.highwayns.domain.dao;

import com.highwayns.domain.entity.Category;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 * @author k_kawasaki
 */
@Dao
@ConfigAutowireable
public interface CategoryDao {

    /**
     * @param categoryId
     * @return the Category entity
     */
    @Select
    Category selectById(Integer categoryId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Category entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Category entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Category entity);
}