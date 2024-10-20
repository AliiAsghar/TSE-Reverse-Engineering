package com.google.android.setupcompat.template;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import defpackage.ajvb;
import defpackage.ajvd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FooterActionButton extends Button implements ajvd {
    public ajvb a;
    public boolean b;

    public FooterActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }
}
