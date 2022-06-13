package com.highwayns.domain.dao;

import com.highwayns.domain.entity.Staff;
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
public interface StaffDao {

    /**
     * @param staffId
     * @return the Staff entity
     */
    @Select
    Staff selectById(Integer staffId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Staff entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Staff entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Staff entity);
}