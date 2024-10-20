package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xal extends arpw implements arqv {
    final /* synthetic */ xam a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xal(xam xamVar, String str, long j, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.e = i2;
        this.a = xamVar;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((xal) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((xal) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.e != 0) {
            aqil.P(obj);
            alvw g = xam.a.g();
            g.X(alwp.a, "BugleTelephony");
            alvg alvgVar = (alvg) g;
            alvgVar.V(10, TimeUnit.SECONDS);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 129, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Logging RCS Telephony persistence failure event to clearcut.");
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfqVar.getClass();
            alzz.n(amfp.TELEPHONY_PERSISTENCE_EVENT, amfqVar);
            aozy createBuilder = amnd.a.createBuilder();
            createBuilder.getClass();
            akec.at(yyb.aQ(this.b), createBuilder);
            long j = this.c;
            akec.au(yyb.aR(j), createBuilder);
            long b = xam.b();
            akec.as(yyb.aR(b), createBuilder);
            aozy createBuilder2 = amyj.a.createBuilder();
            createBuilder2.getClass();
            aozy createBuilder3 = amyk.a.createBuilder();
            createBuilder3.getClass();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            int i = this.d;
            apag apagVar = createBuilder3.b;
            amyk amykVar = (amyk) apagVar;
            amykVar.c = i - 1;
            boolean z = true;
            amykVar.b |= 1;
            if (j >= b) {
                z = false;
            }
            boolean z2 = z;
            if (!apagVar.isMutable()) {
                createBuilder3.u();
            }
            amyk amykVar2 = (amyk) createBuilder3.b;
            amykVar2.b |= 2;
            amykVar2.d = z2;
            apag s = createBuilder3.s();
            s.getClass();
            amyk amykVar3 = (amyk) s;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amyj amyjVar = (amyj) createBuilder2.b;
            amyjVar.c = amykVar3;
            amyjVar.b = 2;
            akec.ar(aktp.aE(createBuilder2), createBuilder);
            alzz.q(akec.aq(createBuilder), amfqVar);
            aozy builder = alzz.h(amfqVar).toBuilder();
            builder.getClass();
            try {
                this.a.a((amfq) builder);
            } catch (Exception e) {
                alvw i2 = xam.a.i();
                i2.X(alwp.a, "BugleTelephony");
                ((alvg) ((alvg) i2).g(e).h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 144, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Failed to log telephony file persist failure event to clearcut");
            }
            alvw g2 = xam.a.g();
            g2.X(alwp.a, "BugleTelephony");
            alvg alvgVar2 = (alvg) g2;
            alvgVar2.V(10, TimeUnit.SECONDS);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger$logFailureEvent$1", "invokeSuspend", 150, "RcsTelephonyFilePersistenceEventLogger.kt")).q("Successfully logged RCS Telephony persistence failure event to clearcut.");
            return arnb.a;
        }
        aqil.P(obj);
        int i3 = this.d;
        long j2 = this.c;
        String str = this.b;
        xam xamVar = this.a;
        qjh.l(xamVar.b, null, new xal(xamVar, str, j2, i3, null, 1, null), 3);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.e != 0) {
            return new xal(this.a, this.b, this.c, this.d, arpeVar, 1, null);
        }
        return new xal(this.a, this.b, this.c, this.d, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xal(xam xamVar, String str, long j, int i, arpe arpeVar, int i2, byte[] bArr) {
        super(2, arpeVar);
        this.e = i2;
        this.a = xamVar;
        this.b = str;
        this.c = j;
        this.d = i;
    }
}
