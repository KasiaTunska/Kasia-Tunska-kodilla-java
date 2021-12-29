package com.kodilla.testing.forum;                             // [1]

import java.util.ArrayList;                                    // [2]
import java.util.LinkedList;                                   // [3]

import java.util.List;                                         // [4]
public class ForumUser {                                       // [5]

    private String name;                                        // [6]
    private String realName;                                    // [7]
    private List<ForumPost> posts = new ArrayList<>();          // [8]
    private List<ForumComment> comments = new LinkedList<>();   // [9]

    public ForumUser(String name, String realName) {            // [10]
        //name visible on forum
        this.name = name;                                        // [11]
        //real name of the user
        this.realName = realName;                                // [12]
    }                                                           // [13]

    public void addPost(String author, String postBody) {
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }                                                           // [15]
    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }                                                         // [17]

    public int getPostsQuantity() {
        return posts.size();
    }                                                          // [20]

    public int getCommentsQuantity() {
        return comments.size();
    }
    // [23]

    public ForumPost getPost(int postNumber) {                  // [24]
        // returning null means that the operation was unsuccessful
        return null;                                             // [25]
    }                                                           // [26]

    public ForumComment getComment(int commentNumber) {         // [27]
        // returning null means that the operation was unsuccessful
        return null;                                             // [28]
    }                                                           // [29]

    public boolean removePost(ForumPost thePost) {              // [30]
        // return true temporarily
        return true;                                             // [31]
    }                                                           // [32]

    public boolean removeComment(ForumComment theComment) {     // [33]
        // return true temporarily
        return true;                                             // [34]
    }                                                           // [35]

    public String getName() {                                   // [36]
        return name;                                             // [37]
    }                                                           // [38]

    public String getRealName() {                               // [39]
        return realName;                                         // [40]
    }                                                           // [41]
}