package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pzh implements pza {
    private final Queue c;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final asgm d = new asgm();

    public pzh(Queue queue) {
        this.c = queue;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0097 -> B:11:0x0031). Please report as a decompilation issue!!! */
    @Override // defpackage.pza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.aksr r7, defpackage.pzi r8, defpackage.arpe r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.pzg
            if (r0 == 0) goto L13
            r0 = r9
            pzg r0 = (defpackage.pzg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pzg r0 = new pzg
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            asgm r7 = r0.f
            pzi r8 = r0.e
            aksr r2 = r0.g
            pzh r5 = r0.d
            defpackage.aqil.P(r9)
        L31:
            r9 = r5
            goto L9b
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            aksr r7 = r0.g
            pzh r8 = r0.d
            defpackage.aqil.P(r9)
            r5 = r8
            goto L7c
        L45:
            defpackage.aqil.P(r9)
            r9 = r6
        L49:
            java.util.Queue r2 = r9.c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Laf
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.a
            boolean r2 = r2.get()
            if (r2 != 0) goto Laf
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.b
            boolean r2 = r2.get()
            if (r2 != 0) goto Laf
            java.util.Queue r2 = r9.c
            java.lang.Object r2 = r2.peek()
            pza r2 = (defpackage.pza) r2
            r0.d = r9
            r0.g = r7
            r5 = 0
            r0.e = r5
            r0.f = r5
            r0.c = r4
            java.lang.Object r8 = r2.a(r7, r8, r0)
            if (r8 == r1) goto Lae
            r5 = r9
            r9 = r8
        L7c:
            pzm r9 = (defpackage.pzm) r9
            boolean r8 = r9 instanceof defpackage.pzi
            if (r8 == 0) goto Lad
            pzi r9 = (defpackage.pzi) r9
            asgm r8 = r5.d
            r0.d = r5
            r0.g = r7
            r0.e = r9
            r0.f = r8
            r0.c = r3
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L97
            return r1
        L97:
            r2 = r7
            r7 = r8
            r8 = r9
            goto L31
        L9b:
            java.util.Queue r5 = r9.c     // Catch: java.lang.Throwable -> La8
            java.lang.Object r5 = r5.remove()     // Catch: java.lang.Throwable -> La8
            pza r5 = (defpackage.pza) r5     // Catch: java.lang.Throwable -> La8
            r7.d()
            r7 = r2
            goto L49
        La8:
            r8 = move-exception
            r7.d()
            throw r8
        Lad:
            return r9
        Lae:
            return r1
        Laf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzh.a(aksr, pzi, arpe):java.lang.Object");
    }
}
