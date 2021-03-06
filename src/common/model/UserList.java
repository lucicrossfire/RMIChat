package common.model;

import common.model.User;

import java.io.Serializable;
import java.util.ArrayList;

public class UserList implements Serializable
{
    private ArrayList<User> userList;

    public UserList()
    {
        userList = new ArrayList<>();
    }

    public void addUser(User user)
    {
        userList.add(user);
    }
    public User getUserByName(String name)
    {
        for(int i = 0; i < userList.size(); i++)
        {
            if(name.equals(userList.get(i).getName()))
            {
                return userList.get(i);
            }
        }
        return null;
    }
    public User getUserByID(int userId)
    {
        if(userId >= 0 && userId < userList.size())
        {
            return userList.get(userId);
        }else
        {
            return null;
        }
    }
    public boolean hasUserWithName(String name)
    {
        for(int i = 0; i < userList.size(); i++)
        {
            if(name.equals(userList.get(i).getName()))
            {
                return true;
            }
        }
        return false;
    }
    public void removeUser(String name)
    {
        for(int i = 0; i < userList.size(); i++)
        {
            if(name.equals(userList.get(i).getName()))
            {
                userList.remove(i);
                break;
            }
        }
    }
}
