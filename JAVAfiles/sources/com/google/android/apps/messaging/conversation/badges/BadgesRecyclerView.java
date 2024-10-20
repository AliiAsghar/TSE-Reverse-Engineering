package com.google.android.apps.messaging.conversation.badges;

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
import defpackage.ija;
import defpackage.ijb;
import defpackage.ije;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BadgesRecyclerView extends ije implements akkh<ija> {
    private ija ab;
    private Context ac;

    @Deprecated
    public BadgesRecyclerView(Context context) {
        super(context);
        aP();
    }

    private final void aP() {
        if (this.ab == null) {
            try {
                this.ab = ((ijb) aS()).f();
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
        return ija.class;
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ija E() {
        ija ijaVar = this.ab;
        if (ijaVar != null) {
            return ijaVar;
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

    public BadgesRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BadgesRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BadgesRecyclerView(akkq akkqVar) {
        super(akkqVar);
        aP();
    }
}
