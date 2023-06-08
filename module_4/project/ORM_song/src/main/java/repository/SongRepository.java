package repository;

import com.example.orm_song.model.Song;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    // Additional methods if needed
}