/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    // TODO
    public void userWithMostLikes(){
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()){
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" + users.get(maxId));
        System.out.println("");
    }
    
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
        @Override
        public int compare(Comment c1, Comment c2){
            return c2.getLikes() - c1.getLikes();
        }
    });
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++){
            System.out.println(commentList.get(i));
        }
        System.out.println("");
    }
    // find 5 comments which have the most likes
    // TODO

    public void getAverageNumberOfLikesPerComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        int sum = 0;
        for(Comment comment : commentList) {
            sum += comment.getLikes();
        }
        int result = sum / commentList.size();
        System.out.println("Average number of likes per comment is " + result);
        System.out.println("");
    }

    public void getPostWithMostLikedComments() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        ArrayList<Integer> resultList = new ArrayList<>();
        
        int most = 0;
        for(Post post : postList) {
            List<Comment> commentList = post.getComments();
            for(Comment comment : commentList) {
                if(comment.getLikes() > most) {
                    most = comment.getLikes();
                }
            }   
        }   
        for(Post post : postList) {
            List<Comment> commentList = post.getComments();
            for(Comment comment : commentList) {
                if(comment.getLikes() == most) {
                    resultList.add(post.getPostId());
                }
            }   
        } 
        
        System.out.println("The posts with most Liked comments are");
        for (Integer i : resultList){
            System.out.println(posts.get(i));
        }
        System.out.println("");
    }

    public void getPostWithMostComments() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        ArrayList<Integer> resultList = new ArrayList<>();
        
        int most = 0;
        
        for(Post post : postList) {
            if(post.getComments().size() > most) {
                most = post.getComments().size();
            }
        }
        
        for(Post post : postList) {
            if(post.getComments().size() == most) {
                resultList.add(post.getPostId());
            }
        } 
        
        System.out.println("The posts with most comments are");
        
        for (Integer i : resultList){
            System.out.println(posts.get(i)); 
        }
        System.out.println("");
    }

    public void getTop5InactiveUsersBasedOnTotalPostsNumber() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<User, Integer> userCount = new HashMap<>();
        
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        
        System.out.println("Posts List: ");
        for(Post post : postList) {
            System.out.println(post);
        }
        System.out.println("");
        
        for(Post post : postList) {
            int userId = post.getUserId();
            userCount.put(users.get(userId), userCount.getOrDefault(users.get(userId), 0) + 1);
        }
        
        PriorityQueue<Map.Entry<User, Integer>> minHeap = new PriorityQueue<>(16, new Comparator<Map.Entry<User, Integer>>() {
            @Override
            public int compare(Map.Entry<User, Integer> o1, Map.Entry<User, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())) {
                    return 0;
                }
                return o1.getValue() < o2.getValue() ? -1 : 1;
            }
        });
        
        System.out.println("User Posts Count");
        for(Map.Entry<User, Integer> entry : userCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            minHeap.offer(entry);
        }
        System.out.println("");
        
        System.out.println("top 5 inactive users based on total posts numbers are ");
        for(int i = 0; i < 5; i++) {
            Map.Entry<User, Integer> entry = minHeap.poll();
            System.out.println(i+1 + ". posts number: " + entry.getValue() + ", user: " + entry.getKey());
        }
        System.out.println("");
    }

    public void getTop5InactiveUsersBasedOnTotalCommentsCreated() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getComments().size() == o2.getComments().size()) {
                    return 0;
                }
                return o1.getComments().size() < o2.getComments().size() ? -1 : 1;
            }
        });
        
        System.out.println("top 5 inactive users based on total comments are ");
        for(int i = 0; i < 5; i++) {
            System.out.println(i+1 + ". comments number: " + userList.get(i).getComments().size() + ", user: " + userList.get(i));
        }
        System.out.println("");
    }

    public void getTop5InactiveUsersOverall() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<User, Integer> userPostCount = new HashMap<>();
        Map<User, Integer> userCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        for(Post post : postList) {
            int userId = post.getUserId();
            userPostCount.put(users.get(userId), userPostCount.getOrDefault(users.get(userId), 0) + 1);
            userCount.put(users.get(userId), userCount.getOrDefault(users.get(userId), 0) + 1);
        }
        
        for(User user : users.values()) {
            List<Comment> commentList = user.getComments();
            userCount.put(user, userCount.getOrDefault(user, 0) + commentList.size());
            for(Comment comment : commentList) {
                userCount.put(user, userCount.getOrDefault(user, 0) + comment.getLikes());
            }
        }
        
        PriorityQueue<Map.Entry<User, Integer>> minHeap = new PriorityQueue<>(16, new Comparator<Map.Entry<User, Integer>>() {
            @Override
            public int compare(Map.Entry<User, Integer> o1, Map.Entry<User, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())) {
                    return 0;
                }
                return o1.getValue() < o2.getValue() ? -1 : 1;
            }
        });
        
        for(Map.Entry<User, Integer> entry : userCount.entrySet()) {
            minHeap.offer(entry);
        }
        
        System.out.println("top 5 inactive users overall are ");
        for(int i = 0; i < 5; i++) {
            Map.Entry<User, Integer> entry = minHeap.poll();
            System.out.println(i+1 + ". overall: " + entry.getValue() + ", user:  " + entry.getKey());
        }
        System.out.println("");
    }

    public void getTop5ProactiveUsersOverall() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<User, Integer> userPostCount = new HashMap<>();
        Map<User, Integer> userCount = new HashMap<>();
        
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        for(Post post : postList) {
            int userId = post.getUserId();
            userPostCount.put(users.get(userId), userPostCount.getOrDefault(users.get(userId), 0) + 1);
            userCount.put(users.get(userId), userCount.getOrDefault(users.get(userId), 0) + 1);
        }
        
        for(User user : users.values()) {
        List<Comment> commentList = user.getComments();
            userCount.put(user, userCount.getOrDefault(user, 0) + commentList.size());
            for(Comment comment : commentList) {
                userCount.put(user, userCount.getOrDefault(user, 0) + comment.getLikes());
            }
        }
        
        PriorityQueue<Map.Entry<User, Integer>> maxHeap = new PriorityQueue<>(16, new Comparator<Map.Entry<User, Integer>>() {
            @Override
            public int compare(Map.Entry<User, Integer> o1, Map.Entry<User, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())) {
                    return 0;
                }
                return o1.getValue() > o2.getValue() ? -1 : 1;
            }
        });
        for(Map.Entry<User, Integer> entry : userCount.entrySet()) {
            maxHeap.offer(entry);
        }
        
        System.out.println("top 5 proactive users overall are");
        for(int i = 0; i < 5; i++) {
            Map.Entry<User, Integer> entry = maxHeap.poll();
            System.out.println(i+1 + ". overall: " + entry.getValue() + ", user:  " + entry.getKey());
        }
        System.out.println("");
    }
}
