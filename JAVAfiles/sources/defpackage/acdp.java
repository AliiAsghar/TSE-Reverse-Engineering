package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acdp implements acio {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public acdp(acit acitVar, int i) {
        this.b = i;
        this.a = acitVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.common.internal.ICancelToken, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.common.internal.ICancelToken, java.lang.Object] */
    @Override // defpackage.acio
    public final void a() {
        switch (this.b) {
            case 0:
                try {
                    this.a.cancel();
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            case 1:
                try {
                    this.a.cancel();
                    return;
                } catch (RemoteException unused2) {
                    return;
                }
            case 2:
                ((aciv) ((acit) this.a).a).w();
                return;
            case 3:
                ((hkd) this.a).d();
                return;
            case 4:
                ((hkd) this.a).d();
                return;
            case 5:
                this.a.cancel(true);
                return;
            case 6:
                this.a.cancel(true);
                return;
            case 7:
                this.a.cancel(true);
                return;
            default:
                this.a.cancel(true);
                return;
        }
    }

    public /* synthetic */ acdp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
