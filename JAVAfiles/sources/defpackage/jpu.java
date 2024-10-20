package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpu implements jpv {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments");
    public final arpi a;
    private final addp c;

    public jpu(arpi arpiVar, addp addpVar) {
        arpiVar.getClass();
        this.a = arpiVar;
        this.c = addpVar;
    }

    private final jpo f(List list) {
        jpn jpnVar;
        aozy createBuilder = jpo.a.createBuilder();
        createBuilder.getClass();
        DesugarCollections.unmodifiableList(((jpo) createBuilder.b).c).getClass();
        ArrayList<jgz> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            jgz jgzVar = null;
            if (!it.hasNext()) {
                break;
            }
            jha jhaVar = (jha) it.next();
            if (jhaVar instanceof jgz) {
                jgzVar = (jgz) jhaVar;
            }
            if (jgzVar != null) {
                arrayList.add(jgzVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (jgz jgzVar2 : arrayList) {
            try {
                aozy createBuilder2 = jpn.a.createBuilder();
                createBuilder2.getClass();
                hwr.aj(this.c.c(jgzVar2.a), createBuilder2);
                Uri uri = jgzVar2.b.a;
                if (uri != null) {
                    hwr.ai(uri.toString(), createBuilder2);
                }
                jpnVar = hwr.ah(createBuilder2);
            } catch (afeh e) {
                alvw h = b.h();
                h.X(alwp.a, "BugleComposeRow2");
                ((alvg) ((alvg) h).g(e).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments", "trySerialize", 101, "Attachments.kt")).t("Failed to serialize %s", jgzVar2);
                jpnVar = null;
            }
            if (jpnVar != null) {
                arrayList2.add(jpnVar);
            }
        }
        hwr.af(arrayList2, createBuilder);
        return hwr.ae(createBuilder);
    }

    @Override // defpackage.jpv
    public final Object a(jhb jhbVar, spa spaVar, arpe arpeVar) {
        Object q = arro.q(this.a, new wfj(jhbVar, spaVar, this, (arpe) null, 1), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.afdg r8, defpackage.arpe r9) {
        /*
            r7 = this;
            java.lang.String r0 = "No AttachmentDeserializer found for "
            boolean r1 = r9 instanceof defpackage.jpt
            if (r1 == 0) goto L15
            r1 = r9
            jpt r1 = (defpackage.jpt) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            jpt r1 = new jpt
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.a
            arpl r2 = defpackage.arpl.a
            int r3 = r1.c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            afdg r8 = r1.d
            defpackage.aqil.P(r9)     // Catch: defpackage.afeh -> L2c
            goto L67
        L2c:
            r9 = move-exception
            goto L8e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.aqil.P(r9)
            addp r9 = r7.c     // Catch: defpackage.afeh -> L2c
            r1.d = r8     // Catch: defpackage.afeh -> L2c
            r1.c = r5     // Catch: defpackage.afeh -> L2c
            afei r3 = new afei     // Catch: defpackage.afeh -> L2c
            java.lang.String r5 = r8.c     // Catch: defpackage.afeh -> L2c
            r5.getClass()     // Catch: defpackage.afeh -> L2c
            int r6 = r8.d     // Catch: defpackage.afeh -> L2c
            r3.<init>()     // Catch: defpackage.afeh -> L2c
            java.lang.Object r9 = r9.b     // Catch: defpackage.afeh -> L2c
            java.lang.Object r9 = r9.get(r3)     // Catch: defpackage.afeh -> L2c
            boolean r3 = r9 instanceof defpackage.afeg     // Catch: defpackage.afeh -> L2c
            if (r3 == 0) goto L58
            afeg r9 = (defpackage.afeg) r9     // Catch: defpackage.afeh -> L2c
            goto L59
        L58:
            r9 = r4
        L59:
            if (r9 == 0) goto L6b
            aozb r0 = r8.e     // Catch: defpackage.afeh -> L2c
            r0.getClass()     // Catch: defpackage.afeh -> L2c
            java.lang.Object r9 = r9.d(r0, r1)     // Catch: defpackage.afeh -> L2c
            if (r9 != r2) goto L67
            return r2
        L67:
            afcq r9 = (defpackage.afcq) r9     // Catch: defpackage.afeh -> L2c
            r4 = r9
            goto Lb4
        L6b:
            afeh r9 = new afeh     // Catch: defpackage.afeh -> L2c
            java.lang.String r1 = r8.c     // Catch: defpackage.afeh -> L2c
            int r2 = r8.d     // Catch: defpackage.afeh -> L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: defpackage.afeh -> L2c
            r3.<init>(r0)     // Catch: defpackage.afeh -> L2c
            r3.append(r1)     // Catch: defpackage.afeh -> L2c
            java.lang.String r0 = " with version "
            r3.append(r0)     // Catch: defpackage.afeh -> L2c
            r3.append(r2)     // Catch: defpackage.afeh -> L2c
            java.lang.String r0 = "."
            r3.append(r0)     // Catch: defpackage.afeh -> L2c
            java.lang.String r0 = r3.toString()     // Catch: defpackage.afeh -> L2c
            r9.<init>(r0)     // Catch: defpackage.afeh -> L2c
            throw r9     // Catch: defpackage.afeh -> L2c
        L8e:
            alvi r0 = defpackage.jpu.b
            alvw r0 = r0.h()
            alvz r1 = defpackage.alwp.a
            java.lang.String r2 = "BugleComposeRow2"
            r0.X(r1, r2)
            alvg r0 = (defpackage.alvg) r0
            alvw r9 = r0.g(r9)
            java.lang.String r0 = "tryDeserialize"
            r1 = 80
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments"
            java.lang.String r3 = "Attachments.kt"
            alvw r9 = r9.h(r2, r0, r1, r3)
            alvg r9 = (defpackage.alvg) r9
            java.lang.String r0 = "Failed to deserialize %s"
            r9.t(r0, r8)
        Lb4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpu.b(afdg, arpe):java.lang.Object");
    }

    @Override // defpackage.jpv
    public final void c(spb spbVar, jhc jhcVar) {
        jhcVar.getClass();
        spbVar.b(f(jhcVar.b));
    }

    @Override // defpackage.jpv
    public final void d(sph sphVar, jhc jhcVar) {
        Integer valueOf;
        Integer valueOf2;
        jpo f = f(jhcVar.b);
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59420) {
            agnc.t("attachments", intValue2);
        }
        if (intValue >= 59420) {
            sphVar.a.put("attachments", f.toByteArray());
        }
    }

    @Override // defpackage.jpv
    public final boolean e(jpp jppVar) {
        return jppVar.a(jld.j);
    }
}
