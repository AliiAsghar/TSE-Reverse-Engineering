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
public interface OutgoingVideoSharingListenerInternal extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements OutgoingVideoSharingListenerInternal {
        static final int TRANSACTION_onOutgoingVideoSharingStartFailed = 2;
        static final int TRANSACTION_onOutgoingVideoSharingStarted = 1;
        static final int TRANSACTION_onOutgoingVideoSharingStatusUpdated = 4;
        static final int TRANSACTION_onOutgoingVideoSharingStopped = 3;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements OutgoingVideoSharingListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStartFailed(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStarted(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStatusUpdated(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStopped(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
        }

        public static OutgoingVideoSharingListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
            if (queryLocalInterface instanceof OutgoingVideoSharingListenerInternal) {
                return (OutgoingVideoSharingListenerInternal) queryLocalInterface;
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
                        int readInt = parcel.readInt();
                        Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                        enforceNoDataAvail(parcel);
                        onOutgoingVideoSharingStatusUpdated(readString, readInt, bundle);
                    } else {
                        String readString2 = parcel.readString();
                        int readInt2 = parcel.readInt();
                        Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                        enforceNoDataAvail(parcel);
                        onOutgoingVideoSharingStopped(readString2, readInt2, bundle2);
                    }
                } else {
                    String readString3 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOutgoingVideoSharingStartFailed(readString3, readInt3, bundle3);
                }
            } else {
                String readString4 = parcel.readString();
                Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStarted(readString4, bundle4);
            }
            return true;
        }
    }

    void onOutgoingVideoSharingStartFailed(String str, int i, Bundle bundle);

    void onOutgoingVideoSharingStarted(String str, Bundle bundle);

    void onOutgoingVideoSharingStatusUpdated(String str, int i, Bundle bundle);

    void onOutgoingVideoSharingStopped(String str, int i, Bundle bundle);
}
