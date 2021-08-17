package com.songr.songr.Controller;

import com.songr.songr.Model.Album;
import com.songr.songr.Model.Song;
import com.songr.songr.Repository.AlbumRepository;
import com.songr.songr.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getSongs(Model model){
        model.addAttribute("songs", songRepository.findAll());
        return "songs.html";
    }

    @GetMapping("/songs/{id}")
    public String getSpecificSong(@PathVariable int id, Model model){
        Song song = songRepository.findById(id).get();
        model.addAttribute("song", song);
        return "song.html";
    }


    @GetMapping("/addSong")
    public String addSongPage(){
        return "addsong.html";
    }

    @PostMapping("/addSong")
    public RedirectView addSong(@RequestParam String title,
                                @RequestParam double length,
                                @RequestParam int trackNumber,
                                @RequestParam String album){
        Album albumIns = albumRepository.findByTitle(album);
        Song song = songRepository.findSongByTitleAndAlbum(title, albumIns);
        if(song == null){
            song = songRepository.save(new Song(title, length, trackNumber, albumIns));
        }
        return new RedirectView("/songs");
    }
}
