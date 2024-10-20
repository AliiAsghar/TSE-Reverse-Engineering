package defpackage;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdd extends LinkMovementMethod {
    private final rry a;
    private final MovementMethod b;
    private final abbj c;

    public abdd(rry rryVar, abbj abbjVar, MovementMethod movementMethod) {
        this.a = rryVar;
        this.b = movementMethod;
        this.c = abbjVar;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && this.a.aW()) {
            this.c.c(textView.getContext(), this.a);
            return true;
        }
        return this.b.onTouchEvent(textView, spannable, motionEvent);
    }
}
