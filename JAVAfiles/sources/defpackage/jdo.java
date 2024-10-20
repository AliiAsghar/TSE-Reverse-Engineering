package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdo implements jcu {
    public final arwe a;
    public final ascd b;
    private final arwe c;
    private final List d;
    private final asai e;
    private final Set f;
    private final lre g;

    public jdo(arwe arweVar, Context context, arwe arweVar2, oxz oxzVar, yyt yytVar, lre lreVar, List list) {
        arweVar.getClass();
        context.getClass();
        arweVar2.getClass();
        yytVar.getClass();
        lreVar.getClass();
        this.a = arweVar;
        this.c = arweVar2;
        this.g = lreVar;
        this.d = list;
        ascd a = ascy.a(false);
        this.b = a;
        qjh.l(arweVar2, null, new gci(this, yytVar, oxzVar, (arpe) null, 6), 3);
        this.e = new jdn(a, context, this, 0);
        this.f = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v9, types: [asai, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.jdl
            if (r0 == 0) goto L13
            r0 = r7
            jdl r0 = (defpackage.jdl) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            jdl r0 = new jdl
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            jdo r5 = r0.f
            defpackage.aqil.P(r7)
            goto L62
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.aqil.P(r7)
            java.util.List r7 = r6.d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
            r5 = r6
            r4 = r2
            r2 = r7
        L46:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r2.next()
            iji r7 = (defpackage.iji) r7
            java.lang.Object r7 = r7.b
            r0.f = r5
            r0.a = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = defpackage.arrn.W(r7, r0)
            if (r7 == r1) goto L6a
        L62:
            jxh r7 = (defpackage.jxh) r7
            if (r7 == 0) goto L46
            r4.add(r7)
            goto L46
        L6a:
            return r1
        L6b:
            lre r7 = r5.g
            ipk r0 = new ipk
            r1 = 7
            r0.<init>(r4, r1)
            r7.c(r0)
            arnb r7 = defpackage.arnb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdo.c(arpe):java.lang.Object");
    }
}
