package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnMyLocationButtonClickListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnMyLocationButtonClickListener {
        static final int TRANSACTION_onMyLocationButtonClick = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnMyLocationButtonClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener
            public boolean onMyLocationButtonClick() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        }

        public static IOnMyLocationButtonClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            if (queryLocalInterface instanceof IOnMyLocationButtonClickListener) {
                return (IOnMyLocationButtonClickListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                boolean onMyLocationButtonClick = onMyLocationButtonClick();
                parcel2.writeNoException();
                int i3 = iax.a;
                parcel2.writeInt(onMyLocationButtonClick ? 1 : 0);
                return true;
            }
            return false;
        }
    }

    boolean onMyLocationButtonClick();
}
