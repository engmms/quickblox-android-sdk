package com.quickblox.sample.chat.kotlin.ui.views

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.quickblox.sample.chat.kotlin.R


class MessageTextViewLeft(context: Context, attrs: AttributeSet) : MessageTextView(context, attrs) {

    override fun setLinearSide() {
        val layoutParams = frameLinear.layoutParams as FrameLayout.LayoutParams
        layoutParams.gravity = Gravity.LEFT
        frameLinear.layoutParams = layoutParams
    }

    override fun setTextLayout() {
        viewTextStub.layoutResource = R.layout.widget_text_msg_left
        layoutStub = viewTextStub.inflate() as LinearLayout
    }
}