package com.google.android.apps.messaging.cloudstore.media;

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
import defpackage.ihw;
import defpackage.ihx;
import defpackage.iic;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CmsBrokenMediaAttachmentView extends iic implements akkh<ihw> {
    private ihw a;
    private Context b;

    @Deprecated
    public CmsBrokenMediaAttachmentView(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                this.a = ((ihx) aS()).b();
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
        return ihw.class;
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ihw E() {
        ihw ihwVar = this.a;
        if (ihwVar != null) {
            return ihwVar;
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
        d();
    }

    public CmsBrokenMediaAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CmsBrokenMediaAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CmsBrokenMediaAttachmentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public CmsBrokenMediaAttachmentView(akkq akkqVar) {
        super(akkqVar);
        d();
    }
}
