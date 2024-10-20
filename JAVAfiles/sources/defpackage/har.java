package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class har implements IListenableWorkerImpl {
    private final IBinder a;

    public har(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public final void interrupt(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public final void startWork(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
