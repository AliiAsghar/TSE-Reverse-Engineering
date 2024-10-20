package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class trs {
    public static final xze a = xze.g("BugleDataModel", "AttachmentToBlobstoreUploader");
    public final armf b;
    public final armf c;
    private final armf d;
    private final armf e;
    private final anen f;

    static {
        uuh.r(164486593, "enable_attachment_to_blobstore_uploader");
    }

    public trs(armf armfVar, armf armfVar2, anen anenVar, armf armfVar3, armf armfVar4) {
        this.d = armfVar;
        this.e = armfVar2;
        this.b = armfVar3;
        this.f = anenVar;
        this.c = armfVar4;
    }

    public static boolean b(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.t() == null) {
            return false;
        }
        if (d(messagePartCoreData)) {
            return true;
        }
        if (!messagePartCoreData.bk() || !e(messagePartCoreData)) {
            return false;
        }
        return true;
    }

    private static boolean d(MessagePartCoreData messagePartCoreData) {
        if ((TextUtils.isEmpty(messagePartCoreData.P()) || messagePartCoreData.aY()) && !messagePartCoreData.aR()) {
            return true;
        }
        return false;
    }

    private static boolean e(MessagePartCoreData messagePartCoreData) {
        if ((TextUtils.isEmpty(messagePartCoreData.S()) || messagePartCoreData.bb()) && !messagePartCoreData.aS()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul a(java.util.List r21, boolean r22, java.lang.String r23, defpackage.vba r24, j$.util.Optional r25) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trs.a(java.util.List, boolean, java.lang.String, vba, j$.util.Optional):akul");
    }

    public final void c(MessagePartCoreData messagePartCoreData, tbt tbtVar) {
        akrh e = aktp.e("AttachmentToBlobstoreUploader#updatePartRowIfExists");
        try {
            ((rxc) this.c.b()).e(messagePartCoreData.z(), messagePartCoreData.A(), messagePartCoreData.Z(), tbtVar);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
