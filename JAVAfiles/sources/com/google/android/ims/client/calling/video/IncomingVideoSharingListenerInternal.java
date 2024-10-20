package com.google.android.ims.client.calling.video;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IncomingVideoSharingListenerInternal extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IncomingVideoSharingListenerInternal {
        static final int TRANSACTION_onIncomingVideoSharingParametersChanged = 4;
        static final int TRANSACTION_onIncomingVideoSharingStartFailed = 2;
        static final int TRANSACTION_onIncomingVideoSharingStarted = 1;
        static final int TRANSACTION_onIncomingVideoSharingStopped = 3;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IncomingVideoSharingListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal");
            }

            @Override // com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal
            public void onIncomingVideoSharingParametersChanged(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal
            public void onIncomingVideoSharingStartFailed(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal
            public void onIncomingVideoSharingStarted(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal
            public void onIncomingVideoSharingStopped(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal");
        }

        public static IncomingVideoSharingListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal");
            if (queryLocalInterface instanceof IncomingVideoSharingListenerInternal) {
                return (IncomingVideoSharingListenerInternal) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        String readString = parcel.readString();
                        Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                        enforceNoDataAvail(parcel);
                        onIncomingVideoSharingParametersChanged(readString, bundle);
                    } else {
                        String readString2 = parcel.readString();
                        int readInt = parcel.readInt();
                        Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                        enforceNoDataAvail(parcel);
                        onIncomingVideoSharingStopped(readString2, readInt, bundle2);
                    }
                } else {
                    String readString3 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onIncomingVideoSharingStartFailed(readString3, readInt2, bundle3);
                }
            } else {
                String readString4 = parcel.readString();
                Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onIncomingVideoSharingStarted(readString4, bundle4);
            }
            return true;
        }
    }

    void onIncomingVideoSharingParametersChanged(String str, Bundle bundle);

    void onIncomingVideoSharingStartFailed(String str, int i, Bundle bundle);

    void onIncomingVideoSharingStarted(String str, Bundle bundle);

    void onIncomingVideoSharingStopped(String str, int i, Bundle bundle);
}
