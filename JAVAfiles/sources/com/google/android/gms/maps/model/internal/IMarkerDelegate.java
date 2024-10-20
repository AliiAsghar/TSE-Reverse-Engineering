package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMarkerDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMarkerDelegate {
        static final int TRANSACTION_equalsRemote = 16;
        static final int TRANSACTION_getAlpha = 26;
        static final int TRANSACTION_getAltitude = 37;
        static final int TRANSACTION_getCollisionBehavior = 35;
        static final int TRANSACTION_getContentDescription = 36;
        static final int TRANSACTION_getIconView = 34;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getMarkerType = 32;
        static final int TRANSACTION_getPosition = 4;
        static final int TRANSACTION_getRotation = 23;
        static final int TRANSACTION_getSnippet = 8;
        static final int TRANSACTION_getTag = 30;
        static final int TRANSACTION_getTitle = 6;
        static final int TRANSACTION_getZIndex = 28;
        static final int TRANSACTION_hashCodeRemote = 17;
        static final int TRANSACTION_hideInfoWindow = 12;
        static final int TRANSACTION_isDraggable = 10;
        static final int TRANSACTION_isFlat = 21;
        static final int TRANSACTION_isInfoWindowShown = 13;
        static final int TRANSACTION_isVisible = 15;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setAlpha = 25;
        static final int TRANSACTION_setAltitude = 38;
        static final int TRANSACTION_setAnchor = 19;
        static final int TRANSACTION_setDraggable = 9;
        static final int TRANSACTION_setFlat = 20;
        static final int TRANSACTION_setIcon = 18;
        static final int TRANSACTION_setIconView = 33;
        static final int TRANSACTION_setInfoWindowAnchor = 24;
        static final int TRANSACTION_setMarkerType = 31;
        static final int TRANSACTION_setPosition = 3;
        static final int TRANSACTION_setRotation = 22;
        static final int TRANSACTION_setSnippet = 7;
        static final int TRANSACTION_setTag = 29;
        static final int TRANSACTION_setTitle = 5;
        static final int TRANSACTION_setVisible = 14;
        static final int TRANSACTION_setZIndex = 27;
        static final int TRANSACTION_showInfoWindow = 11;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMarkerDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean equalsRemote(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public float getAlpha() {
                Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public float getAltitude() {
                Parcel transactAndReadException = transactAndReadException(37, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public int getCollisionBehavior() {
                Parcel transactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public String getContentDescription() {
                Parcel transactAndReadException = transactAndReadException(36, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public IObjectWrapper getIconView() {
                Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public String getId() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public int getMarkerType() {
                Parcel transactAndReadException = transactAndReadException(32, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public LatLng getPosition() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                LatLng latLng = (LatLng) iax.a(transactAndReadException, LatLng.CREATOR);
                transactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public float getRotation() {
                Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public String getSnippet() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public IObjectWrapper getTag() {
                Parcel transactAndReadException = transactAndReadException(30, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public String getTitle() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public float getZIndex() {
                Parcel transactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public int hashCodeRemote() {
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void hideInfoWindow() {
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean isDraggable() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean isFlat() {
                Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean isInfoWindowShown() {
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean isVisible() {
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setAlpha(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setAltitude(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(38, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setAnchor(float f, float f2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                obtainAndWriteInterfaceToken.writeFloat(f2);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setDraggable(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setFlat(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setIcon(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setIconView(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(33, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setInfoWindowAnchor(float f, float f2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                obtainAndWriteInterfaceToken.writeFloat(f2);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setMarkerType(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(31, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setPosition(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setRotation(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setSnippet(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setTitle(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setVisible(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setZIndex(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void showInfoWindow() {
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        }

        public static IMarkerDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            if (queryLocalInterface instanceof IMarkerDelegate) {
                return (IMarkerDelegate) queryLocalInterface;
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
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setTitle(readString);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    String title = getTitle();
                    parcel2.writeNoException();
                    parcel2.writeString(title);
                    return true;
                case 7:
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setSnippet(readString2);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    String snippet = getSnippet();
                    parcel2.writeNoException();
                    parcel2.writeString(snippet);
                    return true;
                case 9:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setDraggable(g);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    boolean isDraggable = isDraggable();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isDraggable ? 1 : 0);
                    return true;
                case 11:
                    showInfoWindow();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    hideInfoWindow();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    boolean isInfoWindowShown = isInfoWindowShown();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(isInfoWindowShown ? 1 : 0);
                    return true;
                case 14:
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setVisible(g2);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(isVisible ? 1 : 0);
                    return true;
                case 16:
                    IMarkerDelegate asInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean equalsRemote = equalsRemote(asInterface);
                    parcel2.writeNoException();
                    int i6 = iax.a;
                    parcel2.writeInt(equalsRemote ? 1 : 0);
                    return true;
                case 17:
                    int hashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(hashCodeRemote);
                    return true;
                case 18:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setIcon(asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    float readFloat = parcel.readFloat();
                    float readFloat2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setAnchor(readFloat, readFloat2);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setFlat(g3);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean isFlat = isFlat();
                    parcel2.writeNoException();
                    int i7 = iax.a;
                    parcel2.writeInt(isFlat ? 1 : 0);
                    return true;
                case 22:
                    float readFloat3 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setRotation(readFloat3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    float rotation = getRotation();
                    parcel2.writeNoException();
                    parcel2.writeFloat(rotation);
                    return true;
                case 24:
                    float readFloat4 = parcel.readFloat();
                    float readFloat5 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setInfoWindowAnchor(readFloat4, readFloat5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    float readFloat6 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setAlpha(readFloat6);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    float alpha = getAlpha();
                    parcel2.writeNoException();
                    parcel2.writeFloat(alpha);
                    return true;
                case 27:
                    float readFloat7 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(readFloat7);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 29:
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setTag(asInterface3);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    IObjectWrapper tag = getTag();
                    parcel2.writeNoException();
                    iax.f(parcel2, tag);
                    return true;
                case 31:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setMarkerType(readInt);
                    parcel2.writeNoException();
                    return true;
                case 32:
                    int markerType = getMarkerType();
                    parcel2.writeNoException();
                    parcel2.writeInt(markerType);
                    return true;
                case 33:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setIconView(asInterface4);
                    parcel2.writeNoException();
                    return true;
                case 34:
                    IObjectWrapper iconView = getIconView();
                    parcel2.writeNoException();
                    iax.f(parcel2, iconView);
                    return true;
                case 35:
                    int collisionBehavior = getCollisionBehavior();
                    parcel2.writeNoException();
                    parcel2.writeInt(collisionBehavior);
                    return true;
                case 36:
                    String contentDescription = getContentDescription();
                    parcel2.writeNoException();
                    parcel2.writeString(contentDescription);
                    return true;
                case 37:
                    float altitude = getAltitude();
                    parcel2.writeNoException();
                    parcel2.writeFloat(altitude);
                    return true;
                case 38:
                    float readFloat8 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setAltitude(readFloat8);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IMarkerDelegate iMarkerDelegate);

    float getAlpha();

    float getAltitude();

    int getCollisionBehavior();

    String getContentDescription();

    IObjectWrapper getIconView();

    String getId();

    int getMarkerType();

    LatLng getPosition();

    float getRotation();

    String getSnippet();

    IObjectWrapper getTag();

    String getTitle();

    float getZIndex();

    int hashCodeRemote();

    void hideInfoWindow();

    boolean isDraggable();

    boolean isFlat();

    boolean isInfoWindowShown();

    boolean isVisible();

    void remove();

    void setAlpha(float f);

    void setAltitude(float f);

    void setAnchor(float f, float f2);

    void setDraggable(boolean z);

    void setFlat(boolean z);

    void setIcon(IObjectWrapper iObjectWrapper);

    void setIconView(IObjectWrapper iObjectWrapper);

    void setInfoWindowAnchor(float f, float f2);

    void setMarkerType(int i);

    void setPosition(LatLng latLng);

    void setRotation(float f);

    void setSnippet(String str);

    void setTag(IObjectWrapper iObjectWrapper);

    void setTitle(String str);

    void setVisible(boolean z);

    void setZIndex(float f);

    void showInfoWindow();
}
