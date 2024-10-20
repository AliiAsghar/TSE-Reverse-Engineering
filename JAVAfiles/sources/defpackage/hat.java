package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hat implements IWorkManagerImplCallback {
    private final IBinder a;

    public hat(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void onFailure(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void onSuccess(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeByteArray(bArr);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
