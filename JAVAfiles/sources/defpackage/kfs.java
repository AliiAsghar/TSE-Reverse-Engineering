package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfs {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl");
    public final arwe b;
    public final mjg c;
    public final AtomicBoolean d;
    public final asai e;
    public final asai f;
    public kfy g;
    public final nei h;
    public final lfl i;
    private final armf j;
    private final MessageId k;

    public kfs(arwe arweVar, nei neiVar, lfl lflVar, mjg mjgVar, armf armfVar, OpenConversation2Arguments openConversation2Arguments, obq obqVar, armf armfVar2) {
        asai aghwVar;
        asai aghwVar2;
        arweVar.getClass();
        lflVar.getClass();
        mjgVar.getClass();
        armfVar.getClass();
        openConversation2Arguments.getClass();
        armfVar2.getClass();
        this.b = arweVar;
        this.h = neiVar;
        this.i = lflVar;
        this.c = mjgVar;
        this.j = armfVar;
        this.d = new AtomicBoolean(false);
        if (((ansy) ((nkv) obqVar).a.b()).e("bugle.use_last_read_marker")) {
            asai h = qjh.h(new kdz(this, 10));
            long j = arut.a;
            Object b = armfVar.b();
            b.getClass();
            aghwVar = qkq.b(h, arsd.p(((Number) b).longValue(), aruv.c), new jcw((arpe) null, 5, (boolean[]) null));
        } else {
            aghwVar = new aghw(null, 9);
        }
        this.e = aghwVar;
        if (((ock) armfVar2.b()).a()) {
            asai h2 = qjh.h(new kdz(this, 9));
            long j2 = arut.a;
            Object b2 = armfVar.b();
            b2.getClass();
            aghwVar2 = qkq.b(h2, arsd.p(((Number) b2).longValue(), aruv.c), new jcw((arpe) null, 4, (int[]) null));
        } else {
            aghwVar2 = new aghw(null, 9);
        }
        this.f = aghwVar2;
        this.k = openConversation2Arguments.b;
    }

    public final asai a() {
        ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl", "getInitialMessageId", 145, "MessageListPagingDataProviderImpl.kt")).t("getInitialMessageId - searchedMessagedId: %s", this.k);
        MessageId messageId = this.k;
        if (messageId != null) {
            return new aghw(new kfk(messageId), 9);
        }
        return new jxj(this.e, 12);
    }
}
