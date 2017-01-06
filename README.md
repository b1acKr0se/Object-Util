###Utility methods for operating on objects. Library for Android and Java

[![](https://jitpack.io/v/kakavip/object-util.svg)](https://jitpack.io/#kakavip/object-util)

Download
-------
#####Gradle:

Step 1. Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Step 2. Add the dependency
```groovy
dependencies {
	    compile 'com.github.kakavip:object-util:1.0.0'
}
```

#####Maven:

Step 1. Add the JitPack repository to your build file
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```

Step 2. Add the dependency
```xml
<dependency>
	    <groupId>com.github.kakavip</groupId>
	    <artifactId>object-util</artifactId>
	    <version>1.0.0</version>
</dependency>
```

How to use
-------
Before and After:

```java
// Before
if (viewA != null
    && adapter != null
    && adapter.getItem(0) != null
    && callback != null
    && ...) {
    ...
}

// After
if (ObjectUtil.isNull(viewA,
                    adapter,
                    adapter.getItem(0),
                    callback,
                    ...)) {
  ....
}


String a = "a";
Object obj = null;

// Before
Log.d("MainActivity",
      "A -> " + (a != null ? a.toString() : "null") + "\n"
      + "obj -> " + (obj != null ? obj.toString() : "null")
);

// After
Log.d("MainActivity", ObjectUtil.toString(a, obj, null));


// Check empty
String b = "a";
String c = "";
String d = null;
Log.d("MainActivity", "Have string emptry ? " + ObjectUtil.isEmpty(a, c, d));


// Not Null
public void setPresenter(MainPresenter pPresenter) {
    mPresenter = ObjectUtil.requireNonNull(pPresenter,"MainPresenter is NULL");
}


```



License
-------

    Copyright 2016 Framgia, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.