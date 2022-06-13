package com.highwayns.domain.dao;

import com.highwayns.domain.entity.Actor;
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
public interface ActorDao {

    /**
     * @param actorId
     * @return the Actor entity
     */
    @Select
    Actor selectById(Integer actorId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Actor entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Actor entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Actor entity);
}