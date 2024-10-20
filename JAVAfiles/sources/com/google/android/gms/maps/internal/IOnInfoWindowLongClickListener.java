package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnInfoWindowLongClickListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnInfoWindowLongClickListener {
        static final int TRANSACTION_onInfoWindowLongClick = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnInfoWindowLongClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener
            public void onInfoWindowLongClick(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
        }

        public static IOnInfoWindowLongClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
            if (queryLocalInterface instanceof IOnInfoWindowLongClickListener) {
                return (IOnInfoWindowLongClickListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMarkerDelegate asInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onInfoWindowLongClick(asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onInfoWindowLongClick(IMarkerDelegate iMarkerDelegate);
}
