package tech.hiramchavez.oauth.mapper.user;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import tech.hiramchavez.oauth.dto.user.UserPublicDataDTO;
import tech.hiramchavez.oauth.dto.user.UserReqDTO;
import tech.hiramchavez.oauth.entities.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    User toUser(UserReqDTO userReqDTO);
    UserPublicDataDTO toUserPublicDataDTO(User user);
}
