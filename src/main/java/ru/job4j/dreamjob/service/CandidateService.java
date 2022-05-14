package ru.job4j.dreamjob.service;

import org.springframework.stereotype.Service;
import javax.annotation.concurrent.ThreadSafe;
import ru.job4j.dreamjob.model.Candidate;
import ru.job4j.dreamjob.store.CandidateDBStore;

import java.util.Collection;

@ThreadSafe
@Service
public class CandidateService {

    private final CandidateDBStore store;

    public CandidateService(CandidateDBStore store) {
        this.store = store;
    }

    public void add(Candidate candidate) {
        store.add(candidate);
    }

    public Candidate findById(int id) {
        return store.findById(id);
    }

    public void update(Candidate candidate) {
        store.update(candidate);
    }

    public Collection<Candidate> findAll() {
        return store.findAll();
    }

    public Collection<Candidate> findAllVisible() {
        return store.findAllVisible();
    }

    public void delete(int id) {
        store.delete(id);
    }
}

