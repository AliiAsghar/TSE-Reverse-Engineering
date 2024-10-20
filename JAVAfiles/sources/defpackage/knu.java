package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knu implements rin {
    public static final xze a = xze.f("BugleDiagnostics", knu.class);
    public final rio b;
    public CountDownLatch c;
    public ConversationIdType d = ruy.a;

    public knu(rio rioVar) {
        this.b = rioVar;
    }

    @Override // defpackage.rin
    public final void a(rhj rhjVar, Object obj) {
        this.d = ruy.a;
        this.c.countDown();
    }

    @Override // defpackage.rin
    public final void b(rhj rhjVar, Object obj, ConversationIdType conversationIdType) {
        this.d = conversationIdType;
        this.c.countDown();
    }
}
