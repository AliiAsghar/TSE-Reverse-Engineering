package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivh implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [inn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [inn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        View view;
        int i = 1;
        Snackbar snackbar = null;
        byte b = 0;
        byte b2 = 0;
        int i2 = 0;
        switch (this.b) {
            case 0:
                alvi alviVar = ixd.a;
                ((ila) obj).e().E().K(((jal) this.a).a());
                return;
            case 1:
                ila ilaVar = (ila) obj;
                ilaVar.getClass();
                ilaVar.j(new rre(((ixd) this.a).ca));
                return;
            case 2:
                alvi alviVar2 = ixd.a;
                ((ComposeMessageView) obj).E().K(((jal) this.a).a());
                return;
            case 3:
                alvi alviVar3 = ixd.a;
                ((ila) obj).e().E().aa();
                return;
            case 4:
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                alvi alviVar4 = ixd.a;
                composeMessageView.getClass();
                composeMessageView.E().aa();
                return;
            case 5:
                ((ila) obj).k(((ixd) this.a).A());
                return;
            case 6:
                Object obj2 = this.a;
                ixd ixdVar = (ixd) obj2;
                View findViewById = ixdVar.bR.findViewById(R.id.message_compose_view_container_with_c2o);
                ixdVar.R(new ilf(obj2, findViewById, 11, b2 == true ? 1 : 0), new ilf(obj2, findViewById, 12, b == true ? 1 : 0));
                ixdVar.bV.setOnApplyWindowInsetsListener(new iwv(ixdVar, 0));
                ixdVar.bV.addOnLayoutChangeListener(new aksg(ixdVar.aC, new fyc(obj2, 3), 0));
                if (ixdVar.ca.g()) {
                    rrl rrlVar = (rrl) ixdVar.ca.a();
                    rsr a = ixdVar.U.a(rrlVar.c, rrlVar.s());
                    ixdVar.aZ.b = a;
                    ixdVar.bV.E().A(a, ixdVar.A());
                }
                ixdVar.bV.E().L(ixdVar.bE);
                return;
            case 7:
                aabp aabpVar = (aabp) obj;
                alvi alviVar5 = ixd.a;
                if (aabpVar != null) {
                    aabpVar.j((Bundle) this.a);
                    return;
                }
                return;
            case 8:
                mnd mndVar = (mnd) obj;
                ixd ixdVar2 = (ixd) this.a;
                ((rrl) ixdVar2.ca.a()).m = mndVar;
                ixdVar2.W();
                cg d = ixdVar2.M.G().d(R.id.input_manager_fragment);
                ikl iklVar = ((rrl) ixdVar2.ca.a()).b;
                View u = ixdVar2.u();
                if (d != null) {
                    view = d.Q;
                } else {
                    view = null;
                }
                hgj hgjVar = ixdVar2.cV;
                ConversationIdType conversationIdType = ixdVar2.L;
                iqs iqsVar = new iqs(iklVar.g, ixdVar2.J(), iklVar.d);
                if (hgjVar.a.containsKey(mndVar)) {
                    iqq iqqVar = (iqq) ((armf) hgjVar.a.get(mndVar)).b();
                    Snackbar q = Snackbar.q(u, iqqVar.b(), -2);
                    iqqVar.a().ifPresent(new iqp(q, conversationIdType, iqsVar, i2));
                    q.m(view);
                    snackbar = q;
                }
                ixdVar2.bJ = snackbar;
                Snackbar snackbar2 = ixdVar2.bJ;
                if (snackbar2 != null) {
                    snackbar2.i();
                    return;
                }
                throw new IllegalStateException(String.format("InputDisableSnackbarProvider not configured for disable mode %s", mndVar));
            case 9:
                inn innVar = (inn) obj;
                if (((ixd) this.a).bH) {
                    innVar.r(ins.IME, false, false);
                    return;
                }
                return;
            case 10:
                inn innVar2 = (inn) obj;
                ((ixd) this.a).Q(new ivc(innVar2, i), new ivc(innVar2, i2));
                return;
            case 11:
                ((ixd) this.a).ay.b((akbp) obj);
                return;
            case 12:
                ((lyf) this.a).a();
                ((lyn) obj).e();
                return;
            case 13:
                alvi alviVar6 = ixd.a;
                ((ComposeMessageView) obj).E().c.K = (Optional) this.a;
                return;
            case 14:
                alvi alviVar7 = ixd.a;
                ((abaq) this.a).a();
                ((abar) obj).a();
                return;
            case 15:
                alvi alviVar8 = ixd.a;
                this.a.o(((ila) obj).e().E());
                return;
            case 16:
                alvi alviVar9 = ixd.a;
                this.a.o(((ComposeMessageView) obj).E());
                return;
            case 17:
                ((aaet) this.a).a();
                ((aaeu) obj).c().k(qiu.b(), andi.a);
                return;
            case 18:
                alvi alviVar10 = ixd.a;
                ((lyk) this.a).a();
                ((wtg) obj).b();
                return;
            case 19:
                akfb a2 = ((aaeu) obj).a();
                ixd ixdVar3 = (ixd) this.a;
                ixdVar3.K(a2, new ivw(ixdVar3));
                return;
            default:
                ((ComposeMessageView) obj).addOnLayoutChangeListener(((ixd) this.a).t());
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
