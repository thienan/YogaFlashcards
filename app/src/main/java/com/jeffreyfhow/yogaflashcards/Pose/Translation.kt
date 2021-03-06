package com.jeffreyfhow.yogaflashcards.Pose

/**
 * Created by jeffreyhow on 7/12/17.
 * Translation data class that holds both the english & sanskrit names of a Pose.Pose
 */
data class Translation(val sanskrit: String, val english: String){
    override fun toString() = "$sanskrit = $english"
}