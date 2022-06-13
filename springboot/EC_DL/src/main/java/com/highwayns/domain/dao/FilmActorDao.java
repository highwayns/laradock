package com.highwayns.domain.dao;

import com.highwayns.domain.entity.FilmActor;
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
public interface FilmActorDao {

    /**
     * @param actorId
     * @param filmId
     * @return the FilmActor entity
     */
    @Select
    FilmActor selectById(Short actorId, Short filmId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(FilmActor entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(FilmActor entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(FilmActor entity);
}