# ✈️ Vuelify API

> **Estado:** 🚧 En Construcción (Work In Progress) - *Actualizado: Enero 2026*

**Vuelify** es una API REST moderna y de alto rendimiento para la gestión de vuelos y reservas. 

Este proyecto nace con un objetivo claro: **explorar y aplicar los últimos estándares del ecosistema Java Empresarial en 2025**, alejándose de las arquitecturas "legacy" y abrazando la concurrencia moderna y la arquitectura orientada a eventos.

---

## 🚀 Stack Tecnológico

La arquitectura está diseñada para ser **nativa de la nube** y soportar alta concurrencia gracias a Project Loom.

### Core & Lenguaje
*   **Java 25**: Uso intensivo de **Virtual Threads** para I/O no bloqueante sin la complejidad de la programación reactiva antigua.
*   **Spring Boot 4**: Última versión del framework.
*   **Java Records**: Para DTOs inmutables y transporte de datos eficiente.

### 🛡️ Calidad y Observabilidad
*   **JSpecify**: Adopción del estándar moderno para nulabilidad y análisis estático.
*   **P6Spy**: Trazabilidad detallada de sentencias SQL en tiempo de desarrollo.
*   **Jakarta Validation**: Validación declarativa en la capa de entrada (DTOs).

### Datos & Infraestructura
*   **PostgreSQL 16**: Base de datos relacional principal.
*   **Apache Kafka (KRaft mode)**: Backbone de mensajería para la Arquitectura Orientada a Eventos (EDA).
*   **Docker & Docker Compose**: Orquestación de infraestructura local declarativa.

### Patrones & Diseño
*   **DTO Pattern**: Desacoplamiento total entre Entidades de Persistencia y API pública.
*   **Repository Pattern**: Abstracción del acceso a datos con Spring Data JPA.
*   **Event-Driven**: Comunicación asíncrona entre dominios (en desarrollo).

---

## 🗺️ Roadmap del Proyecto

Este es el plan de desarrollo activo. El proyecto evoluciona semana a semana.

### ✅ Fase 1: Cimientos (Completado)
- [x] Configuración del entorno Java 25 + Spring Boot.
- [x] Infraestructura como Código (Docker Compose con Postgres & Kafka).
- [x] Modelado del Dominio (`Flight` Entity con UUIDs).
- [x] Capa de Persistencia y Repositorios JPA.

### 🚧 Fase 2: Lógica y API (En Progreso)
- [ ] Implementación de Controladores REST (POST / GET endpoints).
- [ ] Manejo global de excepciones (`@ControllerAdvice`).
- [ ] Validaciones de entrada (Jakarta Validation).
- [ ] Mapeo avanzado con MapStruct.

### 📅 Fase 3: Eventos y Seguridad (Próximamente)
- [ ] Publicación de eventos en Kafka (`FlightCreatedEvent`).
- [ ] Consumidores de eventos con Virtual Threads.
- [ ] Seguridad con Spring Security 6+ (JWT/OAuth2).
- [ ] Pruebas de integración con **Testcontainers**.

---
