package Ass.Repository;

import Ass.Model.Users;

public interface UserRepository extends Repository<Users> {
    Users findByUsername(String username);
}
