-- Tạo database
CREATE DATABASE IF NOT EXISTS SellShoes;

-- Sử dụng database mới tạo
USE SellShoes;

-- Tạo bảng BrandTest
CREATE TABLE IF NOT EXISTS BrandTest (
    bID INT AUTO_INCREMENT PRIMARY KEY,
    bName NVARCHAR(20) NOT NULL
);

-- Tạo bảng Cart
CREATE TABLE IF NOT EXISTS Cart (
    cID INT AUTO_INCREMENT PRIMARY KEY,
    pID INT NOT NULL,
    sID INT NOT NULL,
    UserID INT NOT NULL,
    quality INT NOT NULL,
    FOREIGN KEY (pID) REFERENCES Product(pID),
    FOREIGN KEY (sID) REFERENCES Size(sID),
    FOREIGN KEY (UserID) REFERENCES UserShoes(UserID)
);

-- Tạo bảng Product
CREATE TABLE IF NOT EXISTS Product (
    pID INT AUTO_INCREMENT PRIMARY KEY,
    pName TEXT NOT NULL,
    imge TEXT NOT NULL,
    Number INT NOT NULL,
    price FLOAT,
    bID INT NOT NULL,
    FOREIGN KEY (bID) REFERENCES BrandTest(bID)
);

-- Tạo bảng Size
CREATE TABLE IF NOT EXISTS Size (
    sID INT AUTO_INCREMENT PRIMARY KEY,
    sNumber INT NOT NULL
);

-- Tạo bảng UserShoes
CREATE TABLE IF NOT EXISTS UserShoes (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    uName NVARCHAR(20) NOT NULL,
    pass NVARCHAR(20) NOT NULL,
    fName NVARCHAR(50) NOT NULL,
    isSell BIT,
    isAdmin BIT,
    dob DATE,
    phone NVARCHAR(10),
    email NVARCHAR(50)
);

-- Insert dữ liệu mẫu vào bảng BrandTest
INSERT INTO BrandTest (bName) VALUES ('VANS'), ('NIKE'), ('CONVERSE'), ('ADIDAS');

-- Insert dữ liệu mẫu vào bảng Size
INSERT INTO Size (sNumber) VALUES (40), (41), (42);

-- Insert dữ liệu mẫu vào bảng UserShoes
INSERT INTO UserShoes (uName, pass, fName, isSell, isAdmin, dob, phone, email) VALUES
('hautc', '12345', 'Trịnh Công Hậu', 1, 1, '2001-02-24', '0935254877', 'hautcde150179@fpt.edu.vn'),
('hoat', '12345', 'Thái Hòa', 1, 0, '2001-07-21', '0987654321', 'hoatde15792@fpt.edu.vn'),
('toandt', '123456', 'Trần Đức Toàn', 0, 0, '2001-10-23', '0986321142', 'toandtde162312@fpt.edu.vn'),
('anvt', '12345', 'Vo Thanh An', 0, 0, '1900-01-01', '0912345431', 'mrmiss5678@gmail.com'),
('thangt', '12345', 'Tran Duc Toan', 0, 0, '2022-03-30', '0912345431', 'mrmiss5678@gmail.com'),
('arm', '12345', 'Miss Mr', 0, 0, '2022-04-07', '0987654321', 'mrmiss5678@gmail.com');

-- Insert dữ liệu mẫu vào bảng Product
INSERT INTO Product (pName, imge, Number, price, bID) VALUES
('Vans Sk8-Hi', 'https://cdn.elly.vn/uploads/2021/06/05233353/top-nhung-doi-giay-vans-dang-mua-nhat-nam-2021.7.png', 25, 200000, 1),
('Vans Sk8-Mid Skate Shoes', 'https://cdn.elly.vn/uploads/2021/06/05233338/top-nhung-doi-giay-vans-dang-mua-nhat-nam-2021.9-768x768.jpg', 15, 250000, 1);
-- Thêm dữ liệu cho các sản phẩm khác tương tự

-- Insert dữ liệu mẫu vào bảng Cart
INSERT INTO Cart (pID, sID, UserID, quality) VALUES
(6, 1, 1, 2),
(13, 1, 1, 1);
-- Thêm dữ liệu cho giỏ hàng khác tương tự
