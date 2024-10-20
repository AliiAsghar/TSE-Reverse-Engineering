package com.google.android.ims.client.calling.video;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IOutgoingVideoSharingService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IOutgoingVideoSharingService {
        static final int TRANSACTION_pauseVideo = 4;
        static final int TRANSACTION_registerOutgoingVideoSharingListener = 1;
        static final int TRANSACTION_resumeVideo = 5;
        static final int TRANSACTION_startVideo = 2;
        static final int TRANSACTION_stopVideo = 3;
        static final int TRANSACTION_updateParameters = 6;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IOutgoingVideoSharingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.IOutgoingVideoSharingService");
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int pauseVideo(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public void registerOutgoingVideoSharingListener(OutgoingVideoSharingListenerInternal outgoingVideoSharingListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, outgoingVideoSharingListenerInternal);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int resumeVideo(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int startVideo(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int stopVideo(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int updateParameters(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.video.IOutgoingVideoSharingService");
        }

        public static IOutgoingVideoSharingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.IOutgoingVideoSharingService");
            if (queryLocalInterface instanceof IOutgoingVideoSharingService) {
                return (IOutgoingVideoSharingService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    OutgoingVideoSharingListenerInternal asInterface = OutgoingVideoSharingListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerOutgoingVideoSharingListener(asInterface, bundle);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    String readString = parcel.readString();
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int startVideo = startVideo(readString, bundle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(startVideo);
                    return true;
                case 3:
                    String readString2 = parcel.readString();
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int stopVideo = stopVideo(readString2, bundle3);
                    parcel2.writeNoException();
                    parcel2.writeInt(stopVideo);
                    return true;
                case 4:
                    String readString3 = parcel.readString();
                    Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int pauseVideo = pauseVideo(readString3, bundle4);
                    parcel2.writeNoException();
                    parcel2.writeInt(pauseVideo);
                    return true;
                case 5:
                    String readString4 = parcel.readString();
                    Bundle bundle5 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int resumeVideo = resumeVideo(readString4, bundle5);
                    parcel2.writeNoException();
                    parcel2.writeInt(resumeVideo);
                    return true;
                case 6:
                    String readString5 = parcel.readString();
                    Bundle bundle6 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int updateParameters = updateParameters(readString5, bundle6);
                    parcel2.writeNoException();
                    parcel2.writeInt(updateParameters);
                    return true;
                default:
                    return false;
            }
        }
    }

    int pauseVideo(String str, Bundle bundle);

    void registerOutgoingVideoSharingListener(OutgoingVideoSharingListenerInternal outgoingVideoSharingListenerInternal, Bundle bundle);

    int resumeVideo(String str, Bundle bundle);

    int startVideo(String str, Bundle bundle);

    int stopVideo(String str, Bundle bundle);

    int updateParameters(String str, Bundle bundle);
}
