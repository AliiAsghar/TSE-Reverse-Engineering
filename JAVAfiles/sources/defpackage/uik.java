package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uik extends uim {
    private static final alvi h = alvi.m("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob");
    private final int i;
    private final int j;
    private final Context k;
    private final yfo l;

    public uik(Context context, armf armfVar, anen anenVar, uip uipVar, String str) {
        super(context, uipVar, str, anenVar);
        int i;
        this.k = context;
        yfo yfoVar = (yfo) armfVar.b();
        this.l = yfoVar;
        Uri uri = this.c;
        if (uri != null) {
            Rect g = yfoVar.g(uri, str);
            this.i = g.width();
            i = g.height();
        } else {
            i = 0;
            this.i = 0;
        }
        this.j = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        r1 = defpackage.uik.h.i();
        r1.X(defpackage.alwp.a, "BugleResizing");
        ((defpackage.alvg) ((defpackage.alvg) r1).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob", "runInBackgroundInTrace", 88, "ImageResizingJob.java")).q("Cannot resize image with unknown width");
     */
    @Override // defpackage.uim
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final defpackage.akul a() {
        /*
            r15 = this;
            java.lang.String r0 = "ImageResizingJob#runInBackground"
            akrh r0 = defpackage.aktp.e(r0)
            android.net.Uri r8 = r15.c     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "ImageResizingJob.java"
            java.lang.String r11 = "runInBackgroundInTrace"
            java.lang.String r12 = "com/google/android/apps/messaging/shared/datamodel/resizing/v2/ImageResizingJob"
            r13 = 0
            java.lang.String r14 = "BugleResizing"
            if (r8 != 0) goto L37
            alvi r1 = defpackage.uik.h     // Catch: java.lang.Throwable -> Lde
            alvw r1 = r1.i()     // Catch: java.lang.Throwable -> Lde
            alvz r2 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Lde
            r1.X(r2, r14)     // Catch: java.lang.Throwable -> Lde
            alvg r1 = (defpackage.alvg) r1     // Catch: java.lang.Throwable -> Lde
            r2 = 83
            alvw r1 = r1.h(r12, r11, r2, r10)     // Catch: java.lang.Throwable -> Lde
            alvg r1 = (defpackage.alvg) r1     // Catch: java.lang.Throwable -> Lde
            java.lang.String r2 = "Cannot resize image with null contentUri"
            r1.q(r2)     // Catch: java.lang.Throwable -> Lde
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> Lde
            akul r1 = defpackage.aktp.ag(r1)     // Catch: java.lang.Throwable -> Lde
            goto Lda
        L37:
            int r4 = r15.i     // Catch: java.lang.Throwable -> Lde
            if (r4 <= 0) goto L98
            int r5 = r15.j     // Catch: java.lang.Throwable -> Lde
            if (r5 > 0) goto L40
            goto L98
        L40:
            yfo r1 = r15.l     // Catch: java.lang.Throwable -> Lde
            long r6 = r15.d     // Catch: java.lang.Throwable -> Lde
            java.lang.String r9 = r15.e     // Catch: java.lang.Throwable -> Lde
            r2 = r4
            r3 = r5
            byte[] r1 = r1.o(r2, r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> Lde
            if (r1 != 0) goto L71
            alvi r1 = defpackage.uik.h     // Catch: java.lang.Throwable -> Lde
            alvw r1 = r1.i()     // Catch: java.lang.Throwable -> Lde
            alvz r2 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Lde
            r1.X(r2, r14)     // Catch: java.lang.Throwable -> Lde
            alvg r1 = (defpackage.alvg) r1     // Catch: java.lang.Throwable -> Lde
            r2 = 99
            alvw r1 = r1.h(r12, r11, r2, r10)     // Catch: java.lang.Throwable -> Lde
            alvg r1 = (defpackage.alvg) r1     // Catch: java.lang.Throwable -> Lde
            java.lang.String r2 = "Could not resize image"
            r1.q(r2)     // Catch: java.lang.Throwable -> Lde
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> Lde
            akul r1 = defpackage.aktp.ag(r1)     // Catch: java.lang.Throwable -> Lde
            goto Lda
        L71:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lde
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lde
            android.content.Context r1 = r15.k     // Catch: java.lang.Throwable -> Lde
            android.net.Uri r3 = r15.b     // Catch: java.lang.Throwable -> Lde
            android.net.Uri r1 = defpackage.ydk.e(r1, r2, r3)     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto L81
            r13 = 1
        L81:
            if (r13 == 0) goto L8f
            java.lang.String r1 = r15.e     // Catch: java.lang.Throwable -> Lde
            boolean r1 = defpackage.gh.j(r1)     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto L8f
            java.lang.String r1 = "image/jpeg"
            r15.e = r1     // Catch: java.lang.Throwable -> Lde
        L8f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> Lde
            akul r1 = defpackage.aktp.ag(r1)     // Catch: java.lang.Throwable -> Lde
            goto Lda
        L98:
            if (r4 > 0) goto Lb4
            alvi r1 = defpackage.uik.h     // Catch: java.lang.Throwable -> Lde
            alvw r1 = r1.i()     // Catch: java.lang.Throwable -> Lde
            alvz r2 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Lde
            r1.X(r2, r14)     // Catch: java.lang.Throwable -> Lde
            alvg r1 = (defpackage.alvg) r1     // Catch: java.lang.Throwable -> Lde
            r2 = 88
            alvw r1 = r1.h(r12, r11, r2, r10)     // Catch: java.lang.Throwable -> Lde
            alvg r1 = (defpackage.alvg) r1     // Catch: java.lang.Throwable -> Lde
            java.lang.String r2 = "Cannot resize image with unknown width"
            r1.q(r2)     // Catch: java.lang.Throwable -> Lde
        Lb4:
            int r1 = r15.j     // Catch: java.lang.Throwable -> Lde
            if (r1 > 0) goto Ld2
            alvi r1 = defpackage.uik.h     // Catch: java.lang.Throwable -> Lde
            alvw r1 = r1.i()     // Catch: java.lang.Throwable -> Lde
            alvz r2 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Lde
            r1.X(r2, r14)     // Catch: java.lang.Throwable -> Lde
            alvg r1 = (defpackage.alvg) r1     // Catch: java.lang.Throwable -> Lde
            r2 = 91
            alvw r1 = r1.h(r12, r11, r2, r10)     // Catch: java.lang.Throwable -> Lde
            alvg r1 = (defpackage.alvg) r1     // Catch: java.lang.Throwable -> Lde
            java.lang.String r2 = "Cannot resize image with unknown height"
            r1.q(r2)     // Catch: java.lang.Throwable -> Lde
        Ld2:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> Lde
            akul r1 = defpackage.aktp.ag(r1)     // Catch: java.lang.Throwable -> Lde
        Lda:
            r0.close()
            return r1
        Lde:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Le3
            goto Le7
        Le3:
            r0 = move-exception
            r1.addSuppressed(r0)
        Le7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uik.a():akul");
    }

    public uik(Context context, armf armfVar, anen anenVar, uip uipVar, String str, Rect rect) {
        super(context, uipVar, str, anenVar);
        this.k = context;
        this.l = (yfo) armfVar.b();
        this.i = rect.width();
        this.j = rect.height();
    }
}
