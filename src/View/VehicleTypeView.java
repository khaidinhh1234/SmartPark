package View;

import Controller.VehicleTypeController;
import model.VehicleType;
import javax.swing.*;
import java.util.List;

public class VehicleTypeView {

    public void showView() {
        try {
            VehicleTypeController controller = new VehicleTypeController();
            List<VehicleType> list = controller.getAllVehicleTypes();

            StringBuilder html = new StringBuilder("""
                                                    <html>  <head>
                                        <style>
                                            body {
                                                font-family: Arial;
                                                background-color: #f1f5f9;
                                                padding: 25px;
                                            }

                                            .header {
                                                background-color: #1e40af;
                                                color: white;
                                                padding: 20px;
                                                text-align: center;
                                            }

                                            h2 {
                                                margin: 0;
                                                font-size: 24px;
                                            }

                                            .content {
                                                background-color: white;
                                                padding: 20px;
                                                margin-top: 20px;
                                            }

                                            h3 {
                                                color: #1e293b;
                                            }

                                            table {
                                                width: 100%;
                                                border-collapse: collapse;
                                            }

                                            th {
                                                background-color: #2563eb;
                                                color: white;
                                                padding: 14px;
                                            }

                                            td {
                                                padding: 12px;
                                                border-bottom: 1px solid #e2e8f0;
                                                text-align: center;
                                            }

                                            tr:nth-child(even) {
                                                background-color: #f8fafc;
                                            }
                                        </style>
                                    </head>
                                                      <body>
                        <div class="header">
                            <h2>SMART PARK</h2>
                            <p>Hệ thống quản lý bãi đỗ xe</p>
                        </div>

                        <div class="content">
                            <h3>Danh sách loại xe</h3>

                            <table>
                                <tr>
                                    <th>Mã loại xe</th>
                                    <th>Tên loại xe</th>
                                </tr>
                    """);

            for (VehicleType type : list) {
                html.append("<tr>")
                        .append("<td>").append(type.getVehicleTypeId()).append("</td>")
                        .append("<td>").append(type.getTypeName()).append("</td>")
                        .append("</tr>");
            }

            html.append("</table></body></html>");

            JEditorPane pane = new JEditorPane();
            pane.setContentType("text/html");
            pane.setEditable(false);
            pane.setText(html.toString());

            JFrame frame = new JFrame("Danh sách loại xe");
            frame.add(new JScrollPane(pane));
            frame.setSize(700, 400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage());
        }
    }
}