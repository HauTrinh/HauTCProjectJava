USE [master]
GO
CREATE DATABASE [SellShoes]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SellShoes', FILENAME = N'D:\CN3\DBI202\SellShoes.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'SellShoes_log', FILENAME = N'D:\CN3\DBI202\SellShoes_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [SellShoes] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SellShoes].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SellShoes] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SellShoes] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SellShoes] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SellShoes] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SellShoes] SET ARITHABORT OFF 
GO
ALTER DATABASE [SellShoes] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [SellShoes] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SellShoes] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SellShoes] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SellShoes] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SellShoes] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SellShoes] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SellShoes] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SellShoes] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SellShoes] SET  DISABLE_BROKER 
GO
ALTER DATABASE [SellShoes] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SellShoes] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SellShoes] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SellShoes] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SellShoes] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SellShoes] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [SellShoes] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SellShoes] SET RECOVERY FULL 
GO
ALTER DATABASE [SellShoes] SET  MULTI_USER 
GO
ALTER DATABASE [SellShoes] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SellShoes] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SellShoes] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SellShoes] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [SellShoes] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [SellShoes] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'SellShoes', N'ON'
GO
ALTER DATABASE [SellShoes] SET QUERY_STORE = OFF
GO
USE [SellShoes]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BrandTest](
	[bID] [int] IDENTITY(1,1) NOT NULL,
	[bName] [nvarchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[bID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[cID] [int] IDENTITY(1,1) NOT NULL,
	[pID] [int] NOT NULL,
	[sID] [int] NOT NULL,
	[UserID] [int] NOT NULL,
	[quality] [int] NOT NULL,
 CONSTRAINT [PK__Cart__D830D4579B53FC64] PRIMARY KEY CLUSTERED 
(
	[cID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[pID] [int] IDENTITY(1,1) NOT NULL,
	[pName] [nvarchar](max) NOT NULL,
	[imge] [nvarchar](max) NOT NULL,
	[Number] [int] NOT NULL,
	[price] [float] NULL,
	[bID] [int] NOT NULL,
 CONSTRAINT [PK__Product__DD36D5026BA18186] PRIMARY KEY CLUSTERED 
(
	[pID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Size](
	[sID] [int] IDENTITY(1,1) NOT NULL,
	[sNumber] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[sID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UserShoes](
	[UserID] [int] IDENTITY(1,1) NOT NULL,
	[uName] [nvarchar](20) NOT NULL,
	[pass] [nvarchar](20) NOT NULL,
	[fName] [nvarchar](50) NOT NULL,
	[isSell] [bit] NULL,
	[isAdmin] [bit] NULL,
	[dob] [date] NULL,
	[phone] [nvarchar](10) NULL,
	[email] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[BrandTest] ON 

INSERT [dbo].[BrandTest] ([bID], [bName]) VALUES (1, N'VANS')
INSERT [dbo].[BrandTest] ([bID], [bName]) VALUES (2, N'NIKE')
INSERT [dbo].[BrandTest] ([bID], [bName]) VALUES (3, N'CONVERSE')
INSERT [dbo].[BrandTest] ([bID], [bName]) VALUES (4, N'ADIDAS')
SET IDENTITY_INSERT [dbo].[BrandTest] OFF
GO
SET IDENTITY_INSERT [dbo].[Cart] ON 

INSERT [dbo].[Cart] ([cID], [pID], [sID], [UserID], [quality]) VALUES (11, 6, 1, 1, 2)
INSERT [dbo].[Cart] ([cID], [pID], [sID], [UserID], [quality]) VALUES (13, 13, 1, 1, 1)
INSERT [dbo].[Cart] ([cID], [pID], [sID], [UserID], [quality]) VALUES (14, 5, 1, 1, 2)
INSERT [dbo].[Cart] ([cID], [pID], [sID], [UserID], [quality]) VALUES (16, 6, 1, 2, 1)
INSERT [dbo].[Cart] ([cID], [pID], [sID], [UserID], [quality]) VALUES (17, 17, 1, 1, 1)
INSERT [dbo].[Cart] ([cID], [pID], [sID], [UserID], [quality]) VALUES (18, 10, 3, 4, 1)
SET IDENTITY_INSERT [dbo].[Cart] OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (2, N'Vans Sk8-Hi', N'https://cdn.elly.vn/uploads/2021/06/05233353/top-nhung-doi-giay-vans-dang-mua-nhat-nam-2021.7.png', 25, 200000, 1)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (3, N'Vans Sk8-Mid Skate Shoes', N'https://cdn.elly.vn/uploads/2021/06/05233338/top-nhung-doi-giay-vans-dang-mua-nhat-nam-2021.9-768x768.jpg', 15, 250000, 1)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (4, N'Vans Classic ComfyCush', N'https://cdn.elly.vn/uploads/2021/06/05233400/top-nhung-doi-giay-vans-dang-mua-nhat-nam-2021.6.jpg', 20, 200000, 1)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (5, N'Nike Air Force 1 ’07 LX Camo', N'https://sneakerdaily.vn/wp-content/uploads/2020/12/top-8-doi-nike-air-force-1-nam-dep-nhat-2021.jpg', 15, 200000, 2)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (6, N'Nike Air Force 1 ’07 Black', N'https://sneakerdaily.vn/wp-content/uploads/2020/12/top-8-doi-nike-air-force-1-nam-dep-nhat-2021-2.jpg', 25, 250000, 2)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (10, N'Nike Air Force 1 ’07 Ozon Blue', N'https://sneakerdaily.vn/wp-content/uploads/2020/12/top-8-doi-nike-air-force-1-nam-dep-nhat-2021-8.jpg', 15, 230000, 2)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (12, N'Nike Air Force 1 Crater Chambray Blue', N'https://sneakerdaily.vn/wp-content/uploads/2020/12/top-8-doi-nike-air-force-1-nam-dep-nhat-2021-10.jpg', 10, 240000, 2)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (13, N'Nike Air Force 1 Mid ’07 All White', N'https://sneakerdaily.vn/wp-content/uploads/2020/12/top-8-doi-nike-air-force-1-nam-dep-nhat-2021-12.jpg', 25, 250000, 2)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (17, N'Jordan Why Not .5 PF', N'https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,b_rgb:f5f5f5/1ef3ae1e-7206-4a5b-bbe0-434c5bad97aa/jordan-why-not-5-pf-basketball-shoes-r2JwFc.png', 25, 399000, 2)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (18, N'Converse Classic full đen', N'https://saigonsneaker.com/wp-content/uploads/2019/12/giay-converse-mau-den.jpg.webp', 20, 290000, 3)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (24, N'Converse 1970s sunflower', N'https://saigonsneaker.com/wp-content/uploads/2019/12/giay-converse-nam-dep.jpg.webp', 28, 290000, 3)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (25, N'Adidas Yeezy 350 V2', N'https://saigonsneaker.com/wp-content/uploads/2019/12/cac-mau-giay-adidas.jpg.webp', 30, 300000, 4)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (28, N'Adidas Ultra Boost', N'https://saigonsneaker.com/wp-content/uploads/2019/12/cac-dong-san-pham-adidas.jpg.webp', 30, 400000, 4)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (29, N'Adidas NMD', N'https://saigonsneaker.com/wp-content/uploads/2019/12/cac-mau-adidas.jpg.webp', 40, 500000, 4)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (32, N'Adidas EQT', N'https://saigonsneaker.com/wp-content/uploads/2019/12/sneaker-hot-2017.jpg.webp', 25, 450000, 4)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (33, N'Adidas Prophere', N'https://saigonsneaker.com/wp-content/uploads/2019/12/cac-dong-san-pham-giay-adidas.jpg.webp', 35, 350000, 4)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (34, N'Adidas x Dragon Ball', N'https://saigonsneaker.com/wp-content/uploads/2019/12/giay-sneaker-nam-adidas.jpg.webp', 40, 450000, 4)
INSERT [dbo].[Product] ([pID], [pName], [imge], [Number], [price], [bID]) VALUES (45, N'Nike Air Max 1 Premium ''Limeade'' CJ0609-300', N'https://product.hstatic.net/1000282067/product/682290_01.jpg_fab573fc4d2748d298e099b11ebd3206_1024x1024.jpeg', 30, 490000, 1)
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
SET IDENTITY_INSERT [dbo].[Size] ON 

INSERT [dbo].[Size] ([sID], [sNumber]) VALUES (1, 40)
INSERT [dbo].[Size] ([sID], [sNumber]) VALUES (2, 41)
INSERT [dbo].[Size] ([sID], [sNumber]) VALUES (3, 42)
SET IDENTITY_INSERT [dbo].[Size] OFF
GO
SET IDENTITY_INSERT [dbo].[UserShoes] ON 

INSERT [dbo].[UserShoes] ([UserID], [uName], [pass], [fName], [isSell], [isAdmin], [dob], [phone], [email]) VALUES (1, N'hieunt', N'12345', N'Nguyễn Trọng Hiếu', 1, 1, CAST(N'2001-02-10' AS Date), N'0912162551', N'hieuntde150078@fpt.edu.vn')
INSERT [dbo].[UserShoes] ([UserID], [uName], [pass], [fName], [isSell], [isAdmin], [dob], [phone], [email]) VALUES (2, N'hoat', N'12345', N'Thái Hòa', 1, 0, CAST(N'2001-07-21' AS Date), N'0987654321', N'hoatde15792@fpt.edu.vn')
INSERT [dbo].[UserShoes] ([UserID], [uName], [pass], [fName], [isSell], [isAdmin], [dob], [phone], [email]) VALUES (3, N'toandt', N'123456', N'Trần Đức Toàn', 0, 0, CAST(N'2001-10-23' AS Date), N'0986321142', N'toandtde162312@fpt.edu.vn')
INSERT [dbo].[UserShoes] ([UserID], [uName], [pass], [fName], [isSell], [isAdmin], [dob], [phone], [email]) VALUES (4, N'anvt', N'12345', N'Vo Thanh An', 0, 0, CAST(N'1900-01-01' AS Date), N'0912345431', N'mrmiss5678@gmail.com')
INSERT [dbo].[UserShoes] ([UserID], [uName], [pass], [fName], [isSell], [isAdmin], [dob], [phone], [email]) VALUES (5, N'thangt', N'12345', N'Tran Duc Toan', 0, 0, CAST(N'2022-03-30' AS Date), N'0912345431', N'mrmiss5678@gmail.com')
INSERT [dbo].[UserShoes] ([UserID], [uName], [pass], [fName], [isSell], [isAdmin], [dob], [phone], [email]) VALUES (6, N'arm', N'12345', N'Miss Mr', 0, 0, CAST(N'2022-04-07' AS Date), N'0987654321', N'mrmiss5678@gmail.com')
SET IDENTITY_INSERT [dbo].[UserShoes] OFF
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK__Cart__pID__245D67DE] FOREIGN KEY([pID])
REFERENCES [dbo].[Product] ([pID])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK__Cart__pID__245D67DE]
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK__Cart__sID__25518C17] FOREIGN KEY([sID])
REFERENCES [dbo].[Size] ([sID])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK__Cart__sID__25518C17]
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK__Cart__userID__2645B050] FOREIGN KEY([UserID])
REFERENCES [dbo].[UserShoes] ([UserID])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK__Cart__userID__2645B050]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK__Product__bID__5DCAEF64] FOREIGN KEY([bID])
REFERENCES [dbo].[BrandTest] ([bID])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK__Product__bID__5DCAEF64]
GO
USE [master]
GO
ALTER DATABASE [SellShoes] SET  READ_WRITE 
GO
