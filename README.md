# API de Números Aleatorios con Spring Boot

Esta API, construida con Spring Boot, permite generar números aleatorios con diversas especificaciones. Ofrece funcionalidades para obtener un listado de números aleatorios, obtener un número aleatorio con una cantidad específica de dígitos, y recibir un número aleatorio para devolver otro con el mismo número de dígitos.

## Funcionalidades

- **Obtener 100 números aleatorios:** Devuelve una lista de 100 números aleatorios.
- **Obtener un número aleatorio con `d` dígitos:** Devuelve un número aleatorio que tiene exactamente `d` dígitos.
- **Recibir y devolver un número aleatorio con el mismo número de dígitos:** Acepta un número aleatorio y devuelve otro con el mismo número de dígitos.

## Cómo Empezar

### Prerrequisitos

- JDK 11 o superior.
- Maven.

### Instalación

Para ejecutar la API localmente, sigue estos pasos:

1. Clona el repositorio:

git clone [URL del repositorio]


mvn clean install

markdown

## 4. Inicia la aplicación con:

mvn spring-boot:run

shell


## La API estará disponible en `http://localhost:8080`.

## Endpoints

### Obtener 100 números aleatorios

GET /random/numbers

shell


### Obtener un número aleatorio con `d` dígitos

GET /random/number/{d}

shell


### Recibir y devolver un número aleatorio con el mismo número de dígitos

PUT /random/number
Content-Type: application/json

{
"random": 12345
}
