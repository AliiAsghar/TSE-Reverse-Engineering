package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uvd {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/fcm/impl/SmsTickleHandler");
    public final wpp a;
    private final mbl c;
    private final Optional d;
    private final uvf e;

    public uvd(mbl mblVar, Optional optional, uvf uvfVar, wpp wppVar) {
        mblVar.getClass();
        optional.getClass();
        this.c = mblVar;
        this.d = optional;
        this.e = uvfVar;
        this.a = wppVar;
    }

    public final void a(aqht aqhtVar) {
        aqhs aqhsVar;
        aqhtVar.getClass();
        if (this.d.isEmpty()) {
            alvw i = b.i();
            i.X(alwp.a, "BugleSatellite");
            ((alvg) i.h("com/google/android/apps/messaging/shared/fcm/impl/SmsTickleHandler", "onTickleReceived", 29, "SmsTickleHandler.kt")).q("Ignore received sms tickle because TachyonReceiverManager is not present.");
            return;
        }
        this.c.c("Bugle.PhoneIdentity.FcmPush");
        aozy createBuilder = aqfn.a.createBuilder();
        asku b2 = asku.b(aqhtVar.e);
        if (b2 == null) {
            b2 = asku.UNRECOGNIZED;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqfn) createBuilder.b).b = b2.a();
        String str = aqhtVar.g;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        str.getClass();
        ((aqfn) apagVar).d = str;
        String str2 = aqhtVar.f;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aqfn aqfnVar = (aqfn) createBuilder.b;
        str2.getClass();
        aqfnVar.c = str2;
        apag s = createBuilder.s();
        s.getClass();
        uvf uvfVar = this.e;
        aqfn aqfnVar2 = (aqfn) s;
        if (aqhtVar.b == 7) {
            aqhsVar = (aqhs) aqhtVar.c;
        } else {
            aqhsVar = aqhs.a;
        }
        String str3 = aqhsVar.b;
        ult ultVar = new ult(this, 15);
        ult ultVar2 = new ult(this, 16);
        Object e = xct.a.e();
        e.getClass();
        boolean booleanValue = ((Boolean) e).booleanValue();
        Object e2 = xct.b.e();
        e2.getClass();
        boolean booleanValue2 = ((Boolean) e2).booleanValue();
        Object e3 = xct.c.e();
        e3.getClass();
        uvfVar.b(str3, aqfnVar2, ultVar, ultVar2, "Sms", true, false, booleanValue, booleanValue2, ((Boolean) e3).booleanValue());
    }
}
