document.addEventListener("DOMContentLoaded", function () {


fetch("data/speaker.json")
    .then(response => response.json())
    .then(speakers => {
        const speakersContainer = document.getElementById("speakers-list");
        speakersContainer.innerHTML = ""; 

        speakers.forEach(speaker => {
            const speakerDiv = document.createElement("div");
            speakerDiv.classList.add("speaker-card");

            speakerDiv.innerHTML = `
                <img src="${speaker.image}" alt="${speaker.name}">
                <h3>${speaker.name}</h3>
                <h4>${speaker.title}</h4>
                <p>${speaker.bio}</p>
            `;

            speakersContainer.appendChild(speakerDiv);
        });
    })
    .catch(error => console.error("Error loading speakers:", error));

});