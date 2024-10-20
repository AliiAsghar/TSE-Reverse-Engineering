package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylz extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylz(List list, puk pukVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.f = list;
        this.e = pukVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((ylz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((ylz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:6:0x004a). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.g
            r1 = 1
            if (r0 == 0) goto L56
            arpl r0 = defpackage.arpl.a
            int r2 = r5.d
            if (r2 == 0) goto L15
            java.lang.Object r2 = r5.c
            java.lang.Object r3 = r5.b
            java.lang.Object r4 = r5.a
            defpackage.aqil.P(r6)
            goto L4a
        L15:
            defpackage.aqil.P(r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.Object r2 = r5.f
            java.util.Iterator r2 = r2.iterator()
            r3 = r2
            r2 = r6
        L25:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r3.next()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r4 = r5.e
            puk r4 = (defpackage.puk) r4
            puu r4 = r4.a
            akul r6 = r4.a(r6)
            r5.a = r2
            r5.b = r3
            r5.c = r2
            r5.d = r1
            java.lang.Object r6 = defpackage.arro.F(r6, r5)
            if (r6 == r0) goto L55
            r4 = r2
        L4a:
            r6.getClass()
            java.util.Map r6 = (java.util.Map) r6
            r2.putAll(r6)
            r2 = r4
            goto L25
        L54:
            r0 = r2
        L55:
            return r0
        L56:
            arpl r0 = defpackage.arpl.a
            int r2 = r5.d
            if (r2 == 0) goto L66
            java.lang.Object r0 = r5.c
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.aqil.P(r6)
            goto L81
        L66:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r5.e
            java.lang.Object r2 = r5.f
            asgm r3 = defpackage.yma.c
            r5.a = r3
            r5.b = r6
            r5.c = r2
            r5.d = r1
            java.lang.Object r1 = r3.b(r5)
            if (r1 != r0) goto L7e
            goto La1
        L7e:
            r1 = r6
            r0 = r2
            r2 = r3
        L81:
            asgm r6 = defpackage.yma.c     // Catch: java.lang.Throwable -> La2
            r6 = r1
            yma r6 = (defpackage.yma) r6     // Catch: java.lang.Throwable -> La2
            android.content.Context r6 = r6.b     // Catch: java.lang.Throwable -> La2
            alog r3 = defpackage.alog.r(r0)     // Catch: java.lang.Throwable -> La2
            defpackage.eae.d(r6, r3)     // Catch: java.lang.Throwable -> La2
            yma r1 = (defpackage.yma) r1     // Catch: java.lang.Throwable -> La2
            android.content.Context r6 = r1.b     // Catch: java.lang.Throwable -> La2
            alog r0 = defpackage.alog.r(r0)     // Catch: java.lang.Throwable -> La2
            defpackage.eae.c(r6, r0)     // Catch: java.lang.Throwable -> La2
            asgm r2 = (defpackage.asgm) r2
            r2.d()
            arnb r0 = defpackage.arnb.a
        La1:
            return r0
        La2:
            r6 = move-exception
            asgm r2 = (defpackage.asgm) r2
            r2.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylz.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.g != 0) {
            return new ylz((List) this.f, (puk) this.e, arpeVar, 1);
        }
        return new ylz((yma) this.e, (String) this.f, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylz(yma ymaVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.e = ymaVar;
        this.f = str;
    }
}
