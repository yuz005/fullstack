package org.scoula.todo.dao;

import org.scoula.todo.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao{
    Connection conn = JDBCUtil.getConnection();

    private String USER_LIST = "SELECT * FROM users";
    private String USER_GET = "SELECT * FROM users WHERE `id` = ?";
    private String USER_INSERT = "insert into users values(?,?,?,?)";
    private String USER_UPDATE = "update users set `name` = ?,`role` = ? where `id` = ?";
    private String USER_DELETE = "delete from users where `id` = ?";

    @Override
    public int create(UserVO user) throws SQLException{
        try(PreparedStatement stmt = conn.prepareStatement(USER_INSERT)){
            stmt.setString(1, user.getId());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getName());
            stmt.setString(4, user.getRole());
            return stmt.executeUpdate();
        }
    }
    private UserVO map(ResultSet rs) throws SQLException{
        UserVO user = new UserVO();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("PASSWORD"));
        user.setName(rs.getString("NAME"));
        user.setRole(rs.getString("ROLE"));
        return user;
    }

    @Override
    public List<UserVO> getList() throws SQLException{
        List<UserVO> userList = new ArrayList<UserVO>();
        Connection conn = JDBCUtil.getConnection();
        try(PreparedStatement stmt = conn.prepareStatement(USER_LIST);
            ResultSet rs = stmt.executeQuery()){
            while(rs.next()) {
                UserVO user = map(rs);
                userList.add(user);
            }
        }
        return userList;
    }

    @Override
    public Optional<UserVO> get(String id) throws SQLException{
        try (PreparedStatement stmt = conn.prepareStatement(USER_GET)){
            stmt.setString(1, id);
            try (ResultSet rs = stmt.executeQuery()){
                if(rs.next()) {
                    return Optional.of(map(rs));
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public int update(UserVO user) throws SQLException{
        Connection conn = JDBCUtil.getConnection();
        try ( PreparedStatement stmt = conn.prepareStatement(USER_UPDATE)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getRole());
            stmt.setString(3, user.getId());
            return stmt.executeUpdate();
        }
    }


    @Override
    public int delete(String id) throws SQLException{
        try(PreparedStatement stmt = conn.prepareStatement(USER_DELETE)) {
            stmt.setString(1, id);
            return stmt.executeUpdate();
        }
    }
}

