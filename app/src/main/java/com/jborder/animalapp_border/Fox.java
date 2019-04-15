package com.jborder.animalapp_border;

public class Fox extends Animal implements Fun{

    void Fox() {

    }
        public String say(){
            return "Ring ding dinga lingngngngn";
        }

        @Override
        public String play() {
            return "The fox chases mice and digs holes!";
        }
    }