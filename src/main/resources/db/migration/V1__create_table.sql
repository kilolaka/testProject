Create type CURRENCY as enum('PLN', 'USD');


CREATE TABLE Participants
(
    id SERIAL not null PRIMARY KEY,
    name text not null,
    last_name text not null,
    PESEL INT not null UNIQUE,
    birthday date
);

CREATE TABLE Accounts
(
    id SERIAL not null PRIMARY KEY,
    currency CURRENCY not null,
    participant_id INT not null references Participants(id)

);

CREATE TABLE Transactions
(
    id SERIAL not null PRIMARY KEY,
    create_date date not null,
    amount decimal not null,
    currency_from CURRENCY not null,
    currency_to CURRENCY not null,
    balance_from decimal not null,
    balance_to decimal not null,
    participant_id INT not null references Participants(id)
);

