package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivn implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ivn(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                alvi alviVar = ixd.a;
                ((ila) obj).e().E().B();
                return;
            case 1:
                alvi alviVar2 = ixd.a;
                return;
            case 2:
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                alvi alviVar3 = ixd.a;
                composeMessageView.getClass();
                composeMessageView.E().B();
                return;
            case 3:
                alvi alviVar4 = ixd.a;
                ((ila) obj).e().setVisibility(8);
                return;
            case 4:
                alvi alviVar5 = ixd.a;
                ((ComposeMessageView) obj).setVisibility(8);
                return;
            case 5:
                inn innVar = (inn) obj;
                alvi alviVar6 = ixd.a;
                if (innVar.c() == ins.IME) {
                    innVar.h(true);
                    return;
                }
                return;
            case 6:
                alvi alviVar7 = ixd.a;
                ((aaeu) obj).b().k(qiu.b(), andi.a);
                return;
            case 7:
                alvi alviVar8 = ixd.a;
                ((jcb) obj).e();
                return;
            case 8:
                alvi alviVar9 = ixd.a;
                ((inn) obj).h(true);
                return;
            case 9:
                aabp aabpVar = (aabp) obj;
                alvi alviVar10 = ixd.a;
                if (aabpVar != null) {
                    aabpVar.e(true);
                    return;
                }
                return;
            case 10:
                alvi alviVar11 = ixd.a;
                ((ComposeMessageView) obj).E().E();
                return;
            case 11:
                alvi alviVar12 = ixd.a;
                ((ila) obj).e().E().Y();
                return;
            case 12:
                alvi alviVar13 = ixd.a;
                ((ComposeMessageView) obj).E().Y();
                return;
            case 13:
                alvi alviVar14 = ixd.a;
                return;
            case 14:
                ((ila) obj).e().E().T();
                return;
            case 15:
                ((ComposeMessageView) obj).E().T();
                return;
            case 16:
                ((vpb) obj).a();
                return;
            case 17:
                ComposeMessageView composeMessageView2 = (ComposeMessageView) obj;
                rsr rsrVar = (rsr) composeMessageView2.E().s().a();
                composeMessageView2.E().s().b();
                rsrVar.ai();
                return;
            case 18:
                ((aaes) obj).a();
                return;
            case 19:
                ((zxq) obj).c(((Float) zxq.b.e()).floatValue());
                return;
            default:
                ((ila) obj).e().E().Q();
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
