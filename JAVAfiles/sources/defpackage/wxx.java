package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.apps.messaging.ui.appsettings.SpamSettingsActivity;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wxx implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wxx(aglz aglzVar, int i) {
        this.b = i;
        this.a = aglzVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = 0;
        switch (this.b) {
            case 0:
                return new wxy(this.a.ai());
            case 1:
                ConversationIdType conversationIdType = ((ScheduledSendTable.BindData) this.a).c;
                if (conversationIdType == null || conversationIdType.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((ScheduledSendTable.BindData) this.a).c));
            case 2:
                return ((via) ((xfc) this.a).n.b()).a();
            case 3:
                return ((msk) ((xja) this.a).y.b()).f();
            case 4:
                utz utzVar = xjc.a;
                return this.a;
            case 5:
                utz utzVar2 = xjc.a;
                return this.a;
            case 6:
                alwl alwlVar = (alwl) xom.a.g();
                MessagesTable.BindData bindData = (MessagesTable.BindData) this.a;
                alwlVar.X(ydl.a, bindData.A().a());
                alwlVar.X(ydl.e, bindData.D().b);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/RcsFileTransferProgressCallbackAdapter", "getVerifiedTransferId", 125, "RcsFileTransferProgressCallbackAdapter.java")).q("Unverified transfer ID is verified as the RCS message ID but no file transfer data found using it.");
                return null;
            case 7:
                alwl alwlVar2 = (alwl) xot.a.g();
                alwlVar2.X(ydl.a, ((MessageIdType) this.a).a());
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", 101, "FileTransferDatabaseOperations.java")).q("No file transfer bind data found.");
                return Optional.empty();
            case 8:
                MessageIdType messageIdType = ((xow) this.a).a;
                if (messageIdType == null || messageIdType.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((xow) this.a).a));
            case 9:
                akfc akfcVar = xpi.a;
                return this.a;
            case 10:
                akfc akfcVar2 = xpi.a;
                return this.a;
            case 11:
                return new xpt(false, xoc.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No file transfer bind data found for resuming download %s", this.a));
            case 12:
                return (amnl) ((aozy) this.a).s();
            case 13:
                MediaExtractor mediaExtractor = ((yhf) this.a).b;
                while (i < mediaExtractor.getTrackCount()) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                    ((alwl) yhh.a.m().h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoder", "selectAudioTrack", 838, "VideoTranscoder.java")).w("format for track %s is %s", i, trackFormat);
                    String string = trackFormat.getString("mime");
                    if (string != null && (string.startsWith("audio/") || albo.ar(string, "application/ogg"))) {
                        mediaExtractor.selectTrack(i);
                        return Optional.of(trackFormat);
                    }
                    i++;
                }
                return Optional.empty();
            case 14:
                MediaExtractor mediaExtractor2 = ((yhf) this.a).a;
                while (i < mediaExtractor2.getTrackCount()) {
                    MediaFormat trackFormat2 = mediaExtractor2.getTrackFormat(i);
                    ((alwl) yhh.a.m().h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoder", "selectVideoTrack", 851, "VideoTranscoder.java")).w("format for track %s is %s", i, trackFormat2);
                    String string2 = trackFormat2.getString("mime");
                    if (string2 != null && string2.startsWith("video/")) {
                        mediaExtractor2.selectTrack(i);
                        return Optional.of(trackFormat2);
                    }
                    i++;
                }
                return Optional.empty();
            case 15:
                utz utzVar3 = ynf.a;
                amzb amzbVar = (amzb) amzc.a.createBuilder();
                amzbVar.getClass();
                ahmn ahmnVar = new ahmn(amzbVar, null);
                this.a.a(ahmnVar);
                apag s = ((aozy) ahmnVar.a).s();
                s.getClass();
                return (amzc) s;
            case 16:
                MessageIdType messageIdType2 = ((ynt) this.a).a;
                if (messageIdType2 == null || messageIdType2.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((ynt) this.a).a));
            case 17:
                ConversationIdType conversationIdType2 = ((ynt) this.a).c;
                if (conversationIdType2 == null || conversationIdType2.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((ynt) this.a).c));
            case 18:
                return new Intent((Context) this.a, (Class<?>) SpamSettingsActivity.class);
            case 19:
                return acrj.b((Context) this.a);
            default:
                return ((adlw) this.a).n();
        }
    }

    public /* synthetic */ wxx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
