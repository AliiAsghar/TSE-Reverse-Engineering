package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.PinConfig;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IBitmapDescriptorFactoryDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IBitmapDescriptorFactoryDelegate {
        static final int TRANSACTION_defaultMarker = 4;
        static final int TRANSACTION_defaultMarkerWithHue = 5;
        static final int TRANSACTION_fromAsset = 2;
        static final int TRANSACTION_fromBitmap = 6;
        static final int TRANSACTION_fromFile = 3;
        static final int TRANSACTION_fromPath = 7;
        static final int TRANSACTION_fromPinConfig = 8;
        static final int TRANSACTION_fromResource = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IBitmapDescriptorFactoryDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper defaultMarker() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper defaultMarkerWithHue(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromAsset(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromBitmap(Bitmap bitmap) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bitmap);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromFile(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromPath(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromPinConfig(PinConfig pinConfig) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pinConfig);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromResource(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        }

        public static IBitmapDescriptorFactoryDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof IBitmapDescriptorFactoryDelegate) {
                return (IBitmapDescriptorFactoryDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper fromResource = fromResource(readInt);
                    parcel2.writeNoException();
                    iax.f(parcel2, fromResource);
                    return true;
                case 2:
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper fromAsset = fromAsset(readString);
                    parcel2.writeNoException();
                    iax.f(parcel2, fromAsset);
                    return true;
                case 3:
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper fromFile = fromFile(readString2);
                    parcel2.writeNoException();
                    iax.f(parcel2, fromFile);
                    return true;
                case 4:
                    IObjectWrapper defaultMarker = defaultMarker();
                    parcel2.writeNoException();
                    iax.f(parcel2, defaultMarker);
                    return true;
                case 5:
                    float readFloat = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper defaultMarkerWithHue = defaultMarkerWithHue(readFloat);
                    parcel2.writeNoException();
                    iax.f(parcel2, defaultMarkerWithHue);
                    return true;
                case 6:
                    Bitmap bitmap = (Bitmap) iax.a(parcel, Bitmap.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper fromBitmap = fromBitmap(bitmap);
                    parcel2.writeNoException();
                    iax.f(parcel2, fromBitmap);
                    return true;
                case 7:
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper fromPath = fromPath(readString3);
                    parcel2.writeNoException();
                    iax.f(parcel2, fromPath);
                    return true;
                case 8:
                    PinConfig pinConfig = (PinConfig) iax.a(parcel, PinConfig.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper fromPinConfig = fromPinConfig(pinConfig);
                    parcel2.writeNoException();
                    iax.f(parcel2, fromPinConfig);
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper defaultMarker();

    IObjectWrapper defaultMarkerWithHue(float f);

    IObjectWrapper fromAsset(String str);

    IObjectWrapper fromBitmap(Bitmap bitmap);

    IObjectWrapper fromFile(String str);

    IObjectWrapper fromPath(String str);

    IObjectWrapper fromPinConfig(PinConfig pinConfig);

    IObjectWrapper fromResource(int i);
}
