package com.mconsulting.utils;

import java.util.ArrayList;
import java.util.List;

/*
 * Stores an RSS feed
 */

public class Feed {
    final String title;
    final String link;
    final String description;
    final String language;
    final String copyright;
    final String createDate;
    final String updateDate;

    final List<FeedMessage> entries = new ArrayList<FeedMessage>();

    public Feed(String title, String link, String description, String language,
                String copyright, String createDate, String updateDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.language = language;
        this.copyright = copyright;
        this.createDate = createDate;
        this.updateDate = updateDate;

    }

    public List<FeedMessage> getMessages() {
        return entries;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getCreateDate () {
        return createDate;
    }

    public String getUpdateDate () {
        return updateDate;
    }

    @Override
    public String toString() {
        return "Feed [copyright=" + copyright + ", description=" + description
                + ", language=" + language + ", link=" + link + ", createDate="
                + createDate + ", updateDate=" + updateDate+ ", title=" + title + "]";
    }
}
