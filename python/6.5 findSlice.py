'''
Assignment 6.5 
 Write code using find() and string slicing 
 to extract the number at the end of the line below. 
 Convert the extracted value to a floating point number and print it out.


 Input : X-DSPAM-Confidence:    0.8475
 Output : 0.8475
'''

text = "X-DSPAM-Confidence:    0.8475"
#print text 
# output - X-DSPAM-Confidence:    0.8475
pos = text.find(':')
#print pos 
#output - 18
numstr= text[pos+1:]
#print numstr (notice the spaces)
#Output -     0.8475   
print float(numstr)  

#output 0.8475