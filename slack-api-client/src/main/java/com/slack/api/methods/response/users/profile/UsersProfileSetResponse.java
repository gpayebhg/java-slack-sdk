package com.slack.api.methods.response.users.profile;

import com.slack.api.methods.SlackApiTextResponse;
import com.slack.api.model.User;
import lombok.Data;

@Data
public class UsersProfileSetResponse implements SlackApiTextResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private User.Profile profile;
    private String username;
}