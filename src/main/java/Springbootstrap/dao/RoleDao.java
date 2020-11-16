package Springbootstrap.dao;

import Springbootstrap.model.Role;
import Springbootstrap.model.User;

import java.util.Set;

public interface RoleDao {
    Set<Role> getRoleSet(Set<String> roles);
    Role getRoleById(int id);
    Role getRoleByName(String name);
    }
