#!bin/bash
echo Entry with a and b values
read -p 'A= ' a
read -p 'B= ' b
echo $a - $b = $((a - b))