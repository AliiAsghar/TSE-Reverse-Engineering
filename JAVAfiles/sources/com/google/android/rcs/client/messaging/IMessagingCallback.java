package com.google.android.rcs.client.messaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IMessagingCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IMessagingCallback {
        static final int TRANSACTION_onGroupCompleted = 2;
        static final int TRANSACTION_onMessagingCompleted = 1;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IMessagingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.rcs.client.messaging.IMessagingCallback");
            }

            @Override // com.google.android.rcs.client.messaging.IMessagingCallback
            public void onGroupCompleted(GroupOperationResult groupOperationResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, groupOperationResult);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.rcs.client.messaging.IMessagingCallback
            public void onMessagingCompleted(MessagingOperationResult messagingOperationResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, messagingOperationResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.rcs.client.messaging.IMessagingCallback");
        }

        public static IMessagingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.rcs.client.messaging.IMessagingCallback");
            if (queryLocalInterface instanceof IMessagingCallback) {
                return (IMessagingCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                GroupOperationResult groupOperationResult = (GroupOperationResult) iax.a(parcel, GroupOperationResult.CREATOR);
                enforceNoDataAvail(parcel);
                onGroupCompleted(groupOperationResult);
            } else {
                MessagingOperationResult messagingOperationResult = (MessagingOperationResult) iax.a(parcel, MessagingOperationResult.CREATOR);
                enforceNoDataAvail(parcel);
                onMessagingCompleted(messagingOperationResult);
            }
            return true;
        }
    }

    void onGroupCompleted(GroupOperationResult groupOperationResult);

    void onMessagingCompleted(MessagingOperationResult messagingOperationResult);
}
