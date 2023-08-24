package org.opnxlms.course_info.controller;

import lombok.RequiredArgsConstructor;

import org.opnxlms.course_info.dto.CourseMetaDataDto;
import org.opnxlms.course_info.service.CourseMetaDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import reactor.core.publisher.Mono;


@RequiredArgsConstructor
@RestController
@RequestMapping("Api/courseinfo")
public class CourseController {


   private CourseMetaDataService service;

    // hello world
    @GetMapping("/hello")
    public Mono<ResponseEntity<String>> hello(){
        return Mono.just(ResponseEntity.ok("Course Info"));
    }

    //create a course
    //  @Preauthorize("hasRole('ROLE_ADMIN')")
      @PostMapping("/courses/create")
      public Mono<ResponseEntity<CourseMetaDataDto>> createCourse(@RequestBody CourseMetaDataDto course) {
          return service.createCourse(course)
              .map(createdCourse -> ResponseEntity.ok(createdCourse))
              .defaultIfEmpty(ResponseEntity.badRequest().build());
      }

    }

//     @MessageMapping("get.all")
//     public Flux<CourseMetaDataDto> getAllCourses(){

//         return this.service.getAllCourses();
//     }

// //get a course by id
//     @MessageMapping("get.{id}")
//     public Mono<CourseMetaDataDto> getCourseById(@DestinationVariable String id){
//          return this.service.getCourseById(id);

//     }


//     @MessageMapping("update.{id}")
//     public Mono<CourseMetaDataDto> updateCourse(@DestinationVariable String id,
//                                                 Mono<CourseMetaDataDto> dtoMono){

//          return this.service.updateCourse(id,dtoMono);
//     }
//     //delete a course by id
//     @MessageMapping("delete.{id}")
//     public Mono<Void> deleteCourse(@PathVariable String id){

//          return this.service.deleteCourse(id);
//     }

//     @MessageMapping("get.{authorId}")
//     public Flux<CourseMetaDataDto> getCourseByAuthorId(@DestinationVariable String authorId){
//          return this.service.findByAuthorIdsContains(authorId);


//     }
//     // exception handler should be in the same class as the controller
//     @MessageExceptionHandler
//     public Mono<String> handleException(Exception e){
//         return Mono.just(e.getMessage());
//     }

