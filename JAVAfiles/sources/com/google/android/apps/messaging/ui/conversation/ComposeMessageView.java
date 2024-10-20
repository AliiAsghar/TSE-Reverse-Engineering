package com.google.android.apps.messaging.ui.conversation;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.ad;
import defpackage.akec;
import defpackage.akkh;
import defpackage.akkq;
import defpackage.aklg;
import defpackage.aklm;
import defpackage.aklq;
import defpackage.aktp;
import defpackage.akvy;
import defpackage.albo;
import defpackage.aovp;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.hht;
import defpackage.ima;
import defpackage.imb;
import defpackage.kwf;
import defpackage.zkh;
import defpackage.zmi;
import defpackage.zrb;
import defpackage.zrd;
import defpackage.zri;
import defpackage.zrl;
import defpackage.zsd;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ComposeMessageView extends zsd implements akkh<zrb> {
    public zrb d;
    private Context e;

    @Deprecated
    public ComposeMessageView(Context context) {
        super(context);
        f();
    }

    private final zrb e() {
        f();
        return this.d;
    }

    /* JADX WARN: Finally extract failed */
    private final void f() {
        if (this.d == null) {
            try {
                zrl zrlVar = (zrl) aS();
                zkh zkhVar = new zkh(this, 2);
                aklq.c(zkhVar);
                try {
                    zrb x = zrlVar.x();
                    this.d = x;
                    if (x == null) {
                        aklq.b(zkhVar);
                    }
                    this.d.a = this;
                    ((akvy) aovp.m(this, akvy.class)).Q().a = this;
                    zrb zrbVar = this.d;
                    aktp.I(this, ima.class, new kwf(zrbVar, 13));
                    aktp.I(this, imb.class, new kwf(zrbVar, 14));
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof apxq) && !(context instanceof apxm.a) && !(context instanceof aklm)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof aklg)) {
                        throw new IllegalStateException(hht.f(this));
                    }
                } catch (Throwable th) {
                    if (this.d == null) {
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
        return zrb.class;
    }

    @Override // defpackage.akkh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zrb E() {
        zrb zrbVar = this.d;
        if (zrbVar != null) {
            return zrbVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ad();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.e;
            if (context == null) {
                this.e = o;
            } else {
                boolean z = true;
                if (context != o && !akec.p(context)) {
                    z = false;
                }
                albo.U(z, "onAttach called multiple times with different parent Contexts");
            }
        }
        zri zriVar = e().c;
        zriVar.aw = new zrd(zriVar, i);
        ((Optional) zriVar.ak.b()).ifPresent(new zmi(zriVar, 18));
        zriVar.L();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zrb e = e();
        zri zriVar = e.c;
        ((Optional) zriVar.ak.b()).ifPresent(new zmi(zriVar, 16));
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    public ComposeMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComposeMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ComposeMessageView(akkq akkqVar) {
        super(akkqVar);
        f();
    }
}
