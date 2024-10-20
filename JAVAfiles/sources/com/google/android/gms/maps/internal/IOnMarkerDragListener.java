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
public interface IOnMarkerDragListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnMarkerDragListener {
        static final int TRANSACTION_onMarkerDrag = 2;
        static final int TRANSACTION_onMarkerDragEnd = 3;
        static final int TRANSACTION_onMarkerDragStart = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnMarkerDragListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMarkerDragListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDrag(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDragStart(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        }

        public static IOnMarkerDragListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            if (queryLocalInterface instanceof IOnMarkerDragListener) {
                return (IOnMarkerDragListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    IMarkerDelegate asInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    onMarkerDragEnd(asInterface);
                } else {
                    IMarkerDelegate asInterface2 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    onMarkerDrag(asInterface2);
                }
            } else {
                IMarkerDelegate asInterface3 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onMarkerDragStart(asInterface3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onMarkerDrag(IMarkerDelegate iMarkerDelegate);

    void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate);

    void onMarkerDragStart(IMarkerDelegate iMarkerDelegate);
}
