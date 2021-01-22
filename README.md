# AlphaNumericGenerator

[![Version](https://jitpack.io/v/sakshampruthi/AlphaNumericGenerator.svg)](https://jitpack.io/#sakshampruthi/AlphaNumericGenerator)
----------------------------------------------------------

A small library to generate unique alpha numeric strings of custom size for projetcs like password generators

### Adding dependencies
Add this to your build.gradle (Project level):
```groovy
allprojects {
	repositories {
		....
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependencies in your app/build.gradle:
```groovy
dependencies {
    ....
    implementation 'com.github.sakshampruthi:AlphaNumericGenerator:1.0.1'
}
```

### How to use the library

To generate a alpha numeric strings of alphabets and numbers use:
```kotlin
val string = randomGenerator(length)
```
To generate a alpha numeric strings of alphabets, numbers and special characters use:
```kotlin
val string = randomSpecialGenerator(length)
```

>Each function generates and returns a String of size length(value passed in the function).
