package com.kodilla.stream.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ForumUser {
    private final String username;
    private final String realName;
    private final Date birthDay;
    private final List<String> friends;


    public ForumUser(final String username, final String realName, Date birthDay, List<String> friends) {
        this.username = username;
        this.realName = realName;
        //make a private copy of birthDay
        //this is the only way to keep the fBirthDay
        //field private, and shields this class from any changes that
        //the caller may make to the original aBirthDay object
        this.birthDay = new Date(birthDay.getTime());
        this.friends = Collections.unmodifiableList(new ArrayList(friends));
    }

    //Returns a primitive value or returns an immutable object
    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }


    //Returns a mutable object - likely bad style.
    //
    //The caller gets a direct reference to the internal field. This is usually dangerous,
    //since the Date object state can be changed both by this class and its caller.
    //That is, this class is no longer in complete control of dateOfDiscovery.
    //
    //  public Date getBirthDay() {
    //    return birthDay;
    //  }
    public Date getBirthDay() {
        return new Date(birthDay.getTime());
    }

    public List<String> getFriends() {
        return Collections.unmodifiableList(new ArrayList(friends));
    }
}
