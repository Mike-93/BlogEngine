package BlogEngine.api.response;

import BlogEngine.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private boolean result;

    private User user;
}
