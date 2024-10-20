package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class nce extends arrm implements arqr {
    public static final nce a = new nce();

    public nce() {
        super(1, MessagePartData.class, "isEndOfEmergency", "isEndOfEmergency()Z", 0);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessagePartData messagePartData = (MessagePartData) obj;
        messagePartData.getClass();
        return Boolean.valueOf(messagePartData.be());
    }
}
