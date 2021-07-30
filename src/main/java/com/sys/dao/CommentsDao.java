package com.sys.dao;

import com.sys.pojo.Comments;

import java.util.List;

public interface CommentsDao {
    void insertComment(Comments comments);
    void deleteComment(Comments comments);
    List<Comments> selectAllComments();
}
