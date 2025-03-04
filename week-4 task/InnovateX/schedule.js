document.addEventListener("DOMContentLoaded", function () {
    let scheduleData = [];

    fetch("data/schedule.json") 

        .then(response => response.json())
        .then(schedule => {
            scheduleData = schedule;
            displaySchedule(scheduleData);
        })
        .catch(error => console.error("Error loading schedule:", error));

    const filterDropdown = document.getElementById("track-filter");
    filterDropdown.addEventListener("change", function () {
        const selectedTrack = this.value;
        const filteredSchedule = selectedTrack === "All" 
            ? scheduleData 
            : scheduleData.filter(event => event.track === selectedTrack);
        displaySchedule(filteredSchedule);
    });

    function displaySchedule(schedule) {
        const scheduleContainer = document.getElementById("schedule-list");
        scheduleContainer.innerHTML = ""; 

        schedule.forEach(event => {
            const eventDiv = document.createElement("div");
            eventDiv.classList.add("schedule-item");

            eventDiv.innerHTML = `
                <h3>${event.time} - ${event.title}</h3>
                <p><strong>Track:</strong> ${event.track}</p>
            `;

            scheduleContainer.appendChild(eventDiv);
        });
    }
});
