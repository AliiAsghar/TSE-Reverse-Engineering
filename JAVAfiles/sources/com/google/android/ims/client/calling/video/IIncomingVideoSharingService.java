package com.google.android.ims.client.calling.video;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IIncomingVideoSharingService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IIncomingVideoSharingService {
        static final int TRANSACTION_acceptVideo = 3;
        static final int TRANSACTION_registerIncomingVideoSharingListener = 1;
        static final int TRANSACTION_rejectVideo = 2;
        static final int TRANSACTION_stopVideo = 4;
        static final int TRANSACTION_updateParameters = 5;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IIncomingVideoSharingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int acceptVideo(String str, IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, incomingVideoSharingListenerInternal);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public void registerIncomingVideoSharingListener(IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, incomingVideoSharingListenerInternal);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int rejectVideo(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int stopVideo(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int updateParameters(String str, Bundle bundle) {
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
            super("com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
        }

        public static IIncomingVideoSharingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
            if (queryLocalInterface instanceof IIncomingVideoSharingService) {
                return (IIncomingVideoSharingService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            String readString = parcel.readString();
                            Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                            enforceNoDataAvail(parcel);
                            int updateParameters = updateParameters(readString, bundle);
                            parcel2.writeNoException();
                            parcel2.writeInt(updateParameters);
                        } else {
                            String readString2 = parcel.readString();
                            Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                            enforceNoDataAvail(parcel);
                            int stopVideo = stopVideo(readString2, bundle2);
                            parcel2.writeNoException();
                            parcel2.writeInt(stopVideo);
                        }
                    } else {
                        String readString3 = parcel.readString();
                        IncomingVideoSharingListenerInternal asInterface = IncomingVideoSharingListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                        Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                        enforceNoDataAvail(parcel);
                        int acceptVideo = acceptVideo(readString3, asInterface, bundle3);
                        parcel2.writeNoException();
                        parcel2.writeInt(acceptVideo);
                    }
                } else {
                    String readString4 = parcel.readString();
                    Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int rejectVideo = rejectVideo(readString4, bundle4);
                    parcel2.writeNoException();
                    parcel2.writeInt(rejectVideo);
                }
            } else {
                IncomingVideoSharingListenerInternal asInterface2 = IncomingVideoSharingListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                registerIncomingVideoSharingListener(asInterface2, bundle5);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    int acceptVideo(String str, IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle);

    void registerIncomingVideoSharingListener(IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle);

    int rejectVideo(String str, Bundle bundle);

    int stopVideo(String str, Bundle bundle);

    int updateParameters(String str, Bundle bundle);
}
