package com.google.android.setupcompat.portal.v1_1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IPortalProgressCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IPortalProgressCallback {
        static final int TRANSACTION_setComplete = 5;
        static final int TRANSACTION_setFailure = 6;
        static final int TRANSACTION_setPendingReason = 4;
        static final int TRANSACTION_setProgressCount = 1;
        static final int TRANSACTION_setProgressPercentage = 2;
        static final int TRANSACTION_setSummary = 3;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IPortalProgressCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback");
            }

            @Override // com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback
            public Bundle setComplete(String str, int i, int[] iArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback
            public Bundle setFailure(String str, int i, int[] iArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback
            public Bundle setPendingReason(String str, int i, int[] iArr, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback
            public Bundle setProgressCount(int i, int i2, int i3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback
            public Bundle setProgressPercentage(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback
            public Bundle setSummary(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback");
        }

        public static IPortalProgressCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.v1_1.IPortalProgressCallback");
            if (queryLocalInterface instanceof IPortalProgressCallback) {
                return (IPortalProgressCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    Bundle progressCount = setProgressCount(readInt, readInt2, readInt3);
                    parcel2.writeNoException();
                    iax.e(parcel2, progressCount);
                    return true;
                case 2:
                    int readInt4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    Bundle progressPercentage = setProgressPercentage(readInt4);
                    parcel2.writeNoException();
                    iax.e(parcel2, progressPercentage);
                    return true;
                case 3:
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    Bundle summary = setSummary(readString);
                    parcel2.writeNoException();
                    iax.e(parcel2, summary);
                    return true;
                case 4:
                    String readString2 = parcel.readString();
                    int readInt5 = parcel.readInt();
                    int[] createIntArray = parcel.createIntArray();
                    int readInt6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    Bundle pendingReason = setPendingReason(readString2, readInt5, createIntArray, readInt6);
                    parcel2.writeNoException();
                    iax.e(parcel2, pendingReason);
                    return true;
                case 5:
                    String readString3 = parcel.readString();
                    int readInt7 = parcel.readInt();
                    int[] createIntArray2 = parcel.createIntArray();
                    enforceNoDataAvail(parcel);
                    Bundle complete = setComplete(readString3, readInt7, createIntArray2);
                    parcel2.writeNoException();
                    iax.e(parcel2, complete);
                    return true;
                case 6:
                    String readString4 = parcel.readString();
                    int readInt8 = parcel.readInt();
                    int[] createIntArray3 = parcel.createIntArray();
                    enforceNoDataAvail(parcel);
                    Bundle failure = setFailure(readString4, readInt8, createIntArray3);
                    parcel2.writeNoException();
                    iax.e(parcel2, failure);
                    return true;
                default:
                    return false;
            }
        }
    }

    Bundle setComplete(String str, int i, int[] iArr);

    Bundle setFailure(String str, int i, int[] iArr);

    Bundle setPendingReason(String str, int i, int[] iArr, int i2);

    Bundle setProgressCount(int i, int i2, int i3);

    Bundle setProgressPercentage(int i);

    Bundle setSummary(String str);
}
