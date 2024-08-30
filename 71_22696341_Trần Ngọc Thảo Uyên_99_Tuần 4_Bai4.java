<!DOCTYPE html>
<html>
<head>
    <title>Kiểm tra loại tam giác</title>
</head>
<body>
    <script>
        function kiemTraTamGiac() {
            // Nhập liệu và chuyển đổi thành số
            let a = parseFloat(prompt("Nhập vào cạnh a:"));
            let b = parseFloat(prompt("Nhập vào cạnh b:"));
            let c = parseFloat(prompt("Nhập vào cạnh c:"));

            // Kiểm tra xem có phải là số hay không
            if (isNaN(a) || isNaN(b) || isNaN(c)) {
                alert("Vui lòng nhập vào các số");
                return;
            }

            // Kiểm tra điều kiện để là tam giác
            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                // Kiểm tra loại tam giác
                if (a === b && b === c) {
                    alert("Tam giác đều");
                } else if (a === b || a === c || b === c) {
                    alert("Tam giác cân");
                } else {
                    alert("Tam giác thường");
                }
            } else {
                alert("Không phải là tam giác");
            }
        }

        kiemTraTamGiac();
    </script>
</body>
</html>