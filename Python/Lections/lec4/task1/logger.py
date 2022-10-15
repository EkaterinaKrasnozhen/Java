from datetime import datetime as dt
from time import time

def temperature_logger(data):
    time = dt.now().strftime('%H:%M')
    with open('log.cvs', 'a') as file:
        file.write('{}; temperature; {}'
                   .format(time, data))
        
def pressure_logger(data):
    time = dt.now().strftime('%H:%M')
    with open('log.cvs', 'a') as file:
        file.write('{}; pressure; {}'
                   .format(time, data))
        
def wind_speed_logger(data):
    time = dt.now().strftime('%H:%M')
    with open('log.cvs', 'a') as file:
        file.write('{};wind speed; {}'
                   .format(time, data))