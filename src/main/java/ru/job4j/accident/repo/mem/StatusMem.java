package ru.job4j.accident.repo.mem;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Status;
import ru.job4j.accident.repo.StatusRepo;

import java.util.Collection;
import java.util.List;

@Repository
public class StatusMem implements StatusRepo {

    @Override
    public Collection<Status> findAllStatuses() {
        return List.of(Status.ACCEPTED, Status.REJECTED, Status.COMPLETED);
    }
}
