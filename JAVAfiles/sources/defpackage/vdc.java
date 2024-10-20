package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdc implements andy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public vdc(acit acitVar, ListenableFuture listenableFuture, acit acitVar2, int i) {
        this.d = i;
        this.b = acitVar;
        this.c = listenableFuture;
        this.a = acitVar2;
    }

    private final void c() {
        synchronized (this.a) {
            if (((ListenableFuture) ((agsw) this.a).b.get(this.c)) == this.b) {
                ((agsw) this.a).b.remove(this.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mbm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [mbl, java.lang.Object] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c();
                    return;
                }
                if (this.c.isCancelled()) {
                    ((acit) this.a).e();
                    return;
                }
                if (th instanceof Exception) {
                    ((acit) this.b).a((Exception) th);
                    return;
                } else {
                    ((acit) this.b).a(new ExecutionException(th));
                    return;
                }
            }
            alvw i2 = mui.a.i();
            i2.X(alwp.a, "BugleMapi");
            alvg alvgVar = (alvg) i2;
            alvgVar.X(ydl.q, this.a);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$1", "onFailure", 1725, "CoreBugleMessageRepository.java")).q((String) this.b);
            return;
        }
        this.a.c();
        String str = ((vdd) this.b).b;
        if (str == null) {
            return;
        }
        Object obj = this.c;
        ((wpp) obj).c.e(str, Status.c(th).getCode().value());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [mbm, java.lang.Object] */
    @Override // defpackage.andy
    public final void b(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c();
                    return;
                } else {
                    ((acit) this.b).b(obj);
                    return;
                }
            }
            alvw g = mui.a.g();
            g.X(alwp.a, "BugleMapi");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.q, this.a);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$1", "onSuccess", 1717, "CoreBugleMessageRepository.java")).q((String) this.c);
            return;
        }
        this.a.c();
        String str = ((vdd) this.b).b;
        if (str == null) {
            return;
        }
        Object obj2 = this.c;
        ((wpp) obj2).c.e(str, Status.b.getCode().value());
    }

    public vdc(agsw agswVar, String str, ListenableFuture listenableFuture, int i) {
        this.d = i;
        this.c = str;
        this.b = listenableFuture;
        this.a = agswVar;
    }

    public vdc(String str, BugleConversationId bugleConversationId, String str2, int i) {
        this.d = i;
        this.c = str;
        this.a = bugleConversationId;
        this.b = str2;
    }

    public vdc(wpp wppVar, mbm mbmVar, vdd vddVar, int i) {
        this.d = i;
        this.a = mbmVar;
        this.b = vddVar;
        this.c = wppVar;
    }
}
