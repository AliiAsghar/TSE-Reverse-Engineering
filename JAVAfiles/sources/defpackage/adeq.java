package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import com.google.android.ims.provisioning.config.Configuration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Calendar;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adeq implements adfk {
    public static final acyz a = aczd.a(180131982);
    public static final acyz b = acyy.b("log_sip_disabled_by_bugle_ignore_reason");
    public final Context c;
    public final acoc d;
    public final String e = UUID.randomUUID().toString();
    public final long f = Calendar.getInstance().getTimeInMillis();
    public long g = 0;
    public final abja h;
    public final abja i;
    public final abja j;
    public final abja k;
    final abja l;
    public final abja m;
    public final abja n;
    public final abja o;
    final abja p;
    final abja q;
    public Optional r;
    private final adtn s;
    private final adnk t;
    private final abjc u;
    private final adtg v;

    public adeq(Context context, adtg adtgVar, adtn adtnVar, acoc acocVar, adnk adnkVar) {
        abjc abjcVar = new abjc("uptime_tracker");
        this.u = abjcVar;
        this.h = new abiw(abjcVar, "last_registered_ts", 0L);
        this.i = new abiw(abjcVar, "last_unregistered_ts", 0L);
        this.j = new abiw(abjcVar, "last_ignore_ts", 0L);
        this.k = new abiz(abjcVar, "last_ignore_reason", 0);
        this.l = new abiz(abjcVar, "last_unregistered_reason", 0);
        this.m = new abiz(abjcVar, "previous_state", 0);
        this.n = new abiz(abjcVar, "current_state", 0);
        this.o = new abiz(abjcVar, "last_registered_network_type", 0);
        this.p = new abiw(abjcVar, "previous_event_ts", 0L);
        this.q = new abiz(abjcVar, "previously_logged_state", 0);
        this.c = context;
        this.v = adtgVar;
        this.s = adtnVar;
        this.d = acocVar;
        this.r = Optional.empty();
        this.t = adnkVar;
    }

    public static final boolean m(apfz apfzVar) {
        if (apfzVar != apfz.RCS_UPTIME_IGNORE_REASON_UNKNOWN) {
            return true;
        }
        return false;
    }

    private final NetworkInfo s() {
        return adwp.f(this.c).d();
    }

    private final void t(acok acokVar) {
        apfz b2;
        if (acokVar == acok.SHUTDOWN) {
            b2 = apfz.RCS_UPTIME_IGNORE_DEVICE_SHUTDOWN;
        } else {
            b2 = b();
        }
        if (m(b2)) {
            i(b2);
        } else {
            k(acokVar);
        }
    }

    private static final int u(abja abjaVar) {
        int Y = a.Y(((Integer) abjaVar.d()).intValue());
        if (Y == 0) {
            return 1;
        }
        return Y;
    }

    final apfy a(long j) {
        aozy createBuilder = apfy.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str = this.e;
        apag apagVar = createBuilder.b;
        apfy apfyVar = (apfy) apagVar;
        str.getClass();
        apfyVar.b |= 512;
        apfyVar.l = str;
        long j2 = this.f;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apfy apfyVar2 = (apfy) apagVar2;
        apfyVar2.b |= 1024;
        apfyVar2.m = j2;
        long j3 = this.g + 1;
        this.g = j3;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar3 = (apfy) createBuilder.b;
        apfyVar3.b |= 2048;
        apfyVar3.n = j3;
        int u = u(this.n);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar4 = (apfy) createBuilder.b;
        apfyVar4.c = u - 1;
        apfyVar4.b |= 1;
        int u2 = u(this.m);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar5 = (apfy) createBuilder.b;
        apfyVar5.d = u2 - 1;
        apfyVar5.b |= 2;
        long longValue = ((Long) this.j.d()).longValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar6 = (apfy) createBuilder.b;
        apfyVar6.b |= 64;
        apfyVar6.i = longValue;
        long longValue2 = ((Long) this.h.d()).longValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar7 = (apfy) createBuilder.b;
        apfyVar7.b |= 16;
        apfyVar7.g = longValue2;
        long longValue3 = ((Long) this.i.d()).longValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar8 = (apfy) createBuilder.b;
        apfyVar8.b |= 32;
        apfyVar8.h = longValue3;
        aozy createBuilder2 = apfx.a.createBuilder();
        int u3 = u(this.q);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apfx apfxVar = (apfx) createBuilder2.b;
        apfxVar.d = u3 - 1;
        apfxVar.b |= 2;
        long longValue4 = ((Long) this.p.d()).longValue();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apfx apfxVar2 = (apfx) createBuilder2.b;
        apfxVar2.b |= 1;
        apfxVar2.c = longValue4;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar9 = (apfy) createBuilder.b;
        apfx apfxVar3 = (apfx) createBuilder2.s();
        apfxVar3.getClass();
        apfyVar9.p = apfxVar3;
        apfyVar9.b |= 8192;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar10 = (apfy) createBuilder.b;
        apfyVar10.b |= 16384;
        apfyVar10.q = j;
        int W = a.W(((Integer) this.o.d()).intValue());
        if (W != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apfy apfyVar11 = (apfy) createBuilder.b;
            apfyVar11.k = W - 1;
            apfyVar11.b |= 256;
        }
        int o = o();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfy apfyVar12 = (apfy) createBuilder.b;
        apfyVar12.j = o - 1;
        apfyVar12.b |= 128;
        return (apfy) createBuilder.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        return defpackage.apfz.RCS_UPTIME_IGNORE_MISSING_PERMISSION;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.apfz b() {
        /*
            r5 = this;
            java.lang.String[] r0 = defpackage.adwi.a
            int r1 = r0.length
            r1 = 0
            r2 = r1
        L5:
            android.content.Context r3 = r5.c
            r4 = 3
            if (r2 >= r4) goto L16
            r4 = r0[r2]
            boolean r3 = defpackage.agkx.X(r3, r4)
            if (r3 != 0) goto L13
            goto L38
        L13:
            int r2 = r2 + 1
            goto L5
        L16:
            boolean r0 = defpackage.yhx.b
            if (r0 == 0) goto L27
            adwt r0 = defpackage.adwt.g(r3)
            android.telephony.TelephonyManager r0 = r0.a
            boolean r0 = r0.hasCarrierPrivileges()
            if (r0 == 0) goto L27
            goto L3b
        L27:
            java.lang.String r0 = "android.permission.READ_PRIVILEGED_PHONE_STATE"
            boolean r0 = defpackage.agkx.X(r3, r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = defpackage.agkx.X(r3, r0)
            if (r0 == 0) goto L38
            goto L3b
        L38:
            apfz r0 = defpackage.apfz.RCS_UPTIME_IGNORE_MISSING_PERMISSION
            return r0
        L3b:
            adnk r0 = r5.t
            j$.util.Optional r0 = r0.j()
            addg r2 = new addg
            r3 = 5
            r2.<init>(r3)
            j$.util.Optional r0 = r0.map(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.orElse(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5e
            apfz r0 = defpackage.apfz.RCS_UPTIME_IGNORE_NO_VALID_CONFIG
            return r0
        L5e:
            adtg r0 = r5.v
            boolean r0 = r0.f()
            if (r0 != 0) goto L69
            apfz r0 = defpackage.apfz.RCS_UPTIME_IGNORE_NO_SIM
            return r0
        L69:
            adnk r0 = r5.t
            boolean r0 = r0.B()
            if (r0 == 0) goto Ld3
            android.net.NetworkInfo r0 = r5.s()
            if (r0 == 0) goto La9
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto La9
            acyz r0 = defpackage.adeq.b
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La6
            j$.util.Optional r0 = r5.r
            addg r1 = new addg
            r3 = 6
            r1.<init>(r3)
            j$.util.Optional r0 = r0.map(r1)
            java.lang.Object r0 = r0.orElse(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La6
            apfz r0 = defpackage.apfz.RCS_UPTIME_IGNORE_SIP_DISABLED_BY_BUGLE
            return r0
        La6:
            apfz r0 = defpackage.apfz.RCS_UPTIME_IGNORE_REASON_UNKNOWN
            return r0
        La9:
            android.net.NetworkInfo r0 = r5.s()
            if (r0 != 0) goto Lb0
            goto Ld0
        Lb0:
            android.net.NetworkInfo$DetailedState r2 = r0.getDetailedState()
            android.net.NetworkInfo$DetailedState r3 = android.net.NetworkInfo.DetailedState.BLOCKED
            if (r2 != r3) goto Ld0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Network is blocked. This should not happen. Something is wrong with this device's rcs engine doze exemption setup"
            defpackage.advr.q(r3, r2)
            java.lang.String r0 = r0.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "Network info: %s"
            defpackage.advr.k(r0, r2)
            apfz r0 = defpackage.apfz.RCS_UPTIME_IGNORE_BLOCKED_NETWORK
            return r0
        Ld0:
            apfz r0 = defpackage.apfz.RCS_UPTIME_IGNORE_NO_NETWORK_CONNECTIVITY
            return r0
        Ld3:
            apfz r0 = defpackage.apfz.RCS_UPTIME_IGNORE_DISABLED_VIA_PREFERENCES
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adeq.b():apfz");
    }

    public final apfz c(abja abjaVar) {
        apfz b2 = apfz.b(((Integer) abjaVar.d()).intValue());
        if (b2 == null) {
            return apfz.RCS_UPTIME_IGNORE_REASON_UNKNOWN;
        }
        return b2;
    }

    public final Instant d(abja abjaVar) {
        return Instant.ofEpochMilli(((Long) abjaVar.d()).longValue());
    }

    public final String e(abja abjaVar) {
        int u = u(abjaVar) - 1;
        if (u != 1) {
            if (u != 2) {
                if (u != 3) {
                    return "RCS_UPTIME_STATE_UNKNOWN";
                }
                return "RCS_UPTIME_STATE_REGISTERED";
            }
            return "RCS_UPTIME_STATE_UNREGISTERED";
        }
        return "RCS_UPTIME_STATE_IGNORE";
    }

    @Override // defpackage.adfk
    public final void f(acok acokVar) {
        if (!l()) {
            return;
        }
        try {
            t(acokVar);
        } catch (adwk unused) {
            advr.g("Missing permission to calculate uptime metric.", new Object[0]);
        }
    }

    @Override // defpackage.adfk
    public final void g() {
        if (!l()) {
            return;
        }
        j();
    }

    @Override // defpackage.adfk
    public final void h(acok acokVar) {
        if (!l()) {
            return;
        }
        try {
            t(acokVar);
        } catch (adwk unused) {
            advr.g("Missing permission to calculate uptime metric.", new Object[0]);
        }
    }

    public final void i(apfz apfzVar) {
        if (p(2) && ((Integer) this.k.d()).intValue() == apfzVar.j) {
            return;
        }
        advr.o("Sending RCS uptime ignore event with reason: %s", apfzVar);
        long n = n(2);
        this.k.e(Integer.valueOf(apfzVar.j));
        aozy builder = a(n).toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apfy apfyVar = (apfy) builder.b;
        apfyVar.e = apfzVar.j;
        apfyVar.b |= 4;
        r(builder);
    }

    public final void j() {
        if (p(4)) {
            return;
        }
        advr.o("Sending RCS uptime registered event", new Object[0]);
        long n = n(4);
        this.o.e(Integer.valueOf(o() - 1));
        r(a(n).toBuilder());
    }

    public final void k(acok acokVar) {
        if (p(3)) {
            return;
        }
        advr.o("Sending RCS uptime unregistered event with reason: %s", acokVar);
        long n = n(3);
        this.l.e(Integer.valueOf(acokVar.ordinal()));
        aozy builder = a(n).toBuilder();
        if (aoue.g(acokVar.ordinal()) != 0) {
            int g = aoue.g(acokVar.ordinal());
            if (!builder.b.isMutable()) {
                builder.u();
            }
            apfy apfyVar = (apfy) builder.b;
            int i = g - 1;
            if (g != 0) {
                apfyVar.f = i;
                apfyVar.b |= 8;
            } else {
                throw null;
            }
        }
        r(builder);
    }

    public final boolean l() {
        if (adwi.i(this.c)) {
            if (adwi.a(this.c) != 2) {
                return true;
            }
            return false;
        }
        if (((Integer) aduv.f.d()).intValue() == 2) {
            return true;
        }
        return false;
    }

    final long n(int i) {
        this.m.e((Integer) this.n.d());
        int i2 = i - 1;
        this.n.e(Integer.valueOf(i2));
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i2 != 1) {
            if (i2 != 3) {
                this.i.e(Long.valueOf(timeInMillis));
            } else {
                this.h.e(Long.valueOf(timeInMillis));
            }
        } else {
            this.j.e(Long.valueOf(timeInMillis));
        }
        return timeInMillis;
    }

    final int o() {
        NetworkInfo networkInfo;
        try {
            networkInfo = s();
        } catch (adwk unused) {
            advr.g("Missing permission to retrieve network info for uptime metric.", new Object[0]);
            networkInfo = null;
        }
        if (networkInfo == null) {
            return 1;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 17 || !((Boolean) a.a()).booleanValue()) {
                    return 1;
                }
                return 15;
            }
            return 5;
        }
        return 7;
    }

    final boolean p(int i) {
        if (((Integer) this.n.d()).intValue() == i - 1) {
            return true;
        }
        return false;
    }

    public final aozy q() {
        aozy builder = a(Calendar.getInstance().getTimeInMillis()).toBuilder();
        if (p(2)) {
            apfz c = c(this.k);
            if (!builder.b.isMutable()) {
                builder.u();
            }
            apfy apfyVar = (apfy) builder.b;
            apfyVar.e = c.j;
            apfyVar.b |= 4;
        } else if (p(3)) {
            int g = aoue.g(((Integer) this.l.d()).intValue());
            if (g == 0) {
                g = 1;
            }
            if (!builder.b.isMutable()) {
                builder.u();
            }
            apfy apfyVar2 = (apfy) builder.b;
            apfyVar2.f = g - 1;
            apfyVar2.b |= 8;
        }
        return builder;
    }

    public final void r(aozy aozyVar) {
        boolean z;
        this.r.ifPresent(new acsa(aozyVar, 15));
        Configuration f = this.t.f(this.s.l());
        aozy createBuilder = apfu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        int i = 1;
        if (f != null) {
            z = true;
        } else {
            z = false;
        }
        apag apagVar = createBuilder.b;
        apfu apfuVar = (apfu) apagVar;
        apfuVar.b |= 1;
        apfuVar.c = z;
        if (f != null) {
            int i2 = f.mVersion;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apfu apfuVar2 = (apfu) createBuilder.b;
            apfuVar2.b |= 2;
            apfuVar2.d = i2;
            long b2 = f.b();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            apfu apfuVar3 = (apfu) apagVar2;
            apfuVar3.b |= 4;
            apfuVar3.e = b2;
            int U = a.U(f.mConfigState);
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apfu apfuVar4 = (apfu) createBuilder.b;
            int i3 = U - 1;
            if (U != 0) {
                apfuVar4.f = i3;
                apfuVar4.b |= 8;
            } else {
                throw null;
            }
        }
        acoc acocVar = this.d;
        Context context = this.c;
        apfy apfyVar = (apfy) aozyVar.s();
        apfu apfuVar5 = (apfu) createBuilder.s();
        aozy createBuilder2 = apkr.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        apkr apkrVar = (apkr) apagVar3;
        apfyVar.getClass();
        apkrVar.d = apfyVar;
        apkrVar.c = 6;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apkr apkrVar2 = (apkr) createBuilder2.b;
        apfuVar5.getClass();
        apkrVar2.f = apfuVar5;
        apkrVar2.b |= 8;
        acocVar.i(context, createBuilder2, apkj.RCS_UPTIME_EVENT);
        abja abjaVar = this.q;
        int Y = a.Y(((apfy) aozyVar.b).c);
        if (Y != 0) {
            i = Y;
        }
        abjaVar.e(Integer.valueOf(i - 1));
        this.p.e(Long.valueOf(((apfy) aozyVar.b).q));
    }
}
