package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xew {
    public static final alwo a = alwo.o("BugleTachygram");
    private static final alog j = alog.s(qef.OK, qef.FAILED_PERMANENTLY);
    public final armf b;
    public final armf c;
    public final anen d;
    public final qei e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final qco i;

    public xew(qco qcoVar, armf armfVar, armf armfVar2, armf armfVar3, anen anenVar, armf armfVar4, aqfn aqfnVar, armf armfVar5) {
        this.i = qcoVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = anenVar;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.e = (qei) new xei().m().fu(aqfnVar);
        albo.U(!r1.equals(qei.a), "SelfChatEndpoint missing");
    }

    public static alog b(Iterable iterable) {
        alob alobVar = new alob();
        algf m = new xei().m();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aqfn aqfnVar = (aqfn) it.next();
            asku b = asku.b(aqfnVar.b);
            if (b == null) {
                b = asku.UNRECOGNIZED;
            }
            albo.U(!b.equals(asku.GROUP_ID), "A ChatEndpoint participant of a group should not be of type GROUP_ID.");
            alobVar.h((qei) m.fu(aqfnVar));
        }
        return alobVar.g();
    }

    public static void c(qeg qegVar, String str) {
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        albo.V(j.contains(b), "IncomingChatApi returned an unexpected status: %s", b.f);
        qef qefVar = qef.FAILED_PERMANENTLY;
        qef b2 = qef.b(qegVar.c);
        if (b2 == null) {
            b2 = qef.UNKNOWN_STATUS;
        }
        if (qefVar.equals(b2)) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupHandlerChapiAdapter", "checkIncomingChatApiStatus", 408, "TachygramGroupHandlerChapiAdapter.java")).t("Chat API failed to process GroupEvent for %s", str);
        }
    }

    public static /* synthetic */ void d(aqfn aqfnVar) {
        asku b = asku.b(aqfnVar.b);
        if (b == null) {
            b = asku.UNRECOGNIZED;
        }
        albo.U(!b.equals(asku.GROUP_ID), "Updater ID should not be of type GROUP_ID.");
    }

    public final akul a(qey qeyVar, String str) {
        return this.i.d(qeyVar).h(new xeu(str, 0), this.d);
    }

    public final aozy e(String str, Optional optional, Instant instant) {
        aozy createBuilder = qey.c.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qey qeyVar = (qey) createBuilder.b;
        str.getClass();
        qeyVar.d |= 1;
        qeyVar.e = str;
        optional.ifPresent(new vxb(createBuilder, instant, 17, null));
        qei qeiVar = this.e;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qey qeyVar2 = (qey) createBuilder.b;
        qeiVar.getClass();
        qeyVar2.q = qeiVar;
        qeyVar2.d |= 256;
        return createBuilder;
    }
}
