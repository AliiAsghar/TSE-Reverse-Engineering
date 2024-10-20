package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMessengerCompat extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMessengerCompat {
        static final int TRANSACTION_send = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMessengerCompat {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
            }

            @Override // com.google.android.gms.iid.IMessengerCompat
            public void send(Message message) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, message);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.iid.IMessengerCompat");
        }

        public static IMessengerCompat asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            if (queryLocalInterface instanceof IMessengerCompat) {
                return (IMessengerCompat) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Message message = (Message) iax.a(parcel, Message.CREATOR);
                enforceNoDataAvail(parcel);
                send(message);
                return true;
            }
            return false;
        }
    }

    void send(Message message);
}
