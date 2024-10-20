package defpackage;

import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsg implements ajsj {
    public static final /* synthetic */ int a = 0;
    private static final ajsf b;
    private static final ajsf c;
    private static final ajsf d;
    private static final ajsf e;
    private static final ajsf f;
    private static final ajsf g;
    private static final alog h;

    static {
        ajsf a2 = ajsf.a(ajrs.a, ChatMessage.class, new agmr(12));
        b = a2;
        ajsf a3 = ajsf.a(ajry.a, IsComposingMessage.class, new agmr(13));
        c = a3;
        ajsf a4 = ajsf.a(ajrv.a, FileTransferInformation.class, new agmr(14));
        d = a4;
        ajsf a5 = ajsf.a(ajrr.a, BasicTextMessage.class, new agmr(15));
        e = a5;
        ajsf a6 = ajsf.a(ajsa.a, MessageReceipt.class, new agmr(16));
        f = a6;
        ajsf a7 = ajsf.a(ajrz.a, LocationInformation.class, new agmr(17));
        g = a7;
        h = alog.w(a3, a4, a5, a6, a7, a2);
    }

    @Override // defpackage.ajsj
    public final ajsi a(ContentType contentType) {
        return ((ajsf) Collection.EL.stream(h).filter(new agol(contentType, 10)).findAny().orElse(b)).b();
    }

    @Override // defpackage.ajsj
    public final ajsi b(Class cls) {
        return ((ajsf) Collection.EL.stream(h).filter(new agol(cls, 9)).findAny().orElseThrow(new adpp(cls, 8))).b();
    }
}
