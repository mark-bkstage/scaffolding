package com.pst.crewpro.business;

import com.pst.crewpro.enums.AgreementTypeEnum;
import com.pst.crewpro.models.Profile;
import java.util.List;

public interface ProfilesBusiness {

  public List<Profile> getProfiles(
      AgreementTypeEnum agreementType, Boolean excludeRestDaysFlag, String commentId);

  public Profile createAgreementProfile(Profile profile);

  public Profile getProfileById(Integer oId);

  public Profile updateProfile(Integer oId, Profile profile);

  public void deleteProfile(Integer oId);
}
