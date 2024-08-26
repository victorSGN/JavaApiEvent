CREATE TABLE address(
    id UUID  DEFAULT gen_random_uuid() PRIMARY KEY,
    city varchar(100) NOT NULL,
    uf VARCHAR(2) NOT NULL,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);