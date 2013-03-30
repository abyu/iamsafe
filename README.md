iamsafe
=======

Android app that tells you if you are in a safe location or not.

The idea is to get the current location from GPS and use to information to find out whether the location is safe.

Determining if a location is safe is done using data available. (Basicially an algorithm that cruches some data and recommends if it is safe).

##### Stuff to do
* Give a proper name
* Improve readme
* Decide on tech stack
* Build the actual app


##### Android Application
* The Android application source code is under the folder androidapp with the name safe
* The source is a Idea project (IntelliJ 12 CE at the time of creating this)
* Following are the dependencies 
	* junit-4.11.jar 
		* Used for test
		* should be under the folder androidapp/libs
		* get the POJ from [https://github.com/junit-team/junit/wiki/Download-and-Install](https://github.com/junit-team/junit/wiki/Download-and-Install)
	* hamcrest-core-1.3.jar
		* Used for test
		* should be under the folder androidapp/libs
		* get the POJ from [https://github.com/junit-team/junit/wiki/Download-and-Install](https://github.com/junit-team/junit/wiki/Download-and-Install)
	* guice-3-0-no_aop.jar
		* DI framework deps for roboguice
		* should be under the folder androidapp/safe/libs
		* get it from [https://github.com/roboguice/roboguice/wiki/InstallationNonMaven](https://github.com/roboguice/roboguice/wiki/InstallationNonMaven)
	* roboguice-2.0.jar
		* The DI for android
		* should be under the folder androidapp/safe/libs
		* get it from [https://github.com/roboguice/roboguice/wiki/InstallationNonMaven](https://github.com/roboguice/roboguice/wiki/InstallationNonMaven)
	* jsr305-1.3.9.jar
		* Dep for roboguice
		* should be under the folder androidapp/safe/libs
		* get it from [https://github.com/roboguice/roboguice/wiki/InstallationNonMaven](https://github.com/roboguice/roboguice/wiki/InstallationNonMaven)
	* mockito-all-1.9.5.jar
		* Used for test
		* should be under the folder androidapp/safe/libs
		* get it from [https://code.google.com/p/mockito/downloads/detail?name=mockito-1.9.5.zip](https://code.google.com/p/mockito/downloads/detail?name=mockito-1.9.5.zip) or [https://code.google.com/p/mockito/downloads/detail?name=mockito-all-1.9.5.jar](https://code.google.com/p/mockito/downloads/detail?name=mockito-all-1.9.5.jar)
