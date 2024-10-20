package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zro extends FrameLayout implements apxr {
    private apxm a;
    private boolean b;

    zro(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void i() {
        if (!this.b) {
            this.b = true;
            AudioButtonView audioButtonView = (AudioButtonView) this;
            kqs kqsVar = (kqs) aS();
            audioButtonView.f = (xnv) kqsVar.a.bV.b();
            audioButtonView.w = (yyt) kqsVar.a.us.b();
            audioButtonView.g = (zsg) kqsVar.h.b();
            audioButtonView.h = (ngv) kqsVar.i.b();
            audioButtonView.i = kqsVar.a.z();
            audioButtonView.j = (anen) kqsVar.a.DD.b();
            audioButtonView.k = (anen) kqsVar.a.z.b();
            audioButtonView.l = (aneo) kqsVar.a.m.b();
            audioButtonView.m = kqsVar.a.bU;
            audioButtonView.n = kqsVar.J.f;
            audioButtonView.o = (mcu) kqsVar.j.b();
            audioButtonView.p = (mcx) kqsVar.k.b();
            audioButtonView.q = (abbu) kqsVar.a.yF.b();
            audioButtonView.r = (rtb) kqsVar.a.eb.b();
            audioButtonView.s = (mci) kqsVar.a.a.cq.b();
            krv krvVar = kqsVar.a;
            audioButtonView.t = krvVar.ur;
            audioButtonView.u = krvVar.at;
        }
    }

    public zro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    zro(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    zro(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}
