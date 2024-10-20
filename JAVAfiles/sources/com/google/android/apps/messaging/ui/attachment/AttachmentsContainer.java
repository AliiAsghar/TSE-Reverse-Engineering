package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.akec;
import defpackage.akkh;
import defpackage.akkq;
import defpackage.aklg;
import defpackage.aklm;
import defpackage.albo;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.hht;
import defpackage.ybh;
import defpackage.zop;
import defpackage.zoq;
import defpackage.zpb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AttachmentsContainer extends zpb implements akkh<zop> {
    private zop a;
    private Context b;

    @Deprecated
    public AttachmentsContainer(Context context) {
        super(context);
        e();
    }

    private final zop d() {
        e();
        return this.a;
    }

    private final void e() {
        if (this.a == null) {
            try {
                this.a = ((zoq) aS()).v();
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof apxq) && !(context instanceof apxm.a) && !(context instanceof aklm)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof aklg)) {
                    throw new IllegalStateException(hht.f(this));
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zop.class;
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zop E() {
        zop zopVar = this.a;
        if (zopVar != null) {
            return zopVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
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
        e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        zop d = d();
        int measuredWidth = d.q.getMeasuredWidth();
        int i3 = d.y;
        int i4 = i3 - 1;
        if (i3 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return;
                        }
                        d.q.setMeasuredDimension(measuredWidth, 0);
                        return;
                    }
                } else {
                    d.q.setMeasuredDimension(measuredWidth, d.d);
                    return;
                }
            }
            d.q.setMeasuredDimension(measuredWidth, d.e);
            return;
        }
        throw null;
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        d().l(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        zop d = d();
        int i5 = d.y;
        if (i5 != 4 && i5 != 5) {
            d.b.post(new ybh(d, 15));
        }
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AttachmentsContainer(akkq akkqVar) {
        super(akkqVar);
        e();
    }
}
