package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IPolygonDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnPolygonClickListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnPolygonClickListener {
        static final int TRANSACTION_onPolygonClick = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnPolygonClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnPolygonClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnPolygonClickListener
            public void onPolygonClick(IPolygonDelegate iPolygonDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPolygonDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
        }

        public static IOnPolygonClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
            if (queryLocalInterface instanceof IOnPolygonClickListener) {
                return (IOnPolygonClickListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IPolygonDelegate asInterface = IPolygonDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onPolygonClick(asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onPolygonClick(IPolygonDelegate iPolygonDelegate);
}
