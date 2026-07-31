# 💰 Registro de Gastos

Aplicación móvil desarrollada para llevar un control sencillo de los **gastos personales**. Permite registrar gastos, consultar un historial y visualizar el monto total acumulado.

El proyecto fue desarrollado como una práctica de desarrollo de aplicaciones Android utilizando **Kotlin, Jetpack Compose y Room**.

## 📱 Funcionalidades

* ➕ Registrar nuevos gastos.
* 📝 Agregar una descripción al gasto.
* 💵 Registrar el monto en soles (S/).
* 📋 Visualizar el historial de gastos.
* 📅 Mostrar la fecha y hora de cada registro.
* 🗑️ Eliminar gastos registrados.
* 🧮 Calcular automáticamente el total de gastos.
* 💾 Guardar los registros de forma local en el dispositivo.

## 🛠️ Tecnologías utilizadas

* **Kotlin**
* **Android**
* **Jetpack Compose**
* **Material 3**
* **Room Database**
* **KSP**
* **ViewModel**
* **StateFlow / Compose State**
* **Gradle Kotlin DSL**

La aplicación utiliza Jetpack Compose para construir la interfaz y Room para gestionar el almacenamiento local de los gastos.

## 🏗️ Arquitectura

El proyecto organiza la aplicación separando la interfaz de usuario y la capa de datos.

```text
app/
└── src/
    └── main/
        └── java/
            └── com/
                └── rodrigopacheco/
                    └── registrogastos/
                        ├── MainActivity.kt
                        │
                        ├── data/
                        │   ├── Gastos.kt
                        │   ├── GastoDao.kt
                        │   └── GastosDatabase.kt
                        │
                        └── ui/
                            └── theme/
```

La capa `data` contiene la entidad de gastos, el DAO y la base de datos Room.

## 📊 Funcionamiento

La aplicación cuenta con un formulario donde el usuario puede ingresar:

* **Descripción:** nombre o detalle del gasto.
* **Monto:** cantidad gastada en soles.

Al guardar un gasto, este se almacena localmente y aparece inmediatamente en el historial.

Cada registro muestra:

```text
Descripción
Fecha y hora
Monto
[Eliminar]
```

Además, en la parte inferior de la aplicación se muestra automáticamente el **total acumulado de los gastos**.

## 💾 Base de datos

Para la persistencia de información se utiliza **Room Database**, evitando depender de un servidor externo.

La estructura de datos actualmente contempla los registros de gastos y permite realizar operaciones sobre ellos mediante un DAO.

## ⚙️ Requisitos

* Android Studio
* JDK 11
* Android SDK 36
* Dispositivo Android o emulador
* Android 12 / API 31 o superior

El proyecto tiene configurado `minSdk 31`, `targetSdk 36` y utiliza Java 11 como versión de compatibilidad.

## 🚀 Instalación

Clona el repositorio:

```bash
git clone https://github.com/RodrigoPacheco-acc/RegistrosGastos.git
```

Luego:

1. Abre el proyecto en **Android Studio**.
2. Espera a que Gradle sincronice las dependencias.
3. Conecta un dispositivo Android o inicia un emulador.
4. Ejecuta la aplicación.

## 🔄 Operaciones CRUD

El proyecto implementa actualmente parte del flujo CRUD:

| Operación        | Estado |
| ---------------- | ------ |
| Crear gasto      | ✅      |
| Consultar gastos | ✅      |
| Actualizar gasto | ⏳      |
| Eliminar gasto   | ✅      |

> La edición de registros puede incorporarse como una mejora futura.

## 🔮 Próximas mejoras

* ✏️ Permitir editar gastos.
* 🏷️ Incorporar categorías.
* 🔎 Agregar búsqueda y filtros.
* 📅 Filtrar gastos por fechas.
* 📊 Incorporar gráficos y estadísticas.
* 📤 Exportar los registros.
* ☁️ Implementar sincronización con la nube.
* 🔐 Agregar autenticación de usuarios.

## 👨‍💻 Autor

**Rodrigo Pacheco**

Proyecto desarrollado con fines educativos para practicar el desarrollo de aplicaciones móviles, persistencia de datos y operaciones CRUD utilizando Kotlin y Android.

---

⭐ Si te parece útil el proyecto, puedes darle una estrella al repositorio.
