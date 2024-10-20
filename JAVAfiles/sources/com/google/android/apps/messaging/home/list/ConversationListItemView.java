package com.google.android.apps.messaging.home.list;

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
import defpackage.albo;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.hht;
import defpackage.kxy;
import defpackage.kxz;
import defpackage.kyw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationListItemView extends kyw implements akkh<kxy> {
    private kxy d;
    private Context e;

    @Deprecated
    public ConversationListItemView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.d == null) {
            try {
                this.d = ((kxz) aS()).r();
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
        return kxy.class;
    }

    @Override // defpackage.akkh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kxy E() {
        kxy kxyVar = this.d;
        if (kxyVar != null) {
            return kxyVar;
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
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.e;
            if (context == null) {
                this.e = o;
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

    public ConversationListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConversationListItemView(akkq akkqVar) {
        super(akkqVar);
        e();
    }
}
