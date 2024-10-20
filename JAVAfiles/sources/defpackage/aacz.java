package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aacz extends FrameLayout implements apxr {
    private apxm a;
    private boolean b;

    aacz(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        G();
    }

    @Override // defpackage.apxr
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void G() {
        if (!this.b) {
            this.b = true;
            ConversationMessageView conversationMessageView = (ConversationMessageView) this;
            kqs kqsVar = (kqs) aS();
            conversationMessageView.w = (mce) kqsVar.a.bX.b();
            conversationMessageView.x = (yai) kqsVar.a.a.ey.b();
            conversationMessageView.V = (xvc) kqsVar.a.dW.b();
            conversationMessageView.y = (ytk) kqsVar.a.oj.b();
            krv krvVar = kqsVar.a;
            apya apyaVar = krvVar.n;
            apya apyaVar2 = krvVar.pg;
            apya apyaVar3 = krvVar.dU;
            apya apyaVar4 = krvVar.ph;
            apya apyaVar5 = krvVar.oj;
            apya apyaVar6 = kqsVar.m;
            apya apyaVar7 = krvVar.a.fn;
            apya apyaVar8 = krvVar.m;
            apya apyaVar9 = krvVar.ef;
            kqj kqjVar = kqsVar.J;
            apya apyaVar10 = kqjVar.p;
            apya apyaVar11 = krvVar.gD;
            apya apyaVar12 = krvVar.jC;
            apya apyaVar13 = krvVar.ee;
            apya a = apyb.a(kqjVar.ao);
            apya apyaVar14 = kqsVar.c;
            krv krvVar2 = kqsVar.a;
            conversationMessageView.z = new aacq(apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, apyaVar10, apyaVar11, apyaVar12, apyaVar13, a, apyaVar14, krvVar2.os, kqsVar.J.aQ, kqsVar.n, kqsVar.o, krvVar2.a.er, krvVar2.xy, kqsVar.p, krvVar2.bV, kqsVar.q);
            conversationMessageView.A = (ksi) kqsVar.a.ft.b();
            conversationMessageView.B = (abbj) kqsVar.m.b();
            conversationMessageView.C = (zpt) kqsVar.a.ef.b();
            conversationMessageView.af = (vid) kqsVar.a.kO.b();
            conversationMessageView.W = (iyh) kqsVar.J.p.b();
            conversationMessageView.D = kqsVar.a.dr;
            conversationMessageView.ag = (aohs) kqsVar.J.aG.b();
            conversationMessageView.E = Optional.empty();
            conversationMessageView.F = apxv.a(kqsVar.J.ao);
            conversationMessageView.G = kqsVar.c;
            conversationMessageView.H = kqsVar.r;
            conversationMessageView.ae = new zjm(Optional.empty());
            conversationMessageView.aa = new zhg(kqsVar.s, (byte[]) null);
            Stream map = Collection.EL.stream(altc.a.entrySet()).sorted(Comparator.CC.comparing(new idc(5))).map(new idc(6));
            int i = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            alogVar.getClass();
            conversationMessageView.I = alogVar;
            conversationMessageView.J = kqsVar.a.gC();
            conversationMessageView.K = kqsVar.t;
            krv krvVar3 = kqsVar.a;
            conversationMessageView.L = krvVar3.pR;
            conversationMessageView.M = apxv.a(krvVar3.jC);
            conversationMessageView.N = kqsVar.a.ih;
            conversationMessageView.O = apxv.a(kqsVar.v);
            krv krvVar4 = kqsVar.a;
            conversationMessageView.P = krvVar4.dq;
            conversationMessageView.Q = krvVar4.m;
            conversationMessageView.R = kqsVar.w;
            conversationMessageView.S = kqsVar.x;
            conversationMessageView.T = krvVar4.ig;
            conversationMessageView.U = krvVar4.fd;
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    public aacz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        G();
    }

    aacz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        G();
    }

    aacz(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        G();
    }
}
