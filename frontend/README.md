# Front-End

This is a simple front-end. No building, just HTML, JavaScript and CSS files ready to be served.

## Usage

Include

```xml
<dependency>
  <groupId>com.github.bvfnbk</groupId>
  <artifactId>webjars-frontend</artifactId>
  <version>2.0-SNAPSHOT</version>
</dependency>
```

in the dependencies section of your `pom.xml`.

## Building

### Apache Maven

The artifact can be built using _Apache Maven_. It contains an _Apache Maven Wrapper_. Run

```shell
./mvnw package
```

to build the artifact

```shell
./target/webjars-frontend-2.0-SNAPSHOT.jar
```

The artifact can be installed in the local repository with

```shell
./mvnw install
```

## Issues

Currently, all assets are served at

```shell
/assets/webjars-frontend/**/*
```

especially the `index.html`. It may be better that the WebJar only contains the assets and not the index html.

- The backend knows where to find the frontend assets, i.e.
  - The prefix `/asset` (set by itself)
  - The path `/webjars-frontend/**/*`
- It may be better if the service provides the `index.html` and configures the paths to include, e.g. using a template
  etc.
