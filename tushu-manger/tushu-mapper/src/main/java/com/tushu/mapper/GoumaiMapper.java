package com.tushu.mapper;

import com.tushu.pojo.Goumai;
import com.tushu.pojo.GoumaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoumaiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int countByExample(GoumaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int deleteByExample(GoumaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int insert(Goumai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int insertSelective(Goumai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    List<Goumai> selectByExample(GoumaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    Goumai selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int updateByExampleSelective(@Param("record") Goumai record, @Param("example") GoumaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int updateByExample(@Param("record") Goumai record, @Param("example") GoumaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int updateByPrimaryKeySelective(Goumai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goumai
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    int updateByPrimaryKey(Goumai record);
}