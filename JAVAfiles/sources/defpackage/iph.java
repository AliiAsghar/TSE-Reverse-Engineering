package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class iph extends arrm implements arqr {
    public static final iph a = new iph();

    public iph() {
        super(1, ipq.class, "toImageGalleryMedia", "toImageGalleryMedia(Lcom/google/android/apps/messaging/shared/datamodel/data/message/part/MessagePartCoreData;)Lcom/google/android/libraries/compose/media/local/LocalMedia;", 1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        afru afruVar;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        messagePartCoreData.getClass();
        if (messagePartCoreData.bm()) {
            String U = messagePartCoreData.U();
            if (U != null) {
                afruVar = afrt.b(U);
            } else {
                afruVar = null;
            }
            if (afruVar instanceof afsk) {
                afsk afskVar = (afsk) afruVar;
                String valueOf = String.valueOf(messagePartCoreData.v());
                int c = messagePartCoreData.c();
                int b = messagePartCoreData.b();
                long p = messagePartCoreData.p();
                Instant ofEpochMilli = Instant.ofEpochMilli(messagePartCoreData.m());
                ofEpochMilli.getClass();
                ameb M = messagePartCoreData.M();
                M.getClass();
                return new afto(afskVar, valueOf, null, null, c, b, p, ofEpochMilli, imr.a(M), 12);
            }
            throw new IllegalArgumentException(a.cc(afruVar, "MessagePartCoreData with invalid format: ", " cannot be converted to Compose media"));
        }
        throw new IllegalStateException("Check failed.");
    }
}
