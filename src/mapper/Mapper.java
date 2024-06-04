package mapper;

import model.User;
import model.dto.UserDto;

public class Mapper {
    public static UserDto mapFromUserToUserDto(User user){
     if(user==null){
         return null;
     }
     return new UserDto(user.getName(), user.getEmail());
    }
}
