package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.aacd;
import defpackage.aacf;
import defpackage.aadg;
import defpackage.akec;
import defpackage.akkh;
import defpackage.akkq;
import defpackage.aklg;
import defpackage.aklm;
import defpackage.aklq;
import defpackage.albo;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.hht;
import defpackage.utz;
import defpackage.xww;
import defpackage.zkh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClickFixingEmojiAppCompatTextView extends aadg implements akkh<aacd> {
    public aacd a;
    private Context b;

    @Deprecated
    public ClickFixingEmojiAppCompatTextView(Context context) {
        super(context);
        c();
    }

    private final void c() {
        if (this.a == null) {
            try {
                aacf aacfVar = (aacf) aS();
                zkh zkhVar = new zkh(this, 3);
                aklq.c(zkhVar);
                try {
                    aacd y = aacfVar.y();
                    this.a = y;
                    if (y == null) {
                        aklq.b(zkhVar);
                    }
                    this.a.b = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof apxq) && !(context instanceof apxm.a) && !(context instanceof aklm)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof aklg)) {
                        throw new IllegalStateException(hht.f(this));
                    }
                } catch (Throwable th) {
                    if (this.a == null) {
                        aklq.b(zkhVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aacd.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        aacd aacdVar = this.a;
        if (aacdVar != null) {
            return aacdVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.b;
            if (context == null) {
                this.b = o;
                return;
            }
            boolean z = true;
            if (context != o && !akec.p(context)) {
                z = false;
            }
            albo.U(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MovementMethod movementMethod;
        c();
        aacd aacdVar = this.a;
        if (((Boolean) ((utz) xww.a.get()).e()).booleanValue() && motionEvent != null && motionEvent.getAction() == 1 && (movementMethod = aacdVar.a.getMovementMethod()) != null) {
            ClickFixingEmojiAppCompatTextView clickFixingEmojiAppCompatTextView = aacdVar.a;
            CharSequence text = clickFixingEmojiAppCompatTextView.getText();
            text.getClass();
            if (movementMethod.onTouchEvent(clickFixingEmojiAppCompatTextView, (Spannable) text, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public ClickFixingEmojiAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickFixingEmojiAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ClickFixingEmojiAppCompatTextView(akkq akkqVar) {
        super(akkqVar);
        c();
    }
}
