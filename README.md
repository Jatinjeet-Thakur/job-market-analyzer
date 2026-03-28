# Job Market Analyzer

A full-stack application that analyzes job market trends by extracting and processing job postings data. The system provides RESTful APIs for job data management, skill extraction analytics, and interactive dashboards for visualizing hiring trends.

## 🚀 Features

- **RESTful APIs**: Built with Java and Spring Boot for comprehensive job posting management
- **Skill Extraction**: Automated extraction and analysis of trending technologies from job descriptions
- **Smart Search**: Advanced filtering of jobs based on required skills with custom search logic
- **Interactive Dashboards**: Power BI visualizations showcasing:
  - Hiring trends over time
  - Top hiring companies
  - Most in-demand skills and technologies
- **Cloud Deployment**: Backend deployed on Railway with publicly accessible API endpoints

## 🛠️ Tech Stack

### Backend
- **Java** - Core programming language
- **Spring Boot** - Framework for RESTful API development
- **Maven** - Dependency management
- **Railway** - Cloud deployment platform

### Analytics & Visualization
- **Power BI Desktop** - Interactive dashboard creation

## 🌐 Live API

The backend is live and accessible:

| Service | URL |
|---------|-----|
| **Base URL** | `https://job-market-analyzer-production.up.railway.app` |
| **Jobs Endpoint** | [https://job-market-analyzer-production.up.railway.app/api/jobs](https://job-market-analyzer-production.up.railway.app/api/jobs) |


###
API Endpoints
All endpoints are accessible at: https://job-market-analyzer-production.up.railway.app

Method	Endpoint	Description
GET	/api/jobs	Retrieve all job postings
GET	/api/jobs/{id}	Get specific job by ID
POST	/api/jobs	Create new job posting
PUT	/api/jobs/{id}	Update existing job
DELETE	/api/jobs/{id}	Delete job posting
GET	/api/jobs/search/skills	Search jobs by required skills
GET	/api/analytics/skills/trending	Get trending skills from job descriptions
GET	/api/analytics/companies/top	Get top hiring companies
GET	/api/analytics/hiring/trends	Get hiring trends over time
Example API Calls
bash
# Get all job postings
curl https://job-market-analyzer-production.up.railway.app/api/jobs

# Get job with ID 1
curl https://job-market-analyzer-production.up.railway.app/api/jobs/1

# Search for jobs requiring Java
curl "https://job-market-analyzer-production.up.railway.app/api/jobs/search/skills?skills=Java"

# Search for jobs requiring multiple skills
curl "https://job-market-analyzer-production.up.railway.app/api/jobs/search/skills?skills=Java,Spring%20Boot"

Local Development (Optional)
If you want to run the application locally for development:

Prerequisites
Java 11 or higher

Maven 3.6+

Git

Setup
Clone the repository

bash
git clone https://github.com/yourusername/job-market-analyzer.git
cd job-market-analyzer
Configure application properties

bash
# Update src/main/resources/application.properties
spring.datasource.url=jdbc:h2:mem:jobmarket  # Uses in-memory database by default
spring.datasource.username=sa
spring.datasource.password=
Build and run

bash
mvn clean install
mvn spring-boot:run
The application will start at http://localhost:8080

Power BI Dashboards
The application includes Power BI dashboards that visualize:

Hiring Trends Dashboard - Monthly job posting trends and seasonal patterns

Top Companies Dashboard - Companies with most job openings and industry distribution

In-Demand Skills Dashboard - Top requested skills and technology stack trends

Connecting Power BI to Live API
Open Power BI Desktop

Use "Get Data" → "Web"

Enter API URL: https://job-market-analyzer-production.up.railway.app/api/jobs

Load and transform data as needed

Create or refresh dashboards                                                                       

Deployment
The application is deployed on Railway with the following configuration:

Detail	Information
Platform	Railway
Public URL	https://job-market-analyzer-production.up.railway.app
HTTPS	Enabled automatically
Auto-deploys	Enabled on main branch
Deployment Commands
bash
# Install Railway CLI
npm install -g @railway/cli

# Login to Railway
railway login

# Deploy
railway up

# Set environment variables (if needed)
railway variables set DB_URL=your_database_url

Project Structure
text
job-market-analyzer/
├── src/
│   ├── main/
│   │   ├── java/com/jobmarket/
│   │   │   ├── JobMarketApplication.java
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   └── utils/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/
├── power-bi/
│   ├── hiring_trends.pbix
│   ├── top_companies.pbix
│   └── skill_demand.pbix
├── pom.xml
└── README.md 
Live API: https://job-market-analyzer-production.up.railway.app/api/jobs
