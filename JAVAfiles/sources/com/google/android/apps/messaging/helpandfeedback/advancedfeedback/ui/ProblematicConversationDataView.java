package com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui;

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
import defpackage.kuc;
import defpackage.kud;
import defpackage.kui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProblematicConversationDataView extends kui implements akkh<kuc> {
    private kuc g;
    private Context h;

    @Deprecated
    public ProblematicConversationDataView(Context context) {
        super(context);
        i();
    }

    private final void i() {
        if (this.g == null) {
            try {
                this.g = ((kud) aS()).p();
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
        return kuc.class;
    }

    @Override // defpackage.akkh
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final kuc E() {
        kuc kucVar = this.g;
        if (kucVar != null) {
            return kucVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.h;
            if (context == null) {
                this.h = o;
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
        i();
    }

    public ProblematicConversationDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProblematicConversationDataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ProblematicConversationDataView(akkq akkqVar) {
        super(akkqVar);
        i();
    }
}
