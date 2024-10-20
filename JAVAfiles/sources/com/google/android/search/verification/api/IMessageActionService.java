package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IMessageActionService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IMessageActionService {
        static final int TRANSACTION_sendMessage = 1;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IMessageActionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.search.verification.api.IMessageActionService");
            }

            @Override // com.google.android.search.verification.api.IMessageActionService
            public void sendMessage(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, intent);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.search.verification.api.IMessageActionService");
        }

        public static IMessageActionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.IMessageActionService");
            if (queryLocalInterface instanceof IMessageActionService) {
                return (IMessageActionService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Intent intent = (Intent) iax.a(parcel, Intent.CREATOR);
                enforceNoDataAvail(parcel);
                sendMessage(intent);
                return true;
            }
            return false;
        }
    }

    void sendMessage(Intent intent);
}
