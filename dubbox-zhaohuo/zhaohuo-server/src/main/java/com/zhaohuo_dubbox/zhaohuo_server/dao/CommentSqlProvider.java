package com.zhaohuo_dubbox.zhaohuo_server.dao;

import org.apache.ibatis.jdbc.SQL;

import com.zhaohuo_dubbox.model.Comment;
 
public class CommentSqlProvider {

    public String insertSelective(Comment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_comment");
        
        if (record.getId() != 0l) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("state", "#{state,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Comment record) {
        SQL sql = new SQL();
        sql.UPDATE("t_comment");
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.SET("state = #{state,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}