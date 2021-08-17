package com.songr.songr.Repository;

import com.songr.songr.Model.Album;
import com.songr.songr.Model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Integer> {
    public Song findSongByTitleAndAlbum(String title, Album album);
}
