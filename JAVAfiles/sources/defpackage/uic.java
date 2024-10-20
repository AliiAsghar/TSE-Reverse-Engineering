package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uic extends uig {
    private static final xze g = xze.g("BugleResizing", "ImageResizingJob");
    private final int h;
    private final int i;
    private final Context j;
    private final yfo k;

    public uic(Context context, armf armfVar, rgm rgmVar, MessagePartCoreData messagePartCoreData, uih uihVar) {
        super(messagePartCoreData, uihVar, rgmVar);
        this.j = context;
        this.k = (yfo) armfVar.b();
        if (messagePartCoreData.c() <= 0 || messagePartCoreData.b() <= 0) {
            messagePartCoreData.ah();
        }
        this.h = messagePartCoreData.c();
        this.i = messagePartCoreData.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        defpackage.uic.g.q("Cannot resize image with unknown width");
     */
    @Override // defpackage.uig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean b() {
        /*
            r11 = this;
            java.lang.String r0 = "ImageResizingJob#runInBackground"
            akrh r0 = defpackage.aktp.e(r0)
            android.net.Uri r8 = r11.c     // Catch: java.lang.Throwable -> L6b
            r10 = 0
            if (r8 != 0) goto L13
            xze r1 = defpackage.uic.g     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "Cannot resize image with null contentUri"
            r1.q(r2)     // Catch: java.lang.Throwable -> L6b
            goto L67
        L13:
            int r4 = r11.h     // Catch: java.lang.Throwable -> L6b
            if (r4 <= 0) goto L53
            int r5 = r11.i     // Catch: java.lang.Throwable -> L6b
            if (r5 > 0) goto L1c
            goto L53
        L1c:
            yfo r1 = r11.k     // Catch: java.lang.Throwable -> L6b
            long r6 = r11.d     // Catch: java.lang.Throwable -> L6b
            java.lang.String r9 = r11.e     // Catch: java.lang.Throwable -> L6b
            r2 = r4
            r3 = r5
            byte[] r1 = r1.o(r2, r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L32
            java.lang.String r1 = "Bugle"
            java.lang.String r2 = "Could not resize image"
            defpackage.xzb.n(r1, r2)     // Catch: java.lang.Throwable -> L6b
            goto L67
        L32:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            android.content.Context r1 = r11.j     // Catch: java.lang.Throwable -> L6b
            android.net.Uri r3 = r11.b     // Catch: java.lang.Throwable -> L6b
            android.net.Uri r1 = defpackage.ydk.e(r1, r2, r3)     // Catch: java.lang.Throwable -> L6b
            r2 = 1
            if (r1 == 0) goto L43
            r10 = r2
        L43:
            if (r10 == 0) goto L67
            java.lang.String r1 = r11.e     // Catch: java.lang.Throwable -> L6b
            boolean r1 = defpackage.gh.j(r1)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L67
            java.lang.String r1 = "image/jpeg"
            r11.e = r1     // Catch: java.lang.Throwable -> L6b
            r10 = r2
            goto L67
        L53:
            if (r4 > 0) goto L5c
            xze r1 = defpackage.uic.g     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "Cannot resize image with unknown width"
            r1.q(r2)     // Catch: java.lang.Throwable -> L6b
        L5c:
            int r1 = r11.i     // Catch: java.lang.Throwable -> L6b
            if (r1 > 0) goto L67
            xze r1 = defpackage.uic.g     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "Cannot resize image with unknown height"
            r1.q(r2)     // Catch: java.lang.Throwable -> L6b
        L67:
            r0.close()
            return r10
        L6b:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r0 = move-exception
            r1.addSuppressed(r0)
        L74:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uic.b():boolean");
    }

    @Override // defpackage.uig
    protected final void a() {
    }
}
