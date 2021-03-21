package ru.job4j.accident.repo.mem;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.repo.RuleRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class RuleMem implements RuleRepo {
    private final Map<Long, Rule> rules;

    {
        Rule rule1 = new Rule();
        rule1.setId(1L);
        rule1.setName("Статья 1");
        Rule rule2 = new Rule();
        rule2.setId(2L);
        rule2.setName("Статья 2");
        Rule rule3 = new Rule();
        rule3.setId(3L);
        rule3.setName("Статья 3");
        Rule rule4 = new Rule();
        rule4.setId(4L);
        rule4.setName("Статья 4");

        this.rules = new ConcurrentHashMap<>();
        this.rules.put(1L, rule1);
        this.rules.put(2L, rule2);
        this.rules.put(3L, rule3);
        this.rules.put(4L, rule4);

    }

    @Override
    public Collection<Rule> findAllRules() {
        return this.rules.values();
    }

    @Override
    public Set<Rule> findRulesByIds(Set<Long> rIds) {
        Set<Rule> rules = new HashSet<>();
        rIds.forEach(id -> rules.add(this.rules.get(id)));
        return rules;
    }
}