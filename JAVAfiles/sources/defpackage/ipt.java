package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ipt extends arrm implements arqr {
    public static final ipt a = new ipt();

    public ipt() {
        super(1, ipq.class, "toStickerMedia", "toStickerMedia(Lcom/google/android/apps/messaging/shared/datamodel/data/message/part/MessagePartCoreData;)Lcom/google/android/libraries/compose/sticker/data/StickerMedia;", 1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        afqq afqqVar;
        ampm ampmVar;
        ampk ampkVar;
        String str;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        messagePartCoreData.getClass();
        amoq N = messagePartCoreData.N();
        if (N != null) {
            if (N.e == 203) {
                ampmVar = (ampm) N.f;
            } else {
                ampmVar = ampm.a;
            }
            if (ampmVar != null) {
                if (ampmVar.c == 105) {
                    ampkVar = (ampk) ampmVar.d;
                } else {
                    ampkVar = ampk.a;
                }
                if (ampkVar != null && (str = ampkVar.c) != null && !arsd.M(str)) {
                    afqqVar = afxq.a;
                    afqq afqqVar2 = afqqVar;
                    return new afxr("", "", "", aqjn.y(ipq.a(messagePartCoreData, afqqVar2)), afqqVar2);
                }
            }
        }
        afqqVar = afqp.a;
        afqq afqqVar22 = afqqVar;
        return new afxr("", "", "", aqjn.y(ipq.a(messagePartCoreData, afqqVar22)), afqqVar22);
    }
}
