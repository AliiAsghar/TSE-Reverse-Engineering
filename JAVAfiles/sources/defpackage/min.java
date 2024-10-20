package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class min {
    public static final xze a = xze.g("BugleUsageStatistics", "UptimeTracker");
    public final xyt b;
    private final Context f;
    private final armf g;
    private final adtn h;
    private Integer k;
    private apfr l;
    private long m;
    private long n;
    private long o;
    private final yao p;
    private final String i = UUID.randomUUID().toString();
    private long j = 0;
    public amwt c = amwt.INVALID_PRE_KOTO;
    public int d = 1;
    public int e = 1;

    public min(Context context, armf armfVar, adtn adtnVar, xyt xytVar, yjf yjfVar) {
        yal yalVar;
        wii wiiVar = new wii(this, 1);
        this.p = wiiVar;
        this.f = context;
        this.g = armfVar;
        this.h = adtnVar;
        this.b = xytVar;
        yaq yaqVar = (yaq) xytVar.a();
        aozy createBuilder = yam.a.createBuilder();
        if (yjfVar.i()) {
            yalVar = yal.ALL_ACTIVE_SUBSCRIPTIONS;
        } else {
            yalVar = yal.DEFAULT_SYSTEM_SUBSCRIPTION;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yam yamVar = (yam) createBuilder.b;
        yamVar.c = yalVar.e;
        yamVar.b |= 1;
        yaqVar.j(wiiVar, (yam) createBuilder.s());
        d(2, this.c);
    }

    public final amhx a() {
        int intValue;
        aozy createBuilder = amhx.a.createBuilder();
        int i = this.e;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amhx amhxVar = (amhx) apagVar;
        int i2 = i - 1;
        if (i != 0) {
            amhxVar.c = i2;
            amhxVar.b |= 1;
            int i3 = this.d;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            amhx amhxVar2 = (amhx) apagVar2;
            int i4 = i3 - 1;
            if (i3 != 0) {
                amhxVar2.d = i4;
                amhxVar2.b |= 2;
                amwt amwtVar = this.c;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                amhx amhxVar3 = (amhx) apagVar3;
                amhxVar3.e = amwtVar.E;
                amhxVar3.b |= 4;
                long j = this.m;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar4 = createBuilder.b;
                amhx amhxVar4 = (amhx) apagVar4;
                amhxVar4.b |= 8;
                amhxVar4.f = j;
                long j2 = this.n;
                if (!apagVar4.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar5 = createBuilder.b;
                amhx amhxVar5 = (amhx) apagVar5;
                amhxVar5.b |= 16;
                amhxVar5.g = j2;
                long j3 = this.o;
                if (!apagVar5.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar6 = createBuilder.b;
                amhx amhxVar6 = (amhx) apagVar6;
                amhxVar6.b |= 32;
                amhxVar6.h = j3;
                String str = this.i;
                if (!apagVar6.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar7 = createBuilder.b;
                amhx amhxVar7 = (amhx) apagVar7;
                str.getClass();
                amhxVar7.b |= 64;
                amhxVar7.i = str;
                long j4 = this.j;
                this.j = 1 + j4;
                if (!apagVar7.isMutable()) {
                    createBuilder.u();
                }
                amhx amhxVar8 = (amhx) createBuilder.b;
                amhxVar8.b |= 128;
                amhxVar8.j = j4;
                aozy createBuilder2 = amje.a.createBuilder();
                Integer num = this.k;
                if (num != null) {
                    intValue = num.intValue();
                } else {
                    try {
                        this.k = Integer.valueOf(this.f.getPackageManager().getPackageInfo("com.google.android.ims", 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        this.k = -1;
                    }
                    a.p("Loaded CS version.");
                    intValue = this.k.intValue();
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amje amjeVar = (amje) createBuilder2.b;
                amjeVar.b |= 1;
                amjeVar.c = intValue;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amhx amhxVar9 = (amhx) createBuilder.b;
                amje amjeVar2 = (amje) createBuilder2.s();
                amjeVar2.getClass();
                amhxVar9.k = amjeVar2;
                amhxVar9.b |= 256;
                apfr apfrVar = this.l;
                if (apfrVar == null) {
                    String m = this.h.m();
                    if (TextUtils.isEmpty(m)) {
                        a.q("Unable to retrieve SIM operator information for metrics!");
                        apfrVar = apfr.a;
                    } else {
                        adtn adtnVar = this.h;
                        String n = adtnVar.n();
                        String i5 = adtnVar.i();
                        aozy createBuilder3 = apfr.a.createBuilder();
                        String substring = m.substring(0, 3);
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apfr apfrVar2 = (apfr) createBuilder3.b;
                        substring.getClass();
                        apfrVar2.b |= 1;
                        apfrVar2.c = substring;
                        String substring2 = m.substring(3);
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apfr apfrVar3 = (apfr) createBuilder3.b;
                        substring2.getClass();
                        apfrVar3.b |= 2;
                        apfrVar3.d = substring2;
                        boolean u = this.h.u();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apfr apfrVar4 = (apfr) createBuilder3.b;
                        apfrVar4.b |= 16;
                        apfrVar4.g = u;
                        if (!TextUtils.isEmpty(i5)) {
                            String i6 = this.h.i();
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            apfr apfrVar5 = (apfr) createBuilder3.b;
                            i6.getClass();
                            apfrVar5.b |= 8;
                            apfrVar5.f = i6;
                        }
                        if (!TextUtils.isEmpty(n)) {
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            apfr apfrVar6 = (apfr) createBuilder3.b;
                            n.getClass();
                            apfrVar6.b |= 4;
                            apfrVar6.e = n;
                        }
                        this.l = (apfr) createBuilder3.s();
                        a.p("Loaded GSMNetworkId.");
                        apfrVar = this.l;
                    }
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amhx amhxVar10 = (amhx) createBuilder.b;
                apfrVar.getClass();
                amhxVar10.l = apfrVar;
                amhxVar10.b |= 1024;
                return (amhx) createBuilder.s();
            }
            throw null;
        }
        throw null;
    }

    public final void b(amhx amhxVar) {
        String str;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amhxVar.getClass();
        amfrVar.H = amhxVar;
        amfrVar.c |= 32;
        ((maq) this.g.b()).j(amfqVar);
        xyo d = a.d();
        int Y = a.Y(amhxVar.c);
        if (Y != 0 && Y != 1) {
            if (Y != 2) {
                if (Y != 3) {
                    str = "RCS_UPTIME_STATE_REGISTERED";
                } else {
                    str = "RCS_UPTIME_STATE_UNREGISTERED";
                }
            } else {
                str = "RCS_UPTIME_STATE_IGNORE";
            }
        } else {
            str = "UNKNOWN_RCS_UPTIME_STATE";
        }
        d.z("Sending event to clearcut", str);
        d.q();
    }

    public final boolean c(amwt amwtVar) {
        if (((yaq) this.b.a()).n() && amwtVar == amwt.AVAILABLE) {
            return true;
        }
        return false;
    }

    public final amhx d(int i, amwt amwtVar) {
        int i2 = this.e;
        if (i2 == i && this.c == amwtVar) {
            return null;
        }
        this.d = i2;
        this.e = i;
        this.c = amwtVar;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        int i3 = i - 1;
        if (i3 != 2) {
            if (i3 != 3) {
                this.o = timeInMillis;
            } else {
                this.m = timeInMillis;
            }
        } else {
            this.n = timeInMillis;
        }
        return a();
    }
}
