package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGroundOverlayDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGroundOverlayDelegate {
        static final int TRANSACTION_equalsRemote = 19;
        static final int TRANSACTION_getBearing = 12;
        static final int TRANSACTION_getBounds = 10;
        static final int TRANSACTION_getHeight = 8;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getPosition = 4;
        static final int TRANSACTION_getTag = 25;
        static final int TRANSACTION_getTransparency = 18;
        static final int TRANSACTION_getWidth = 7;
        static final int TRANSACTION_getZIndex = 14;
        static final int TRANSACTION_hashCodeRemote = 20;
        static final int TRANSACTION_isClickable = 23;
        static final int TRANSACTION_isVisible = 16;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setBearing = 11;
        static final int TRANSACTION_setClickable = 22;
        static final int TRANSACTION_setDimensions = 5;
        static final int TRANSACTION_setDimensionsWithHeight = 6;
        static final int TRANSACTION_setImage = 21;
        static final int TRANSACTION_setPosition = 3;
        static final int TRANSACTION_setPositionFromBounds = 9;
        static final int TRANSACTION_setTag = 24;
        static final int TRANSACTION_setTransparency = 17;
        static final int TRANSACTION_setVisible = 15;
        static final int TRANSACTION_setZIndex = 13;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGroundOverlayDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGroundOverlayDelegate);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getBearing() {
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public LatLngBounds getBounds() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                LatLngBounds latLngBounds = (LatLngBounds) iax.a(transactAndReadException, LatLngBounds.CREATOR);
                transactAndReadException.recycle();
                return latLngBounds;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getHeight() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public String getId() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public LatLng getPosition() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                LatLng latLng = (LatLng) iax.a(transactAndReadException, LatLng.CREATOR);
                transactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public IObjectWrapper getTag() {
                Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getTransparency() {
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getWidth() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getZIndex() {
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public int hashCodeRemote() {
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public boolean isClickable() {
                Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public boolean isVisible() {
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setBearing(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setClickable(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setDimensions(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setDimensionsWithHeight(float f, float f2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                obtainAndWriteInterfaceToken.writeFloat(f2);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setImage(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setPosition(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setPositionFromBounds(LatLngBounds latLngBounds) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLngBounds);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setTransparency(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setVisible(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setZIndex(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        }

        public static IGroundOverlayDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            if (queryLocalInterface instanceof IGroundOverlayDelegate) {
                return (IGroundOverlayDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    remove();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                case 3:
                    LatLng latLng = (LatLng) iax.a(parcel, LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPosition(latLng);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    LatLng position = getPosition();
                    parcel2.writeNoException();
                    iax.e(parcel2, position);
                    return true;
                case 5:
                    float readFloat = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setDimensions(readFloat);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    float readFloat2 = parcel.readFloat();
                    float readFloat3 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setDimensionsWithHeight(readFloat2, readFloat3);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    float width = getWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(width);
                    return true;
                case 8:
                    float height = getHeight();
                    parcel2.writeNoException();
                    parcel2.writeFloat(height);
                    return true;
                case 9:
                    LatLngBounds latLngBounds = (LatLngBounds) iax.a(parcel, LatLngBounds.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPositionFromBounds(latLngBounds);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    LatLngBounds bounds = getBounds();
                    parcel2.writeNoException();
                    iax.e(parcel2, bounds);
                    return true;
                case 11:
                    float readFloat4 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setBearing(readFloat4);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    float bearing = getBearing();
                    parcel2.writeNoException();
                    parcel2.writeFloat(bearing);
                    return true;
                case 13:
                    float readFloat5 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(readFloat5);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 15:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setVisible(g);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isVisible ? 1 : 0);
                    return true;
                case 17:
                    float readFloat6 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setTransparency(readFloat6);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    float transparency = getTransparency();
                    parcel2.writeNoException();
                    parcel2.writeFloat(transparency);
                    return true;
                case 19:
                    IGroundOverlayDelegate asInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean equalsRemote = equalsRemote(asInterface);
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(equalsRemote ? 1 : 0);
                    return true;
                case 20:
                    int hashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(hashCodeRemote);
                    return true;
                case 21:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setImage(asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setClickable(g2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean isClickable = isClickable();
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(isClickable ? 1 : 0);
                    return true;
                case 24:
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setTag(asInterface3);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    IObjectWrapper tag = getTag();
                    parcel2.writeNoException();
                    iax.f(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate);

    float getBearing();

    LatLngBounds getBounds();

    float getHeight();

    String getId();

    LatLng getPosition();

    IObjectWrapper getTag();

    float getTransparency();

    float getWidth();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void setBearing(float f);

    void setClickable(boolean z);

    void setDimensions(float f);

    void setDimensionsWithHeight(float f, float f2);

    void setImage(IObjectWrapper iObjectWrapper);

    void setPosition(LatLng latLng);

    void setPositionFromBounds(LatLngBounds latLngBounds);

    void setTag(IObjectWrapper iObjectWrapper);

    void setTransparency(float f);

    void setVisible(boolean z);

    void setZIndex(float f);
}
