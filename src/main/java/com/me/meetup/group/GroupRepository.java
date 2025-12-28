package com.me.meetup.group;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class GroupRepository {
    private List<Group> groups = new ArrayList<>();
    private final AtomicLong counterId = new AtomicLong();

    public GroupRepository() {
        groups.add(new Group(counterId.getAndIncrement(), "Spring Users Group", "A group for Spring framework enthusiasts", "San Francisco", "John Doe", LocalDate.of(2016, 1, 1)));
        groups.add(new Group(counterId.getAndIncrement(), "Java Developers", "A group for Java developers and enthusiasts", "New York", "Jane Smith", LocalDate.of(2017, 1, 1)));
        groups.add(new Group(counterId.getAndIncrement(), "Python Enthusiasts", "A group for Python enthusiasts", "Los Angeles", "Alice Johnson", LocalDate.of(2018, 1, 1)));
        groups.add(new Group(counterId.getAndIncrement(), "JavaScript Enthusiasts", "A group for JavaScript enthusiasts", "Chicago", "Bob Brown", LocalDate.of(2019, 1, 1)));
        groups.add(new Group(counterId.getAndIncrement(), "Ruby Enthusiasts", "A group for Ruby enthusiasts", "Houston", "Charlie Davis", LocalDate.of(2020, 1, 1)));
    }

    public List<Group> getAllGroups() {
        return groups;
    }

    public Group getGroupById(Long id) {
        return groups.stream().filter(group -> group.id().equals(id)).findFirst().orElse(null);
    }
}
