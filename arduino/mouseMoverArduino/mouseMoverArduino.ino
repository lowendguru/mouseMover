#include "Mouse.h"
#include <EEPROM.h>

int led = 13;        // the PWM pin the LED is attached to
int brightness = 0;  // how bright the LED is
int fadeAmount = 5;  // how many points to fade the LED by

int eepromAddress = 0;
int toggle;

unsigned long startMillis;
unsigned long currentMillis;
unsigned long period;

void setup() {
  // declare pin 9 to be an output:
  pinMode(led, OUTPUT);

  // initialize mouse control:
  Mouse.begin();

  startMillis = millis();  //initial start time
  period = 240000;         // 4 minutes

  toggle = EEPROM.read(eepromAddress);

  if (toggle == 1) {
    // ON
    EEPROM.write(eepromAddress, 0);
  } else {
    // OFF
    analogWrite(led, 0);
    EEPROM.write(eepromAddress, 1);
  }
}

// the loop routine runs over and over again forever:
void loop() {

  if (toggle == 1) {
    // set the brightness of pin 9:
    analogWrite(led, brightness);

    // change the brightness for next time through the loop:
    brightness = brightness + fadeAmount;

    // reverse the direction of the fading at the ends of the fade:
    if (brightness <= 0 || brightness >= 128) {
      fadeAmount = -fadeAmount;
    }
    // wait for 30 milliseconds to see the dimming effect
    delay(100);

    currentMillis = millis();  //get the current time
    if (currentMillis - startMillis >= period) {
      // move mouse
      Mouse.move(2, 0);
      delay(50);
      Mouse.move(-2, 0);
      startMillis = currentMillis;
    }
  }
}