package org.opnxlms.course_info.service;

import org.opnxlms.course_info.dto.CourseMetaDataDto;
import org.opnxlms.course_info.repository.CourseMedaDataRepository;
import org.opnxlms.course_info.util.ModelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;


@Service
public class CourseMetaDataService {
        
            @Autowired
            public CourseMedaDataRepository repository;
            

            public Mono<CourseMetaDataDto> createCourse(CourseMetaDataDto dtoMono) {
             return Mono.just(dtoMono)
                       .map(ModelUtil::toEntity)
                       .flatMap(this.repository::save)
                       .map(ModelUtil::toDto);
                       //.doOnNext(courseMetaData -> {
                       //    this.publisher.publishEvent(new CourseCreatedEvent(courseMetaData));
                       //
                };
                      
                
            }
        
        
        
        //     public Flux<CourseMetaDataDto> getAllCourses(){
        //    return this.repository.findAll().map(ModelUtil::toDto);
        //     }
        
        //     public Mono<CourseMetaDataDto> getCourseById(String id){
        //    return this.repository.findById(id).map(ModelUtil::toDto);
        //     }
        
        //     public Mono<CourseMetaDataDto> updateCourse(String id, Mono<CourseMetaDataDto> dtoMono){
        //    return this.repository.findById(id)
        //          .flatMap(courseMetaData -> dtoMono.map(org.opnxlms.enrollement_services.util.ModelUtil::toEntity))
        //          .flatMap(this.repository::save)
        //          .map(ModelUtil::toDto);
        //     }
        
        //     public Mono<Void> deleteCourse(String id){
        //    return this.repository.deleteById(id);
        //     }

        //     public Flux<CourseMetaDataService> findByAuthorIdsContains(String authorId) {
        //         return null;
        //     }

    

        