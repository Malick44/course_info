package org.opnxlms.course_info.util;


import org.opnxlms.course_info.dto.CourseMetaDataDto;
import org.opnxlms.course_info.model.CourseMetaData;
import org.springframework.beans.BeanUtils;


public class ModelUtil {

    public static CourseMetaDataDto toDto(CourseMetaData mono){
        CourseMetaDataDto dto = new CourseMetaDataDto();
        BeanUtils.copyProperties(mono,dto);
        return dto;
    }

    public static CourseMetaData toEntity(CourseMetaDataDto dto){
        CourseMetaData courseMetaData = new CourseMetaData();
        BeanUtils.copyProperties(dto,courseMetaData);
        return courseMetaData;
    }
}
