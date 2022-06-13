package com.highwayns.domain.dao;

import com.highwayns.domain.entity.Film;
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
public interface FilmDao {

    /**
     * @param filmId
     * @return the Film entity
     */
    @Select
    Film selectById(Integer filmId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Film entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Film entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Film entity);
}