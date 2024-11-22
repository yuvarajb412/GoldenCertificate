package org.Api.get;

public class MainUser {

    private  int userId;
    private int id;
    private  String title;
    private String body;

    public MainUser(int userId,
                    int id,
                    String title,
                    String body){

        this.body=body;
        this.id=id;
        this.userId=userId;
        this.title=title;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
