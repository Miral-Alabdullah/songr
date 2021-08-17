package com.songr.songr.Controller;

import com.songr.songr.Model.Album;
import com.songr.songr.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;


@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAlbums(Model model){
//        Album superjunior = new Album("Mamacita", "Super Junior", 8, 2267, "https://img.discogs.com/JxqlsFTvmILC5eanEYXG4AHt7Ag=/fit-in/600x862/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-7515785-1443090584-4759.jpeg.jpg");
//        Album exo = new Album("Exodus", "EXO", 8, 2241, "https://i.pinimg.com/564x/00/df/26/00df2656e062dda5f3382fadfb817f21.jpg");
//        Album deadbyapril = new Album("Worlds Collide", "Dead By April", 11, 2505, "https://images-na.ssl-images-amazon.com/images/I/81wMk8Ni1EL._SL1500_.jpg");
//
//        List<Album> albums = new ArrayList<Album>();
//        albums.add(superjunior);
//        albums.add(exo);
//        albums.add(deadbyapril);

        model.addAttribute("albums", albumRepository.findAll());
        return "albums.html";
    }

    @GetMapping("/albums/{id}")
    public String getSpecificAlbum(@PathVariable int id, Model model){
        Album album = albumRepository.findById(id).get();
        model.addAttribute("album", album);
        return "album.html";
    }

    @PostMapping("/addAlbum")
    public RedirectView addAlbum(@RequestParam String title, @RequestParam String artist,
                                 @RequestParam int songCount, @RequestParam double length,
                                 @RequestParam String imageUrl){
        Album album = albumRepository.save(new Album(title, artist, songCount, length, imageUrl));
        return new RedirectView("/albums");
    }
}
