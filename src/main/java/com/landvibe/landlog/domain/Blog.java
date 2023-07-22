package com.landvibe.landlog.domain;

public class Blog {
    private Long creatorId;
    private Long id;
    private String title;
    private String contents;

    public Blog() {
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Blog(Long creatorId, Long id, String title, String contents) {
        this.creatorId = creatorId;
        this.id = id;
        this.title = title;
        this.contents = contents;
    }
    public Blog(Long creatorId, String title, String contents) {
        this.creatorId = creatorId;
        this.id = id;
        this.title = title;
        this.contents = contents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
