package com.Core.Utilities.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperServices {
    private final ModelMapper modelMapper;

    // Constructor
    @Autowired
    public ModelMapperServices(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

//    public void addCustomMapping() {
//        modelMapper.addMappings(new PropertyMap<UserDTO, User>() {
//            @Override
//            protected void configure() {
//                map(source.getEmail(), destination.getEmail()); // örnek özel eşleme
//            }
//        });
//    }

    // Getter
    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
