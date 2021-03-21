package ru.job4j.accident.repo;

import ru.job4j.accident.model.Rule;

import java.util.Collection;
import java.util.Set;

public interface RuleRepo {
    Collection<Rule> findAllRules();

    Set<Rule> findRulesByIds(Set<Long> rIds);
}
