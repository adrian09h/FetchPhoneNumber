
# react-native-fetch-phone-number

## Getting started

`$ npm install react-native-fetch-phone-number --save`

### Mostly automatic installation

`$ react-native link react-native-fetch-phone-number`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-fetch-phone-number` and add `RNFetchPhoneNumber.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNFetchPhoneNumber.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNFetchPhoneNumberPackage;` to the imports at the top of the file
  - Add `new RNFetchPhoneNumberPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-fetch-phone-number'
  	project(':react-native-fetch-phone-number').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-fetch-phone-number/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-fetch-phone-number')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNFetchPhoneNumber.sln` in `node_modules/react-native-fetch-phone-number/windows/RNFetchPhoneNumber.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Fetch.Phone.Number.RNFetchPhoneNumber;` to the usings at the top of the file
  - Add `new RNFetchPhoneNumberPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNFetchPhoneNumber from 'react-native-fetch-phone-number';

// TODO: What to do with the module?
RNFetchPhoneNumber;
```
  