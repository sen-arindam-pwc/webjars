# Roadmap

This document describes the major milestones.

## 1.0 (Initial Commit)

This is the first MVP.

- The `backend` serves the `frontend` assets: it requires the _environment variable_ `UI_ROOT_DIRECTORY` which contains
  the path to the assets.
- The `backend` serves a "Greeter" REST endpoint.
- The `frontend` contains a simple form request a "Greeting".

## 2.0 (Use Apache Maven for Building)

The `frontend` artifact is built using _Apache Maven_. The assets are accessible at

```shell
/assets/webjars-frontend/js/GreetingService.js
/assets/webjars-frontend/css/frontend.css
/assets/webjars-frontend/index.html
```

The `index.html` has been updated to include the assets using the updated paths.

**Please note:** The `default` page does not work anymore.

## 2.1 (Split WebJar)

The `index.html` is currently served from the WebJar. This leads to a unconvenient path for the browser (the full
prefix is required). The file should be served from the _backend_.

## 3.0 (Gradle)

The `frontend` artifact may get built by _Gradle_ as well. No further features (other than that) has been added.
