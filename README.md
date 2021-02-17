**Digital Signatures and Verifying Digital Signatures using Java**

**_Giới thiệu_**

Demo cách ký và xác thực chữ ký cho một record trong bảng của MySQL, 
record sẽ được ép từ Object sang kiểu Xml. Chúng ta dùng thuật toán _SHA-256_
để hash chuỗi Xml thu được và dùng thuật toán _DSA_ để ký.

**_Môi trường_**
1. Java 1.8
2. IntelliJ IDEA
3. MySQL (MySQL Workbench)
4. mysql-connector-java-5.1.49.jar (DigitalSignaturesDemo\lib_db\)

**_Cách cài đặt_**
1. Chạy file _db.sql_ để tạo ra database trên MySQL
2. Import thư viện _mysql-connector-java-5.1.49.jar_ từ _DigitalSignaturesDemo\lib_db\_ vào project
3. Mở file _DigitalSignaturesDemo\src\digitalsignatures\db\ConnectDB.java_ 
sửa lại thông tin dòng 9, 10, 11 cho đúng với db của máy.

 **_Cách chạy_**
1. Chạy file _DigitalSignaturesDemo\src\digitalsignatures\controller\DigitalSignaturesUsingJava.java_
để thực hiện việc ký một cột trong bảng _wire_transfer_103_.
2. Sau đó chạy file _DigitalSignaturesDemo\src\digitalsignatures\controller\VerifyingADigitalSignature.java_
để xác thực chữ ký đó.
