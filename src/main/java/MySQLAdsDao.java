import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.*;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao() throws SQLException {
        Config config = new Config();
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() {
        List<Ad> ShowAll = new ArrayList<>();
        String query = "SELECT * FROM ads";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                ShowAll.add(
                        new Ad(
                                rs.getInt("id"),
                                rs.getInt("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ShowAll;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    public static void main(String[] args) throws SQLException {
        Ads adsDao = new MySQLAdsDao();

        List<Ad> ads = adsDao.all();
        for (Ad ad : ads){
            System.out.println(ad);
        }
//        create test Ad





//         test insert method



    }
}
