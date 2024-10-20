package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class iwb extends ijy<Optional<Boolean>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwb(ixd ixdVar) {
        super("RCS support status");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$18", "onNewData", 2729, "ConversationFragmentPeer.java")).t("ConversationFragment: onNewData RCS supported data: %s", optional);
        optional.ifPresent(new Consumer() { // from class: iwa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void q(Object obj2) {
                iwb iwbVar = iwb.this;
                ((rrl) iwbVar.a.ca.a()).j = ((Boolean) obj2).booleanValue();
                iwbVar.a.ag();
                alvw d2 = ixd.a.d();
                d2.X(alwp.a, "Bugle");
                alvg alvgVar2 = (alvg) d2;
                alvgVar2.X(ydl.p, iwbVar.a.L);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$18", "onNewData", 2737, "ConversationFragmentPeer.java")).q("ConversationFragment: Updating Magic Compose visibility on RCS support status new data");
                iwbVar.a.aI();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
