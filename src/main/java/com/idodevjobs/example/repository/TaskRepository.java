package com.idodevjobs.example.repository;

import com.idodevjobs.example.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Integer> {

	List<Task> findByArchivedTrue();
	List<Task> findByArchivedFalse();
	List<Task> findByStatus(@Param("status") String taskStatus);

}
