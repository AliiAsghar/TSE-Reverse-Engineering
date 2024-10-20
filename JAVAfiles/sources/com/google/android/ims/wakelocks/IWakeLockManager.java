package com.google.android.ims.wakelocks;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IWakeLockManager extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IWakeLockManager {
        static final int TRANSACTION_acquire = 1;
        static final int TRANSACTION_release = 2;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IWakeLockManager {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.wakelocks.IWakeLockManager");
            }

            @Override // com.google.android.ims.wakelocks.IWakeLockManager
            public int acquire(IBinder iBinder, String str, int i, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.wakelocks.IWakeLockManager
            public void release(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.wakelocks.IWakeLockManager");
        }

        public static IWakeLockManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.wakelocks.IWakeLockManager");
            if (queryLocalInterface instanceof IWakeLockManager) {
                return (IWakeLockManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                release(readInt);
                parcel2.writeNoException();
            } else {
                IBinder readStrongBinder = parcel.readStrongBinder();
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                int acquire = acquire(readStrongBinder, readString, readInt2, readLong);
                parcel2.writeNoException();
                parcel2.writeInt(acquire);
            }
            return true;
        }
    }

    int acquire(IBinder iBinder, String str, int i, long j);

    void release(int i);
}
