package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class maf implements ahmb, ahpp, armf {
    private static final xze a = xze.g("Bugle", "BuglePrimesMetricExtensionProvider");
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider");
    private final Context c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;

    public maf(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.c = context;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
        this.i = armfVar3;
        this.j = armfVar4;
    }

    @Override // defpackage.ahpp
    public final algw a() {
        return algw.i(b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.armf, defpackage.arme
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ashu b() {
        boolean z;
        ashp ashpVar;
        int i;
        asht ashtVar;
        apaa apaaVar = (apaa) ashu.a.createBuilder();
        armf armfVar = this.i;
        apae apaeVar = ashp.b;
        String str = "UNKNOWN";
        int i2 = 1;
        if (((pca) armfVar.b()).a()) {
            alvw d = b.d();
            d.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider", "buildMetricForAllSims", 141, "BuglePrimesMetricExtensionProvider.java")).q("Building primes metric with custom extension for all sims.");
            aozy createBuilder = ashp.a.createBuilder();
            if (((yjf) this.f.b()).m() && ((yjf) this.f.b()).i()) {
                for (ykb ykbVar : ((yjy) this.g.b()).l()) {
                    String w = ykbVar.w();
                    String s = ykbVar.s();
                    aozy createBuilder2 = asht.a.createBuilder();
                    if (w == null) {
                        w = str;
                    }
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    asht ashtVar2 = (asht) apagVar;
                    String str2 = str;
                    ashtVar2.b |= 1;
                    ashtVar2.c = w;
                    if (s == null) {
                        s = str2;
                    }
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    asht ashtVar3 = (asht) createBuilder2.b;
                    ashtVar3.b |= 2;
                    ashtVar3.d = s;
                    int a2 = ykbVar.a();
                    Optional i3 = ((wwn) this.e.b()).i(a2);
                    if (i3.isEmpty()) {
                        alvw i4 = b.i();
                        i4.X(alwp.a, "Bugle");
                        alvg alvgVar = (alvg) i4;
                        alvgVar.X(ydl.t, Integer.valueOf(a2));
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider", "buildSimInfo", 210, "BuglePrimesMetricExtensionProvider.java")).q("No subscription info to log for Primes crash metrics");
                        ashtVar = (asht) createBuilder2.s();
                    } else {
                        wxb wxbVar = (wxb) i3.get();
                        amwt amwtVar = ((adjc) this.j.b()).b(wxbVar.c).a;
                        String str3 = wxbVar.k;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar2 = createBuilder2.b;
                        asht ashtVar4 = (asht) apagVar2;
                        str3.getClass();
                        ashtVar4.b |= 8;
                        ashtVar4.f = str3;
                        String str4 = wxbVar.l;
                        if (!apagVar2.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar3 = createBuilder2.b;
                        asht ashtVar5 = (asht) apagVar3;
                        str4.getClass();
                        ashtVar5.b |= 16;
                        ashtVar5.g = str4;
                        if (true != wxbVar.o) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        if (!apagVar3.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar4 = createBuilder2.b;
                        asht ashtVar6 = (asht) apagVar4;
                        ashtVar6.e = i - 1;
                        ashtVar6.b |= 4;
                        if (!apagVar4.isMutable()) {
                            createBuilder2.u();
                        }
                        asht ashtVar7 = (asht) createBuilder2.b;
                        ashtVar7.h = amwtVar.E;
                        ashtVar7.b |= 32;
                        ashtVar = (asht) createBuilder2.s();
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashp ashpVar2 = (ashp) createBuilder.b;
                    ashtVar.getClass();
                    apax apaxVar = ashpVar2.k;
                    if (!apaxVar.c()) {
                        ashpVar2.k = apag.mutableCopy(apaxVar);
                    }
                    ashpVar2.k.add(ashtVar);
                    str = str2;
                }
            }
            ashpVar = (ashp) createBuilder.s();
        } else {
            a.l("Building primes metric with custom extension.");
            aozy createBuilder3 = ashp.a.createBuilder();
            amwt a3 = ((vru) this.h.b()).a();
            amwt amwtVar2 = amwt.AVAILABLE;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            if (a3 == amwtVar2) {
                z = true;
            } else {
                z = false;
            }
            ashp ashpVar3 = (ashp) createBuilder3.b;
            ashpVar3.c |= 1;
            ashpVar3.d = z;
            if (((yjf) this.f.b()).m()) {
                ykb h = ((yjy) this.g.b()).h(-1);
                String w2 = h.w();
                String s2 = h.s();
                aozy createBuilder4 = ashs.a.createBuilder();
                if (w2 == null) {
                    w2 = "UNKNOWN";
                }
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar5 = createBuilder4.b;
                ashs ashsVar = (ashs) apagVar5;
                ashsVar.b |= 4;
                ashsVar.c = w2;
                if (s2 == null) {
                    s2 = "UNKNOWN";
                }
                if (!apagVar5.isMutable()) {
                    createBuilder4.u();
                }
                ashs ashsVar2 = (ashs) createBuilder4.b;
                ashsVar2.b |= 8;
                ashsVar2.d = s2;
                String m = adwt.g(this.c).m();
                if (m != null && m.length() >= 5) {
                    String substring = m.substring(0, 3);
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    ashs ashsVar3 = (ashs) createBuilder4.b;
                    substring.getClass();
                    ashsVar3.b |= 32;
                    ashsVar3.f = substring;
                    String substring2 = m.substring(3);
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    ashs ashsVar4 = (ashs) createBuilder4.b;
                    substring2.getClass();
                    ashsVar4.b |= 64;
                    ashsVar4.g = substring2;
                }
                if (true == ((adtn) this.d.b()).u()) {
                    i2 = 2;
                }
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ashs ashsVar5 = (ashs) createBuilder4.b;
                ashsVar5.e = i2 - 1;
                ashsVar5.b |= 16;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                ashp ashpVar4 = (ashp) createBuilder3.b;
                ashs ashsVar6 = (ashs) createBuilder4.s();
                ashsVar6.getClass();
                ashpVar4.e = ashsVar6;
                ashpVar4.c |= 2;
            }
            ashpVar = (ashp) createBuilder3.s();
        }
        apaaVar.ct(apaeVar, ashpVar);
        return (ashu) apaaVar.s();
    }

    @Override // defpackage.ahmb
    public final ashu d() {
        return b();
    }
}
