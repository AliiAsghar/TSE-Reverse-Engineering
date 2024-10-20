package com.google.android.gms.mobstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.mobstore.IMobStoreFileCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMobStoreFileService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMobStoreFileService {
        static final int TRANSACTION_deleteFile = 2;
        static final int TRANSACTION_openFileDescriptor = 1;
        static final int TRANSACTION_rename = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMobStoreFileService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileService");
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void deleteFile(IMobStoreFileCallbacks iMobStoreFileCallbacks, DeleteFileRequest deleteFileRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                iax.d(obtainAndWriteInterfaceToken, deleteFileRequest);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void openFileDescriptor(IMobStoreFileCallbacks iMobStoreFileCallbacks, OpenFileDescriptorRequest openFileDescriptorRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                iax.d(obtainAndWriteInterfaceToken, openFileDescriptorRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void rename(IMobStoreFileCallbacks iMobStoreFileCallbacks, RenameRequest renameRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                iax.d(obtainAndWriteInterfaceToken, renameRequest);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mobstore.IMobStoreFileService");
        }

        public static IMobStoreFileService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
            if (queryLocalInterface instanceof IMobStoreFileService) {
                return (IMobStoreFileService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    IMobStoreFileCallbacks asInterface = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RenameRequest renameRequest = (RenameRequest) iax.a(parcel, RenameRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    rename(asInterface, renameRequest);
                } else {
                    IMobStoreFileCallbacks asInterface2 = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    DeleteFileRequest deleteFileRequest = (DeleteFileRequest) iax.a(parcel, DeleteFileRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteFile(asInterface2, deleteFileRequest);
                }
            } else {
                IMobStoreFileCallbacks asInterface3 = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                OpenFileDescriptorRequest openFileDescriptorRequest = (OpenFileDescriptorRequest) iax.a(parcel, OpenFileDescriptorRequest.CREATOR);
                enforceNoDataAvail(parcel);
                openFileDescriptor(asInterface3, openFileDescriptorRequest);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void deleteFile(IMobStoreFileCallbacks iMobStoreFileCallbacks, DeleteFileRequest deleteFileRequest);

    void openFileDescriptor(IMobStoreFileCallbacks iMobStoreFileCallbacks, OpenFileDescriptorRequest openFileDescriptorRequest);

    void rename(IMobStoreFileCallbacks iMobStoreFileCallbacks, RenameRequest renameRequest);
}
