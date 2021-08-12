package com.songr.songr.Controller;

import com.songr.songr.Model.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddAlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/addAlbum")
    public String addAlbum(){

        return "addAlbum.html";
    }
}
