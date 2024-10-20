package defpackage;

import android.text.TextWatcher;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxx implements afke {
    private final aksr a;
    private final ahlp b;

    public afxx(aksr aksrVar, ahlp ahlpVar) {
        aksrVar.getClass();
        this.a = aksrVar;
        this.b = ahlpVar;
    }

    @Override // defpackage.afke
    public final View.OnClickListener a(String str, View.OnClickListener onClickListener) {
        return new akwb(this.a, str, onClickListener, 1);
    }

    @Override // defpackage.afke
    public final View.OnLongClickListener b(String str, View.OnLongClickListener onLongClickListener) {
        return new afvl(this.a, str, onLongClickListener, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [arqr] */
    @Override // defpackage.afke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.arqr r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.afxv
            if (r0 == 0) goto L13
            r0 = r7
            afxv r0 = (defpackage.afxv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afxv r0 = new afxv
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r5 = r0.d
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L29
            goto L44
        L29:
            r6 = move-exception
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r7)
            akrh r5 = defpackage.aktp.e(r5)
            r0.d = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.a(r0)     // Catch: java.lang.Throwable -> L29
            if (r7 == r1) goto L49
        L44:
            r6 = 0
            defpackage.armd.i(r5, r6)
            return r7
        L49:
            return r1
        L4a:
            throw r6     // Catch: java.lang.Throwable -> L4b
        L4b:
            r7 = move-exception
            defpackage.armd.i(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxx.c(java.lang.String, arqr, arpe):java.lang.Object");
    }

    @Override // defpackage.afke
    public final Object d(String str, arqg arqgVar) {
        akrh e = aktp.e(str);
        try {
            Object a = arqgVar.a();
            armd.i(e, null);
            return a;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [arqr] */
    @Override // defpackage.afke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r5, defpackage.arqr r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.afxw
            if (r0 == 0) goto L13
            r0 = r7
            afxw r0 = (defpackage.afxw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afxw r0 = new afxw
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L29
            goto L47
        L29:
            r6 = move-exception
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r7)
            aksr r7 = r4.a
            akrc r5 = r7.b(r5)
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.a(r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L47
            return r1
        L47:
            r6 = 0
            defpackage.armd.i(r5, r6)
            return r7
        L4c:
            throw r6     // Catch: java.lang.Throwable -> L4d
        L4d:
            r7 = move-exception
            defpackage.armd.i(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxx.e(java.lang.String, arqr, arpe):java.lang.Object");
    }

    @Override // defpackage.afke
    public final Object f(String str, arqg arqgVar) {
        akrc b = this.a.b(str);
        try {
            Object a = arqgVar.a();
            armd.i(b, null);
            return a;
        } finally {
        }
    }

    @Override // defpackage.afke
    public final arpi g(ScheduledExecutorService scheduledExecutorService) {
        return this.b.i(scheduledExecutorService);
    }

    @Override // defpackage.afke
    public final TextWatcher h(TextWatcher textWatcher) {
        return new aksq(this.a, textWatcher, "EditTextDraftTextController#textWatcher");
    }
}
