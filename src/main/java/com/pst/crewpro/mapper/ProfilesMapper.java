package com.pst.crewpro.mapper;

import com.pst.crewpro.dto.ProfileDto;
import com.pst.crewpro.models.Profile;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProfilesMapper {

  ProfilesMapper INSTANCE = Mappers.getMapper(ProfilesMapper.class);

  Profile mapProfileEntityToBean(ProfileDto profileDto);

  ProfileDto mapProfileBeanToEntity(Profile profile);

  List<Profile> mapProfileEntityListToBeans(List<ProfileDto> profileDtos);

  List<ProfileDto> mapProfileBeansToEntityList(List<Profile> profiles);
}
