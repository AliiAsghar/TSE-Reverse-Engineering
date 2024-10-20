package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abry extends BasePendingResult implements abrz {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abry(aaoc aaocVar, abrg abrgVar) {
        super(abrgVar);
        d.aC(abrgVar, "GoogleApiClient must not be null");
        d.aC(aaocVar, "Api must not be null");
        Object obj = aaocVar.b;
    }

    private final void l(RemoteException remoteException) {
        g(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void b(abqu abquVar);

    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void f(abqu abquVar) {
        try {
            b(abquVar);
        } catch (DeadObjectException e) {
            l(e);
            throw e;
        } catch (RemoteException e2) {
            l(e2);
        }
    }

    public final void g(Status status) {
        d.t(!status.c(), "Failed result must not be success");
        j(a(status));
    }
}
