package com.google.android.apps.messaging.conversation.messagelist;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
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
import defpackage.itf;
import defpackage.ith;
import defpackage.itq;
import defpackage.zkh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MessageListRecyclerView extends itq implements akkh<itf> {
    public itf ab;
    private Context ac;

    @Deprecated
    public MessageListRecyclerView(Context context) {
        super(context);
        aP();
    }

    private final void aP() {
        if (this.ab == null) {
            try {
                ith ithVar = (ith) aS();
                zkh zkhVar = new zkh(this, 1);
                aklq.c(zkhVar);
                try {
                    itf h = ithVar.h();
                    this.ab = h;
                    if (h == null) {
                        aklq.b(zkhVar);
                    }
                    this.ab.b = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof apxq) && !(context instanceof apxm.a) && !(context instanceof aklm)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof aklg)) {
                        throw new IllegalStateException(hht.f(this));
                    }
                } catch (Throwable th) {
                    if (this.ab == null) {
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
        return itf.class;
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final itf E() {
        itf itfVar = this.ab;
        if (itfVar != null) {
            return itfVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.ac;
            if (context == null) {
                this.ac = o;
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
        aP();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        aP();
        itf itfVar = this.ab;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = itfVar.a;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return onTouchEvent;
    }

    public MessageListRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MessageListRecyclerView(akkq akkqVar) {
        super(akkqVar);
        aP();
    }
}
