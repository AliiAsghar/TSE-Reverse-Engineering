package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kao implements kkl {
    public final Object a;
    private final /* synthetic */ int b;

    public kao(Conversation conversation, int i) {
        this.b = i;
        this.a = conversation;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((khl) this.a.b()).f();
                    return;
                }
                qrm qrmVar = (qrm) this.a.b();
                if (qrmVar.f != null) {
                    qrmVar.a();
                    qrmVar.f = null;
                    return;
                }
                return;
            }
            this.a.close();
        }
    }

    public kao(Context context, ConnectivityManager connectivityManager, arwe arweVar, akbm akbmVar, arwe arweVar2, arpi arpiVar, int i) {
        this.b = i;
        context.getClass();
        connectivityManager.getClass();
        arweVar.getClass();
        akbmVar.getClass();
        arweVar2.getClass();
        arpiVar.getClass();
        this.a = new AtomicBoolean(true);
        new kan(this);
    }

    public kao(armf armfVar, int i) {
        this.b = i;
        armfVar.getClass();
        this.a = armfVar;
    }

    public kao(armf armfVar, int i, byte[] bArr) {
        this.b = i;
        armfVar.getClass();
        this.a = armfVar;
    }
}
