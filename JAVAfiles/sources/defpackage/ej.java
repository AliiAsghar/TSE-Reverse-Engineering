package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.IResultReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ej implements IResultReceiver {
    private final IBinder a;

    public ej(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.os.IResultReceiver
    public final void send(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeInt(i);
            a.f(obtain, bundle);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
