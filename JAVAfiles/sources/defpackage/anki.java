package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anki implements ankl {
    private static final Set b = aqil.r(new asku[]{asku.PHONE_NUMBER, asku.GAIA_ID});
    public final wfh a;
    private final anjr c;

    public anki(wfh wfhVar, anjr anjrVar) {
        this.a = wfhVar;
        this.c = anjrVar;
    }

    public static final aqfn e(aqfn aqfnVar, int i) {
        asku b2 = asku.b(aqfnVar.b);
        if (b2 == null) {
            b2 = asku.UNRECOGNIZED;
        }
        b2.getClass();
        if (b.contains(b2)) {
            return aqfnVar;
        }
        anjs anjsVar = new anjs(null);
        anjsVar.b();
        anjsVar.b = "Handling unsupported requester ID type, " + b2.a() + " as an empty group updater for GroupMessage of type " + a.at(i);
        xdj.a(anjsVar.a());
        return null;
    }

    private final Object f(aqgw aqgwVar, aqfn aqfnVar, Instant instant, int i, arpe arpeVar) {
        String str;
        anjg anjgVar;
        String str2;
        if (aqgwVar.e.size() != 0) {
            algf m = new anka().m();
            asks b2 = asks.b(aqgwVar.f);
            if (b2 == null) {
                b2 = asks.UNRECOGNIZED;
            }
            Object fu = m.fu(b2);
            fu.getClass();
            anjq anjqVar = (anjq) fu;
            anjh anjhVar = new anjh(null);
            aqfn aqfnVar2 = aqgwVar.c;
            if (aqfnVar2 == null) {
                aqfnVar2 = aqfn.a;
            }
            aqfnVar2.getClass();
            anjhVar.b(aqfnVar2);
            try {
                URI create = URI.create(aqgwVar.g);
                create.getClass();
                anjhVar.c(create);
            } catch (IllegalArgumentException unused) {
                anjs anjsVar = new anjs(null);
                anjsVar.c();
                anjsVar.b = "Failed to parse group conference URI.";
                xdj.a(anjsVar.a());
            }
            aqft k = aqam.k(aqgwVar);
            if (k == null || (str = k.b) == null) {
                str = "";
            }
            aqft k2 = aqam.k(aqgwVar);
            if (k2 != null && (str2 = k2.c) != null) {
                anjgVar = new anjg(str2);
            } else {
                anjgVar = anjg.a;
            }
            aqft aqftVar = aqgwVar.d;
            if (aqftVar == null) {
                aqftVar = aqft.a;
            }
            Map unmodifiableMap = DesugarCollections.unmodifiableMap(aqftVar.d);
            unmodifiableMap.getClass();
            anjn anjnVar = new anjn(str, anjqVar, unmodifiableMap, anjgVar);
            ankr ankrVar = ankr.a;
            aqhf aqhfVar = aqgwVar.h;
            if (aqhfVar == null) {
                aqhfVar = aqhf.a;
            }
            aqhfVar.getClass();
            anjf apply = ankrVar.apply(aqhfVar);
            if (anjqVar.a(apply)) {
                algf m2 = new anjy(anjqVar).m();
                try {
                    apax apaxVar = aqgwVar.e;
                    apaxVar.getClass();
                    ArrayList arrayList = new ArrayList(aqjn.J(apaxVar, 10));
                    Iterator<E> it = apaxVar.iterator();
                    while (it.hasNext()) {
                        Object fu2 = m2.fu((aqgy) it.next());
                        fu2.getClass();
                        arrayList.add((anjl) fu2);
                    }
                    armo armoVar = new armo(new anjj(anjhVar.a(), anjnVar, apply, alzz.bd(arrayList)), e(aqfnVar, i));
                    Object c = c(apts.CREATE_GROUP, new anke(this, (anjj) armoVar.a, (aqfn) armoVar.b, instant, null), arpeVar);
                    if (c == arpl.a) {
                        return c;
                    }
                    return arnb.a;
                } catch (IllegalStateException e) {
                    throw new ankn(i, e);
                }
            }
            throw new ankn(i, "Received incompatible group type and group features.");
        }
        throw new ankn(i, "Received notification for creation of an empty group.");
    }

    @Override // defpackage.ankl
    public final Iterable a() {
        return aqjn.y(aqdr.GROUP);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ankl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.aqds r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anki.b(aqds, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.apts r5, defpackage.arqr r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ankg
            if (r0 == 0) goto L13
            r0 = r7
            ankg r0 = (defpackage.ankg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ankg r0 = new ankg
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            apts r5 = r0.e
            anki r6 = r0.d
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L2b
            goto L45
        L2b:
            r7 = move-exception
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.aqil.P(r7)
            r0.d = r4     // Catch: java.lang.Throwable -> L48
            r0.e = r5     // Catch: java.lang.Throwable -> L48
            r0.c = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r6.a(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            arnb r5 = defpackage.arnb.a
            return r5
        L48:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L4b:
            anjr r6 = r6.c
            aptx r5 = defpackage.anme.e(r7, r5)
            r6.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anki.c(apts, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d9, code lost:
    
        if (r0 != r10) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0299, code lost:
    
        if (r0 != r10) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02e2, code lost:
    
        if (r0 != r10) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        if (r0 == r10) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02e7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        if (r0 != r10) goto L90;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x006b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.aqdo r15, defpackage.aqfn r16, defpackage.arpe r17) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anki.d(aqdo, aqfn, arpe):java.lang.Object");
    }
}
