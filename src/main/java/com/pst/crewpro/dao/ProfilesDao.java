package com.pst.crewpro.dao;

import com.pst.crewpro.dto.ProfileDto;
import com.pst.crewpro.enums.AgreementTypeEnum;
import java.util.List;

public interface ProfilesDao {

  public List<ProfileDto> getProfiles(
      AgreementTypeEnum agreementType, Boolean excludeRestDaysFlag, String commentId);

  public ProfileDto createAgreementProfile(ProfileDto profileDto);

  public ProfileDto getProfileById(Integer oId);

  public ProfileDto updateProfile(Integer oId, ProfileDto profileDto);

  public void deleteProfile(Integer oId);
}
