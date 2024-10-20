package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.akec;
import defpackage.akkh;
import defpackage.akkq;
import defpackage.aklg;
import defpackage.aklm;
import defpackage.albo;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.dxc;
import defpackage.hht;
import defpackage.zky;
import defpackage.zkz;
import defpackage.znd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsSimStatusView extends znd implements akkh<zky> {
    private zky h;
    private Context i;

    @Deprecated
    public RcsSimStatusView(Context context) {
        super(context);
        h();
    }

    private final void h() {
        if (this.h == null) {
            try {
                this.h = ((zkz) aS()).u();
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
        return zky.class;
    }

    @Override // defpackage.akkh
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final zky E() {
        zky zkyVar = this.h;
        if (zkyVar != null) {
            return zkyVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dxc();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.i;
            if (context == null) {
                this.i = o;
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
        h();
    }

    public RcsSimStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RcsSimStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RcsSimStatusView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public RcsSimStatusView(akkq akkqVar) {
        super(akkqVar);
        h();
    }
}
