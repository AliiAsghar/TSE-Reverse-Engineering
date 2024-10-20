package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.ICircleDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnCircleClickListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnCircleClickListener {
        static final int TRANSACTION_onCircleClick = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnCircleClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnCircleClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnCircleClickListener
            public void onCircleClick(ICircleDelegate iCircleDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iCircleDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnCircleClickListener");
        }

        public static IOnCircleClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCircleClickListener");
            if (queryLocalInterface instanceof IOnCircleClickListener) {
                return (IOnCircleClickListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ICircleDelegate asInterface = ICircleDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onCircleClick(asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onCircleClick(ICircleDelegate iCircleDelegate);
}
