package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlv implements mlw {
    public final armf c;
    public final armf d;
    public final armf e;
    public final Object f = new Object();
    public Instant g = Instant.EPOCH;
    private final anen i;
    public static final alwo a = alwo.o("BugleConversation");
    private static final xny h = new xnx("BugleConversationUnlatcher::unlatchConversation");
    public static final Duration b = Duration.ofMinutes(2);

    public mlv(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.i = anenVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
    }

    @Override // defpackage.mlw
    public final akul a(BugleConversationId bugleConversationId) {
        akrh a2 = h.a();
        try {
            BugleConversation A = ((mlu) this.c.b()).A(bugleConversationId, false);
            ncq ncqVar = ((DefaultConversation) A).e;
            ncq f = A.f();
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(ydl.q, bugleConversationId);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatchingConversation", 85, "BugleConversationUnlatcher.java")).q("Unlatcher: Checking if conversation needs unlatching.");
            akul i = aktp.aj(new imi(bugleConversationId, ncqVar, 4), this.i).i(new mhv(this, bugleConversationId, f, 4, (byte[]) null), andi.a);
            a2.b(i);
            a2.close();
            return i;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
