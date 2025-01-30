package com.example.issue_tracking_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class IssueTrackingProjectApplication {

    
    public static void main(String[] args) throws IOException {
        // ClassLoader classLoader = IssueTrackingProjectApplication.class.getClassLoader();
        // File file = new File(classLoader.getResource("serviceAccountKey.json").getFile());
        // FileInputStream serviceAccount = new FileInputStream(file.getAbsolutePath());

        // if (!FirebaseApp.getApps().isEmpty()) {
        //     FirebaseApp.getInstance().delete();
        //     System.out.println("Removed existing FirebaseApp instance.");
        // }
    

        // FirebaseOptions options = FirebaseOptions.builder()
        // .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        // .setDatabaseUrl("https://issue-tracking-db-default-rtdb.firebaseio.com/")
        // .build();
        
        // FirebaseApp.initializeApp(options);

        SpringApplication.run(IssueTrackingProjectApplication.class, args);
    }

}
