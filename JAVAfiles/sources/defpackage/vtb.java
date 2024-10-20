package defpackage;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtb implements uvn {
    public final Context a;
    public final apwt b;
    public final apwt c;
    public final armf d;
    public final RcsProfileService e;
    public final adtn f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    private final anen l;
    private final anen m;
    private final anen n;

    public vtb(Context context, anen anenVar, anen anenVar2, anen anenVar3, apwt apwtVar, armf armfVar, apwt apwtVar2, RcsProfileService rcsProfileService, adtn adtnVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.a = context;
        this.l = anenVar;
        this.m = anenVar2;
        this.n = anenVar3;
        this.b = apwtVar;
        this.d = armfVar;
        this.c = apwtVar2;
        this.e = rcsProfileService;
        this.f = adtnVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.i = armfVar4;
        this.j = armfVar5;
        this.k = armfVar6;
    }

    @Override // defpackage.uvn
    public final akul b() {
        return d().h(new vsw(3), this.n);
    }

    @Override // defpackage.uvn
    public final akul c() {
        return aktp.ai(new vcr(9), this.m).h(new vsw(4), this.l);
    }

    @Override // defpackage.uvn
    public final akul d() {
        akul ai = aktp.ai(new Callable() { // from class: vta
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String d;
                String str;
                String j;
                String str2;
                String str3;
                boolean isBackgroundRestricted;
                int appStandbyBucket;
                String str4 = "Bugle";
                ArrayList arrayList = new ArrayList();
                vtb vtbVar = vtb.this;
                vrn vrnVar = (vrn) ((xyt) vtbVar.b.b()).a();
                amwt d2 = vrnVar.d();
                amhv c = vrnVar.c();
                xou xouVar = new xou((short[]) null);
                xouVar.j("rcsAvailability");
                xouVar.k(String.valueOf(d2.E));
                arrayList.add(xouVar.i());
                xou xouVar2 = new xou((short[]) null);
                xouVar2.j("rcsAvailabilityDescription");
                xouVar2.k(vrnVar.g(d2, c));
                arrayList.add(xouVar2.i());
                xou xouVar3 = new xou((short[]) null);
                xouVar3.j("rcsReadiness");
                xouVar3.k(((wfe) vtbVar.d.b()).f());
                arrayList.add(xouVar3.i());
                xou xouVar4 = new xou((short[]) null);
                xouVar4.j("rcsTransport");
                if (((pcp) vtbVar.k.b()).a()) {
                    Set g = ((xtj) vtbVar.h.b()).g();
                    if (g.size() > 1) {
                        d = (String) Collection.EL.stream(g).map(new vrx(10)).collect(Collectors.joining(", "));
                    } else {
                        d = ((xtg) Collection.EL.stream(g).findFirst().orElse(xtg.a)).g;
                    }
                } else {
                    d = ((xti) vtbVar.g.b()).d();
                }
                xouVar4.k(d);
                arrayList.add(xouVar4.i());
                try {
                    str = vtbVar.e.getRcsConfigAcsUrl();
                } catch (ajny e) {
                    xzb.p("Bugle", e, "Failed to retrieve getRcsConfigAcsUrl");
                    str = "Unknown ACS url";
                }
                xou xouVar5 = new xou((short[]) null);
                xouVar5.j("rcsConfigAcsUrl");
                xouVar5.k(str);
                arrayList.add(xouVar5.i());
                xou xouVar6 = new xou((short[]) null);
                xouVar6.j("NetworkName");
                xouVar6.k(albo.ag(adwt.g(vtbVar.a).k()));
                arrayList.add(xouVar6.i());
                if (((acxv) vtbVar.i.b()).a()) {
                    j = ((aday) vtbVar.j.b()).m(vtbVar.f.l());
                } else {
                    adnu.a();
                    j = adnu.j(vtbVar.a, vtbVar.f.l());
                }
                if (j != null) {
                    xou xouVar7 = new xou((short[]) null);
                    xouVar7.j("ProvisioningSessionId");
                    xouVar7.k(j);
                    arrayList.add(xouVar7.i());
                }
                boolean i = adwi.i(vtbVar.a);
                xou xouVar8 = new xou((short[]) null);
                xouVar8.j("RcsHostApk");
                if (true != i) {
                    str4 = "cs.apk";
                }
                xouVar8.k(str4);
                arrayList.add(xouVar8.i());
                xou xouVar9 = new xou((short[]) null);
                xouVar9.j("SystemBinding");
                if (true != adwi.e(vtbVar.a)) {
                    str2 = "Disabled";
                } else {
                    str2 = "Enabled";
                }
                xouVar9.k(str2);
                arrayList.add(xouVar9.i());
                xou xouVar10 = new xou((short[]) null);
                xouVar10.j("RcsBOE");
                if (true != agkx.V(vtbVar.a)) {
                    str3 = "Optimized";
                } else {
                    str3 = "Exempted";
                }
                xouVar10.k(str3);
                arrayList.add(xouVar10.i());
                if (Build.VERSION.SDK_INT >= 28) {
                    UsageStatsManager usageStatsManager = (UsageStatsManager) vtbVar.a.getSystemService("usagestats");
                    if (usageStatsManager != null) {
                        xou xouVar11 = new xou((short[]) null);
                        xouVar11.j("RcsStandbyBucket");
                        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                        String str5 = (String) alor.o(10, "Active", 30, "Frequent", 40, "Rare", 20, "WorkingSet").getOrDefault(Integer.valueOf(appStandbyBucket), null);
                        if (str5 == null) {
                            str5 = Integer.toString(appStandbyBucket);
                        }
                        xouVar11.k(str5);
                        arrayList.add(xouVar11.i());
                    } else {
                        xou xouVar12 = new xou((short[]) null);
                        xouVar12.j("RcsStandbyBucket");
                        xouVar12.k("[Unavailable]");
                        arrayList.add(xouVar12.i());
                    }
                    ActivityManager activityManager = (ActivityManager) vtbVar.a.getSystemService("activity");
                    if (activityManager != null) {
                        xou xouVar13 = new xou((short[]) null);
                        xouVar13.j("RcsBackgroundRestricted");
                        isBackgroundRestricted = activityManager.isBackgroundRestricted();
                        xouVar13.k(Boolean.toString(isBackgroundRestricted));
                        arrayList.add(xouVar13.i());
                    } else {
                        xou xouVar14 = new xou((short[]) null);
                        xouVar14.j("RcsBackgroundRestricted");
                        xouVar14.k("[Unavailable]");
                        arrayList.add(xouVar14.i());
                    }
                } else {
                    xou xouVar15 = new xou((short[]) null);
                    xouVar15.j("RcsStandbyBucket");
                    xouVar15.k("[Unavailable]");
                    arrayList.add(xouVar15.i());
                    xou xouVar16 = new xou((short[]) null);
                    xouVar16.j("RcsBackgroundRestricted");
                    xouVar16.k("[Unavailable]");
                    arrayList.add(xouVar16.i());
                }
                return arrayList;
            }
        }, this.m);
        akul g = ((mho) this.c.b()).g();
        return aktp.an(ai, g).h(new rbn(this, ai, g, 14), this.n);
    }
}
