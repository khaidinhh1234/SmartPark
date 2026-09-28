# DATABASE - SMART PARK

## 1. Giới thiệu

Thư mục `database` lưu trữ các câu lệnh Oracle SQL được sử dụng trong dự án **SMART PARK - Hệ thống quản lý bãi đỗ xe**.

Mục đích của thư mục này là giúp các thành viên trong nhóm tham khảo, tìm hiểu và hiểu rõ cách xây dựng cơ sở dữ liệu, các câu lệnh SQL cũng như chức năng của từng bảng.

Các file SQL được lưu lại để phục vụ việc đọc hiểu, trao đổi và phát triển dự án, không yêu cầu thực thi lại trên database hiện tại.

## 2. Cấu trúc thư mục

```text
database/
├── README.md
├── SMART_PARK_SERVER.sql
└── SYSTEM.sql
```

## 3. Nội dung các file

### 3.1. SMART_PARK_SERVER.sql

File chứa các câu lệnh SQL liên quan đến cơ sở dữ liệu của hệ thống SMART PARK.

Các thành viên có thể tham khảo để tìm hiểu:

- Cách tạo các bảng trong hệ thống.
- Cách khai báo kiểu dữ liệu cho từng cột.
- Cách thiết lập khóa chính và khóa ngoại.
- Cách liên kết dữ liệu giữa các bảng.
- Cách thêm dữ liệu mẫu và truy vấn dữ liệu.
- Cách quản lý thông tin khách hàng, phương tiện và vé gửi xe.

### 3.2. SYSTEM.sql

File chứa các câu lệnh SQL được thực hiện bằng tài khoản SYSTEM để phục vụ việc quản trị cơ sở dữ liệu.

Các thành viên có thể tham khảo để tìm hiểu:

- Cách tạo tài khoản người dùng.
- Cách cấp quyền cho tài khoản.
- Cách cấp quyền sử dụng tablespace.
- Cách thiết lập quyền truy cập database phục vụ dự án.

## 4. Hướng dẫn đọc và tham khảo

Các thành viên mở file SQL tương ứng để xem nội dung và tìm hiểu ý nghĩa của từng câu lệnh.

Khi đọc file, nên chú ý:

1. Tên bảng và chức năng của từng bảng.
2. Các cột dữ liệu và kiểu dữ liệu được sử dụng.
3. Khóa chính và khóa ngoại.
4. Mối quan hệ giữa các bảng.
5. Các câu lệnh quản trị và phân quyền database.

**Lưu ý:** Các file SQL trong thư mục này phục vụ mục đích đọc hiểu và tham khảo. Database của dự án đã được thiết lập trước đó, vì vậy không cần chạy lại các câu lệnh tạo bảng, tạo user hoặc cấp quyền.

## 5. Mục đích sử dụng

- Giúp các thành viên hiểu cấu trúc cơ sở dữ liệu của dự án.
- Hỗ trợ việc tìm hiểu và giải thích các câu lệnh Oracle SQL.
- Giúp các thành viên thuận tiện tra cứu khi làm việc với Java và JDBC.
- Là tài liệu tham khảo chung trong quá trình phát triển hệ thống.

---

**SMART PARK - Hệ thống quản lý bãi đỗ xe**

Database được xây dựng và quản lý bằng Oracle Database.
