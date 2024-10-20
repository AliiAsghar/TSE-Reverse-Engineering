package com.google.android.gms.kids.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IParentalControlsListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IParentalControlsListener {
        static final int TRANSACTION_onParentalControlsChange = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IParentalControlsListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IParentalControlsListener");
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsListener
            public void onParentalControlsChange(boolean z, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i2 = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IParentalControlsListener");
        }

        public static IParentalControlsListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IParentalControlsListener");
            if (queryLocalInterface instanceof IParentalControlsListener) {
                return (IParentalControlsListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                boolean g = iax.g(parcel);
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                onParentalControlsChange(g, readInt);
                return true;
            }
            return false;
        }
    }

    void onParentalControlsChange(boolean z, int i);
}
