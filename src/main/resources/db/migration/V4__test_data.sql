INSERT INTO tags (name)
VALUES ('Java'),
       ('ООП'),
       ('Программирование'),
       ('PHP'),
       ('C#');

INSERT INTO posts (is_active, moderation_status, user_id, time, title, text)
VALUES (true, 'ACCEPTED', 1, 1625127990000, 'Выбор языка программирования в 2022', 'Плюсы и минусы различных языков'),
       (true, 'ACCEPTED', 2, 1625127990000, 'Концепция ООП', 'Текст про ООП'),
       (true, 'ACCEPTED', 3, 1625127990000, 'Устройство HashMap', 'Текст про HashMap под капотом');

INSERT INTO tag2post (post_id, tag_id)
VALUES (1, 3),
       (1, 1),
       (1, 4),
       (2, 2),
       (3, 1);

INSERT INTO post_comments (post_id, user_id, parent_id, time, text)
VALUES (1, 2, null, 1625127990000, 'Спасибо! Очень полезно!'),
       (2, 3, null, 1625127990000, 'Сохраню в избранное!'),
       (2, 2, 2, 1625127990000, 'Пригодится на собеседовании!'),
       (3, 1, null, 1625127990000, 'Спасибо! Очень полезно!');