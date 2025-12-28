package com.me.meetup.todo;

public record Todo(Long id, Long userId, String title, boolean completed) {
}
