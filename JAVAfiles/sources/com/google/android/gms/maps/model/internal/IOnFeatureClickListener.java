package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnFeatureClickListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnFeatureClickListener {
        static final int TRANSACTION_onFeatureClick = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnFeatureClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IOnFeatureClickListener");
            }

            @Override // com.google.android.gms.maps.model.internal.IOnFeatureClickListener
            public void onFeatureClick(IFeatureClickEventDelegate iFeatureClickEventDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFeatureClickEventDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IOnFeatureClickListener");
        }

        public static IOnFeatureClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IOnFeatureClickListener");
            if (queryLocalInterface instanceof IOnFeatureClickListener) {
                return (IOnFeatureClickListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IFeatureClickEventDelegate asInterface = IFeatureClickEventDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onFeatureClick(asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onFeatureClick(IFeatureClickEventDelegate iFeatureClickEventDelegate);
}
