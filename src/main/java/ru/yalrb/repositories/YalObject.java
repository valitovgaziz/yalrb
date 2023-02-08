package ru.yalrb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yalrb.models.entities.Yal_Object;

import java.util.List;
import java.util.UUID;

@Repository
public interface YalObject extends JpaRepository<Yal_Object, UUID> {
    List<Yal_Object> findAllByNameOrShortDescriptionOrFullDescriptionOrLongName(String query);
}
