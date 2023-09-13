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

## next practices

code the two methods
    - easy
    - medium

the teahcer will give us the base code(this just draw the firt octan), we need to draw the complete circumference,  and then implement the second method.