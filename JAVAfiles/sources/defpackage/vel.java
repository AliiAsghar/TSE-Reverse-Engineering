package defpackage;

import com.android.vcard.VCardConfig;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vel {
    public static final xze a = xze.g("BugleProtoData", "TachyonPhoneDataService");
    public final wul b;
    public final anen c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final String g;
    private final Set h;
    private final armf i;

    public vel(znj znjVar, apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, anen anenVar, armf armfVar4, String str) {
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.i = armfVar4;
        this.g = str;
        this.c = anenVar;
        aiwl a2 = wus.a();
        a2.i(wuk.TACHYON_PHONE);
        a2.l(str);
        a2.k(vee.a);
        a2.h(new uzg(7));
        a2.g(true);
        this.b = znjVar.ab(a2.f());
        this.h = new CopyOnWriteArraySet((Collection) apwtVar.b());
    }

    public static amkk l(vec vecVar) {
        int ordinal = vecVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return amkk.UNKNOWN_PREKEY_STATE;
            }
            return amkk.LOW_PREKEYS;
        }
        return amkk.SUFFICIENT_PREKEYS;
    }

    public static amkl m(ved vedVar) {
        int ordinal = vedVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return amkl.UNKNOWN_TACHYON_STATE;
                }
                return amkl.REGISTERED_WITH_PREKEYS;
            }
            return amkl.REGISTERED_WITHOUT_PREKEYS;
        }
        return amkl.NOT_REGISTERED;
    }

    public final akul a() {
        return this.b.h().h(new vej(8), andi.a);
    }

    public final akul b() {
        return this.b.h();
    }

    public final akul c() {
        return this.b.h().h(new vej(3), andi.a);
    }

    public final akul d() {
        return this.b.h().h(new vdx(15), andi.a);
    }

    public final akul e() {
        return this.b.h().h(new vej(1), andi.a);
    }

    public final akul f() {
        return this.b.h().h(new vej(0), andi.a);
    }

    public final akul g() {
        return this.b.j(new vej(6)).h(new vej(7), andi.a);
    }

    public final akul h() {
        a.o("Resetting registration state");
        AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new veg(atomicReference, 7)).i(new vbl(this, atomicReference, 17, null), this.c);
    }

    public final akul i(vec vecVar) {
        xyo c = a.c();
        c.H("Tachyon PrekeyState set for phone number");
        c.z("state", vecVar);
        c.q();
        AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new uvz(atomicReference, vecVar, 10, null)).h(new tul(this, atomicReference, vecVar, 9), this.c);
    }

    public final akul j(ved vedVar, Optional optional, Optional optional2, Optional optional3) {
        xyo c = a.c();
        c.H("Setting probationary values");
        c.z("state", vedVar);
        if (optional.isPresent()) {
            c.z("client feature flags", ((aqfk) optional.get()).c.toString());
        }
        if (optional2.isPresent()) {
            c.z("client capabilities extension", ((aqfj) optional2.get()).b.toString());
        }
        if (optional3.isPresent()) {
            c.z("client caps", ((aqhz) optional3.get()).b.toString());
        }
        c.q();
        return this.b.j(new mhr(vedVar, optional, optional2, optional3, 6)).h(new vdx(19), andi.a);
    }

    public final akul k(byte[] bArr) {
        return this.b.j(new veg(bArr, 2)).h(new vdx(17), andi.a);
    }

    public final Optional n(String str) {
        try {
            if (((Boolean) new mst(11).get()).booleanValue()) {
                return Optional.of(((psq) this.i.b()).a(str, false));
            }
            return Optional.empty();
        } catch (psr unused) {
            xyo c = a.c();
            c.H("Could not create ChatEndpoint from ");
            c.L("phone number", str);
            c.q();
            return Optional.empty();
        }
    }

    public final akul o(int i) {
        final AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new algk() { // from class: veh
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                vee veeVar = (vee) obj;
                xyo c = vel.a.c();
                c.H("Setting probationary values");
                ved b = ved.b(veeVar.k);
                if (b == null) {
                    b = ved.UNRECOGNIZED;
                }
                c.z("state", b);
                aqfk aqfkVar = veeVar.l;
                if (aqfkVar == null) {
                    aqfkVar = aqfk.b;
                }
                c.z("client feature flags", aqfkVar.c.toString());
                aqfj aqfjVar = veeVar.n;
                if (aqfjVar == null) {
                    aqfjVar = aqfj.a;
                }
                c.z("client capabilities extension", aqfjVar.b.toString());
                if ((veeVar.b & 16) != 0) {
                    aqhz aqhzVar = veeVar.s;
                    if (aqhzVar == null) {
                        aqhzVar = aqhz.a;
                    }
                    c.z("client caps", aqhzVar.b.toString());
                }
                c.q();
                aozy builder = veeVar.toBuilder();
                ved b2 = ved.b(veeVar.k);
                if (b2 == null) {
                    b2 = ved.UNRECOGNIZED;
                }
                if (b2 != ved.UNSET_TACHYON_STATE) {
                    atomicReference.set(veeVar);
                    ved b3 = ved.b(veeVar.k);
                    if (b3 == null) {
                        b3 = ved.UNRECOGNIZED;
                    }
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    ((vee) builder.b).i = b3.a();
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    ((vee) builder.b).k = 0;
                } else {
                    vel.a.m("Committing probationary state without the probationary state being set in the first place. Ignoring the commit.");
                }
                if ((veeVar.b & 1) != 0) {
                    aqfk aqfkVar2 = veeVar.l;
                    if (aqfkVar2 == null) {
                        aqfkVar2 = aqfk.b;
                    }
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    apag apagVar = builder.b;
                    vee veeVar2 = (vee) apagVar;
                    aqfkVar2.getClass();
                    veeVar2.m = aqfkVar2;
                    veeVar2.b |= 2;
                    if (!apagVar.isMutable()) {
                        builder.u();
                    }
                    vee veeVar3 = (vee) builder.b;
                    veeVar3.l = null;
                    veeVar3.b &= -2;
                } else {
                    vel.a.l("No probationary client feature flags. Skipping commit");
                }
                if ((veeVar.b & 4) != 0) {
                    aqfj aqfjVar2 = veeVar.n;
                    if (aqfjVar2 == null) {
                        aqfjVar2 = aqfj.a;
                    }
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    apag apagVar2 = builder.b;
                    vee veeVar4 = (vee) apagVar2;
                    aqfjVar2.getClass();
                    veeVar4.o = aqfjVar2;
                    veeVar4.b |= 8;
                    if (!apagVar2.isMutable()) {
                        builder.u();
                    }
                    vee veeVar5 = (vee) builder.b;
                    veeVar5.n = null;
                    veeVar5.b &= -5;
                } else {
                    vel.a.l("No probationary client capabilities. Skipping commit");
                }
                if ((veeVar.b & 16) != 0) {
                    aqhz aqhzVar2 = veeVar.s;
                    if (aqhzVar2 == null) {
                        aqhzVar2 = aqhz.a;
                    }
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    apag apagVar3 = builder.b;
                    vee veeVar6 = (vee) apagVar3;
                    aqhzVar2.getClass();
                    veeVar6.t = aqhzVar2;
                    veeVar6.b |= 32;
                    if (!apagVar3.isMutable()) {
                        builder.u();
                    }
                    vee veeVar7 = (vee) builder.b;
                    veeVar7.s = null;
                    veeVar7.b &= -17;
                }
                return (vee) builder.s();
            }
        }).i(new vei(this, atomicReference, i, 0), this.c);
    }

    public final akul p(ved vedVar, ved vedVar2, int i) {
        a.l("Notifying tachyon phone data store listeners");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((vgw) it.next()).f(this.g, vedVar2, vedVar, i));
        }
        return aktp.am(arrayList).h(new vcr(3), andi.a);
    }

    public final void q(ved vedVar, ved vedVar2, int i) {
        amkl m = m(vedVar);
        amkl m2 = m(vedVar2);
        if (m == m2) {
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_E2EE_STATE_TRANSITION;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = ammz.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ammz ammzVar = (ammz) apagVar;
        ammzVar.c = m.e;
        ammzVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ammz ammzVar2 = (ammz) apagVar2;
        ammzVar2.d = m2.e;
        ammzVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ammz ammzVar3 = (ammz) createBuilder.b;
        ammzVar3.e = i - 1;
        ammzVar3.b |= 4;
        ammz ammzVar4 = (ammz) createBuilder.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        ammzVar4.getClass();
        amfrVar2.V = ammzVar4;
        amfrVar2.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        ((maq) this.d.b()).j(amfqVar);
    }
}
