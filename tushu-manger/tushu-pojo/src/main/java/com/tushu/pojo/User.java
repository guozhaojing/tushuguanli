package com.tushu.pojo;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uname
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    private String uname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.upwd
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    private String upwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.utype
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    private String utype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uname
     *
     * @return the value of user.uname
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uname
     *
     * @param uname the value for user.uname
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.upwd
     *
     * @return the value of user.upwd
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    public String getUpwd() {
        return upwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.upwd
     *
     * @param upwd the value for user.upwd
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.utype
     *
     * @return the value of user.utype
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    public String getUtype() {
        return utype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.utype
     *
     * @param utype the value for user.utype
     *
     * @mbggenerated Thu May 26 10:42:14 CST 2016
     */
    public void setUtype(String utype) {
        this.utype = utype == null ? null : utype.trim();
    }
}