package org.opnxlms.course_info.repository;

import org.opnxlms.course_info.model.CourseMetaData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface CourseMedaDataRepository extends ReactiveMongoRepository<CourseMetaData, String> {
 //   Flux<CourseMetaData> findByAuthorIdsContains(@NonNull String authorId);

 //   Mono<CourseMetaData> findById(String id);

}
