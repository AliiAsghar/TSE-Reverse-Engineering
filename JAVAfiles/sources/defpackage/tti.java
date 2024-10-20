package defpackage;

import android.telephony.ims.RcsContactUceCapability;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import j$.util.Optional;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tti implements algk {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ tti(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.c) {
            case 0:
                return ((NativeBaseCrypto) obj).deleteOldOneTimeKeys((Scope) this.b, this.a);
            case 1:
                ((AtomicLong) ((kkg) this.b).a).set(this.a);
                return obj;
            case 2:
                aozy builder = ((woo) obj).toBuilder();
                Object obj2 = this.b;
                obj2.getClass();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                woo wooVar = (woo) builder.b;
                apbo apboVar = wooVar.c;
                if (!apboVar.b) {
                    wooVar.c = apboVar.a();
                }
                long j = this.a;
                wooVar.c.put(obj2, Long.valueOf(j));
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                woo wooVar2 = (woo) builder.b;
                wooVar2.b |= 1;
                wooVar2.d = j;
                return (woo) builder.s();
            case 3:
                return Boolean.valueOf(((wor) this.b).a((Long) obj, this.a));
            case 4:
                return Boolean.valueOf(((wor) this.b).a((Long) obj, this.a));
            case 5:
                Long l = (Long) obj;
                xyo c = abch.b.c();
                c.H("Verified SMS is enabled.");
                c.q();
                if (l != null) {
                    long j2 = this.a;
                    if (l.longValue() != j2) {
                        abch abchVar = (abch) this.b;
                        ((uki) abchVar.i.b()).a(abchVar.k, j2);
                        return null;
                    }
                }
                xyo c2 = abch.b.c();
                c2.H("Not enqueuing Verified SMS key rotation work since interval frequency is unchanged.");
                c2.z("interval frequency", l);
                c2.q();
                return null;
            case 6:
                long epochMilli = ((abcu) this.b).f.f().toEpochMilli() - this.a;
                abcu.a.p("RebuildShortcuts FULL time: " + epochMilli + " ms");
                return null;
            case 7:
                return ((acnf) this.b).b((RcsContactUceCapability) obj, this.a);
            case 8:
                return ((acnf) this.b).b((RcsContactUceCapability) obj, this.a);
            case 9:
                advr.i((TimeoutException) obj, "Timed out connecting to PCSCF in %d ms", Long.valueOf(this.a));
                ((adhf) this.b).b.q(18);
                return Optional.empty();
            case 10:
                aior aiorVar = (aior) obj;
                Object[] objArr = {aiorVar, Long.valueOf(this.a)};
                adhf adhfVar = (adhf) this.b;
                advr.l(adhfVar.b.m, "discoverSipServerWithNetworkInterface: connected SIP transport[%s] to PCSCF within %d ms, sending MSG_CONNECTED_TO_SERVER", objArr);
                adhfVar.b.s(13, aiorVar);
                return Optional.of(aiorVar);
            default:
                ajzl ajzlVar = (ajzl) obj;
                int i = ajzlVar.b;
                int i2 = i & 1;
                long j3 = this.a;
                if (i2 != 0 || (i & 2) == 0 || ajzlVar.d <= j3) {
                    aozy builder2 = ajzlVar.toBuilder();
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    Object obj3 = this.b;
                    apag apagVar = builder2.b;
                    ajzl ajzlVar2 = (ajzl) apagVar;
                    ajzlVar2.b |= 1;
                    ajzlVar2.c = j3;
                    if (!apagVar.isMutable()) {
                        builder2.u();
                    }
                    int i3 = ((ajzk) obj3).b;
                    apag apagVar2 = builder2.b;
                    ajzl ajzlVar3 = (ajzl) apagVar2;
                    ajzlVar3.b |= 4;
                    ajzlVar3.e = i3;
                    if (!apagVar2.isMutable()) {
                        builder2.u();
                    }
                    ajzl ajzlVar4 = (ajzl) builder2.b;
                    ajzlVar4.b &= -3;
                    ajzlVar4.d = 0L;
                    return (ajzl) builder2.s();
                }
                return ajzlVar;
        }
    }
}
