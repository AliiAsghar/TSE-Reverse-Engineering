package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivp implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, android.view.MenuItem] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = 2;
        switch (this.b) {
            case 0:
                ((lyp) this.a).a();
                ((lyn) obj).f();
                return;
            case 1:
                ((ixd) this.a).cI.d();
                return;
            case 2:
                ila ilaVar = (ila) obj;
                rre rreVar = new rre(ilaVar.e().E().s());
                Object obj2 = this.a;
                ixd ixdVar = (ixd) obj2;
                ixdVar.cl = rreVar;
                ilaVar.e().addOnLayoutChangeListener(new aksg(ixdVar.aC, new fyc(obj2, 4), 0));
                ixdVar.ar();
                return;
            case 3:
                ((inn) obj).d(((ixd) this.a).bU);
                return;
            case 4:
                Object obj3 = this.a;
                ((ixd) obj3).S(new ivc(obj3, i), new ivc(obj3, 3));
                return;
            case 5:
                alvi alviVar = ixd.a;
                ?? r0 = this.a;
                r0.contains(lqj.a);
                r0.contains(lqj.b);
                r0.contains(lqj.c);
                r0.contains(lqj.d);
                r0.contains(lqj.g);
                ((jca) obj).c();
                return;
            case 6:
                View view = ((ila) obj).b().Q;
                view.getClass();
                ((ixd) this.a).aK(view.getHeight());
                return;
            case 7:
                this.a.setIcon(((Integer) obj).intValue());
                return;
            case 8:
                ((ixd) this.a).aK(((ComposeMessageView) obj).getHeight());
                return;
            case 9:
                ((ixd) this.a).cr.setOnApplyWindowInsetsListener(new ivf(i));
                return;
            case 10:
                alvi alviVar2 = ixd.a;
                ((ComposeMessageView) obj).E().J((Bundle) this.a);
                return;
            case 11:
                View view2 = ((ila) obj).b().Q;
                view2.getClass();
                ((ixd) this.a).aK(view2.getHeight());
                return;
            case 12:
                ((ixd) this.a).aK(((ComposeMessageView) obj).getHeight());
                return;
            case 13:
                View view3 = ((ila) obj).b().Q;
                view3.getClass();
                ((ixd) this.a).aK(view3.getHeight());
                return;
            case 14:
                zrb E = ((ComposeMessageView) obj).E();
                ((aaev) this.a).a();
                E.Z();
                return;
            case 15:
                ((ixd) this.a).ak((ammc) obj);
                return;
            case 16:
                ammc ammcVar = (ammc) obj;
                if (ammcVar != null) {
                    ixd ixdVar2 = (ixd) this.a;
                    ixdVar2.au = ammcVar.i;
                    alvw d = ixd.a.d();
                    d.X(alwp.a, "Bugle");
                    alvg alvgVar = (alvg) d;
                    alvgVar.X(ydl.p, ixdVar2.L);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "updateParticipantSupportCarrierVideoCall", 4790, "ConversationFragmentPeer.java")).t("ConversationFragment: Participant support carrier video call: %s", Boolean.valueOf(ixdVar2.au));
                    return;
                }
                return;
            case 17:
                iwp iwpVar = (iwp) this.a;
                ixd ixdVar3 = iwpVar.b;
                ixdVar3.bP.getClass();
                ahlp ahlpVar = new ahlp(((aaeq) obj).a());
                ixd ixdVar4 = iwpVar.b;
                ixdVar3.ay.j(ahlpVar, new ahlp(ixdVar4.bP), ixdVar4.k);
                return;
            case 18:
                zxq zxqVar = (zxq) obj;
                zxk zxkVar = (zxk) this.a;
                if (zxkVar.d) {
                    zxqVar.c(zxkVar.c);
                    return;
                }
                return;
            case 19:
                ((zxq) obj).c(((zxk) this.a).c);
                return;
            default:
                ((ixd) ((qdq) this.a).a).bV.E().Q();
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
