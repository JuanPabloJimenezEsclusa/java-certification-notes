package com.company.io.nio;

import java.io.File;
import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Song {
  public static void organize(Path folder, Path file) throws IOException {
    Path p = folder.resolve(file);
    //BasicFileAttributeView vw = Files.getFileAttributeView(p, BasicFileAttributes.class);
    BasicFileAttributeView vw = Files.getFileAttributeView(p, BasicFileAttributeView.class);
    //if(vw.creationTime().toMillis()<System.currentTimeMillis()) {
    if(vw.readAttributes().creationTime().toMillis()<System.currentTimeMillis()) {
      vw.setTimes(FileTime.fromMillis(System.currentTimeMillis()),null,null);
    }
  }
  public static void main(String[] audio) throws Exception {
    Song.organize(Paths.get("/", "pub"),new File("/songs").toPath());
  }
}
