-- Tạo ADMIN nếu chưa tồn tại
INSERT INTO USER_ACCOUNT
(
    USERNAME,
    PASSWORD_HASH,
    ROLE,
    STATUS
)
SELECT
    'admin',
    STANDARD_HASH('admin123', 'SHA256'),
    'ADMIN',
    'ACTIVE'
FROM DUAL
WHERE NOT EXISTS
(
    SELECT 1
    FROM USER_ACCOUNT
    WHERE USERNAME = 'admin'
);

COMMIT;

S
-- Tạo EMPLOYEE tương ứng nếu chưa có
INSERT INTO EMPLOYEE
(
    ACCOUNT_ID,
    FULL_NAME,
    PHONE,
    EMAIL,
    POSITION,
    STATUS
)
SELECT
    ACCOUNT_ID,
    'Quản trị hệ thống',
    '0900000000',
    'admin@smartpark.com',
    'ADMIN',
    'ACTIVE'
FROM USER_ACCOUNT u
WHERE u.USERNAME = 'admin'
AND NOT EXISTS
(
    SELECT 1
    FROM EMPLOYEE e
    WHERE e.ACCOUNT_ID = u.ACCOUNT_ID
);

COMMIT;