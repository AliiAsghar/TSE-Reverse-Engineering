package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITileOverlayDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ITileOverlayDelegate {
        static final int TRANSACTION_clearTileCache = 2;
        static final int TRANSACTION_equalsRemote = 8;
        static final int TRANSACTION_getFadeIn = 11;
        static final int TRANSACTION_getId = 3;
        static final int TRANSACTION_getTransparency = 13;
        static final int TRANSACTION_getZIndex = 5;
        static final int TRANSACTION_hashCodeRemote = 9;
        static final int TRANSACTION_isVisible = 7;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setFadeIn = 10;
        static final int TRANSACTION_setTransparency = 12;
        static final int TRANSACTION_setVisible = 6;
        static final int TRANSACTION_setZIndex = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ITileOverlayDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void clearTileCache() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iTileOverlayDelegate);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public boolean getFadeIn() {
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public String getId() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public float getTransparency() {
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public float getZIndex() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public int hashCodeRemote() {
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public boolean isVisible() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void setFadeIn(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void setTransparency(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void setVisible(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void setZIndex(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        }

        public static ITileOverlayDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            if (queryLocalInterface instanceof ITileOverlayDelegate) {
                return (ITileOverlayDelegate) queryLocalInterface;
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
                    clearTileCache();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                case 4:
                    float readFloat = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(readFloat);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 6:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setVisible(g);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isVisible ? 1 : 0);
                    return true;
                case 8:
                    ITileOverlayDelegate asInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean equalsRemote = equalsRemote(asInterface);
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(equalsRemote ? 1 : 0);
                    return true;
                case 9:
                    int hashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(hashCodeRemote);
                    return true;
                case 10:
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setFadeIn(g2);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    boolean fadeIn = getFadeIn();
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(fadeIn ? 1 : 0);
                    return true;
                case 12:
                    float readFloat2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setTransparency(readFloat2);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    float transparency = getTransparency();
                    parcel2.writeNoException();
                    parcel2.writeFloat(transparency);
                    return true;
                default:
                    return false;
            }
        }
    }

    void clearTileCache();

    boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate);

    boolean getFadeIn();

    String getId();

    float getTransparency();

    float getZIndex();

    int hashCodeRemote();

    boolean isVisible();

    void remove();

    void setFadeIn(boolean z);

    void setTransparency(float f);

    void setVisible(boolean z);

    void setZIndex(float f);
}
