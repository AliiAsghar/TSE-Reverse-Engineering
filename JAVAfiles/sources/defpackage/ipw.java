package defpackage;

import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ipw extends arrm implements arqr {
    public static final ipw a = new ipw();

    public ipw() {
        super(1, ipq.class, "toVideoGalleryMedia", "toVideoGalleryMedia(Lcom/google/android/apps/messaging/shared/datamodel/data/message/part/MessagePartCoreData;)Lcom/google/android/libraries/compose/media/local/LocalMedia;", 1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        afru afruVar;
        afcp a2;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        messagePartCoreData.getClass();
        if (messagePartCoreData.bm()) {
            String U = messagePartCoreData.U();
            if (U != null) {
                afruVar = afrt.b(U);
            } else {
                afruVar = null;
            }
            if (afruVar instanceof aftm) {
                aftm aftmVar = (aftm) afruVar;
                String valueOf = String.valueOf(messagePartCoreData.v());
                int c = messagePartCoreData.c();
                int b = messagePartCoreData.b();
                long p = messagePartCoreData.p();
                Instant ofEpochMilli = Instant.ofEpochMilli(messagePartCoreData.m());
                ofEpochMilli.getClass();
                ameb M = messagePartCoreData.M();
                if (M == null || M.ordinal() != 38) {
                    ameb M2 = messagePartCoreData.M();
                    M2.getClass();
                    a2 = imr.a(M2);
                } else {
                    a2 = VideoTrimmerSource.a;
                }
                afcp afcpVar = a2;
                Duration ofMillis = Duration.ofMillis(messagePartCoreData.k());
                ofMillis.getClass();
                return new aftq(aftmVar, valueOf, null, null, c, b, p, ofEpochMilli, afcpVar, ofMillis, 12);
            }
            throw new IllegalStateException(a.cc(afruVar, "MessagePartCoreData with invalid format: ", " cannot be converted to Compose media"));
        }
        throw new IllegalStateException("Check failed.");
    }
}
