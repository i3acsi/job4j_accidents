package ru.job4j.accident.repo;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.Status;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class AccidentMem implements AccidentRepo {
    private Map<Long, Accident> accidents = new ConcurrentHashMap<>();

    {
        Accident accident = new Accident();
        accident.setId(1L);
        accident.setAddress("a1");
        accident.setCarNumber("carNo");
        accident.setTitle("title");
        accident.setDescription("desc");
        accident.setPhotos(Set.of("photo1", "photo2"));
        accident.setStatus(Status.ACCEPTED);

        Accident accident2 = new Accident();
        accident2.setId(2L);
        accident2.setAddress("a2");
        accident2.setCarNumber("carNo2");
        accident2.setTitle("title2");
        accident2.setDescription("desc2");
        accident2.setPhotos(Set.of("photo12", "photo22"));
        accident2.setStatus(Status.ACCEPTED);
        accidents.put(1L, accident);
        accidents.put(2L, accident2);
    }

    public Collection<Accident> findAllAccidents() {
        return accidents.values();
    }
}
