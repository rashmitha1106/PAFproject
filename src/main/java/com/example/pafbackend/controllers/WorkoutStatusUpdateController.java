package com.example.pafbackend.controllers;

import com.example.pafbackend.models.WorkoutStatusUpdate;
import com.example.pafbackend.repositories.WorkoutStatusUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workoutStatusUpdates")
public class WorkoutStatusUpdateController {

    private final WorkoutStatusUpdateRepository workoutStatusUpdateRepository;

    @Autowired
    public WorkoutStatusUpdateController(WorkoutStatusUpdateRepository workoutStatusUpdateRepository) {
        this.workoutStatusUpdateRepository = workoutStatusUpdateRepository;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<WorkoutStatusUpdate>> getUpdatesByUserId(@PathVariable String userId) {
        List<WorkoutStatusUpdate> updates = workoutStatusUpdateRepository.findByUserId(userId);
        return new ResponseEntity<>(updates, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<WorkoutStatusUpdate> createUpdate(@RequestBody WorkoutStatusUpdate update) {
        WorkoutStatusUpdate savedUpdate = workoutStatusUpdateRepository.save(update);
        return new ResponseEntity<>(savedUpdate, HttpStatus.CREATED);
    }

    @DeleteMapping("/{updateId}")
    public ResponseEntity<Void> deleteUpdate(@PathVariable String updateId) {
        workoutStatusUpdateRepository.deleteById(updateId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
