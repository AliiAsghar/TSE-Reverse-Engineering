package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.receiver.IncomingRcsEventReceiver;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqb implements xpz {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final armf c;
    public final anen d;
    public final Context e;
    private final anen f;
    private final anen g;

    public xqb(armf armfVar, armf armfVar2, Context context, anen anenVar, anen anenVar2, anen anenVar3) {
        this.b = armfVar;
        this.c = armfVar2;
        this.e = context;
        this.f = anenVar;
        this.d = anenVar2;
        this.g = anenVar3;
    }

    public static int d(FileInformation fileInformation, aozb aozbVar) {
        return Objects.hash(fileInformation, aozbVar);
    }

    @Override // defpackage.xpz
    public final akul a(MessageIdType messageIdType, FileInformation fileInformation, aozb aozbVar) {
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(ydl.a, messageIdType.a());
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "downloadFile", 84, "RcsFileDownloader.java")).q("Initiating download.");
        return aktp.ai(new rbn(this, fileInformation, aozbVar, 19), this.f).h(new wua(this, fileInformation, messageIdType, aozbVar, 3), this.d);
    }

    @Override // defpackage.xpz
    public final akul b(String str) {
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(xod.a, str);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 124, "RcsFileDownloader.java")).q("Pausing download.");
        return aktp.aj(new xpx(this, str, 2), this.f).f(ajny.class, new xdg(10), andi.a);
    }

    @Override // defpackage.xpz
    public final akul c(String str) {
        alwo alwoVar = a;
        alwl alwlVar = (alwl) alwoVar.g();
        alwlVar.X(xod.a, str);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 167, "RcsFileDownloader.java")).q("Resuming download.");
        alwl alwlVar2 = (alwl) alwoVar.g();
        alwlVar2.X(xod.a, str);
        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "getFileInformationForResume", 262, "RcsFileDownloader.java")).q("Canceling download.");
        akul ai = aktp.ai(new wkf(str, 12), this.d);
        return ai.i(new xfn(this, 6), this.g).i(new vwx((Object) this, (Object) ai, (Object) str, 20, (byte[]) null), this.d).i(new xfv(this, str, 5), this.f).f(ajny.class, new xdg(11), andi.a);
    }

    public final Intent e(aozb aozbVar) {
        Intent putExtra = new Intent().putExtra("file_transfer_service_download_response_extra", aozbVar.H());
        putExtra.setClass(this.e, IncomingRcsEventReceiver.class);
        return putExtra;
    }
}
