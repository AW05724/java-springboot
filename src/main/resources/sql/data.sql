MERGE INTO `user` (mail, password, roles, created, last_logined, enabled)
KEY(mail)
VALUES ('tana@mail', 'hashed_password_tana', 'ROLE_USER', '2025-01-31 10:00:00', NOW(), TRUE);

MERGE INTO `user` (mail, password, roles, created, last_logined, enabled)
KEY(mail)
VALUES ('sato@mail', 'hashed_password_sato', 'ROLE_ADMIN', '2025-03-01 10:00:00', NOW(), FALSE);

MERGE INTO `user` (mail, password, roles, created, last_logined, enabled)
KEY(mail)
VALUES ('mura@mail', 'hashed_password_mura', 'ROLE_EDITOR', NOW(), NOW(), TRUE);
