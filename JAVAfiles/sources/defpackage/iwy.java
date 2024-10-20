package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwy extends ijy<ikj> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwy(ixd ixdVar) {
        super("Message count");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        boolean z;
        int intExtra;
        ikj ikjVar = (ikj) obj;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$8", "onNewData", 2311, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Message count");
        alvw g = ixd.a.g();
        g.X(alwp.a, "Bugle");
        alvg alvgVar2 = (alvg) g;
        ixd ixdVar = this.a;
        alvgVar2.X(ydl.p, ixdVar.L);
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onConversationMessagesUpdated", 4723, "ConversationFragmentPeer.java")).t("ConversationFragment: onConversationMessagesUpdated messagesUpdated: %s", ikjVar);
        int i = ikjVar.a;
        int i2 = ikjVar.b;
        rrb rrbVar = ixdVar.ca;
        lex lexVar = ixdVar.cB;
        int i3 = ((rrl) rrbVar.a()).b.c;
        lexVar.v.isPresent();
        ConversationActivityUsageStatisticsState m = lexVar.m();
        boolean c = lexVar.d().c();
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (c) {
            m.d = i;
            m.e = z;
            m.i = i3;
        } else if (m.b < 0) {
            m.b = i;
            m.e = z;
            m.i = i3;
            lexVar.z();
        }
        Intent s = ixdVar.s();
        if (s == null) {
            intExtra = -1;
        } else {
            intExtra = s.getIntExtra("message_position", -1);
        }
        if (intExtra >= 0) {
            alvw f = ixd.a.f();
            f.X(alwp.a, "Bugle");
            alvg alvgVar3 = (alvg) f;
            alvgVar3.X(ydl.p, ixdVar.L);
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onConversationMessagesUpdated", 4736, "ConversationFragmentPeer.java")).r("ConversationFragment: onConversationMessagesUpdated scrollToPos: %d", intExtra);
            Intent s2 = ixdVar.s();
            if (s2 != null) {
                s2.putExtra("message_position", -1);
            }
        }
        ixdVar.cB.g();
    }
}
