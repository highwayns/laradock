package com.highwayns.domain.dao;

import com.highwayns.domain.entity.Store;
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
public interface StoreDao {

    /**
     * @param storeId
     * @return the Store entity
     */
    @Select
    Store selectById(Integer storeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Store entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Store entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Store entity);
}