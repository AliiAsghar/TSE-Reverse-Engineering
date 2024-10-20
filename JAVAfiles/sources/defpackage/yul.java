package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yul {
    public static final alnr a;
    public static final xze b;
    public static final uuf c;
    private static final uuf i;
    public final xnv d;
    public final uvi e;
    public final anen f;
    public final aiwu g;
    public final ansy h;
    private final wul j;
    private volatile boolean k = false;

    static {
        anmh anmhVar = anmh.C11N;
        yua yuaVar = yua.C11N;
        anmh anmhVar2 = anmh.RCS;
        yua yuaVar2 = yua.RCS;
        anmh anmhVar3 = anmh.C11N_RCS;
        yua yuaVar3 = yua.C11N_RCS;
        albo.v(anmhVar, yuaVar);
        albo.v(anmhVar2, yuaVar2);
        albo.v(anmhVar3, yuaVar3);
        a = new alsw(new Object[]{anmhVar, yuaVar, anmhVar2, yuaVar2, anmhVar3, yuaVar3}, 3);
        b = xze.g("Bugle", "VerifiedSmsDataService");
        i = uuh.i(uuh.b, "verified_sms_enable_clearing_registration_data", true);
        c = uuh.i(uuh.b, "enable_vsms_keypair_consistency_read_check", false);
    }

    public yul(armf armfVar, aiwu aiwuVar, xnv xnvVar, mbl mblVar, ansy ansyVar, uvi uviVar, anen anenVar) {
        this.g = aiwuVar;
        this.d = xnvVar;
        this.h = ansyVar;
        znj znjVar = (znj) armfVar.b();
        aiwl a2 = wus.a();
        a2.i(wuk.VERIFIED_SMS);
        a2.k(yuf.a);
        a2.j(new yuj(aiwuVar, mblVar, 0));
        this.j = znjVar.ab(a2.f());
        this.e = uviVar;
        this.f = anenVar;
    }

    public static yua a(yub yubVar) {
        if (yubVar.b.size() == 0) {
            b.q("Registration type requested, but no keys exist.");
            return yua.UNKNOWN_TYPE;
        }
        yua yuaVar = yua.UNKNOWN_TYPE;
        yua b2 = yua.b(yubVar.f);
        if (b2 == null) {
            b2 = yua.UNRECOGNIZED;
        }
        if (!yuaVar.equals(b2)) {
            xyo c2 = b.c();
            yua b3 = yua.b(yubVar.f);
            if (b3 == null) {
                b3 = yua.UNRECOGNIZED;
            }
            c2.z("Registration type set.", b3);
            c2.q();
            yua b4 = yua.b(yubVar.f);
            if (b4 == null) {
                return yua.UNRECOGNIZED;
            }
            return b4;
        }
        if (!yubVar.d.G() && yubVar.e.isEmpty()) {
            b.o("Registration type not set, but only RCS token exists. Inferring RCS registration.");
            return yua.RCS;
        }
        if (!yubVar.e.isEmpty() && yubVar.d.G()) {
            b.o("Registration type not set, but only C11N token exists. Inferring C11N registration.");
            return yua.C11N;
        }
        b.q("Registration type requested, but 1) No registration type is set and 2) The registration type cannot be inferred.");
        return yua.NOT_YET_KNOWN;
    }

    public static Collection j(Collection collection, Object obj) {
        alms almsVar = new alms(5);
        almsVar.addAll(collection);
        almsVar.add(obj);
        return almsVar;
    }

    public final akul b(String str, String str2) {
        return i(new uzn(str, str2, 20, null));
    }

    public final akul c() {
        if (!((Boolean) i.e()).booleanValue()) {
            b.m("Attempted to cleanup Verified SMS registration data, but flag is off. You're not allowed to do this.");
            return aktp.ag(null);
        }
        b.q("Resetting all Verified SMS registration data");
        return i(new yug(0));
    }

    public final akul d() {
        return e().h(new yts(5), andi.a);
    }

    public final akul e() {
        return this.j.h().f(Exception.class, new ytu(this, 5), this.f);
    }

    public final akul f(String str) {
        return e().h(new yez(str, 15), andi.a);
    }

    public final akul g() {
        return e().h(new yts(6), andi.a);
    }

    public final akul h(long j) {
        return i(new rum(j, 11));
    }

    public final akul i(Function function) {
        int i2 = 16;
        lce lceVar = new lce(function, this.d.f().toEpochMilli(), i2);
        return this.j.j(new yez(lceVar, i2)).i(new yui(this, lceVar, 0), andi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aozy k(yuf yufVar, String str, yum yumVar, yua yuaVar) {
        yub yubVar = yub.a;
        apbo apboVar = yufVar.e;
        if (apboVar.containsKey(str)) {
            yubVar = (yub) apboVar.get(str);
        }
        aozy builder = yubVar.toBuilder();
        xze xzeVar = b;
        xzeVar.o("Setting registration time.");
        builder.ai(yumVar);
        long epochMilli = this.d.f().toEpochMilli();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((yub) builder.b).c = epochMilli;
        xyo c2 = xzeVar.c();
        c2.z("Setting registration type", yuaVar);
        c2.q();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((yub) builder.b).f = yuaVar.a();
        aozy builder2 = yufVar.toBuilder();
        while (true) {
            if (((yub) builder.b).b.size() <= 2) {
                break;
            }
            yum yumVar2 = (yum) ((yub) builder.b).b.get(0);
            if (yumVar2.equals(yumVar)) {
                b.q("Attempting to remove fresh key pair? Something is wrong with the order. Cleaning and now fresh pair is the only pair stored.");
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((yub) builder.b).b = yub.emptyProtobufList();
                builder.ai(yumVar);
                yty ytyVar = ((yuf) builder2.b).j;
                if (ytyVar == null) {
                    ytyVar = yty.a;
                }
                aozy builder3 = ytyVar.toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                ((yty) builder3.b).c = true;
                yty ytyVar2 = (yty) builder3.s();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                yuf yufVar2 = (yuf) builder2.b;
                ytyVar2.getClass();
                yufVar2.j = ytyVar2;
                yufVar2.b |= 2;
            } else {
                xze xzeVar2 = b;
                xzeVar2.o("Removing a deprecated pair of keys.");
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                yub yubVar2 = (yub) builder.b;
                yubVar2.a();
                yubVar2.b.remove(0);
                if (yufVar.h) {
                    xzeVar2.o("Populating diagnostic info with deprecated key pair.");
                    yty ytyVar3 = ((yuf) builder2.b).j;
                    if (ytyVar3 == null) {
                        ytyVar3 = yty.a;
                    }
                    aozy builder4 = ((ytz) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(ytyVar3.f), str, ytz.a)).toBuilder();
                    Collection j = j(DesugarCollections.unmodifiableList(((ytz) builder4.b).b), yumVar2);
                    if (!builder4.b.isMutable()) {
                        builder4.u();
                    }
                    ((ytz) builder4.b).b = ytz.emptyProtobufList();
                    if (!builder4.b.isMutable()) {
                        builder4.u();
                    }
                    ytz ytzVar = (ytz) builder4.b;
                    apax apaxVar = ytzVar.b;
                    if (!apaxVar.c()) {
                        ytzVar.b = apag.mutableCopy(apaxVar);
                    }
                    aoyj.addAll(j, ytzVar.b);
                    yty ytyVar4 = ((yuf) builder2.b).j;
                    if (ytyVar4 == null) {
                        ytyVar4 = yty.a;
                    }
                    aozy builder5 = ytyVar4.toBuilder();
                    ytz ytzVar2 = (ytz) builder4.s();
                    ytzVar2.getClass();
                    if (!builder5.b.isMutable()) {
                        builder5.u();
                    }
                    yty ytyVar5 = (yty) builder5.b;
                    apbo apboVar2 = ytyVar5.f;
                    if (!apboVar2.b) {
                        ytyVar5.f = apboVar2.a();
                    }
                    ytyVar5.f.put(str, ytzVar2);
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    yuf yufVar3 = (yuf) builder2.b;
                    yty ytyVar6 = (yty) builder5.s();
                    ytyVar6.getClass();
                    yufVar3.j = ytyVar6;
                    yufVar3.b |= 2;
                }
            }
        }
        builder2.am(str, (yub) builder.s());
        return builder2;
    }
}
