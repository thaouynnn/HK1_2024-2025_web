<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kiểm tra năm nhuận</title>
</head>
<body>
    <p>Nhập năm cần kiểm tra: <input type="text" id="txtName"></p>
    <button onclick="kiemTraNamNhuan()">Kiểm tra</button>

    <script>
        function kiemTraNamNhuan() {
            // Lấy giá trị từ ô input và chuyển đổi thành số nguyên
            let nam = parseInt(document.getElementById("txtName").value);

            // Kiểm tra xem có phải là số nguyên hay không
            if (isNaN(nam)) {
                alert("Vui lòng nhập một số nguyên");
                return;
            }

            // Kiểm tra điều kiện năm nhuận
            if ((nam % 400 === 0) || (nam % 4 === 0 && nam % 100 !== 0)) {
                alert(nam + " là năm nhuận");
            } else {
                alert(nam + " không phải là năm nhuận");
            }
        }
    </script>
</body>
</html>