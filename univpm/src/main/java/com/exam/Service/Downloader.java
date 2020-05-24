package com.exam.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.*;
import org.json.JSONArray;
import org.json.JSONTokener;

import com.exam.Database.Tweet;

import org.json.JSONObject;

public class Downloader {

	private File file;
	private URL url;
	private File myfile;
	
	private JSONArray jsonArray;
	private Tweet[] tweets = new Tweet[100];
	
	
	
	public Downloader() throws IOException {
		file = new File("text.json");
		url = new URL("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?q=terremoto&count=100");
		myfile = new File("src/main/resources/myfile.txt"); 
		
		FileUtils.copyURLToFile(url, file);
		FileInputStream newfile = new FileInputStream(new File ("stringa.txt"));
		JSONTokener readlocationFeed = null;
		jsonArray = new JSONArray (readlocationFeed);
		
		for (int n=0; n<jsonArray.length(); n++) {
			
			JSONObject temp = jsonArray.getJSONObject(n);
			tweets[n] = new Tweet(temp.getString("text"),
									temp.getInt("id"),
									temp.getDouble("boo"));
			
	    }
	
	}
	
}