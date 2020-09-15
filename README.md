# rest-service
---

A simple Jersey REST service accepting a list of email addresses, in JSON format (see below), and return an integer indicating the number of unique email addresses.

### Input
{ "list": ["{email address}", "{email address}", ..., "{email address}"] }

### Output
Unique email addresses means they will be delivered to different accounts using Gmail account matching.
Gmail will ignore the placement of "." in the username and will ignore any portion of the username after a "+".

**examples:**

- { "list": ["freddie@mac.com", "fannie@mac.com", "sallie@mae.com"] }
> returns 3
- { "list": ["test.email@gmail.com", "test.email+spam@gmail.com", "testemail@gmail.com"] }
> returns 1
- { "list": ["test.email@gmail.com", "test.email@fetchrewards.com"] }
> returns 2
