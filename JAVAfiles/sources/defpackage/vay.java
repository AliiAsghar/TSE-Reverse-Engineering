package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vay {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/AttachmentUploader");

    public final ListenableFuture a(MessagePartCoreData messagePartCoreData) {
        alvw h = a.h();
        h.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/net/AttachmentUploader", "upload", 48, "AttachmentUploader.java")).q("AttachmentUploader.upload being called on stub class");
        return aktp.ag(messagePartCoreData);
    }

    public final ListenableFuture b(MessagePartCoreData messagePartCoreData) {
        alvw h = a.h();
        h.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/net/AttachmentUploader", "uploadDownSizedImage", 56, "AttachmentUploader.java")).q("AttachmentUploader.upload being called on stub class");
        return aktp.ag(messagePartCoreData);
    }
}
