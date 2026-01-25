# KiemThuPhanMem

Bài thực hành tuần 1
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/7b38cc6d-0975-4db2-a29d-aa542d59eefe" />

# Bài thực hành kiểm thử đơn vị với JUnit

## 1. Thông tin bài tập
- **Công cụ sử dụng**: Java, Eclipse IDE, JUnit 5  

---

## 2. Mục tiêu
- Làm quen với kiểm thử đơn vị (Unit Testing) bằng JUnit
- Viết và chạy các ca kiểm thử tự động cho chương trình Java
- Áp dụng kiểm thử cho các trường hợp:
  - Trường hợp bình thường
  - Trường hợp biên
  - Trường hợp dữ liệu không hợp lệ

---

## 3. Mô tả bài toán
Xây dựng lớp `StudentAnalyzer` với hai phương thức:

### 3.1 `countExcellentStudents(List<Double> scores)`
- Đếm số học sinh đạt loại **Giỏi** (điểm ≥ 8.0)
- Bỏ qua các điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10)
- Nếu danh sách rỗng, trả về 0

### 3.2 `calculateValidAverage(List<Double> scores)`
- Tính điểm trung bình của các điểm hợp lệ (từ 0 đến 10)
- Bỏ qua điểm không hợp lệ
- Nếu không có điểm hợp lệ, trả về 0

---

## 4. Cấu trúc thư mục
unit_test/
├── src/
│ └── StudentAnalyzer.java
├── test/
│ └── StudentAnalyzerTest.java


---

## 5. Kiểm thử với JUnit
Lớp `StudentAnalyzerTest` được sử dụng để kiểm thử các phương thức trong `StudentAnalyzer`.

### Các trường hợp kiểm thử:
- Danh sách có cả điểm hợp lệ và không hợp lệ
- Danh sách toàn bộ điểm hợp lệ
- Danh sách rỗng
- Giá trị biên (0 và 10)
- Danh sách chỉ chứa điểm không hợp lệ

Tổng số ca kiểm thử: **6 test case**
<img width="1426" height="907" alt="image" src="https://github.com/user-attachments/assets/82c21602-2e3b-497e-b378-af80957c2be2" />


---

## 6. Cách chạy kiểm thử
1. Mở project bằng **Eclipse IDE**
2. Chuột phải vào file `StudentAnalyzerTest.java`
3. Chọn:
Run As → JUnit Test
4. Kết quả:
- Tất cả test case chạy thành công (màu xanh)
- Không có lỗi (Errors = 0, Failures = 0)

---

## 7. Kết luận
- Chương trình hoạt động đúng theo yêu cầu đề bài
- Các phương thức được kiểm thử đầy đủ với nhiều trường hợp khác nhau
- JUnit giúp phát hiện lỗi sớm và đảm bảo chất lượng mã nguồn

---

## 8. Tài liệu tham khảo
- JUnit 5 User Guide: https://junit.org/junit5/docs/current/user-guide/
