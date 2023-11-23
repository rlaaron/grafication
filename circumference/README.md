## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## TRHEE METHODS

- easy: using the cirfumference formula
    - cirfunference ecuation: x^2 + y^2 = r^2
- medium
- hard: graphic set up

## NOTES
# First method
The circunference is simetric to octants, so we can use the first octant to calculate the rest of the points

How can I know if already draw a octant? 
    - x>=y for each (x,y) point
How can I get the rest of cirfumference parts?
    - using the simetry of the octants
    - I can get to using:
        - (x,y) -> (y,x) and (x,-y) -> (y,-x)
        - (x,-y) -> (-y,x) and (x,y) -> (-y,-x)

why can't I see the complete circle?
    - 'cause there's not exist negative pixels
       
How can I see the complete circle?
    - Only need to add for each point the center cords.

If the radius is r, the center it'd be (r,r), and then the user can to set any center cords.

# Second method
Same method to use the circumference function.
Take as reference this formula:
    - x^2 + y^2 = r^2 -> f(x,y) = x^2 + y^2 - r^2 = 0

We said:
    - if the point is inside the circumference, then f(x,y) < 0
    , else f(x,y) != 0
    - if the point is on the circumference, then f(x,y) = 0, else f(x,y) != 0
    - if the point is outside the circumference, then f(x,y) > 0, else f(x,y) != 0

How can I know what pixel do I need to select?
    - After to evalute the cords in the circumference function, selct the pixel with the lowest absolute value of f(x,y).
    - I shouldn't forget the symmetry cords.

# Third method
take as as a reference the circumference function
    - x^2 + y^2 = r^2 
    - x^2 + x^2 = r^2
    - 2x^2 = r^2
    - x^2 = r^2/2
    - x = sqrt(r^2/2)
    - postive part: x = 2/sqrt(2)

for example: draw the circunference with r=10, using 3 control points
solution:
    -the middle point will be :
    -(3.5, y=sqrt(r^2 - x^2))
    -(3.5, y=sqrt(10^2 - 3.5^2))
    -(3.5, sqrt(100 - 12.25))
    -(3.5, sqrt(8.7.75))
    -(3.5, 9.37)
    -(4,9)
    -the first point will be :
    -(0,10)
    -the last point will be :
    -(7,7)
    -the method
    -g.drawLine(0,10,4,9)
    -g.drawLine(4,9,7,7)

Excercie: draw the circumference with r=30, using 5 control points
solution:
    -the middle point will be :
    -(10.6, y=sqrt(r^2 - x^2))
    -(10.6, y=sqrt(30^2 - 10.6^2))
    -(10.6, sqrt(900 - 112.36))
    -(10.6, sqrt(787.64))
    -(10.6, 28.06)
    -(11,28)
    -the first point will be :
    -(0,30)
    -the last points will be :
    -(5,30) -> (5,sqrt(30^2 - 5.2^2)) -> (5, sqrt(900 - 27.04)) -> (5, sqrt(872.96)) -> (5, 29.54) -> (5,30)
    -(5,30) -> (10, sqrt(30^2 - 10^2)) -> (10, sqrt(900 - 100)) -> (10, sqrt(800)) -> (10, 28.28) -> (10,28)
    -(10,28) -> (15, sqrt(30^2 - 15^2)) -> (15, sqrt(900 - 225)) -> (15, sqrt(675)) -> (15, 26) -> (16,26)
    -(30/sqrt(2), 30/sqrt(2)) -> (21.21,21.21) ->(21,21)
    -the method



    

## next practices

code the two methods
    - easy
    - medium

the teahcer will give us the base code(this just draw the firt octan), we need to draw the complete circumference,  and then implement the second method.

---
write the next methods
@Params
    -number of points
    -radius

