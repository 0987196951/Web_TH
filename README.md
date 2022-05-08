# Web_TH
*Nguyễn Việt Tiến B19DCCN580
- Viết giao diện home.html để hiện ra đầu tiên khi vào trangweb, sẽ có thẻ h1 và và 1 thẻ link a có chứa link để dẫn tới StorageController và gọi phương thức Mapping ứng với link mapping là /storage
- Để có thể hiện ra luôn được home.html ngay khi vào localhost:8080 thì trong Web_THApplication phải kế thừa WebMVCConfiger và override lại phương thức addViewController để có thể hiện thị home.html khi vào localhost:8080  
- Trong bài có sử dụng JPA để lưu cơ sở dữ liệu. đường dẫn đến cơ sở dữ liệu trong file application.properties và username cộng với password
- Sau khi người dùng bấm vào linh view product trong trang view thì home sẽ gọi đến StorageController để có thể lấy các product trong csdl ra. 
- Để có thể có lấy dữ liệu thì phải sử dụng Class ProductRepository imlements JpaRepository để có thể truy xuất dữ liệu 
- Product sẽ có 4 thuộc tính id, name,description,cost được chú thích là @Entity để Jpa có thể xác định được Product là 1 thực thể trong csdl với id là kiểu long  là primary key trong csdl. id được chú thích là @Id.
- Trong StorageController được chú thích là @Controller để có thể hiểu StorageController là 1 controller. StorageController có thuộc tính ProductRepository.
- Khởi tạo StorageController có tham số truyền vào là ProductRepository để có thêm tiêm JpaRepository vào trong Controller và phương thức phải được chú thích là @Autowire để có thể thực hiện tự động truyển vào khi controller được khởi tạo lần đầu
- Phương thức showProduct được được gọi khi có View gọi đến StorageController bằng phương thức get. Truyển vào showProduct 1 Model để Model đóng gói và truyển lại cho storage.html.
- storage.html sẽ hiện danh sách sản phẩm bằng foreach. bên cạnh các dòng sản phẩm sẽ có các nút edit và delete sản phẩm.
