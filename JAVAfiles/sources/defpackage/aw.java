package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aw implements ITrustedWebActivityCallback {
    private final IBinder a;

    public aw(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            a.f(obtain, bundle);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
