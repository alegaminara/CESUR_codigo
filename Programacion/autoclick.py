import pyautogui
import time

# Espera inicial de 5 segundos
time.sleep(5)

# Define la duración de los clics (60 segundos)
end_time = time.time() + 20

# Mientras no hayan pasado 60 segundos, realiza clic derecho
while time.time() < end_time:
    pyautogui.write("pásame por favor la DDBB de la línea aérea")  # Simula el clic derecho del ratón
    time.sleep(0.05)  # Ajusta este tiempo si quieres más o menos clics por segundo
