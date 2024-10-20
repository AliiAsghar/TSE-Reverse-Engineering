package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IUiSettingsDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IUiSettingsDelegate {
        static final int TRANSACTION_isCompassEnabled = 10;
        static final int TRANSACTION_isIndoorLevelPickerEnabled = 17;
        static final int TRANSACTION_isMapToolbarEnabled = 19;
        static final int TRANSACTION_isMyLocationButtonEnabled = 11;
        static final int TRANSACTION_isRotateGesturesEnabled = 15;
        static final int TRANSACTION_isScrollGesturesEnabled = 12;
        static final int TRANSACTION_isScrollGesturesEnabledDuringRotateOrZoom = 21;
        static final int TRANSACTION_isTiltGesturesEnabled = 14;
        static final int TRANSACTION_isZoomControlsEnabled = 9;
        static final int TRANSACTION_isZoomGesturesEnabled = 13;
        static final int TRANSACTION_setAllGesturesEnabled = 8;
        static final int TRANSACTION_setCompassEnabled = 2;
        static final int TRANSACTION_setIndoorLevelPickerEnabled = 16;
        static final int TRANSACTION_setMapToolbarEnabled = 18;
        static final int TRANSACTION_setMyLocationButtonEnabled = 3;
        static final int TRANSACTION_setRotateGesturesEnabled = 7;
        static final int TRANSACTION_setScrollGesturesEnabled = 4;
        static final int TRANSACTION_setScrollGesturesEnabledDuringRotateOrZoom = 20;
        static final int TRANSACTION_setTiltGesturesEnabled = 6;
        static final int TRANSACTION_setZoomControlsEnabled = 1;
        static final int TRANSACTION_setZoomGesturesEnabled = 5;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IUiSettingsDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isCompassEnabled() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isIndoorLevelPickerEnabled() {
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isMapToolbarEnabled() {
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isMyLocationButtonEnabled() {
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isRotateGesturesEnabled() {
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isScrollGesturesEnabled() {
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isScrollGesturesEnabledDuringRotateOrZoom() {
                Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isTiltGesturesEnabled() {
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isZoomControlsEnabled() {
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isZoomGesturesEnabled() {
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setAllGesturesEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setCompassEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setIndoorLevelPickerEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setMapToolbarEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setMyLocationButtonEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setRotateGesturesEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setScrollGesturesEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setTiltGesturesEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setZoomControlsEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setZoomGesturesEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        }

        public static IUiSettingsDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof IUiSettingsDelegate) {
                return (IUiSettingsDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setZoomControlsEnabled(g);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setCompassEnabled(g2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setMyLocationButtonEnabled(g3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean g4 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setScrollGesturesEnabled(g4);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean g5 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setZoomGesturesEnabled(g5);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    boolean g6 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setTiltGesturesEnabled(g6);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean g7 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setRotateGesturesEnabled(g7);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    boolean g8 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setAllGesturesEnabled(g8);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    boolean isZoomControlsEnabled = isZoomControlsEnabled();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isZoomControlsEnabled ? 1 : 0);
                    return true;
                case 10:
                    boolean isCompassEnabled = isCompassEnabled();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(isCompassEnabled ? 1 : 0);
                    return true;
                case 11:
                    boolean isMyLocationButtonEnabled = isMyLocationButtonEnabled();
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(isMyLocationButtonEnabled ? 1 : 0);
                    return true;
                case 12:
                    boolean isScrollGesturesEnabled = isScrollGesturesEnabled();
                    parcel2.writeNoException();
                    int i6 = iax.a;
                    parcel2.writeInt(isScrollGesturesEnabled ? 1 : 0);
                    return true;
                case 13:
                    boolean isZoomGesturesEnabled = isZoomGesturesEnabled();
                    parcel2.writeNoException();
                    int i7 = iax.a;
                    parcel2.writeInt(isZoomGesturesEnabled ? 1 : 0);
                    return true;
                case 14:
                    boolean isTiltGesturesEnabled = isTiltGesturesEnabled();
                    parcel2.writeNoException();
                    int i8 = iax.a;
                    parcel2.writeInt(isTiltGesturesEnabled ? 1 : 0);
                    return true;
                case 15:
                    boolean isRotateGesturesEnabled = isRotateGesturesEnabled();
                    parcel2.writeNoException();
                    int i9 = iax.a;
                    parcel2.writeInt(isRotateGesturesEnabled ? 1 : 0);
                    return true;
                case 16:
                    boolean g9 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setIndoorLevelPickerEnabled(g9);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    boolean isIndoorLevelPickerEnabled = isIndoorLevelPickerEnabled();
                    parcel2.writeNoException();
                    int i10 = iax.a;
                    parcel2.writeInt(isIndoorLevelPickerEnabled ? 1 : 0);
                    return true;
                case 18:
                    boolean g10 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setMapToolbarEnabled(g10);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    boolean isMapToolbarEnabled = isMapToolbarEnabled();
                    parcel2.writeNoException();
                    int i11 = iax.a;
                    parcel2.writeInt(isMapToolbarEnabled ? 1 : 0);
                    return true;
                case 20:
                    boolean g11 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setScrollGesturesEnabledDuringRotateOrZoom(g11);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean isScrollGesturesEnabledDuringRotateOrZoom = isScrollGesturesEnabledDuringRotateOrZoom();
                    parcel2.writeNoException();
                    int i12 = iax.a;
                    parcel2.writeInt(isScrollGesturesEnabledDuringRotateOrZoom ? 1 : 0);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean isCompassEnabled();

    boolean isIndoorLevelPickerEnabled();

    boolean isMapToolbarEnabled();

    boolean isMyLocationButtonEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isScrollGesturesEnabledDuringRotateOrZoom();

    boolean isTiltGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    void setAllGesturesEnabled(boolean z);

    void setCompassEnabled(boolean z);

    void setIndoorLevelPickerEnabled(boolean z);

    void setMapToolbarEnabled(boolean z);

    void setMyLocationButtonEnabled(boolean z);

    void setRotateGesturesEnabled(boolean z);

    void setScrollGesturesEnabled(boolean z);

    void setScrollGesturesEnabledDuringRotateOrZoom(boolean z);

    void setTiltGesturesEnabled(boolean z);

    void setZoomControlsEnabled(boolean z);

    void setZoomGesturesEnabled(boolean z);
}
