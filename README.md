# ImageGallery  [![](https://jitpack.io/v/mehdishz11/ImageGallery.svg)](https://jitpack.io/#mehdishz11/ImageGallery)



**Step 1: Add it in your root build.gradle at the end of repositories:**
```xml
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2: Add the dependency**
```xml
dependencies {
	       implementation 'com.github.mehdishz11:ImageGallery:v0.0.2'
	}
```

**Grid List Builder**

Simply with a very nice builder you will find it done.

```java
ZGrid.with(this, /*your string arraylist of image urls*/)
                .setToolbarColorResId(R.color.colorPrimary) // toolbar color
                .setTitle("Zak Gallery") // toolbar title
                .setToolbarTitleColor(ZColor.WHITE) // toolbar title color
                .setSpanCount(3) // colums count
                .setGridImgPlaceHolder(R.color.colorPrimary) // color placeholder for the grid image until it loads
                .show();
```

**Gallery Builder**
```java
ZGallery.with(this, /*your string arraylist of image urls*/)
                .setToolbarTitleColor(ZColor.WHITE) // toolbar title color
                .setGalleryBackgroundColor(ZColor.WHITE) // activity background color
                .setToolbarColorResId(R.color.colorPrimary) // toolbar color
                .setTitle("Zak Gallery") // toolbar title
                .show();
```
