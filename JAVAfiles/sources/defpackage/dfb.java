package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfb extends arpw implements arqv<asaj<? super Float>, arpe<? super arnb>, Object> {
    Object a;
    int b;
    final /* synthetic */ ContentResolver c;
    final /* synthetic */ Uri d;
    final /* synthetic */ dfc e;
    final /* synthetic */ arzj f;
    final /* synthetic */ Context g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfb(ContentResolver contentResolver, Uri uri, dfc dfcVar, arzj arzjVar, Context context, arpe arpeVar) {
        super(2, arpeVar);
        this.c = contentResolver;
        this.d = uri;
        this.e = dfcVar;
        this.f = arzjVar;
        this.g = context;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dfb) c((asaj) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:6:0x000f, B:7:0x0035, B:9:0x0044, B:11:0x004c, B:20:0x0019, B:22:0x002f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0070 -> B:7:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.h
            asaj r3 = (defpackage.asaj) r3
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L7d
            goto L35
        L13:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.h
            asaj r3 = (defpackage.asaj) r3
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L7d
            goto L44
        L1d:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.h
            r3 = r7
            asaj r3 = (defpackage.asaj) r3
            android.content.ContentResolver r7 = r6.c
            android.net.Uri r1 = r6.d
            r4 = 0
            dfc r5 = r6.e
            r7.registerContentObserver(r1, r4, r5)
            arzj r7 = r6.f     // Catch: java.lang.Throwable -> L7d
            aryz r1 = r7.B()     // Catch: java.lang.Throwable -> L7d
        L35:
            r6.h = r3     // Catch: java.lang.Throwable -> L7d
            r6.a = r1     // Catch: java.lang.Throwable -> L7d
            r6.b = r2     // Catch: java.lang.Throwable -> L7d
            r7 = r1
            aryz r7 = (defpackage.aryz) r7     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L7d
            if (r7 == r0) goto L7f
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L73
            r7 = r1
            aryz r7 = (defpackage.aryz) r7     // Catch: java.lang.Throwable -> L7d
            r7.b()     // Catch: java.lang.Throwable -> L7d
            android.content.Context r7 = r6.g     // Catch: java.lang.Throwable -> L7d
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r7 = android.provider.Settings.Global.getFloat(r7, r4, r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> L7d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L7d
            r6.h = r3     // Catch: java.lang.Throwable -> L7d
            r6.a = r1     // Catch: java.lang.Throwable -> L7d
            r7 = 2
            r6.b = r7     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r3.fv(r4, r6)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r0) goto L35
            return r0
        L73:
            android.content.ContentResolver r7 = r6.c
            dfc r0 = r6.e
            r7.unregisterContentObserver(r0)
            arnb r7 = defpackage.arnb.a
            return r7
        L7d:
            r7 = move-exception
            goto L80
        L7f:
            return r0
        L80:
            android.content.ContentResolver r0 = r6.c
            dfc r1 = r6.e
            r0.unregisterContentObserver(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        dfb dfbVar = new dfb(this.c, this.d, this.e, this.f, this.g, arpeVar);
        dfbVar.h = obj;
        return dfbVar;
    }
}
