INSERT INTO `my_logger`.`address` (`id`, `name`, `type`, `leaf`, `path`) VALUES ('5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9', '中国', 'country', '0', '0.5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9.');
INSERT INTO `my_logger`.`address` (`id`, `name`, `type`, `leaf`, `parent_Id`, `path`) VALUES ('cc1d2fcd-8a5b-460c-a48b-f83551836a66', '北京市', 'province', '1', '5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9', '0.5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9.cc1d2fcd-8a5b-460c-a48b-f83551836a66.');
INSERT INTO `my_logger`.`address` (`id`, `name`, `type`, `leaf`, `parent_Id`, `path`) VALUES ('a29bdbee-7d02-439a-bc12-46a08f3e401b', '上海市', 'province', '1', '5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9', '0.5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9.a29bdbee-7d02-439a-bc12-46a08f3e401b.');
INSERT INTO `my_logger`.`address` (`id`, `name`, `type`, `leaf`, `parent_Id`, `path`) VALUES ('9e207ec5-8d4d-4f2e-905a-890389d8daf8', '广东省', 'province', '0', '5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9', '0.5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9.9e207ec5-8d4d-4f2e-905a-890389d8daf8.');
INSERT INTO `my_logger`.`address` (`id`, `name`, `type`, `leaf`, `parent_Id`, `path`) VALUES ('89379c17-8382-494d-8db1-ee0f3558db5b', '广州市', 'city', '0', '9e207ec5-8d4d-4f2e-905a-890389d8daf8', '0.5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9.9e207ec5-8d4d-4f2e-905a-890389d8daf8.89379c17-8382-494d-8db1-ee0f3558db5b.');
INSERT INTO `my_logger`.`address` (`id`, `name`, `type`, `leaf`, `parent_Id`, `path`) VALUES ('37241efb-e14b-4965-9700-04969a72cd8d', '深圳市', 'city', '1', '9e207ec5-8d4d-4f2e-905a-890389d8daf8', '0.5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9.9e207ec5-8d4d-4f2e-905a-890389d8daf8.37241efb-e14b-4965-9700-04969a72cd8d.');
INSERT INTO `my_logger`.`address` (`id`, `name`, `type`, `leaf`, `parent_Id`, `path`) VALUES ('f2d091dc-404b-40ae-a99a-9b63d8ddf1fa', '天河区', 'county', '1', '89379c17-8382-494d-8db1-ee0f3558db5b', '0.5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9.9e207ec5-8d4d-4f2e-905a-890389d8daf8.89379c17-8382-494d-8db1-ee0f3558db5b.f2d091dc-404b-40ae-a99a-9b63d8ddf1fa.');