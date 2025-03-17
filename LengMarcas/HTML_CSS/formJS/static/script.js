document.addEventListener("DOMContentLoaded", () => {
    const formulario = document.getElementById("formularioETS");
    const resultadoDiv = document.getElementById("resultado");
    const btn = document.querySelector("#btn");
    const btnText = document.querySelector("#btnText");
    
    const respuestasCorrectas = {
        ETS_Definicion: "Enfermedad de transmisión sexual",
        ETS_Transmision: "abrazos",
        preservativo: "verdadero",
        ETS_Curable: "gonorrea",
        sintomas: "no",
        periodo_VIH: "3 a 12 semanas",
        genero: "si",
        ETS_Especialista: "dermatólogo",
        prevencion: "si"
    };

    formulario.addEventListener("submit", (event) => {
        event.preventDefault();
        let correctas = 0;
        let total = 10;

        function marcarRespuesta(elemento, esCorrecta, solucion) {
            elemento.style.borderColor = esCorrecta ? "green" : "red";
            elemento.style.color = esCorrecta ? "green" : "red";
            
            let solucionSpan = elemento.parentNode.querySelector(".solucion");
            if (!esCorrecta) {
                if (!solucionSpan) {
                    solucionSpan = document.createElement("span");
                    solucionSpan.className = "solucion";
                    solucionSpan.style.color = "blue";
                    solucionSpan.style.marginLeft = "10px";
                    elemento.parentNode.appendChild(solucionSpan);
                }
                solucionSpan.textContent = `(Correcto: ${solucion})`;
            } else if (solucionSpan) {
                solucionSpan.remove();
            }
        }

        // Validar preguntas abiertas
        Object.keys(respuestasCorrectas).forEach(id => {
            let elemento = document.getElementById(id);
            if (elemento) {
                let respuestaUsuario = elemento.value.trim().toLowerCase();
                let esCorrecta = respuestaUsuario === respuestasCorrectas[id].toLowerCase();
                marcarRespuesta(elemento, esCorrecta, respuestasCorrectas[id]);
                if (esCorrecta) correctas++;
            }
        });

        // Validar preguntas de opción múltiple
        let checkboxes = document.querySelectorAll(".ETS_Multi:checked");
        let seleccionadas = Array.from(checkboxes).map(cb => cb.value);
        let respuestasETS = ["sida", "gonorrea", "herpes"];
        let respuestasIncorrectas = ["gripe", "tuberculosis"];
        let esCorrectaETS = respuestasETS.every(ets => seleccionadas.includes(ets)) && !respuestasIncorrectas.some(ets => seleccionadas.includes(ets));
        checkboxes.forEach(cb => cb.style.outline = esCorrectaETS ? "2px solid green" : "2px solid red");
        if (esCorrectaETS) correctas++;

        // Validar preguntas de opción única
        document.querySelectorAll("input[type=radio]:checked").forEach(radio => {
            let name = radio.name;
            let esCorrecta = radio.value === respuestasCorrectas[name];
            marcarRespuesta(radio.parentNode, esCorrecta, respuestasCorrectas[name]);
            if (esCorrecta) correctas++;
        });

        resultadoDiv.innerHTML = `Has respondido correctamente ${correctas} de ${total} preguntas.`;
        
        // Animación del botón
        btnText.innerHTML = "Thanks";
        btn.classList.add("active");
    });
});
