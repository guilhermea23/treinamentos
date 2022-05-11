int randomNumber = (new Random()).nextInt(100) + 1
       
print 'Guess a number: '
System.in.withReader { reader ->
  String response
  while (response = reader.readLine()) {
      if (! response.isNumber())
          print "that's not a number! try again: "
      else {
          int guess = response as Integer
          if (guess < randomNumber)
              print 'too low, try again: '
          else if (guess > randomNumber)
              print 'too high, try again: '
          else {
              println "that's right"
              break
          }
      }
 }
}
