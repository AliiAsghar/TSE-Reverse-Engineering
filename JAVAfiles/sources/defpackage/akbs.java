package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbs extends eor {
    public final Executor a;
    public final Set c;
    private final Context f;
    public final akbn b = new akbn("FuturesMixinRF");
    public boolean e = false;
    public final int d = Process.myPid();

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public akbs(defpackage.eog r10, android.content.Context r11, java.util.concurrent.Executor r12) {
        /*
            r9 = this;
            r9.<init>()
            akbn r0 = new akbn
            java.lang.String r1 = "FuturesMixinRF"
            r0.<init>(r1)
            r9.b = r0
            r0 = 0
            r9.e = r0
            r9.a = r12
            r9.f = r11
            int r12 = android.os.Process.myPid()
            r9.d = r12
            java.lang.String r12 = "future_saved_state"
            java.lang.Object r1 = r10.a(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = 1
            if (r1 == 0) goto Lc6
            java.lang.String r3 = "last_process_id"
            int r3 = r1.getInt(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L5d
            java.lang.String r4 = "activity"
            java.lang.Object r4 = r11.getSystemService(r4)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            if (r4 == 0) goto L5d
            java.lang.String r11 = r11.getPackageName()
            java.util.List r11 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r4, r11, r3, r2)
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L5d
            java.lang.Object r11 = r11.get(r0)
            android.app.ApplicationExitInfo r11 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r11)
            int r11 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m$1(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            algw r11 = defpackage.algw.i(r11)
            goto L5f
        L5d:
            alfd r11 = defpackage.alfd.a
        L5f:
            java.lang.String r3 = "future_wrappers"
            android.os.Parcelable[] r3 = r1.getParcelableArray(r3)
            java.util.HashSet r4 = new java.util.HashSet
            int r5 = r3.length
            r4.<init>(r5)
            r9.c = r4
        L6d:
            if (r0 >= r5) goto Lcd
            r4 = r3[r0]
            akbu r4 = (defpackage.akbu) r4
            algw r6 = r4.c
            boolean r6 = r6.f()
            if (r6 != 0) goto L7c
            goto Lbe
        L7c:
            algw r6 = r4.c
            java.lang.Object r6 = r6.b()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 == r2) goto Lbe
            r7 = 2
            if (r6 != r7) goto Lb0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "ParcelableFuture was Parceled by a lifecycle change before it completed."
            r6.<init>(r7)
            boolean r7 = r11.f()
            if (r7 == 0) goto La6
            java.lang.String r7 = " process exit reason code: "
            r6.append(r7)
            java.lang.Object r7 = r11.b()
            r6.append(r7)
        La6:
            akbv r7 = new akbv
            java.lang.String r6 = r6.toString()
            r7.<init>(r6, r11)
            goto Lbb
        Lb0:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "ParcelableFuture read in unexpected value for hasResult: "
            java.lang.String r6 = defpackage.a.bV(r6, r8)
            r7.<init>(r6)
        Lbb:
            r4.b(r7)
        Lbe:
            java.util.Set r6 = r9.c
            r6.add(r4)
            int r0 = r0 + 1
            goto L6d
        Lc6:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r2)
            r9.c = r11
        Lcd:
            akbn r11 = r9.b
            r11.e(r1)
            cp r11 = new cp
            r0 = 10
            r11.<init>(r9, r0)
            r10.d(r12, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbs.<init>(eog, android.content.Context, java.util.concurrent.Executor):void");
    }

    public static void a(akbp akbpVar, akbu akbuVar) {
        akrh f = aktp.f("onPending FuturesMixin", akrk.a);
        try {
            ubx a = akbe.a();
            try {
                akbpVar.b(akbuVar.d);
                a.close();
                f.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ListenableFuture listenableFuture, Object obj, akbp akbpVar) {
        aiut.c();
        aktp.d();
        akbu akbuVar = new akbu(this.b.a(akbpVar), obj, listenableFuture);
        this.c.add(akbuVar);
        if (this.e) {
            akbuVar.c(this);
            if (!listenableFuture.isDone()) {
                a(akbpVar, akbuVar);
            }
        }
    }

    public final void c(akbp akbpVar) {
        this.b.d(akbpVar);
    }
}
