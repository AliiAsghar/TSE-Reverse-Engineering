package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImpl;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class has implements IWorkManagerImpl {
    private final IBinder a;

    public has(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
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

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void setForegroundAsync(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void updateUniquePeriodicWorkRequest(String str, byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
