package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivg implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ivg(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                alvi alviVar = ixd.a;
                ((ComposeMessageView) obj).E().G();
                return;
            case 1:
                aabp aabpVar = (aabp) obj;
                alvi alviVar2 = ixd.a;
                if (aabpVar != null) {
                    aabe aabeVar = aabpVar.c;
                    if (true != aabeVar.c) {
                        i = 2;
                    } else {
                        i = 4;
                    }
                    aabeVar.l.x(i | 16);
                    if (!aabeVar.c) {
                        if (aabeVar.d || aabeVar.f.m) {
                            aabeVar.d = true;
                            aabeVar.f.m(false);
                            aabeVar.b();
                            aabeVar.d = false;
                            if (aabeVar.i || aabeVar.f.n) {
                                aabeVar.f.n(false);
                                aabeVar.f.q();
                                aabeVar.i = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                alvi alviVar3 = ixd.a;
                composeMessageView.E().C(false);
                composeMessageView.setVisibility(8);
                return;
            case 3:
                alvi alviVar4 = ixd.a;
                ((ila) obj).f(true);
                return;
            case 4:
                alvi alviVar5 = ixd.a;
                ((ComposeMessageView) obj).E().I(true);
                return;
            case 5:
                alvi alviVar6 = ixd.a;
                ((ila) obj).e().setVisibility(0);
                return;
            case 6:
                alvi alviVar7 = ixd.a;
                ((ComposeMessageView) obj).setVisibility(0);
                return;
            case 7:
                ComposeMessageView composeMessageView2 = (ComposeMessageView) obj;
                alvi alviVar8 = ixd.a;
                if (composeMessageView2 != null) {
                    composeMessageView2.E().R();
                    return;
                }
                return;
            case 8:
                alvi alviVar9 = ixd.a;
                ((jcb) obj).b();
                return;
            case 9:
                alvi alviVar10 = ixd.a;
                ((inn) obj).r(ins.MAGIC_COMPOSE, true, true);
                return;
            case 10:
                alvi alviVar11 = ixd.a;
                return;
            case 11:
                aabp aabpVar2 = (aabp) obj;
                alvi alviVar12 = ixd.a;
                if (aabpVar2 != null) {
                    aabe aabeVar2 = aabpVar2.c;
                    aabeVar2.c = aabeVar2.b.b;
                    aabp aabpVar3 = aabeVar2.f;
                    aabeVar2.i = aabpVar3.n;
                    aabeVar2.d = aabpVar3.m;
                    return;
                }
                return;
            case 12:
                alvi alviVar13 = ixd.a;
                ((lyy) obj).b();
                return;
            case 13:
                alvi alviVar14 = ixd.a;
                ((inn) obj).h(true);
                return;
            case 14:
                alvi alviVar15 = ixd.a;
                ((woj) obj).h();
                return;
            case 15:
                aabp aabpVar4 = (aabp) obj;
                alvi alviVar16 = ixd.a;
                if (aabpVar4 != null) {
                    aabpVar4.i();
                    return;
                }
                return;
            case 16:
                ((lyn) obj).a();
                return;
            case 17:
                ((ila) obj).g();
                return;
            case 18:
                alvi alviVar17 = ixd.a;
                ((ComposeMessageView) obj).E().F();
                return;
            case 19:
                alvi alviVar18 = ixd.a;
                ((ComposeMessageView) obj).E().c.E();
                return;
            default:
                alvi alviVar19 = ixd.a;
                ((inn) obj).r(ins.MAGIC_COMPOSE, true, true);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
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
