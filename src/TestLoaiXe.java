import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestLoaiXe {

    public static void main(String[] args) {

        try {
            Connection conn = DBConnection.getConnection();

            System.out.println("Kết nối Oracle thành công!");
            System.out.println("===== DANH SÁCH LOẠI XE =====");

            Statement stmt = conn.createStatement();

            String sql = """
                    SELECT EMPLOYEE_ID, FULL_NAME, PHONE, POSITION
                    FROM EMPLOYEE
                    """;

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("EMPLOYEE_ID") + " | "
                                + rs.getString("FULL_NAME") + " | "
                                + rs.getString("POSITION"));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}