package defpackage;

import androidx.compose.ui.platform.ComposeView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zrf implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ zrf(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                aabp aabpVar = (aabp) obj;
                xze xzeVar = zri.a;
                if (aabpVar != null) {
                    aabpVar.o();
                    return;
                }
                return;
            case 1:
                xze xzeVar2 = zri.a;
                ((inn) obj).r(ins.C2O, true, true);
                return;
            case 2:
                xze xzeVar3 = zri.a;
                ((inn) obj).r(ins.IME, true, false);
                return;
            case 3:
                aabp aabpVar2 = (aabp) obj;
                xze xzeVar4 = zri.a;
                if (aabpVar2 != null) {
                    aabpVar2.y(2);
                    return;
                }
                return;
            case 4:
                xze xzeVar5 = zri.a;
                ((jcb) obj).c();
                return;
            case 5:
                xze xzeVar6 = zri.a;
                ((jca) obj).a();
                return;
            case 6:
                xze xzeVar7 = zri.a;
                ((inn) obj).r(ins.VOICE, false, true);
                return;
            case 7:
                xze xzeVar8 = zri.a;
                ((jcb) obj).a();
                return;
            case 8:
                xze xzeVar9 = zri.a;
                ((inn) obj).r(ins.EMOTIVE, false, true);
                return;
            case 9:
                aabp aabpVar3 = (aabp) obj;
                xze xzeVar10 = zri.a;
                if (aabpVar3 != null) {
                    aabpVar3.r(amqe.DRAFT_END_EMOJI_BUTTON);
                    return;
                }
                return;
            case 10:
                ((lyv) obj).c();
                return;
            case 11:
                xze xzeVar11 = zri.a;
                ((inn) obj).r(ins.C2O, true, false);
                return;
            case 12:
                aabp aabpVar4 = (aabp) obj;
                xze xzeVar12 = zri.a;
                if (aabpVar4 != null) {
                    aabpVar4.o();
                    return;
                }
                return;
            case 13:
                xze xzeVar13 = zri.a;
                ((ComposeView) obj).setVisibility(8);
                return;
            case 14:
                xze xzeVar14 = zri.a;
                ((inn) obj).r(ins.IME, true, false);
                return;
            case 15:
                aabp aabpVar5 = (aabp) obj;
                xze xzeVar15 = zri.a;
                if (aabpVar5 != null) {
                    aabpVar5.j.h(aabpVar5.q);
                    aabpVar5.j.g(aabpVar5.r);
                    return;
                }
                return;
            case 16:
                ((aaex) obj).c();
                return;
            case 17:
                inn innVar = (inn) obj;
                xze xzeVar16 = zri.a;
                if (innVar.c() == ins.MAGIC_COMPOSE) {
                    innVar.r(ins.IME, true, false);
                    return;
                }
                return;
            case 18:
                ((jca) obj).b();
                return;
            case 19:
                ((aaew) obj).a().k(qiu.b(), andi.a);
                return;
            default:
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
