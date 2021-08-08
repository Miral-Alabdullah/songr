package controller;

import model.AlbumModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String getAlbums(Model model){
        AlbumModel superjunior = new AlbumModel("Mamacita", "Super Junior", 8, 2267, "https://img.discogs.com/JxqlsFTvmILC5eanEYXG4AHt7Ag=/fit-in/600x862/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-7515785-1443090584-4759.jpeg.jpg");
        AlbumModel exo = new AlbumModel("Exodus", "EXO", 8, 2241, "https://i.pinimg.com/564x/00/df/26/00df2656e062dda5f3382fadfb817f21.jpg");
        AlbumModel deadbyapril = new AlbumModel("Worlds Collide", "Dead By April", 11, 2505, "https://images-na.ssl-images-amazon.com/images/I/81wMk8Ni1EL._SL1500_.jpg");

        List<AlbumModel> albums = new ArrayList<AlbumModel>();
        albums.add(superjunior);
        albums.add(exo);
        albums.add(deadbyapril);

        model.addAttribute("albums", albums);
        return "albums.html";
    }
}
