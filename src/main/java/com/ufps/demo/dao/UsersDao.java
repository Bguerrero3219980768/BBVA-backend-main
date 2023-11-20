/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufps.demo.dao;

import java.sql.SQLException;
import java.util.List;

import co.banco.test.modelo.Users;
import co.empresa.test.modelo.Usuario;

public interface UsersDao {
    void insert(Users usuario) throws SQLException;

    Usuario select(int id);

    List<Users> selectAll();

    void delete(int id) throws SQLException;

    void update(Users usuario) throws SQLException;
}
