# Cricbuzz API

This project provides an API to retrieve information about cricket series, matches, and related details.

## Overview

The application offers endpoints to fetch cricket series categorized as domestic and international matches.

- `/series/domestic`: Retrieve a list of domestic cricket series.
- `/series/international`: Retrieve a list of international cricket series.

## Technologies Used

- Java
- Spring Boot
- MongoDB 
- Gradle 

## Setup Instructions

1. **Clone the repository:**

    ```bash
    git clone https://github.com/Gaurang135/cricbuzz-api.git
    cd cricbuzz-api
    ```

2. **Run the application:**

    ```bash
    gradle bootRun
    ```

3. **Access the API:**

    - Domestic Series: [http://localhost:8081/series/domestic](http://localhost:8081/series/domestic)
    - International Series: [http://localhost:8081/series/international](http://localhost:8081/series/international)

## API Responses

### `/series/domestic`

- **HTTP Method**: GET
- **Description**: Retrieve a list of domestic cricket series.
- **Response Codes**:
    - `200 OK`: Successfully retrieved the list of domestic series.
    - `204 No Content`: No domestic series available.
- **Sample Response**:

    ```json
    [
        {
            "seriesName": "IPL 2023",
            "region": "DOMESTIC",
            "matches": [
                {
                    "team1": {
                        "teamName": "Mumbai Indians",
                        "score": 180,
                        "wickets": 6,
                        "overs": 18.0
                    },
                    "team2": {
                        "teamName": "Chennai Super Kings",
                        "score": 160,
                        "wickets": 8,
                        "overs": 20.0
                    },
                    "matchNumber": 1,
                    "status": "DECLARED",
                    "schedule": {
                        "date": "2023-12-05",
                        "location": "Wankhede Stadium, Mumbai"
                    }
                }
                
            ]
        }
    ]
    ```

### `/series/international`

- **HTTP Method**: GET
- **Description**: Retrieve a list of international cricket series.
- **Response Codes**:
    - `200 OK`: Successfully retrieved the list of international series.
    - `204 No Content`: No international series available.
- **Sample Response**:

    ```json
    [
        {
            "seriesName": "Test Series 2023",
            "region": "INTERNATIONAL",
            "matches": [
                {
                    "team1": {
                        "teamName": "India",
                        "score": 300,
                        "wickets": 7,
                        "overs": 80.0
                    },
                    "team2": {
                        "teamName": "Australia",
                        "score": 320,
                        "wickets": 5,
                        "overs": 85.0
                    },
                    "matchNumber": 1,
                    "status": "DECLARED",
                    "schedule": {
                        "date": "2023-12-10",
                        "location": "Sydney Cricket Ground"
                    }
                }
                
            ]
        }
    ]
    ```

## Contribution

Contributions are welcome! Feel free to raise issues or submit pull requests for any improvements or additional features.

