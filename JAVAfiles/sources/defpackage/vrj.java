package defpackage;

import android.content.Context;
import android.os.Bundle;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrj {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal");
    private final yjv A;
    private final armf B;
    private final vau C;
    private final okh D;
    private final admu E;
    private final okx F;
    private final armf G;
    private final armf H;
    private final armf I;
    private final armf J;
    private final armf K;
    private final armf L;
    private final ppy M;
    private final yxb N;
    private final armf O;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final yab g;
    public final vrq h;
    public final anen i;
    public final adwu j;
    public final wwn l;
    public final armf m;
    private final Context q;
    private final vrg r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final okr z;
    private final ReadWriteLock o = new ReentrantReadWriteLock();
    public Optional k = Optional.empty();
    public boolean n = false;
    private final CopyOnWriteArraySet p = new CopyOnWriteArraySet();

    public vrj(Context context, armf armfVar, armf armfVar2, armf armfVar3, vrg vrgVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, yab yabVar, armf armfVar9, vrq vrqVar, anen anenVar, armf armfVar10, armf armfVar11, adwu adwuVar, armf armfVar12, wwn wwnVar, okr okrVar, armf armfVar13, yjv yjvVar, armf armfVar14, vau vauVar, okh okhVar, admu admuVar, okx okxVar, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, ppy ppyVar, yxb yxbVar, armf armfVar21) {
        this.q = context;
        this.d = armfVar3;
        this.c = armfVar2;
        this.u = armfVar6;
        this.b = armfVar;
        this.m = armfVar13;
        this.s = armfVar4;
        this.t = armfVar5;
        this.v = armfVar7;
        this.f = armfVar8;
        this.r = vrgVar;
        this.g = yabVar;
        this.e = armfVar9;
        this.h = vrqVar;
        this.i = anenVar;
        this.w = armfVar10;
        this.x = armfVar11;
        this.j = adwuVar;
        this.y = armfVar12;
        this.l = wwnVar;
        this.z = okrVar;
        this.A = yjvVar;
        this.B = armfVar14;
        this.C = vauVar;
        this.D = okhVar;
        this.E = admuVar;
        this.F = okxVar;
        this.G = armfVar15;
        this.H = armfVar16;
        this.I = armfVar17;
        this.J = armfVar18;
        this.K = armfVar19;
        this.M = ppyVar;
        this.N = yxbVar;
        this.O = armfVar21;
        this.L = armfVar20;
    }

    private final akul m(boolean z, String str) {
        return aktp.ai(new mti(this, z, str, 4), this.i);
    }

    public final akul a() {
        alvw g = a.g();
        g.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "canReshowSuccessFuture", 910, "RcsAvailabilityUpdaterLocal.java")).I("canReshowSuccessFuture: cacheReshownStatus: %s, hasReshownSuccess: %s", aczv.y(), this.n);
        if (aczv.y() && this.n) {
            return aktp.ag(false);
        }
        return ((whj) this.y.b()).e().h(new whf(0), andi.a).h(new vgd(this, 9), this.i);
    }

    public final amwt b() {
        return ((vru) this.e.b()).a();
    }

    public final amwt c(String str) {
        return ((vru) this.e.b()).b(str);
    }

    public final void d(vrm vrmVar) {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((vrl) it.next()).am(vrmVar);
        }
    }

    public final void e(vrk vrkVar, boolean z) {
        if (this.z.a()) {
            alvw g = a.g();
            g.X(alwp.a, "BugleRcsProvisioning");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateRcsAvailabilityForMultipleSims", 277, "RcsAvailabilityUpdaterLocal.java")).E("updateRcsAvailabilityForMultipleSims: hint: %s, canReshowWelcomeMessage: %s", vrkVar, z);
            Iterator it = this.l.m().iterator();
            while (it.hasNext()) {
                l((adiv) it.next(), vrkVar, z);
            }
            return;
        }
        alvw g2 = a.g();
        g2.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateRcsAvailabilityForDefaultCallSim", 262, "RcsAvailabilityUpdaterLocal.java")).E("updateRcsAvailabilityForDefaultCallSim: hint: %s, canReshowWelcomeMessage: %s", vrkVar, z);
        this.l.h(wwm.a).ifPresent(new ivo(this, vrkVar, z, 4));
    }

    public final void f(adiv adivVar, vrk vrkVar) {
        l(adivVar, vrkVar, false);
    }

    @Deprecated
    public final void g(vrk vrkVar) {
        h(vrkVar, false);
    }

    @Deprecated
    public final void h(vrk vrkVar, boolean z) {
        amwt amwtVar;
        boolean z2;
        armf armfVar = this.w;
        amwt b = b();
        if (((Bundle) armfVar.b()).containsKey("disable_rcs") && ((Bundle) this.w.b()).getBoolean("disable_rcs")) {
            amwtVar = amwt.DISABLED_BY_EMM;
        } else if (!((vah) this.x.b()).c()) {
            amwtVar = amwt.DISABLED_BY_EMM;
        } else if (!((Boolean) acpq.E().v().a()).booleanValue()) {
            amwtVar = amwt.DISABLED_VIA_FLAGS;
        } else if (!((yjr) this.u.b()).y()) {
            amwtVar = amwt.DISABLED_NOT_DEFAULT_SMS_APP;
        } else if (!((yjf) this.t.b()).h()) {
            amwtVar = amwt.DISABLED_NO_PERMISSIONS;
        } else if (!((wih) this.B.b()).o()) {
            amwtVar = amwt.DISABLED_FROM_PREFERENCES;
        } else if (this.r.a()) {
            amwtVar = amwt.DISABLED_LEGACY_CLIENT_ENABLED;
        } else if (yhx.g(this.q)) {
            amwtVar = amwt.DISABLED_FOR_SECONDARY_USER;
        } else {
            String l = ((adtn) this.b.b()).l();
            int b2 = ((adtn) this.b.b()).b();
            adwl a2 = this.j.a(b2);
            boolean equals = adwl.SINGLE_REG.equals(a2);
            boolean j = j(l, a2);
            if (!j) {
                if (!((adtl) this.v.b()).l(this.q)) {
                    amwtVar = amwt.DISABLED_SIM_ABSENT;
                } else if (!equals && !((adnv) this.f.b()).h()) {
                    amwtVar = amwt.DISABLED_VIA_GSERVICES;
                }
            }
            if (i(l)) {
                amwtVar = amwt.CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING;
            } else if (j && k(l)) {
                amwtVar = amwt.DISABLED_VIA_RCS_CONFIG_CHAT_AUTH;
            } else {
                alvw g = a.g();
                g.X(alwp.a, "BugleRcsProvisioning");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "getNewAvailability", 678, "RcsAvailabilityUpdaterLocal.java")).K("RcsAvailability: Subscription Id: %s, simId: %s, sipConnectionType: %s, isRcsAvailable: %s", Integer.valueOf(b2), advq.SIM_ID.c(l), a2.name(), Boolean.valueOf(j));
                if (j) {
                    amwtVar = amwt.AVAILABLE;
                } else {
                    amwtVar = amwt.CARRIER_SETUP_PENDING;
                }
            }
        }
        alvw g2 = a.g();
        g2.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateRcsAvailability", 461, "RcsAvailabilityUpdaterLocal.java")).J("updateRcsAvailability: currentAvailability: %s, newAvailability: %s, hint: %s", b, amwtVar, vrkVar);
        if (amwtVar == b) {
            if (z && amwtVar == amwt.AVAILABLE) {
                z2 = true;
            }
            vrm a3 = vrm.a(amwtVar, vrkVar, ((adtn) this.b.b()).b(), Optional.of(new adiw(((adtn) this.b.b()).l())));
            this.k.ifPresent(new vra(a3, 4));
            qjb.a(new ung(this, a3, 15), this.g);
        }
        z2 = z;
        ((vru) this.e.b()).c(((adtn) this.b.b()).l(), amwtVar);
        if (amwtVar == amwt.AVAILABLE) {
            m(z2, ((adtn) this.b.b()).l()).k(qiu.b(), this.i);
        }
        if (this.F.a()) {
            this.E.r(((adtn) this.b.b()).l(), new adjl(amwtVar));
        }
        vrm a32 = vrm.a(amwtVar, vrkVar, ((adtn) this.b.b()).b(), Optional.of(new adiw(((adtn) this.b.b()).l())));
        this.k.ifPresent(new vra(a32, 4));
        qjb.a(new ung(this, a32, 15), this.g);
    }

    public final boolean i(String str) {
        if (((pcl) this.H.b()).a()) {
            return ((whs) this.I.b()).j(new adiw(str));
        }
        return ((vqu) this.c.b()).E();
    }

    public final boolean j(String str, adwl adwlVar) {
        boolean F;
        adwl adwlVar2 = adwl.UNKNOWN;
        int ordinal = adwlVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                F = false;
            } else {
                F = ((adnk) this.s.b()).D(str);
            }
        } else {
            F = ((adnk) this.s.b()).F(str);
        }
        alvw g = a.g();
        g.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "isAvailable", 883, "RcsAvailabilityUpdaterLocal.java")).J("RcsAvailability configuration availability and enabled status: simId: %s, SipConnectionType: %s, isConfigurationAvailableAndEnabled: %s", advq.SIM_ID.c(str), adwlVar, Boolean.valueOf(F));
        return F;
    }

    public final boolean k(String str) {
        if (!((adnk) this.s.b()).f(str).mServicesConfiguration.mChatAuth) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0100 A[Catch: all -> 0x02be, TryCatch #1 {all -> 0x02be, blocks: (B:3:0x0011, B:5:0x002b, B:7:0x0031, B:30:0x0035, B:32:0x0046, B:34:0x0054, B:36:0x008c, B:38:0x009a, B:40:0x00a8, B:41:0x00ac, B:43:0x00ba, B:44:0x00be, B:46:0x00c5, B:48:0x00cb, B:51:0x00f8, B:53:0x0100, B:54:0x0104, B:56:0x0112, B:57:0x0116, B:59:0x0124, B:61:0x0132, B:63:0x0140, B:64:0x0144, B:69:0x0162, B:70:0x0166, B:71:0x016a, B:72:0x016e, B:74:0x0181, B:75:0x0185, B:77:0x0193, B:79:0x01b7, B:81:0x01bf, B:82:0x01c2, B:84:0x01ca, B:85:0x01cd, B:87:0x01e1, B:89:0x01e9, B:91:0x01f3, B:92:0x01f6, B:93:0x01a1, B:95:0x01b4, B:97:0x00dc, B:98:0x00e0, B:100:0x00f4, B:101:0x0062, B:104:0x021c, B:105:0x0080), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104 A[Catch: all -> 0x02be, TryCatch #1 {all -> 0x02be, blocks: (B:3:0x0011, B:5:0x002b, B:7:0x0031, B:30:0x0035, B:32:0x0046, B:34:0x0054, B:36:0x008c, B:38:0x009a, B:40:0x00a8, B:41:0x00ac, B:43:0x00ba, B:44:0x00be, B:46:0x00c5, B:48:0x00cb, B:51:0x00f8, B:53:0x0100, B:54:0x0104, B:56:0x0112, B:57:0x0116, B:59:0x0124, B:61:0x0132, B:63:0x0140, B:64:0x0144, B:69:0x0162, B:70:0x0166, B:71:0x016a, B:72:0x016e, B:74:0x0181, B:75:0x0185, B:77:0x0193, B:79:0x01b7, B:81:0x01bf, B:82:0x01c2, B:84:0x01ca, B:85:0x01cd, B:87:0x01e1, B:89:0x01e9, B:91:0x01f3, B:92:0x01f6, B:93:0x01a1, B:95:0x01b4, B:97:0x00dc, B:98:0x00e0, B:100:0x00f4, B:101:0x0062, B:104:0x021c, B:105:0x0080), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.adiv r12, defpackage.vrk r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrj.l(adiv, vrk, boolean):void");
    }
}
