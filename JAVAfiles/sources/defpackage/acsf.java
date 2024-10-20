package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsf extends acsh {
    private final acnj f;
    private final acrm g;
    private final boolean h;
    private final String i;
    private final long j;

    private acsf(acrz acrzVar, Context context, acnj acnjVar, long j, long j2, String str, acts actsVar, acrm acrmVar, String str2, boolean z, acsd acsdVar) {
        super(context, actsVar, acsdVar, acrzVar, j, str2);
        this.f = acnjVar;
        this.g = acrmVar;
        this.j = j2;
        this.i = str;
        this.h = z;
    }

    public static acsf d(acrz acrzVar, Context context, acnj acnjVar, long j, long j2, acts actsVar, acrm acrmVar, String str) {
        aomk aomkVar = new aomk();
        aomkVar.e(false);
        aomkVar.f(false);
        return new acsf(acrzVar, context, acnjVar, j, j2, null, actsVar, acrmVar, str, true, aomkVar.d());
    }

    public static acsf e(acrz acrzVar, Context context, acnj acnjVar, long j, long j2, String str, acts actsVar, acrm acrmVar, String str2, boolean z) {
        aomk aomkVar = new aomk();
        aomkVar.e(false);
        aomkVar.f(z);
        return new acsf(acrzVar, context, acnjVar, j, j2, str, actsVar, acrmVar, str2, false, aomkVar.d());
    }

    private final void f() {
        this.g.c(new FileTransferEvent(20013, this.d, 8L, this.e), advy.SEND_PUSH_MESSAGE_LISTENER);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.acsh, defpackage.acug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r10, android.net.Uri r11) {
        /*
            r9 = this;
            super.b(r10, r11)
            long r0 = r9.d
            acrz r11 = r9.b
            java.lang.String r0 = java.lang.Long.toString(r0)
            com.google.android.ims.filetransfer.http.PendingTransferInfo r11 = r11.a(r0)
            r0 = 0
            if (r11 == 0) goto L25
            com.google.android.ims.rcsservice.filetransfer.FileTransferInfo r11 = r11.mFileTransferInfo
            java.lang.String r2 = r11.b
            r2.getClass()
            java.lang.String r3 = "audio"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L25
            long r2 = r11.g
            goto L26
        L25:
            r2 = r0
        L26:
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 0
            if (r11 <= 0) goto L4a
            com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage r11 = com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage.a(r10)     // Catch: java.io.IOException -> L3b
            com.google.android.ims.filetransfer.http.message.FileInfo r1 = r11.mFileInfo     // Catch: java.io.IOException -> L3b
            r1.mAudioDuration = r2     // Catch: java.io.IOException -> L3b
            byte[] r11 = r11.c()     // Catch: java.io.IOException -> L3b
            if (r11 == 0) goto L4a
            r10 = r11
            goto L4a
        L3b:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            java.lang.String r11 = "Could not parse ft response data: %s"
            defpackage.advr.q(r11, r1)
        L4a:
            boolean r11 = r9.h
            if (r11 == 0) goto L65
            acnj r2 = r9.f
            long r3 = r9.j
            java.lang.String r5 = r9.e
            java.lang.String r6 = "application/vnd.gsma.rcs-ft-http+xml"
            r7 = r10
            com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult r10 = r2.d(r3, r5, r6, r7)
            boolean r10 = r10.succeeded()
            if (r10 != 0) goto L8a
            r9.f()
            return
        L65:
            java.lang.String r3 = r9.i
            if (r3 != 0) goto L74
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.String r11 = "Failed to send file transfer push message in a one on one conversation. The remote user ID is null."
            defpackage.advr.g(r11, r10)
            r9.f()
            return
        L74:
            acnj r2 = r9.f
            long r4 = r9.j
            java.lang.String r8 = r9.e
            java.lang.String r7 = "application/vnd.gsma.rcs-ft-http+xml"
            r6 = r10
            com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult r10 = r2.f(r3, r4, r6, r7, r8)
            boolean r10 = r10.succeeded()
            if (r10 != 0) goto L8a
            r9.f()
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsf.b(byte[], android.net.Uri):void");
    }
}
