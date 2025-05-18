package com.camjrose.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // to add additional find methods which interact with the database
    Optional<Movie> findMovieByImdbId(String imdbId);
}
