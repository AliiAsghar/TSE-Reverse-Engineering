package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqa implements xpz {
    private final alwo a = alwo.o("BugleFileTransfer");
    private final armf b;
    private final anen c;
    private final pyk d;

    public xqa(anen anenVar, armf armfVar, pyk pykVar) {
        this.c = anenVar;
        this.b = armfVar;
        this.d = pykVar;
    }

    @Override // defpackage.xpz
    public final akul a(MessageIdType messageIdType, FileInformation fileInformation, aozb aozbVar) {
        ((alwl) ((alwl) this.a.g()).h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloaderImpl", "downloadFile", 41, "FileDownloaderImpl.java")).q("Starting the file download.");
        return ((xpy) this.b.b()).b(messageIdType, UUID.randomUUID().toString(), fileInformation, aozbVar).h(new xgu(19), this.c);
    }

    @Override // defpackage.xpz
    public final akul b(String str) {
        alwl alwlVar = (alwl) this.a.g();
        alwlVar.X(xod.a, str);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloaderImpl", "pauseDownload", 59, "FileDownloaderImpl.java")).q("Starting to pause the file download.");
        return this.d.b(str);
    }

    @Override // defpackage.xpz
    public final akul c(String str) {
        xpy xpyVar = (xpy) this.b.b();
        return aktp.aj(new xpx(xpyVar, str, 0), xpyVar.b).h(new xgu(18), this.c);
    }
}
