package com.songr.songr;

import com.songr.songr.Model.Album;
import com.songr.songr.Model.Song;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SongrApplicationTests {

	@Test
	public void albumDefaultConstructor() {
		Album album = new Album();
		assertTrue(album instanceof Album);
	}

	@Test
	public void albumConstructorSettersAndGetters(){
		Album album = new Album("Exodus", "EXO", 5, 214, "https://upload.wikimedia.org/wikipedia/commons/5/5b/Exo_love_me_right.jpg");
		assertEquals("Exodus", album.getTitle());
		assertEquals("EXO", album.getArtist());
		assertEquals(5, album.getSongCount());
		assertEquals(214, album.getLength());
		assertEquals("https://upload.wikimedia.org/wikipedia/commons/5/5b/Exo_love_me_right.jpg", album.getImageUrl());
	}

	@Test
	public void songDefaultConstructor(){
		Song song = new Song();
		assertTrue(song instanceof Song);
	}

	@Test
	public void songConstructorSettersAndGetters(){
		Album album = new Album("Exodus", "EXO", 5, 214, "https://upload.wikimedia.org/wikipedia/commons/5/5b/Exo_love_me_right.jpg");
		Song song = new Song("Hurt",2,4, album);

		assertEquals("Hurt", song.getTitle());
		assertEquals(2,song.getLength());
		assertEquals(4, song.getTrackNumber());
		assertEquals("Exodus", song.getAlbum().getTitle());
		assertEquals("EXO", song.getAlbum().getArtist());
	}
}
