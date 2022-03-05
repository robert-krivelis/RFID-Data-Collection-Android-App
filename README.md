# RFID Data Collection Android App
This project started as a hackathon with innovation 4 health (I4H). Over the course of 8 weeks, interdisciplinary teams were formed to work together to try to solve the problems of sponsors working with.   
![Group photo](https://user-images.githubusercontent.com/43624936/156862948-94c9cb2a-3ecb-4324-bd5e-d5ea67fd17c3.jpg)
## The Problem
Our sponsor was a labratory researcher who had a difficult problem. He wanted to measure his subject's hormones throughout the day using saliva samples, but was having difficulty ensuring that the samples were taken at the right time. Given his subjects were primarily teenagers and children with hectic schedules, they would often falsify the time tests were taken, forget to make measurements entirely, or perform them incorrectly. Our mission was to try to build a solution that would record accurate time data for when the measurements were taken.

## Initial Solutions
![test tube holder](https://user-images.githubusercontent.com/43624936/156863380-3cf4092d-6c64-4817-892f-921d77755746.JPG)
Our initial solution consisted of a test tube holder enclosure with a touch screen interface powered by raspberry pi zero. The test tubes held vials for testing saliva samples. These vials had RFID identification labels that were read by an RFID reader. A subject in the study would scan the vial while performing a test, as shown by instructions on the screen. Scanning the vial would record the time the test was performed. This data collection could be used by the research lab for a higher confidence dataset regarding the subjects and their measurements.  
![nist box](https://user-images.githubusercontent.com/43624936/156863596-ee6d51f4-213d-43e3-8b0b-ccf5a55b0bf1.jpg)


We created the solution for the hackathon, where I worked on the python software powering the raspberry pi as well as designing and configuring the electrical design for the connections between the raspberry pi, sensors, and battery. It was designed to look like a treasure chest to appeal to our youth-focused customers.
![Team photo at the hackathon](https://user-images.githubusercontent.com/43624936/156863639-0cf6dc93-0422-4c71-ad67-1d93986010b5.jpg)

Our device worked well enough for the hackathon, but had problems for sustainability. It took a long time to make changes to the firmware, as the touchscreen did not work simultaneously with HDMI outputs, creating a long feedback loop between development iterations. In addition, the device was not easily scalable -- it took a lot of time to set up and get running because of the fragility of the mechanical parts, the soldering required, and the time it took to flash firmware. In the future, an improved version would address these problems.

## Final Solutions
After the hackathon was completed, the team split ways onto other journeys. Our sponsors, the researchers, reached out to us about continuing the project after. I had some time to continue working on the project, so I worked towards the final solution we came up with. Our solution was to make an app that would use the RFID chips in android phones to write data into the RFID labels on the test vials. This allowed us to scale our solution easily and reduced the development and iteration time for making changes to our software.

Our sponspors ran into their own funding issues for their studies, so this project was put on pause for the time being. The project now lives in this repo and is largely done: many of the key components like writing to the RFID labels and recording user data to the phones internal memory is figured out. While this project is currently stalled, during the time I worked on it, it was super fun to work on challenging problems with amazing people.   
