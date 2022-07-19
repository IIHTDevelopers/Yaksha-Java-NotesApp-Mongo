package com.yaksha.assessments.notesservice.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.yaksha.assessments.notesservice.entity.Note;

public interface NoteRepository extends MongoRepository<Note, String>{

}
