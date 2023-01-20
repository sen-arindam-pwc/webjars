# Roadmap

This document describes the major milestones.

## 1.0 (Initial Commit)

This is the first MVP.

- The `backend` serves the `frontend` assets: it requires the _environment variable_ `UI_ROOT_DIRECTORY` which contains
  the path to the assets.
- The `backend` serves a "Greeter" REST endpoint.
- The `frontend` contains a simple form request a "Greeting".

## 2.0 (Build Webjar)

- There is a `build` command/script in the `frontend` module which creates a WebJAR (a `jar` file) _somewhere_.
- There is an `install` command/script which deploys the `jar` file into the local Maven repository such that the
  `backend` is able to actually use it.
- There is an `uninstall` command/script which removes the `frontend` artifact again.
- The service uses the created WebJar and does

## 2.1 (Use Apache Maven for Building)

- The `frontend` artifact is now built by _Apache Maven_ and may as such be installed into the local cache as well.
- Removing the artifact from the local repository must still be done using the script.

## 3.0 (Gradle)

The `frontend` artifact may get built by _Gradle_ as well. No further features (other than that) has been added.
