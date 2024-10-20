package defpackage;

import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xqp implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ xqp(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        long parseLong;
        switch (this.a) {
            case 0:
                return upm.b();
            case 1:
                znj znjVar = (znj) obj;
                Point di = yyb.di(znjVar);
                String extractMetadata = ((MediaMetadataRetriever) znjVar.b).extractMetadata(9);
                if (TextUtils.isEmpty(extractMetadata)) {
                    parseLong = 0;
                } else {
                    parseLong = Long.parseLong(extractMetadata);
                }
                return new xqk(di, Duration.ofMillis(parseLong));
            case 2:
                return Optional.ofNullable((Uri) obj);
            case 3:
                ((alwl) ((alwl) xrf.a.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1367, "IncomingFileTransferProcessor.java")).t("Thumbnail successfully queued for download. Download ID: %s", ((xpr) obj).a);
                return null;
            case 4:
                ((alwl) ((alwl) ((alwl) xrf.a.i()).g((xpt) obj)).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1379, "IncomingFileTransferProcessor.java")).q("Thumbnail was not successfully queued for download.");
                return null;
            case 5:
                xrm.D.r("Unable to complete the incoming thumbnail transfer.", (IOException) obj);
                return upm.d();
            case 6:
                return upm.b();
            case 7:
                return upm.b();
            case 8:
                return upm.b();
            case 9:
                return upm.b();
            case 10:
                return upm.d();
            case 11:
                pwq a = pwr.a();
                a.f(xoc.FILE_TRANSFER_FAILURE_REASON_TACHYON_TOKEN_FAILURE);
                a.c((aniq) obj);
                return new xta(a.a());
            case 12:
                alwo alwoVar = xsg.a;
                return vqh.a(3, 0).a();
            case 13:
                return xsy.a;
            case 14:
                return xsy.a;
            case 15:
                return Boolean.valueOf(((Optional) obj).isPresent());
            case 16:
                xze xzeVar = xwj.a;
                for (aqby aqbyVar : (List) obj) {
                    if (aqbyVar.b == 7) {
                        return aqbyVar;
                    }
                }
                return null;
            case 17:
                if (((vee) obj).h.G()) {
                    xwk.a.l("Data store does not have token to verify OTP. Skip OTP check.");
                    return false;
                }
                return true;
            case 18:
                uuf uufVar = xzk.a;
                aozy builder = ((xzj) obj).toBuilder();
                String uuid = UUID.randomUUID().toString();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                xzj xzjVar = (xzj) builder.b;
                uuid.getClass();
                xzjVar.b = 1 | xzjVar.b;
                xzjVar.c = uuid;
                return (xzj) builder.s();
            case 19:
                return ((xzj) obj).c;
            default:
                return null;
        }
    }
}
