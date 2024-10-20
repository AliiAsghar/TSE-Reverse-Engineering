package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyb extends aqyc {
    public aqyb(IBinder iBinder) {
        super(iBinder);
    }

    @Override // defpackage.aqyc
    public final void a(int i, aqyg aqygVar) {
        if (c(i, aqygVar.b())) {
        } else {
            throw new RemoteException(a.cb(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
        }
    }
}
