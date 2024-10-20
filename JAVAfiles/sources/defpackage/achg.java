package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class achg<T extends IInterface> extends abug<T> {
    public achg(Context context, Looper looper, int i, abua abuaVar, absf absfVar, abtc abtcVar, achu achuVar) {
        super(context, looper, i, abuaVar, absfVar, abtcVar);
        if (achuVar == null) {
        } else {
            throw null;
        }
    }

    public final IInterface K() {
        try {
            return w();
        } catch (IllegalStateException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.icing.INDEX_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("ComponentName", null);
        return bundle;
    }
}
