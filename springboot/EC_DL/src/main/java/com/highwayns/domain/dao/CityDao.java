package com.highwayns.domain.dao;

import com.highwayns.domain.entity.City;
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
public interface CityDao {

    /**
     * @param cityId
     * @return the City entity
     */
    @Select
    City selectById(Integer cityId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(City entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(City entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(City entity);
}