Version 2 of the WhatsApp Verification process.

**Base URL:** `https://v.whatsapp.net/v2`

## Exist

Check if this number exists on the WhatsApp server.

## Request

**URL:** Base URL + `/exist`

**Method:** `GET`

**Headers:**

-   `User-Agent`

**Parameters:**

| Parameter | Description | Optional/Required |
| --- | --- | --- |
| `authkey` | Authkey is the public key of the `client_static_keypair` | Required |
| `cc` | Country Code | Required |
| `in` | Internal Number | Required |
| `id` | Identifier | Required |

## Response

_TODO_

## Code

Request a code.

## Request

**URL:** Base URL + `/code`

**Method:** `GET`

**Headers:**

-   `User-Agent`

**Parameters:**

| Parameter | Description | Optional/Required |
| --- | --- | --- |
| `authkey` | Authkey is the public key of the `client_static_keypair` | Required |
| `cc` | Country Code | Required |
| `in` | Internal Number | Required |
| `token` | Token | Required |
| `id` | Identifier | Required |
| `method` | Method (`sms`/`voice`) | Required |

## Response

_TODO_

## Register

Register the number with the received code.

## Request

**URL:** Base URL + `/register`

**Method:** `GET`

**Headers:**

-   `User-Agent`

**Parameters:**

| Parameter | Description | Optional/Required |
| --- | --- | --- |
| `authkey` | Authkey is the public key of the `client_static_keypair` | Required |
| `cc` | Country Code | Required |
| `in` | Internal Number | Required |
| `code` | Code | Required |
| `id` | Identifier | Required |

## Response

_TODO_