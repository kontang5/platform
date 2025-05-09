# platform

> Web Platform — On-premise Web Service Project

Full-stack web platform designed to run on a self-hosted server. It leverages a main domain with multiple subdomains to structure different services and is built for real-world deployment experience using Docker, Nginx, and Spring Boot.

## Tech Stack

- **Backend**
  - Java 17
  - Spring Boot 3.4.5
  - Spring MVC (HTTP APIs, server-side rendering with Thymeleaf)
- **Frontend**
  - HTML5 + CSS3 (with TailwindCSS)
  - JavaScript (Vanilla, no framework)
- **Infrastructure**
  - Docker & Docker Compose (multi-container orchestration)
  - Nginx (reverse proxy, SSL termination via Cloudflare)
  - PostgreSQL (Relational Database)
  - Cloudflare (DNS management, SSL, web security)
- **Development Environment**
  - Local: macOS
  - Production: Linux server (self-hosted PC)


## System Architecture

The platform flow is structured as follows:

Internet → Cloudflare (DNS + SSL) → Router → Server (Dockerized Nginx, Spring Boot Application, PostgreSQL Database)

![Architecture Diagram](/docs/figure01.png)


## Environment

- Local Development: macOS
- Internet Connection: Dynamic IP
- Network Hardware: ASUS Router (V-LAN, Port-forwarding)
- Server Deployment: PC (with Docker containers)
- DNS & SSL Management: Cloudflare


## Git Workflow

### Branch Strategy

 Follow **GitHub Flow**
- `main` branch holds production-ready code.
- Create small feature branches off `main`.
- Open Pull Request (PR) when the feature is complete.
- Merge back into `main` after review and testing.
- Manual deployment after merging.


### Commit Message Guidelines

  | Type       | Description              |
  |------------|--------------------------|
  | `feat`     | New feature              |
  | `fix`      | Bug fix                  |
  | `docs`     | Documentation changes    |
  | `refactor` | Code restructuring       |
  | `test`     | Adding or updating tests |
  | `design`   | UI/UX changes            |
  | `chore`    | Other maintenance tasks  |
Example commits:
```text
feat: add user authentication API
fix: correct Nginx proxy_pass configuration
docs: update README with branch strategy
```


## Development and Deployment Plan

- [x] Set up a basic Spring Boot server
- [x] Set up PostgreSQL and connect it to Spring Boot
- [ ] Build basic frontend pages with Thymeleaf and TailwindCSS
- [ ] Create Dockerfiles and containerize services
- [ ] Configure Nginx reverse proxy
- [ ] Orchestrate services with Docker Compose
- [ ] Test full stack locally via Docker Compose
- [ ] Connect domain and enable HTTPS
- [ ] Implement monitoring, backup, and security
- [ ] Complete documentation