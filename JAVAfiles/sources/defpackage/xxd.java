package defpackage;

import android.content.Context;
import android.provider.BlockedNumberContract;
import j$.util.Optional;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxd {
    private static final xze b = xze.g("BugleDataModel", "BlockedNumberWrapper");
    private final Context c;
    private final xca d;
    final Set a = new to();
    private boolean e = false;

    public xxd(Context context, xca xcaVar) {
        this.c = context;
        this.d = xcaVar;
    }

    public final Optional a(String str) {
        String str2;
        boolean isBlocked;
        boolean z;
        if (this.d.j(str)) {
            xyo d = b.d();
            d.H("Checking is blocked against the in memory alpha blocked list");
            d.j(str);
            d.q();
            synchronized (this.a) {
                synchronized (this.a) {
                    if (!this.e) {
                        b();
                    }
                    z = this.e;
                }
                if (z) {
                    return Optional.of(Boolean.valueOf(this.a.contains(str.toLowerCase(Locale.US))));
                }
            }
        }
        try {
            isBlocked = BlockedNumberContract.isBlocked(this.c, str);
            return Optional.of(Boolean.valueOf(isBlocked));
        } catch (Throwable th) {
            if (true != (th instanceof SecurityException)) {
                str2 = "This device appears to have a SystemBlockList, but its block list is not available at the URI content://com.android.blockednumber";
            } else {
                str2 = "Insufficient permissions to query BlockedNumberContract";
            }
            b.r(str2, th);
            return Optional.empty();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r1 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r9 = this;
            java.util.Set r0 = r9.a
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = r9.c     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            android.net.Uri r4 = defpackage.d$$ExternalSyntheticApiModelOutline0.m316m()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r2 = "original_number"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.util.Set r2 = r9.a     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r2.clear()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r1 == 0) goto L5f
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r2 <= 0) goto L5f
        L28:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r2 == 0) goto L58
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            xca r3 = r9.d     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            boolean r3 = r3.j(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r3 == 0) goto L28
            java.util.Set r3 = r9.a     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r4 = r2.toLowerCase(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r3.add(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            xze r3 = defpackage.xxd.b     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            xyo r3 = r3.d()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r4 = "Loading blocked alpha short code sender in memory"
            r3.H(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r3.j(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r3.q()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L28
        L58:
            r2 = 1
            r9.e = r2     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L5b:
            r1.close()     // Catch: java.lang.Throwable -> L7b
            goto L73
        L5f:
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.lang.Throwable -> L7b
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            return
        L66:
            r2 = move-exception
            goto L75
        L68:
            r2 = move-exception
            xze r3 = defpackage.xxd.b     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "Couldn't load blocked numbers"
            r3.n(r4, r2)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L73
            goto L5b
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            return
        L75:
            if (r1 == 0) goto L7a
            r1.close()     // Catch: java.lang.Throwable -> L7b
        L7a:
            throw r2     // Catch: java.lang.Throwable -> L7b
        L7b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxd.b():void");
    }
}
