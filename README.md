# rest-service
---

A simple Jersey REST service accepting a list of email addresses, in JSON format (see below), and return an integer indicating the number of unique email addresses.

### Usage

POST http://{server}:{port}/services/rest/unique-email-address-check
- Content-Type: `application/json`
- Accept: `text/plain`
- Body : `{ "list": ["test.email@gmail.com", "test.email@fetchrewards.com"] }`

GET http://{server}:{port}/services/rest/unique-email-address-check/test
- return `ok` if successful.

### Body Format
{ "list": ["{email address}", "{email address}", ..., "{email address}"] }

### Output
Unique email addresses means they will be delivered to different accounts using Gmail account matching.
Gmail will ignore the placement of "." in the username and will ignore any portion of the username after a "+".

examples:

- in:  { "list": ["freddie@mac.com", "fannie@mac.com", "sallie@mae.com"] }
> out: 3
- in:  { "list": ["test.email@gmail.com", "test.email+spam@gmail.com", "testemail@gmail.com"] }
> out: 1
- in:  { "list": ["test.email@gmail.com", "test.email@fetchrewards.com"] }
> out: 2

