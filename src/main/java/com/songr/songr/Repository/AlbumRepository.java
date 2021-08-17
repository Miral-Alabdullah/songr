package com.songr.songr.Repository;
import com.songr.songr.Model.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Integer>{
    public Album findByTitle(String title);
}
