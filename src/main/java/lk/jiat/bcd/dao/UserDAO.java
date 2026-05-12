package lk.jiat.bcd.dao;

import lk.jiat.bcd.model.User;
import lk.jiat.bcd.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public boolean saveUser(User user) throws Exception {

        Connection connection = DBConnection.getConnection();

        String query = "INSERT INTO user (name, mobile) VALUES (?, ?)";

        PreparedStatement pstm = connection.prepareStatement(query);
        pstm.setString(1, user.getName());
        pstm.setString(2, user.getMobile());

        int result = pstm.executeUpdate();

        return result > 0;
    }

    public List<User> getAllUsers() throws Exception {
        List<User> userList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        String query = "SELECT * FROM user";

        PreparedStatement pstm = connection.prepareStatement(query);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            User user = new User();
            user.setName(rs.getString("name"));
            user.setMobile(rs.getString("mobile"));
            userList.add(user);
        }
        return userList;
    }
}
