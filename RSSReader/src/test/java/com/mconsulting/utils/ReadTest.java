package com.mconsulting.utils;

import com.mconsulting.utils.Feed;
import com.mconsulting.utils.FeedMessage;
import com.mconsulting.utils.RSSFeedParser;

public class ReadTest {
    public static void main(String[] args) {
        RSSFeedParser parser = new RSSFeedParser(
                "http://s3.amazonaws.com/alexa-java-skill-vikas/article.rss");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);

        }

    }
}
