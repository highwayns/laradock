package com.highwayns.domain.dao;

import com.highwayns.domain.entity.Language;
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
public interface LanguageDao {

    /**
     * @param languageId
     * @return the Language entity
     */
    @Select
    Language selectById(Integer languageId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Language entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Language entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Language entity);
}