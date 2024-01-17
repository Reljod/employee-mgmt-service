--liquibase formatted sql

--changeset jod:1
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

--rollback DROP EXTENSION IF EXISTS "uuid-ossp";

--changeset jod:2
CREATE TABLE IF NOT EXISTS employees (
    id SERIAL PRIMARY KEY,
    employee_id uuid DEFAULT uuid_generate_v4(),
    company_id uuid NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(50) NOT NULL
);

--rollback DROP TABLE employees;
