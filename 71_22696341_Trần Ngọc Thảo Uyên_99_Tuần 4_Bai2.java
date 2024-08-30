<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kiểm tra số ngày trong tháng</title>
</head>
<body>
    <script>
        function kiemTraSoNgay() {
            // Nhập liệu và chuyển đổi thành số nguyên
            let thang = parseInt(prompt("Nhập vào một tháng của năm (1-12):"));

            // Kiểm tra xem có phải là số nguyên trong khoảng 1-12 hay không
            if (isNaN(thang) || thang < 1 || thang > 12) {
                alert("Vui lòng nhập một số nguyên từ 1 đến 12");
                return;
            }

            // Kiểm tra số ngày trong tháng
            switch (thang) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    alert("Tháng " + thang + " có 31 ngày");
                    break;
                case 4: case 6: case 9: case 11:
                    alert("Tháng " + thang + " có 30 ngày");
                    break;
                case 2:
                    // Xử lý trường hợp tháng 2 (cần biết năm để xác định năm nhuận)
                    let nam = parseInt(prompt("Nhập vào năm:"));
                    if ((nam % 400 === 0) || (nam % 4 === 0 && nam % 100 !== 0)) {
                        alert("Tháng " + thang + " có 29 ngày (năm nhuận)");
                    } else {
                        alert("Tháng " + thang + " có 28 ngày");
                    }
                    break;
                default:
                    alert("Không phải là tháng của năm");
            }
        }

        kiemTraSoNgay();
    </script>
</body>
</html>