package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class utr {
    public static final alwo a = alwo.o("BuglePhenotype");
    public static final alhr b = uuh.w("sms_permission_enable_add_sms_permission_check");
    public static final String[] c = {"ANDROID_MESSAGING", "ANDROID_MESSAGING_PRIMES", "BUGLE_COUNTERS", "CARRIER_SERVICES", "CLIENT_LOGGING_PROD", "EXPRESSION", "EXPRESSION_COUNTERS", "COMMS_MESSAGES_WEB", "BUGLE_SPAM", "MESSAGES"};
    public final alhr d;
    public final armf e;
    public final Context f;
    public final armf g;
    private final anen h;
    private final armf i;

    public utr(anen anenVar, apwt apwtVar, armf armfVar, armf armfVar2, Context context, armf armfVar3) {
        this.h = anenVar;
        this.d = albo.D(new uqw(apwtVar, 10));
        this.i = armfVar;
        this.e = armfVar2;
        this.f = context;
        this.g = armfVar3;
    }

    public static apbt a() {
        aozy createBuilder = amkq.a.createBuilder();
        int i = xyp.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amkq amkqVar = (amkq) apagVar;
        int i2 = i - 1;
        if (i != 0) {
            amkqVar.c = i2;
            amkqVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amkq amkqVar2 = (amkq) createBuilder.b;
            amkqVar2.b |= 2;
            amkqVar2.d = 683537993L;
            return createBuilder.s();
        }
        throw null;
    }

    public final void b() {
        utu utuVar = (utu) this.i.b();
        ((alwl) a.n().h("com/google/android/apps/messaging/shared/experiments/BuglePhenotypeHelper", "commitBuglePhenotypeAsync", 169, "BuglePhenotypeHelper.java")).q("Committing bugle phenotype.");
        utuVar.c(this.h, new uts(akto.a(new ult(this, 6)), 1));
    }
}
