package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xrl implements Runnable {
    public final /* synthetic */ xrm a;
    public final /* synthetic */ ConversationIdType b;
    public final /* synthetic */ MessageIdType c;
    public final /* synthetic */ MessagePartCoreData d;
    public final /* synthetic */ Uri e;
    public final /* synthetic */ tqi f;
    public final /* synthetic */ MessageCoreData g;
    private final /* synthetic */ int h;

    public /* synthetic */ xrl(xrm xrmVar, ConversationIdType conversationIdType, MessageIdType messageIdType, MessagePartCoreData messagePartCoreData, Uri uri, tqi tqiVar, MessageCoreData messageCoreData, int i) {
        this.h = i;
        this.a = xrmVar;
        this.b = conversationIdType;
        this.c = messageIdType;
        this.d = messagePartCoreData;
        this.e = uri;
        this.f = tqiVar;
        this.g = messageCoreData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h != 0) {
            MessageCoreData messageCoreData = this.g;
            tqi tqiVar = this.f;
            Uri uri = this.e;
            MessagePartCoreData messagePartCoreData = this.d;
            MessageIdType messageIdType = this.c;
            ConversationIdType conversationIdType = this.b;
            xrm xrmVar = this.a;
            xrmVar.k.e("ThumbnailDownloadCompletedHandler.updateThumbnailInBugleDb", new xrl(xrmVar, conversationIdType, messageIdType, messagePartCoreData, uri, tqiVar, messageCoreData, 0));
            ((xcs) xrmVar.j.b()).o(messageCoreData.E().f(), new ahka("ToThumbnailDownloaded"), xcr.TACHYGRAM_MESSAGE_ARRIVED);
            xet xetVar = new xet(8);
            xqc xqcVar = xrmVar.m;
            ((mbb) xqcVar.b.b()).a().b(xqcVar.c(messageCoreData, 34, xetVar), mbt.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
            return;
        }
        xrm xrmVar2 = this.a;
        rxc rxcVar = (rxc) xrmVar2.h.b();
        String Z = this.d.Z();
        tbt tbtVar = new tbt();
        tbtVar.aj("updateThumbnailInBugleDb");
        tbtVar.o(this.e);
        tbtVar.k(this.f);
        MessageIdType messageIdType2 = this.c;
        ConversationIdType conversationIdType2 = this.b;
        rxcVar.e(conversationIdType2, messageIdType2, Z, tbtVar);
        MessageCoreData k = ((rwd) xrmVar2.g.b()).k(conversationIdType2);
        if (k != null && !k.B().equals(messageIdType2)) {
            return;
        }
        ((ruq) xrmVar2.i.b()).e(conversationIdType2, messageIdType2, Long.valueOf(this.g.n()), tqc.UNARCHIVED, -1L, null);
    }
}
