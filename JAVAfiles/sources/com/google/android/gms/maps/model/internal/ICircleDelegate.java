package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICircleDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICircleDelegate {
        static final int TRANSACTION_equalsRemote = 17;
        static final int TRANSACTION_getCenter = 4;
        static final int TRANSACTION_getFillColor = 12;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getRadius = 6;
        static final int TRANSACTION_getStrokeColor = 10;
        static final int TRANSACTION_getStrokePattern = 22;
        static final int TRANSACTION_getStrokeWidth = 8;
        static final int TRANSACTION_getTag = 24;
        static final int TRANSACTION_getZIndex = 14;
        static final int TRANSACTION_hashCodeRemote = 18;
        static final int TRANSACTION_isClickable = 20;
        static final int TRANSACTION_isVisible = 16;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setCenter = 3;
        static final int TRANSACTION_setClickable = 19;
        static final int TRANSACTION_setFillColor = 11;
        static final int TRANSACTION_setRadius = 5;
        static final int TRANSACTION_setStrokeColor = 9;
        static final int TRANSACTION_setStrokePattern = 21;
        static final int TRANSACTION_setStrokeWidth = 7;
        static final int TRANSACTION_setTag = 23;
        static final int TRANSACTION_setVisible = 15;
        static final int TRANSACTION_setZIndex = 13;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICircleDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public boolean equalsRemote(ICircleDelegate iCircleDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iCircleDelegate);
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public LatLng getCenter() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                LatLng latLng = (LatLng) iax.a(transactAndReadException, LatLng.CREATOR);
                transactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public int getFillColor() {
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public String getId() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public double getRadius() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                double readDouble = transactAndReadException.readDouble();
                transactAndReadException.recycle();
                return readDouble;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public int getStrokeColor() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public List<PatternItem> getStrokePattern() {
                Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
                ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(PatternItem.CREATOR);
                transactAndReadException.recycle();
                return createTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public float getStrokeWidth() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public IObjectWrapper getTag() {
                Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public float getZIndex() {
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public int hashCodeRemote() {
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public boolean isClickable() {
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public boolean isVisible() {
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setCenter(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setClickable(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setFillColor(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setRadius(double d) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeDouble(d);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setStrokeColor(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setStrokePattern(List<PatternItem> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setStrokeWidth(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setVisible(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setZIndex(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.ICircleDelegate");
        }

        public static ICircleDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            if (queryLocalInterface instanceof ICircleDelegate) {
                return (ICircleDelegate) queryLocalInterface;
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
                    setCenter(latLng);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    LatLng center = getCenter();
                    parcel2.writeNoException();
                    iax.e(parcel2, center);
                    return true;
                case 5:
                    double readDouble = parcel.readDouble();
                    enforceNoDataAvail(parcel);
                    setRadius(readDouble);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    double radius = getRadius();
                    parcel2.writeNoException();
                    parcel2.writeDouble(radius);
                    return true;
                case 7:
                    float readFloat = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setStrokeWidth(readFloat);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    float strokeWidth = getStrokeWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(strokeWidth);
                    return true;
                case 9:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setStrokeColor(readInt);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    int strokeColor = getStrokeColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(strokeColor);
                    return true;
                case 11:
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setFillColor(readInt2);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    int fillColor = getFillColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(fillColor);
                    return true;
                case 13:
                    float readFloat2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(readFloat2);
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
                    ICircleDelegate asInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean equalsRemote = equalsRemote(asInterface);
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(equalsRemote ? 1 : 0);
                    return true;
                case 18:
                    int hashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(hashCodeRemote);
                    return true;
                case 19:
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setClickable(g2);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean isClickable = isClickable();
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(isClickable ? 1 : 0);
                    return true;
                case 21:
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(PatternItem.CREATOR);
                    enforceNoDataAvail(parcel);
                    setStrokePattern(createTypedArrayList);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    List<PatternItem> strokePattern = getStrokePattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(strokePattern);
                    return true;
                case 23:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setTag(asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    IObjectWrapper tag = getTag();
                    parcel2.writeNoException();
                    iax.f(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(ICircleDelegate iCircleDelegate);

    LatLng getCenter();

    int getFillColor();

    String getId();

    double getRadius();

    int getStrokeColor();

    List<PatternItem> getStrokePattern();

    float getStrokeWidth();

    IObjectWrapper getTag();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void setCenter(LatLng latLng);

    void setClickable(boolean z);

    void setFillColor(int i);

    void setRadius(double d);

    void setStrokeColor(int i);

    void setStrokePattern(List<PatternItem> list);

    void setStrokeWidth(float f);

    void setTag(IObjectWrapper iObjectWrapper);

    void setVisible(boolean z);

    void setZIndex(float f);
}
