package eu.caraus.dynamo.application.ui.main.znav

import android.support.transition.ChangeBounds
import android.support.transition.ChangeImageTransform
import android.support.transition.ChangeTransform
import android.support.transition.TransitionSet


class DetailsTransition : TransitionSet() {

    init {

        ordering = ORDERING_TOGETHER

        addTransition( ChangeBounds()).
        addTransition( ChangeTransform()).
        addTransition( ChangeImageTransform())

    }

}

