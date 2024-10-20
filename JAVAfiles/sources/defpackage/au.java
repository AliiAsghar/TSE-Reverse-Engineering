package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.customtabs.IEngagementSignalsCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class au implements IEngagementSignalsCallback {
    private final IBinder a;

    public au(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeInt(i);
            a.f(obtain, bundle);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback
    public final void onSessionEnded(boolean z, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeInt(z ? 1 : 0);
            a.f(obtain, bundle);
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeInt(z ? 1 : 0);
            a.f(obtain, bundle);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
