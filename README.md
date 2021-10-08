# Mouse Mover

## Description
This application does exactly what the title says: it moves the mouse (pointer).

## Executable
The only prerequisite is Java 1.8+ to be present in the system. The executable mouseMover.jar file can be downloaded from the Releases section.

## Usage
When the application is executed a small window is displayed. The mouse pointer will be moved to coordinates 100x 100y and after 30 seconds it will automatically move to 200x 100y. The mouse pointer will move back and forth between those 2 points until the application window is closed.

## Rationale
The reason behind this app's functionality is that the user may want to have automatic mouse movement inputs in order to fool some mouse movement monitoring software (as in employee monitoring software trying to record employee idle time).
Another possible scenario is to avoid the Windows session from locking itself after some idle time (a value that usually cannot be adjusted by non-admin users in corporate laptops).
