<!DOCTYPE html>
<html>
<head>
    <title>Tính tổng hai số</title>
</head>
<body>
    <form>
        <input type="text" id="number1" placeholder="Nhập số thứ nhất">
        <input type="text" id="number2" placeholder="Nhập số thứ hai">
        <button onclick="tinhTong()">Tính tổng</button>
        <p id="result"></p>
    </form>

    <script>
        function tinhTong() {
            // Lấy giá trị từ các ô input
            var num1 = parseInt(document.getElementById("number1").value);
            var num2 = parseInt(document.getElementById("number2").value);

            // Kiểm tra xem người dùng có nhập số hay không
            if (isNaN(num1) || isNaN(num2)) {
                alert("Vui lòng nhập vào hai số");
                return;
            }

            // Tính tổng
            var tong = num1 + num2;

            // Hiển thị kết quả vào phần tử có id là "result"
            document.getElementById("result").textContent = "Kết quả: " + tong;
        }
    </script>
</body>
</html>