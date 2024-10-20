package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pzy implements pzw {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl");
    private final arwe b;
    private final xot c;

    public pzy(arwe arweVar, xot xotVar) {
        arweVar.getClass();
        xotVar.getClass();
        this.b = arweVar;
        this.c = xotVar;
    }

    public static final boolean k(pyz pyzVar, qep qepVar, qam qamVar) {
        sdz b = qal.b();
        b.f(pyzVar);
        b.d(qamVar);
        b.h(qepVar);
        qac a2 = b.a();
        qak qakVar = new qak();
        qakVar.c(pyzVar);
        qakVar.b(qamVar);
        boolean k = a2.k(new agpw(qakVar));
        if (k) {
            alvw g = a.g();
            g.X(alwp.a, "BugleFileTransfer");
            alvg alvgVar = (alvg) g;
            alvgVar.X(xod.j, pyzVar);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithHttpRequestResultForFileType", 335, "FileProcessingDatabaseOperationsImpl.kt")).t("Updated file transfer entry with HTTP request result for %s.", qamVar.name());
        } else {
            alvw i = a.i();
            i.X(alwp.a, "BugleFileTransfer");
            alvg alvgVar2 = (alvg) i;
            alvgVar2.X(xod.j, pyzVar);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithHttpRequestResultForFileType", 340, "FileProcessingDatabaseOperationsImpl.kt")).t("Failed to update file transfer entry with HTTP request result for %s.", qamVar.name());
        }
        return k;
    }

    @Override // defpackage.pzw
    public final pzv a(pzn pznVar) {
        Object obj;
        pznVar.getClass();
        String str = pznVar.a;
        if (str != null) {
            Optional f = this.c.f(str, Optional.of(xpg.UPLOAD));
            if (f.isPresent()) {
                qep k = ((xow) f.get()).k();
                if (k != null && !k.equals(qep.a)) {
                    return new pzs(k);
                }
                pwq a2 = pwr.a();
                a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL);
                return new pzt(a2.a());
            }
            pwq a3 = pwr.a();
            a3.f(xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB);
            return new pzt(a3.a());
        }
        pyz pyzVar = pznVar.b;
        if (pyzVar != null) {
            qai qaiVar = new qai(qal.a);
            qak qakVar = new qak();
            qakVar.c(pyzVar);
            qaiVar.k(new agpw(qakVar));
            alog t = qaiVar.b().t();
            if (((alsx) t).c <= 2) {
                t.getClass();
                qam qamVar = qam.b;
                qamVar.getClass();
                alur it = t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((qac) obj).d().equals(qamVar)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                qac qacVar = (qac) obj;
                if (qacVar == null) {
                    pwq a4 = pwr.a();
                    a4.f(xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB);
                    return new pzt(a4.a());
                }
                if (qacVar.e() == null) {
                    pwq a5 = pwr.a();
                    a5.f(xoc.FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL);
                    return new pzt(a5.a());
                }
                qep e = qacVar.e();
                e.getClass();
                return new pzs(e);
            }
            Objects.toString(pyzVar);
            throw new IllegalStateException("FileProcessingTable has more than two entries (file and thumbnail) for processingId: ".concat(pyzVar.toString()));
        }
        throw new IllegalStateException("Processing id and upload id are null in getThumbnailInformation.");
    }

    @Override // defpackage.pzw
    public final qeq b(MessageIdType messageIdType) {
        messageIdType.getClass();
        Optional g = this.c.g(messageIdType);
        g.getClass();
        return (qeq) arsd.k(g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.pzw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.pyz r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.pzx
            if (r0 == 0) goto L13
            r0 = r8
            pzx r0 = (defpackage.pzx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pzx r0 = new pzx
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            pyz r7 = r0.d
            defpackage.aqil.P(r8)
            goto L4b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.aqil.P(r8)
            arwe r8 = r6.b
            arpi r8 = r8.b()
            pze r2 = new pze
            r4 = 0
            r5 = 2
            r2.<init>(r7, r4, r5)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r2, r0)
            if (r8 == r1) goto La3
        L4b:
            alog r8 = (defpackage.alog) r8
            int r0 = r8.size()
            java.lang.String r1 = "deleteProcessingPipelineArtifacts"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r3 = "FileProcessingDatabaseOperationsImpl.kt"
            java.lang.String r4 = "BugleFileTransfer"
            if (r0 != 0) goto L7d
            alvi r8 = defpackage.pzy.a
            alvw r8 = r8.d()
            alvz r0 = defpackage.alwp.a
            r8.X(r0, r4)
            alvg r8 = (defpackage.alvg) r8
            alvz r0 = defpackage.xod.j
            r8.X(r0, r7)
            r7 = 304(0x130, float:4.26E-43)
            alvw r7 = r8.h(r2, r1, r7, r3)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r8 = "No file processing table entries to delete or failure encoutered."
            r7.q(r8)
            arnb r7 = defpackage.arnb.a
            return r7
        L7d:
            alvi r0 = defpackage.pzy.a
            alvw r0 = r0.d()
            alvz r5 = defpackage.alwp.a
            r0.X(r5, r4)
            alvg r0 = (defpackage.alvg) r0
            alvz r4 = defpackage.xod.j
            r0.X(r4, r7)
            r7 = 310(0x136, float:4.34E-43)
            alvw r7 = r0.h(r2, r1, r7, r3)
            alvg r7 = (defpackage.alvg) r7
            int r8 = r8.size()
            java.lang.String r0 = "Deleted %d file processing table entries."
            r7.r(r0, r8)
            arnb r7 = defpackage.arnb.a
            return r7
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzy.c(pyz, arpe):java.lang.Object");
    }

    @Override // defpackage.pzw
    public final void d(pyz pyzVar, apwj apwjVar) {
        qjh.l(this.b, null, new naw(pyzVar, apwjVar, (arpe) null, 10), 3);
    }

    @Override // defpackage.pzw
    public final void e(pyz pyzVar, qeq qeqVar) {
        pyzVar.getClass();
        qjh.l(this.b, null, new mmz(qeqVar, this, pyzVar, (arpe) null, 3), 3);
    }

    @Override // defpackage.pzw
    public final void f(pyz pyzVar, Uri uri, String str) {
        qjh.l(this.b, null, new icw(pyzVar, uri, this, str, (arpe) null, 8), 3);
    }

    @Override // defpackage.pzw
    public final void g(pyz pyzVar, apwj apwjVar) {
        qjh.l(this.b, null, new naw(pyzVar, apwjVar, (arpe) null, 11, (byte[]) null), 3);
    }

    @Override // defpackage.pzw
    public final boolean h(MessageIdType messageIdType) {
        messageIdType.getClass();
        return this.c.k(messageIdType);
    }

    @Override // defpackage.pzw
    public final boolean i(pzn pznVar, qep qepVar) {
        pznVar.getClass();
        qepVar.getClass();
        String str = pznVar.a;
        if (str != null) {
            akrh e = aktp.e("FileTransferDatabaseOperations#updateFileTransferEntryWithThumbnailInformation");
            try {
                xpd xpdVar = new xpd();
                xpdVar.aj("updateFileTransferEntryWithThumbnailInformation");
                xpdVar.f(new xol(str, 2));
                xpdVar.d(qepVar);
                boolean z = true;
                if (xpdVar.a().e() != 1) {
                    z = false;
                }
                e.close();
                return z;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        akrh e2 = aktp.e("FileProcessingDatabaseOperations#updateFileTransferEntryWithThumbnailInformation");
        try {
            pyz pyzVar = pznVar.b;
            if (pyzVar != null) {
                boolean k = k(pyzVar, qepVar, qam.b);
                armd.i(e2, null);
                return k;
            }
            throw new IllegalStateException("Processing id and upload id are null in updateFileTransferEntryWithThumbnailInformation.");
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                armd.i(e2, th3);
                throw th4;
            }
        }
    }

    @Override // defpackage.pzw
    public final boolean j(pzn pznVar, xwb xwbVar) {
        String str = pznVar.a;
        if (str != null) {
            return this.c.l(str, xpg.UPLOAD, (String) xwbVar.a);
        }
        akrh e = aktp.e("FileProcessingDatabaseOperations#updateFileTransferEntryWithTransferHandle");
        try {
            sdz b = qal.b();
            b.f(pznVar.b);
            b.d(qam.a);
            b.g((String) xwbVar.a);
            qac a2 = b.a();
            qak qakVar = new qak();
            qakVar.c(pznVar.b);
            qakVar.b(qam.a);
            boolean k = a2.k(new agpw(qakVar));
            if (k) {
                alvw g = a.g();
                g.X(alwp.a, "BugleFileTransfer");
                ((alvg) g.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithTransferHandle", 199, "FileProcessingDatabaseOperationsImpl.kt")).q("Updated file processing table entry with transfer handle.");
            } else {
                alvw i = a.i();
                i.X(alwp.a, "BugleFileTransfer");
                ((alvg) i.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithTransferHandle", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "FileProcessingDatabaseOperationsImpl.kt")).q("Failed to update file processing table entry with transfer handle.");
            }
            armd.i(e, null);
            return k;
        } finally {
        }
    }
}
