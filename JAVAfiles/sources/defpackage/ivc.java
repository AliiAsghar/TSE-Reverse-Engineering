package defpackage;

import android.content.res.Configuration;
import android.widget.EditText;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.Collections;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivc implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [inn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [inn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [inn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [inn, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = 2;
        switch (this.b) {
            case 0:
                alvi alviVar = ixd.a;
                this.a.d(((ComposeMessageView) obj).E());
                return;
            case 1:
                alvi alviVar2 = ixd.a;
                this.a.d(((ila) obj).e().E());
                return;
            case 2:
                ila ilaVar = (ila) obj;
                if (ilaVar != null) {
                    abdc.b(((ixd) this.a).q(), ilaVar.e());
                    return;
                }
                return;
            case 3:
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                if (composeMessageView != null) {
                    abdc.b(((ixd) this.a).q(), composeMessageView);
                    return;
                }
                return;
            case 4:
                ((lyl) this.a).a();
                ((lyn) obj).d();
                return;
            case 5:
                if (!((ila) obj).d().Z()) {
                    ((ibi) ((ixd) this.a).bf.b()).a(3);
                    return;
                }
                return;
            case 6:
                if (!((rsr) ((ComposeMessageView) obj).E().s().a()).Z()) {
                    ((ibi) ((ixd) this.a).bf.b()).a(3);
                    return;
                }
                return;
            case 7:
                inn innVar = (inn) obj;
                ixd ixdVar = (ixd) this.a;
                EditText d = ixdVar.d();
                if (d != null) {
                    d.clearFocus();
                }
                ixdVar.Q(new ivh(innVar, 15), new ivh(innVar, 16));
                return;
            case 8:
                ((ComposeMessageView) obj).removeOnLayoutChangeListener(((ixd) this.a).cy);
                return;
            case 9:
                ila ilaVar2 = (ila) obj;
                MessageCoreData messageCoreData = ((ixd) this.a).bY;
                if (messageCoreData != null) {
                    ilaVar2.l(messageCoreData);
                    return;
                }
                return;
            case 10:
                ixd ixdVar2 = (ixd) this.a;
                imk imkVar = ixdVar2.bG;
                imkVar.getClass();
                imkVar.d(ixdVar2.bY, false);
                return;
            case 11:
                ((ila) obj).f(((ixd) this.a).cB.S());
                return;
            case 12:
                inn innVar2 = (inn) obj;
                ((ixd) this.a).Q(new ivc(innVar2, 19), new ivc(innVar2, 20));
                return;
            case 13:
                ((ComposeMessageView) obj).E().N(((rrl) ((ixd) this.a).ca.a()).c);
                return;
            case 14:
                aabp aabpVar = (aabp) obj;
                alvi alviVar3 = ixd.a;
                if (aabpVar != null) {
                    Object obj2 = this.a;
                    if (aabpVar.o && ((Configuration) obj2).orientation == 1) {
                        aabpVar.o = false;
                        aabpVar.b();
                    } else if (!aabpVar.o && ((Configuration) obj2).orientation == 2) {
                        aabpVar.o = true;
                        aabpVar.d();
                    }
                    aabpVar.i();
                    return;
                }
                return;
            case 15:
                ((inn) obj).h(false);
                ((ixd) this.a).Q(new ivn(3), new ivn(4));
                return;
            case 16:
                ((ixd) this.a).Q(null, new ivg(i));
                return;
            case 17:
                ((ComposeMessageView) obj).addOnLayoutChangeListener(((ixd) this.a).t());
                return;
            case 18:
                ((inn) obj).i(Collections.singletonList(this.a));
                return;
            case 19:
                alvi alviVar4 = ixd.a;
                this.a.d(((ila) obj).e().E());
                return;
            default:
                alvi alviVar5 = ixd.a;
                this.a.d(((ComposeMessageView) obj).E());
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
