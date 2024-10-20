package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.customtabs.trusted.ITrustedWebActivityService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ax implements ITrustedWebActivityService {
    private final IBinder a;

    public ax(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle areNotificationsEnabled(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            d.c(obtain, bundle, 0);
            this.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) a.d(obtain2, Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final void cancelNotification(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            d.c(obtain, bundle, 0);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            d.c(obtain, bundle, 0);
            obtain.writeStrongBinder(iBinder);
            this.a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) a.d(obtain2, Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle getActiveNotifications() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) a.d(obtain2, Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle getSmallIconBitmap() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) a.d(obtain2, Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final int getSmallIconId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle notifyNotificationWithChannel(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            d.c(obtain, bundle, 0);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) a.d(obtain2, Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
