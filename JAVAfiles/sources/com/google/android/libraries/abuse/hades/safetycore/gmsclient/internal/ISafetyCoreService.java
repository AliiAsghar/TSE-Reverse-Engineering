package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISafetyCoreService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements ISafetyCoreService {
        static final int TRANSACTION_classifyImageFileDescriptor = 4;
        static final int TRANSACTION_classifyParcelFileDescriptor = 2;
        static final int TRANSACTION_prewarm = 3;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements ISafetyCoreService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void classifyImageFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, ISafetyCoreCallbacks iSafetyCoreCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                iax.f(obtainAndWriteInterfaceToken, iSafetyCoreCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void classifyParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, ISafetyCoreCallbacks iSafetyCoreCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                iax.f(obtainAndWriteInterfaceToken, iSafetyCoreCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void prewarm(int[] iArr, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
        }

        public static ISafetyCoreService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
            if (queryLocalInterface instanceof ISafetyCoreService) {
                return (ISafetyCoreService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    int readInt = parcel.readInt();
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                    ISafetyCoreCallbacks asInterface = ISafetyCoreCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    classifyImageFileDescriptor(readInt, parcelFileDescriptor, asInterface);
                } else {
                    int[] createIntArray = parcel.createIntArray();
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    prewarm(createIntArray, asInterface2);
                }
            } else {
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                ISafetyCoreCallbacks asInterface3 = ISafetyCoreCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                classifyParcelFileDescriptor(parcelFileDescriptor2, asInterface3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void classifyImageFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, ISafetyCoreCallbacks iSafetyCoreCallbacks);

    void classifyParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, ISafetyCoreCallbacks iSafetyCoreCallbacks);

    void prewarm(int[] iArr, IStatusCallback iStatusCallback);
}
