package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.EOFException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akkl {
    public final Context a;
    public final Map b;
    public final anen c;
    public final apwt d;
    public final armf e;
    public final armf f;
    public final boolean g;
    public final Map h;
    public final agrk i;
    private final Map j;

    public akkl(Context context, agrk agrkVar, Map map, Map map2, anen anenVar, apwt apwtVar, armf armfVar, armf armfVar2) {
        context.getClass();
        anenVar.getClass();
        apwtVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = context;
        this.i = agrkVar;
        this.j = map;
        this.b = map2;
        this.c = anenVar;
        this.d = apwtVar;
        this.e = armfVar;
        this.f = armfVar2;
        if (aqjn.aB(((alor) map).keySet(), ((alor) map2).keySet()).isEmpty()) {
            Boolean bool = false;
            bool.getClass();
            this.g = false;
            this.h = agrkVar.i() ? aqjn.p(map, map2) : map2;
            return;
        }
        Set aB = aqjn.aB(((alor) map).keySet(), ((alor) map2).keySet());
        Objects.toString(aB);
        throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(aB.toString()));
    }

    public static final int b(RandomAccessFile randomAccessFile) {
        int i;
        try {
            i = randomAccessFile.readInt();
        } catch (EOFException unused) {
            i = -1;
        } catch (Throwable th) {
            randomAccessFile.seek(0L);
            throw th;
        }
        randomAccessFile.seek(0L);
        return i;
    }

    public final void a(final boolean z) {
        akrh e = aktp.e("StartupAfterPackageReplaced");
        try {
            ListenableFuture X = aktp.X(new ancr() { // from class: akkk
                /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: IOException -> 0x00a3, TRY_ENTER, TryCatch #0 {IOException -> 0x00a3, blocks: (B:3:0x0002, B:5:0x0013, B:7:0x0017, B:9:0x0033, B:10:0x0042, B:12:0x004f, B:14:0x0055, B:31:0x0065, B:19:0x0076, B:22:0x007b, B:26:0x008f, B:27:0x0092, B:33:0x0093, B:34:0x009a, B:35:0x0038, B:36:0x009b, B:37:0x00a2, B:29:0x005e, B:17:0x006b), top: B:2:0x0002, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[Catch: IOException -> 0x00a3, TryCatch #0 {IOException -> 0x00a3, blocks: (B:3:0x0002, B:5:0x0013, B:7:0x0017, B:9:0x0033, B:10:0x0042, B:12:0x004f, B:14:0x0055, B:31:0x0065, B:19:0x0076, B:22:0x007b, B:26:0x008f, B:27:0x0092, B:33:0x0093, B:34:0x009a, B:35:0x0038, B:36:0x009b, B:37:0x00a2, B:29:0x005e, B:17:0x006b), top: B:2:0x0002, inners: #1 }] */
                @Override // defpackage.ancr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        r7 = this;
                        akkl r0 = defpackage.akkl.this
                        armf r1 = r0.f     // Catch: java.io.IOException -> La3
                        java.lang.Object r1 = r1.b()     // Catch: java.io.IOException -> La3
                        r1.getClass()     // Catch: java.io.IOException -> La3
                        android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1     // Catch: java.io.IOException -> La3
                        int r2 = r1.versionCode     // Catch: java.io.IOException -> La3
                        android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.io.IOException -> La3
                        if (r1 == 0) goto L9b
                        java.lang.String r1 = r1.dataDir     // Catch: java.io.IOException -> La3
                        if (r1 == 0) goto L9b
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> La3
                        java.lang.String r4 = "files"
                        r3.<init>(r1, r4)     // Catch: java.io.IOException -> La3
                        java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> La3
                        java.lang.String r4 = "tiktok"
                        r1.<init>(r3, r4)     // Catch: java.io.IOException -> La3
                        r1.mkdirs()     // Catch: java.io.IOException -> La3
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> La3
                        agrk r4 = r0.i     // Catch: java.io.IOException -> La3
                        boolean r4 = r4.i()     // Catch: java.io.IOException -> La3
                        r5 = 0
                        if (r4 == 0) goto L38
                        java.lang.String r4 = defpackage.akec.u(r5)     // Catch: java.io.IOException -> La3
                        goto L42
                    L38:
                        android.content.Context r4 = r0.a     // Catch: java.io.IOException -> La3
                        java.lang.String r4 = defpackage.aiep.a(r4)     // Catch: java.io.IOException -> La3
                        java.lang.String r4 = defpackage.akec.u(r4)     // Catch: java.io.IOException -> La3
                    L42:
                        r3.<init>(r1, r4)     // Catch: java.io.IOException -> La3
                        boolean r1 = r3.createNewFile()     // Catch: java.io.IOException -> La3
                        boolean r4 = r3.exists()     // Catch: java.io.IOException -> La3
                        if (r4 == 0) goto L93
                        boolean r4 = r3.isFile()     // Catch: java.io.IOException -> La3
                        if (r4 == 0) goto L93
                        java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> La3
                        java.lang.String r6 = "rw"
                        r4.<init>(r3, r6)     // Catch: java.io.IOException -> La3
                        if (r1 != 0) goto L6a
                        int r1 = defpackage.akkl.b(r4)     // Catch: java.lang.Throwable -> L8e
                        if (r2 == r1) goto L65
                        goto L6a
                    L65:
                        r4.close()     // Catch: java.io.IOException -> La3
                        r1 = r5
                        goto L74
                    L6a:
                        r1 = -1
                        defpackage.akec.v(r4, r1)     // Catch: java.lang.Throwable -> L8e
                        mjw r1 = new mjw     // Catch: java.lang.Throwable -> L8e
                        r3 = 7
                        r1.<init>(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L8e
                    L74:
                        if (r1 != 0) goto L7b
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.albo.bI(r5)     // Catch: java.io.IOException -> La3
                        goto Lcb
                    L7b:
                        apwt r2 = r0.d     // Catch: java.io.IOException -> La3
                        java.lang.Object r2 = r2.b()     // Catch: java.io.IOException -> La3
                        akat r2 = (defpackage.akat) r2     // Catch: java.io.IOException -> La3
                        anen r3 = r0.c     // Catch: java.io.IOException -> La3
                        com.google.common.util.concurrent.ListenableFuture r1 = defpackage.aktp.W(r1, r3)     // Catch: java.io.IOException -> La3
                        r2.g(r1)     // Catch: java.io.IOException -> La3
                        r0 = r1
                        goto Lcb
                    L8e:
                        r1 = move-exception
                        r4.close()     // Catch: java.io.IOException -> La3
                        throw r1     // Catch: java.io.IOException -> La3
                    L93:
                        java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> La3
                        java.lang.String r2 = "Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup."
                        r1.<init>(r2)     // Catch: java.io.IOException -> La3
                        throw r1     // Catch: java.io.IOException -> La3
                    L9b:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> La3
                        java.lang.String r2 = "PackageInfo was invalid."
                        r1.<init>(r2)     // Catch: java.io.IOException -> La3
                        throw r1     // Catch: java.io.IOException -> La3
                    La3:
                        r1 = move-exception
                        boolean r2 = r2
                        java.lang.String r3 = "StartupAfterPkgReplaced"
                        if (r2 == 0) goto Lc4
                        android.content.Context r2 = r0.a
                        boolean r2 = defpackage.agqa.e(r2)
                        if (r2 != 0) goto Lb7
                        java.lang.String r2 = "StartupAfterPackageReplaced failed, device was locked. Will reschedule."
                        android.util.Log.w(r3, r2, r1)
                    Lb7:
                        android.content.Context r1 = r0.a
                        akhg r2 = new akhg
                        r3 = 9
                        r2.<init>(r0, r3)
                        defpackage.agqa.b(r1, r2)
                        goto Lc9
                    Lc4:
                        java.lang.String r0 = "StartupAfterPackageReplaced failed, will try again next startup: "
                        android.util.Log.e(r3, r0, r1)
                    Lc9:
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.aneh.a
                    Lcb:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.akkk.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.c);
            akat akatVar = (akat) this.d.b();
            e.b(X);
            akatVar.f(X, 30L, TimeUnit.SECONDS);
            armd.i(e, null);
        } finally {
        }
    }
}
