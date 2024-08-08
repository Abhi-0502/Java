package com.xworkz;

import com.xworkz.instagram.Instagram;
import com.xworkz.linkdin.Linkdin;
import com.xworkz.slack.Slack;
import com.xworkz.twitter.Twitter;
import com.xworkz.youtube.Youtube;

public class SocialMediaRunner {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        instagram.timePass();

        Linkdin linkdin = new Linkdin();
        linkdin.timePass();

        Slack slack = new Slack();
        slack.timePass();

        Twitter twitter = new Twitter();
        twitter.timePass();

        Youtube youtube= new Youtube();
        youtube.timePass();
    }
}
