package com.example.demo;
/*JPARepository is exists in Spring Data JPA dependencies and it contains
 * all the CRUD operation of Spring JPA
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement,Integer>{
	
}
