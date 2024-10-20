package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uva implements ancs {
    private final /* synthetic */ int a;

    public /* synthetic */ uva(int i) {
        this.a = i;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        switch (this.a) {
            case 0:
                return ((vbq) obj).u();
            case 1:
                return ((vbq) obj).u();
            case 2:
                return aktp.ag(upm.b());
            case 3:
                return aktp.ag(upm.b());
            case 4:
                return ((unz) obj).a();
            case 5:
                return aktp.af(new aqwb(Status.f.d((TimeoutException) obj)));
            case 6:
                return aktp.af(new aqwb(Status.i.d(new IllegalStateException("Refresh failed and not allowed to re-register"))));
            case 7:
                return ((vbq) obj).q();
            case 8:
                return ((vbq) obj).l(vaz.FORCE_REFRESH);
            case 9:
                return ((vbq) obj).l(vaz.FORCE_REFRESH);
            case 10:
                return ((vbq) obj).q();
            case 11:
                Exception exc = (Exception) obj;
                vcm.a.n("Failed to verify tachyon registration", exc);
                throw exc;
            case 12:
                return ((BugleConversation) obj).d().b();
            case 13:
                Throwable th = (Throwable) obj;
                alvw i = vgk.a.i();
                i.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", (char) 133, "PullHandlerImpl.java")).q("Failure calling pull messages or handling results");
                return aktp.af(th);
            case 14:
                return ((vbq) obj).u();
            case 15:
                return aktp.ag(upm.e());
            case 16:
                return aktp.ag(upm.e());
            case 17:
                return aktp.ag(upm.e());
            case 18:
                return aktp.ag(upm.e());
            case 19:
                xze xzeVar = woe.a;
                return ((unz) obj).b().h(new woc(3), andi.a);
            default:
                xze xzeVar2 = woe.a;
                return ((unz) obj).b().h(new woc(2), andi.a);
        }
    }
}
