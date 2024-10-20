package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rzc {
    public static final /* synthetic */ int b = 0;
    private static final alwo c = alwo.o("BugleNotifications");
    public final iew a;
    private final armf d;

    public rzc(iew iewVar, armf armfVar) {
        this.a = iewVar;
        this.d = armfVar;
    }

    public final void a(MessageIdType messageIdType) {
        ((alwl) c.m().h("com/google/android/apps/messaging/shared/datamodel/data/util/RequestLinkPreviewScheduler", "requestLinkPreview", 35, "RequestLinkPreviewScheduler.java")).q("running requestLinkPreview after commit in silo execution");
        agnq agnqVar = (agnq) this.d.b();
        rxa rxaVar = new rxa(5);
        String valueOf = String.valueOf(messageIdType.toString());
        agnqVar.i(rxaVar, valueOf.concat("logMessageSentOrReceived"), new ryv(this, messageIdType, 2, null), agnt.TXN_1);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [armf, java.lang.Object] */
    public final void b(MessageIdType messageIdType) {
        aozy createBuilder = umo.a.createBuilder();
        String a = messageIdType.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        umo umoVar = (umo) apagVar;
        a.getClass();
        umoVar.b |= 1;
        umoVar.c = a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        iew iewVar = this.a;
        umo umoVar2 = (umo) createBuilder.b;
        umoVar2.d = 2;
        umoVar2.b = 2 | umoVar2.b;
        ((uof) iewVar.a.b()).b(upk.a("request_link_preview", (umo) createBuilder.s()));
    }
}
