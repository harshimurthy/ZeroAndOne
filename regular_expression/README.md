# Regular Expression documentation

+ import java.util.regex.*; must be used
+ Pattern p = Pattern.compile(reg_ex) complies reg_ex(regular expression)
+ Matcher m = p.matcher(Test_String); matches the compiled pattern with the given string Test_string

## Regular expression cheatsheet

+ . matches everything except newline
+ // is used to escape in java , ex //. matches .
+ \d matches any digit[0-9]
+ \D matches any character that is not a digit
+ \s match whitespace ( \r, \n, \t, \f or <space>)
+ \S matches non-whitespace characters
+ \w matches any word character(A-Z, a-z, 0-9, _)
+ \W matches any non-word character
+ ^ matches the position at the start of a string
+ $ matches the position at the end of a string

+ [ ] matches only one of several characters placed inside the [] bracketts
	+ [aei] will match for a or e or i
+ [^] matches any character that is not inside [ ] bracket
	+ [^you] will match any character which is not y or o or u
+ - inside [] represents range
	+ [A-Za-z] matches any upper case/ lower case character


+ {x} matches the character it follows x times
	+ [a-z]{4} matches for 4 lower case letters
+ {x,y} matches between x and y{both inclusive} repetitions of characters
	+ w{2,4} will match ww, www, wwww
	+ [xyz][5,] will match x,y,z 5 or more times
+ * matches 0/more repetitions of character(s)
	+ w* matches character w 0/more times
	+ [xyz]* matches character x,y,z 0/more times.
+ + matches 1/more repetitions of character(s)
	+ w+ matches w 1 or more times
	+ [abc]+ will match a,b,c 1 or more times
+ $ matches character(s) at the end of line