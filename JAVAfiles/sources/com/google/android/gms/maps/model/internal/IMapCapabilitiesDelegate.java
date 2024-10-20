package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMapCapabilitiesDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMapCapabilitiesDelegate {
        static final int TRANSACTION_isAdvancedMarkersAvailable = 1;
        static final int TRANSACTION_isDataDrivenStylingAvailable = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMapCapabilitiesDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate
            public boolean isAdvancedMarkersAvailable() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate
            public boolean isDataDrivenStylingAvailable() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
        }

        public static IMapCapabilitiesDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
            if (queryLocalInterface instanceof IMapCapabilitiesDelegate) {
                return (IMapCapabilitiesDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                boolean isDataDrivenStylingAvailable = isDataDrivenStylingAvailable();
                parcel2.writeNoException();
                int i3 = iax.a;
                parcel2.writeInt(isDataDrivenStylingAvailable ? 1 : 0);
            } else {
                boolean isAdvancedMarkersAvailable = isAdvancedMarkersAvailable();
                parcel2.writeNoException();
                int i4 = iax.a;
                parcel2.writeInt(isAdvancedMarkersAvailable ? 1 : 0);
            }
            return true;
        }
    }

    boolean isAdvancedMarkersAvailable();

    boolean isDataDrivenStylingAvailable();
}
