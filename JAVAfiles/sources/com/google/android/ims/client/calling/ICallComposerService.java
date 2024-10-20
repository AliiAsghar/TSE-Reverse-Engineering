package com.google.android.ims.client.calling;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.calling.CallComposerListenerInternal;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ICallComposerService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements ICallComposerService {
        static final int TRANSACTION_prepareCallComposer = 1;
        static final int TRANSACTION_releaseCallComposer = 3;
        static final int TRANSACTION_sendCallComposerContent = 2;
        static final int TRANSACTION_sendCallComposerImage = 4;
        static final int TRANSACTION_sendCallComposerNotification = 6;
        static final int TRANSACTION_terminateCallComposerImageSending = 5;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements ICallComposerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.ICallComposerService");
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int prepareCallComposer(String str, CallComposerListenerInternal callComposerListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, callComposerListenerInternal);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int releaseCallComposer(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int sendCallComposerContent(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int sendCallComposerImage(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int sendCallComposerNotification(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int terminateCallComposerImageSending(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.ICallComposerService");
        }

        public static ICallComposerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.ICallComposerService");
            if (queryLocalInterface instanceof ICallComposerService) {
                return (ICallComposerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String readString = parcel.readString();
                    CallComposerListenerInternal asInterface = CallComposerListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int prepareCallComposer = prepareCallComposer(readString, asInterface, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(prepareCallComposer);
                    return true;
                case 2:
                    String readString2 = parcel.readString();
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int sendCallComposerContent = sendCallComposerContent(readString2, bundle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(sendCallComposerContent);
                    return true;
                case 3:
                    String readString3 = parcel.readString();
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int releaseCallComposer = releaseCallComposer(readString3, bundle3);
                    parcel2.writeNoException();
                    parcel2.writeInt(releaseCallComposer);
                    return true;
                case 4:
                    String readString4 = parcel.readString();
                    Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int sendCallComposerImage = sendCallComposerImage(readString4, bundle4);
                    parcel2.writeNoException();
                    parcel2.writeInt(sendCallComposerImage);
                    return true;
                case 5:
                    String readString5 = parcel.readString();
                    Bundle bundle5 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int terminateCallComposerImageSending = terminateCallComposerImageSending(readString5, bundle5);
                    parcel2.writeNoException();
                    parcel2.writeInt(terminateCallComposerImageSending);
                    return true;
                case 6:
                    String readString6 = parcel.readString();
                    int readInt = parcel.readInt();
                    Bundle bundle6 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int sendCallComposerNotification = sendCallComposerNotification(readString6, readInt, bundle6);
                    parcel2.writeNoException();
                    parcel2.writeInt(sendCallComposerNotification);
                    return true;
                default:
                    return false;
            }
        }
    }

    int prepareCallComposer(String str, CallComposerListenerInternal callComposerListenerInternal, Bundle bundle);

    int releaseCallComposer(String str, Bundle bundle);

    int sendCallComposerContent(String str, Bundle bundle);

    int sendCallComposerImage(String str, Bundle bundle);

    int sendCallComposerNotification(String str, int i, Bundle bundle);

    int terminateCallComposerImageSending(String str, Bundle bundle);
}
