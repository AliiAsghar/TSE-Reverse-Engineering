package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajve extends MaterialButton implements ajvd {
    ajvb k;

    public ajve(Context context, int i) {
        super(context, null, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }
}
