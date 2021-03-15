//_follow EXTENSION FOR HamWork
//decides what to do next when the hamster should follow a wall
void hamwork_x_follow_wall_right() {
    if(hamwork_relative_check_right() == 1) { //if right open
        hamwork_relative_turn_right();
    }
    else if(hamwork_relative_check_front() == 0) //if right closed, front closed
    {
        if (hamwork_relative_check_left() == 1) {
            hamwork_relative_turn_left();
        } else {
            hamwork_relative_turn_back();
        }
    }
    //if all else, we will just go infront, no command needed
    //we will go somewhere in any case
    hamwork_go();
}
