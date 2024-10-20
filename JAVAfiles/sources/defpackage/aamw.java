package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamw extends arpw implements arqw {
    final /* synthetic */ LoadMessagesReceiver a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamw(LoadMessagesReceiver loadMessagesReceiver, long j, boolean z, arpe arpeVar) {
        super(3, arpeVar);
        this.a = loadMessagesReceiver;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new aamw(this.a, this.b, this.c, (arpe) obj3).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        long a = ((xnv) this.a.l().b()).a();
        alvw g = LoadMessagesReceiver.d.g();
        g.X(alwp.a, "BugleTests");
        ((alvg) g.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$4", "invokeSuspend", 153, "LoadMessagesReceiver.kt")).s("Completed in %d ms", a - this.b);
        if (this.c) {
            alvw g2 = LoadMessagesReceiver.d.g();
            g2.X(alwp.a, "BugleTests");
            ((alvg) g2.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$4", "invokeSuspend", 155, "LoadMessagesReceiver.kt")).q("Requesting full blocking sync");
            ((wzp) this.a.g().b()).q(true);
            ((wzp) this.a.g().b()).k(amvm.FAKE_MESSAGE_GENERATOR);
        }
        return arnb.a;
    }
}
