package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ipb extends arrm implements arqr {
    public static final ipb a = new ipb();

    public ipb() {
        super(1, ipq.class, "toGifMedia", "toGifMedia(Lcom/google/android/apps/messaging/shared/datamodel/data/message/part/MessagePartCoreData;)Lcom/google/android/libraries/compose/gif/data/GifMedia;", 1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        messagePartCoreData.getClass();
        return new afql("", "", "", aqjn.y(ipq.a(messagePartCoreData, afqp.a)), null, 16);
    }
}
