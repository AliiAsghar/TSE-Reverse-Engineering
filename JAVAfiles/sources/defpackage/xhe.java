package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xhe {
    public static final /* synthetic */ int c = 0;
    private final armf f;
    private final xnv g;
    private final wzy h;
    private final armf i;
    private final armf j;
    private final vyv k;
    private static final xze d = xze.g("Bugle", "TelephonyWipeoutDetector");
    static final utz a = uuh.i(uuh.b, "enable_message_count_for_wipeout", true);
    static final utz b = uuh.r(172575264, "check_for_permissions");
    private static final Object e = new Object();

    public xhe(armf armfVar, xnv xnvVar, vyv vyvVar, wzy wzyVar, armf armfVar2, armf armfVar3) {
        this.f = armfVar;
        this.g = xnvVar;
        this.k = vyvVar;
        this.h = wzyVar;
        this.i = armfVar2;
        this.j = armfVar3;
    }

    public final Optional a(amnf amnfVar) {
        Optional b2 = b(amnfVar);
        if (b2.isEmpty()) {
            return Optional.empty();
        }
        return ((xhf) b2.get()).a;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, utz] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, utz] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final Optional b(amnf amnfVar) {
        int i;
        int i2;
        armf armfVar;
        int i3;
        int i4;
        Iterator it;
        boolean z;
        int i5;
        Optional optional;
        amnf amnfVar2 = amnfVar;
        boolean z2 = true;
        albo.T(!aiut.g());
        synchronized (e) {
            long a2 = this.g.a();
            Optional empty = Optional.empty();
            ?? r9 = this.k.a;
            ArrayList arrayList = new ArrayList();
            Optional empty2 = Optional.empty();
            Optional empty3 = Optional.empty();
            int i6 = 5;
            int i7 = 4;
            if (((Boolean) a.e()).booleanValue()) {
                sxy d2 = MessagesTable.d();
                d2.w("executeAllHeuristicsDetailed1");
                d2.q();
                d2.g(new xgv(i7));
                int i8 = d2.b().i();
                sxy d3 = MessagesTable.d();
                d3.w("executeAllHeuristicsDetailed2");
                d3.q();
                d3.g(new xgv(i6));
                i2 = d3.b().i();
                i = i8;
            } else {
                i = 0;
                i2 = 0;
            }
            if (((Boolean) b.e()).booleanValue() && !((wyj) this.j.b()).f()) {
                Duration ofMillis = Duration.ofMillis(this.g.a() - a2);
                aozy createBuilder = amng.a.createBuilder();
                aozn i9 = aotl.i(ofMillis);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amng amngVar = (amng) createBuilder.b;
                i9.getClass();
                amngVar.g = i9;
                amngVar.b |= 8;
                int cH = yyb.cH(Optional.of(Integer.valueOf(i)));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amng amngVar2 = (amng) createBuilder.b;
                amngVar2.j = cH - 1;
                amngVar2.b |= 64;
                int cH2 = yyb.cH(Optional.of(Integer.valueOf(i2)));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amng amngVar3 = (amng) apagVar;
                amngVar3.k = cH2 - 1;
                amngVar3.b |= 128;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amng amngVar4 = (amng) apagVar2;
                amngVar4.c = amnfVar2.g;
                amngVar4.b |= 1;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                amng amngVar5 = (amng) apagVar3;
                amngVar5.h = 3;
                amngVar5.b |= 16;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                amng amngVar6 = (amng) createBuilder.b;
                amngVar6.i = 1;
                amngVar6.b |= 32;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    createBuilder.bu((aozy) it2.next());
                }
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amng amngVar7 = (amng) createBuilder.s();
                amngVar7.getClass();
                amfrVar2.aj = amngVar7;
                amfrVar2.d |= 16384;
                ((maq) r9.b()).j(amfqVar);
                return Optional.empty();
            }
            try {
                empty2 = Optional.of(Integer.valueOf(this.h.an()));
            } catch (Throwable th) {
                d.e().r(th);
                ((mbl) this.i.b()).c("Bugle.Wipeout.ErrorWhenGettingTelephonyCount.Sms");
            }
            try {
                empty3 = Optional.of(Integer.valueOf(this.h.am()));
            } catch (Throwable th2) {
                d.e().r(th2);
                ((mbl) this.i.b()).c("Bugle.Wipeout.ErrorWhenGettingTelephonyCount.Mms");
            }
            try {
                Iterator it3 = ((Set) this.f.b()).iterator();
                boolean z3 = false;
                armf armfVar2 = r9;
                while (it3.hasNext()) {
                    try {
                        xhk xhkVar = (xhk) it3.next();
                        if (xhkVar.g.contains(amnfVar2)) {
                            if (!((Boolean) xhkVar.e.b().e()).booleanValue()) {
                                optional = Optional.empty();
                                armfVar = armfVar2;
                                it = it3;
                                i3 = i;
                                i4 = i2;
                                z = z2;
                            } else {
                                long a3 = xhkVar.h.a();
                                Optional empty4 = Optional.empty();
                                boolean booleanValue = ((Boolean) xhkVar.f.b().e()).booleanValue();
                                try {
                                    empty4 = xhkVar.c.a();
                                    if (empty4.isPresent()) {
                                        if (true != ((Boolean) empty4.get()).booleanValue()) {
                                            i5 = 3;
                                        } else {
                                            i5 = 2;
                                        }
                                    } else {
                                        i5 = 5;
                                    }
                                    armfVar = armfVar2;
                                    it = it3;
                                    i3 = i;
                                    i4 = i2;
                                } catch (Throwable th3) {
                                    xyo e2 = xhk.a.e();
                                    it = it3;
                                    e2.H("Error while executing wipeout heuristic");
                                    armfVar = armfVar2;
                                    try {
                                        e2.z("heuristicName", xhkVar.d);
                                        e2.r(th3);
                                        i4 = i2;
                                        i3 = i;
                                        ((alwl) ((alwl) ((alwl) xhk.b.h()).g(th3)).h("com/google/android/apps/messaging/shared/telephony/WipeoutDetectionHeuristicExecutor", "detectWipeout", 115, "WipeoutDetectionHeuristicExecutor.java")).w("Error while executing wipeout heuristic %d, error=%s", xhkVar.d.e, new aomj(aomi.NO_USER_DATA, th3.getMessage()));
                                        i5 = 4;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i3 = i;
                                        i4 = i2;
                                        yyb.cF(amnfVar, Duration.ofMillis(this.g.a() - a2), empty2, empty3, i3, i4, empty, armfVar, arrayList);
                                        throw th;
                                    }
                                }
                                Duration ofMillis2 = Duration.ofMillis(xhkVar.h.a() - a3);
                                amnh amnhVar = xhkVar.d;
                                aozy createBuilder2 = amni.a.createBuilder();
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                apag apagVar4 = createBuilder2.b;
                                amni amniVar = (amni) apagVar4;
                                amniVar.c = amnhVar.e;
                                z = true;
                                amniVar.b |= 1;
                                if (!apagVar4.isMutable()) {
                                    createBuilder2.u();
                                }
                                amni amniVar2 = (amni) createBuilder2.b;
                                amniVar2.d = i5 - 1;
                                amniVar2.b |= 2;
                                aozn i10 = aotl.i(ofMillis2);
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                apag apagVar5 = createBuilder2.b;
                                amni amniVar3 = (amni) apagVar5;
                                i10.getClass();
                                amniVar3.e = i10;
                                amniVar3.b |= 4;
                                if (!apagVar5.isMutable()) {
                                    createBuilder2.u();
                                }
                                amni amniVar4 = (amni) createBuilder2.b;
                                amniVar4.b |= 8;
                                amniVar4.f = booleanValue;
                                arrayList.add(createBuilder2);
                                if (booleanValue) {
                                    optional = Optional.empty();
                                } else {
                                    optional = empty4;
                                }
                            }
                            if (!optional.isEmpty()) {
                                try {
                                    z3 |= ((Boolean) optional.get()).booleanValue();
                                    empty = Optional.of(Boolean.valueOf(z3));
                                } catch (Throwable th5) {
                                    th = th5;
                                    yyb.cF(amnfVar, Duration.ofMillis(this.g.a() - a2), empty2, empty3, i3, i4, empty, armfVar, arrayList);
                                    throw th;
                                }
                            }
                        } else {
                            armfVar = armfVar2;
                            it = it3;
                            i3 = i;
                            i4 = i2;
                            z = z2;
                        }
                        amnfVar2 = amnfVar;
                        z2 = z;
                        it3 = it;
                        armfVar2 = armfVar;
                        i2 = i4;
                        i = i3;
                    } catch (Throwable th6) {
                        th = th6;
                        armfVar = armfVar2;
                    }
                }
                armfVar = armfVar2;
                i3 = i;
                i4 = i2;
                Optional of = Optional.of(new xhf(empty, empty2, empty3));
                yyb.cF(amnfVar, Duration.ofMillis(this.g.a() - a2), empty2, empty3, i3, i4, empty, armfVar, arrayList);
                return of;
            } catch (Throwable th7) {
                th = th7;
                armfVar = r9;
            }
        }
    }
}
