CREATE TABLE IF NOT EXISTS "users"
(
    id              SERIAL NOT NULL,
    is_moderator    boolean NOT NULL,
    reg_time        BIGINT NOT NULL,
    name            VARCHAR(255) NOT NULL,
    e_mail          VARCHAR(255) NOT NULL,
    password        VARCHAR(255) NOT NULL,
    code            VARCHAR(255),
    photo           TEXT,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS "posts"
(
    id                  SERIAL NOT NULL,
    is_active           boolean NOT NULL,
    moderation_status   TEXT NOT NULL,
    moderator_id        INT,
    user_id             INT NOT NULL,
    time                BIGINT NOT NULL,
    title               VARCHAR(255) NOT NULL,
    text                TEXT NOT NULL,
    view_count          INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS "post_votes"
(
    id          SERIAL NOT NULL,
    user_id     INT NOT NULL,
    post_id     INT NOT NULL,
    time        BIGINT NOT NULL,
    value       boolean NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (post_id) REFERENCES posts (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS "tags"
(
    id      SERIAL NOT NULL,
    name    VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS "tag2post"
(
    id          SERIAL NOT NULL,
    post_id     INT NOT NULL,
    tag_id      INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (post_id) REFERENCES posts (id) ON DELETE CASCADE,
    FOREIGN KEY (tag_id) REFERENCES tags (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS "post_comments"
(
    id          SERIAL NOT NULL,
    parent_id   INT,
    post_id     INT NOT NULL,
    user_id     INT NOT NULL,
    time        BIGINT NOT NULL,
    text TEXT   NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (parent_id) REFERENCES post_comments (id) ON DELETE CASCADE,
    FOREIGN KEY (post_id) REFERENCES posts (id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS "captcha_codes"
(
    id              SERIAL NOT NULL,
    time            BIGINT NOT NULL,
    code            boolean NOT NULL,
    secret_code     TEXT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS "global_settings"
(
    id      SERIAL NOT NULL,
    code    VARCHAR(255) NOT NULL,
    name    VARCHAR(255) NOT NULL,
    value   VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
