package com.idursun.springandangular.services;

import com.idursun.springandangular.domain.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "projects", path = "projects")
public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {
    Page<Project> findByNameContains(@Param("name") String name, Pageable pageable);
}
