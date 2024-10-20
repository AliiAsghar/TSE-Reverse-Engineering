package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmb extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmb(arpe arpeVar, List list, jcy jcyVar, int i) {
        super(3, arpeVar);
        this.f = i;
        this.d = list;
        this.c = jcyVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    jmb jmbVar = new jmb((ConcurrentMap) this.d, (pyr) this.c, (arpe) obj3, 3);
                    jmbVar.e = (pyt) obj;
                    jmbVar.b = (uns) obj2;
                    return jmbVar.b(arnb.a);
                }
                jmb jmbVar2 = new jmb((arpe) obj3, (lgo) this.c, (List) this.d, 2);
                jmbVar2.e = (asaj) obj;
                jmbVar2.b = (Object[]) obj2;
                return jmbVar2.b(arnb.a);
            }
            jmb jmbVar3 = new jmb((arpe) obj3, (List) this.d, (jcy) this.c, 1);
            jmbVar3.e = (asaj) obj;
            jmbVar3.b = obj2;
            return jmbVar3.b(arnb.a);
        }
        jmb jmbVar4 = new jmb((arpe) obj3, (jmc) this.c, (List) this.d, 0);
        jmbVar4.e = (asaj) obj;
        jmbVar4.b = (Object[]) obj2;
        return jmbVar4.b(arnb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v22, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmb.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmb(arpe arpeVar, jmc jmcVar, List list, int i) {
        super(3, arpeVar);
        this.f = i;
        this.c = jmcVar;
        this.d = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmb(arpe arpeVar, lgo lgoVar, List list, int i) {
        super(3, arpeVar);
        this.f = i;
        this.c = lgoVar;
        this.d = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmb(ConcurrentMap concurrentMap, pyr pyrVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.f = i;
        this.d = concurrentMap;
        this.c = pyrVar;
    }
}
