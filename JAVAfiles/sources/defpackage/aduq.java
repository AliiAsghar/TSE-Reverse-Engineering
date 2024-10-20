package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduq extends Thread {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ adut c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aduq(adut adutVar, Context context, String str) {
        super("PersistentStorage-load");
        this.a = context;
        this.b = str;
        this.c = adutVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6 A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:4:0x002d, B:7:0x00c3, B:10:0x0035, B:12:0x003d, B:13:0x0049, B:15:0x0051, B:17:0x0059, B:18:0x0075, B:30:0x0097, B:36:0x00a8, B:39:0x00ad, B:40:0x00b0, B:21:0x00b1, B:23:0x00b6, B:24:0x00c0, B:25:0x00b9, B:35:0x00a1), top: B:3:0x002d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:4:0x002d, B:7:0x00c3, B:10:0x0035, B:12:0x003d, B:13:0x0049, B:15:0x0051, B:17:0x0059, B:18:0x0075, B:30:0x0097, B:36:0x00a8, B:39:0x00ad, B:40:0x00b0, B:21:0x00b1, B:23:0x00b6, B:24:0x00c0, B:25:0x00b9, B:35:0x00a1), top: B:3:0x002d, inners: #1 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r0 = "Attempt to read file "
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r7.a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = r7.b
            r1.<init>(r2, r3)
            adut r2 = r7.c
            r2.b = r1
            java.io.File r1 = r2.b
            java.io.File r3 = new java.io.File
            java.lang.String r1 = r1.getPath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = ".bak"
            java.lang.String r1 = r1.concat(r4)
            r3.<init>(r1)
            r2.c = r3
            adut r1 = r7.c
            monitor-enter(r1)
            adut r2 = r7.c     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r2.f     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto L35
            goto Lc3
        L35:
            java.io.File r3 = r2.c     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto L49
            java.io.File r3 = r2.b     // Catch: java.lang.Throwable -> Lc5
            r3.delete()     // Catch: java.lang.Throwable -> Lc5
            java.io.File r3 = r2.c     // Catch: java.lang.Throwable -> Lc5
            java.io.File r4 = r2.b     // Catch: java.lang.Throwable -> Lc5
            r3.renameTo(r4)     // Catch: java.lang.Throwable -> Lc5
        L49:
            java.io.File r3 = r2.b     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto L75
            java.io.File r3 = r2.b     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r3.canRead()     // Catch: java.lang.Throwable -> Lc5
            if (r3 != 0) goto L75
            java.lang.String r3 = "RcsClientLib"
            java.io.File r4 = r2.b     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lc5
            r5.append(r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = " without permission"
            r5.append(r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lc5
            defpackage.xzb.n(r3, r0)     // Catch: java.lang.Throwable -> Lc5
        L75:
            java.io.File r0 = r2.b     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = r0.canRead()     // Catch: java.lang.Throwable -> Lc5
            r3 = 0
            if (r0 == 0) goto Lb1
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L9e
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9e
            java.io.File r5 = r2.b     // Catch: java.lang.Throwable -> L9e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L9e
            r5 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L9e
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L9c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r4 = r4.readObject()     // Catch: java.lang.Throwable -> L9c
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L9c
            defpackage.adut.e(r0)     // Catch: java.lang.Throwable -> Lc5
            r3 = r4
            goto Lb1
        L9c:
            r4 = move-exception
            goto La1
        L9e:
            r0 = move-exception
            r4 = r0
            r0 = r3
        La1:
            java.lang.String r5 = "RcsClientLib"
            java.lang.String r6 = "loadFromDiskLocked"
            defpackage.xzb.p(r5, r4, r6)     // Catch: java.lang.Throwable -> Lac
            defpackage.adut.e(r0)     // Catch: java.lang.Throwable -> Lc5
            goto Lb1
        Lac:
            r2 = move-exception
            defpackage.adut.e(r0)     // Catch: java.lang.Throwable -> Lc5
            throw r2     // Catch: java.lang.Throwable -> Lc5
        Lb1:
            r0 = 1
            r2.f = r0     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto Lb9
            r2.d = r3     // Catch: java.lang.Throwable -> Lc5
            goto Lc0
        Lb9:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lc5
            r0.<init>()     // Catch: java.lang.Throwable -> Lc5
            r2.d = r0     // Catch: java.lang.Throwable -> Lc5
        Lc0:
            r2.notifyAll()     // Catch: java.lang.Throwable -> Lc5
        Lc3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            return
        Lc5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aduq.run():void");
    }
}
