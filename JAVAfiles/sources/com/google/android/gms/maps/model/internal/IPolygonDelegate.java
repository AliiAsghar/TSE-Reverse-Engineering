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
public interface IPolygonDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPolygonDelegate {
        static final int TRANSACTION_equalsRemote = 19;
        static final int TRANSACTION_getFillColor = 12;
        static final int TRANSACTION_getHoles = 6;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getPoints = 4;
        static final int TRANSACTION_getStrokeColor = 10;
        static final int TRANSACTION_getStrokeJointType = 24;
        static final int TRANSACTION_getStrokePattern = 26;
        static final int TRANSACTION_getStrokeWidth = 8;
        static final int TRANSACTION_getTag = 28;
        static final int TRANSACTION_getZIndex = 14;
        static final int TRANSACTION_hashCodeRemote = 20;
        static final int TRANSACTION_isClickable = 22;
        static final int TRANSACTION_isGeodesic = 18;
        static final int TRANSACTION_isVisible = 16;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setClickable = 21;
        static final int TRANSACTION_setFillColor = 11;
        static final int TRANSACTION_setGeodesic = 17;
        static final int TRANSACTION_setHoles = 5;
        static final int TRANSACTION_setPoints = 3;
        static final int TRANSACTION_setStrokeColor = 9;
        static final int TRANSACTION_setStrokeJointType = 23;
        static final int TRANSACTION_setStrokePattern = 25;
        static final int TRANSACTION_setStrokeWidth = 7;
        static final int TRANSACTION_setTag = 27;
        static final int TRANSACTION_setVisible = 15;
        static final int TRANSACTION_setZIndex = 13;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPolygonDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public boolean equalsRemote(IPolygonDelegate iPolygonDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPolygonDelegate);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public int getFillColor() {
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public List getHoles() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                ArrayList b = iax.b(transactAndReadException);
                transactAndReadException.recycle();
                return b;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public String getId() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public List<LatLng> getPoints() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(LatLng.CREATOR);
                transactAndReadException.recycle();
                return createTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public int getStrokeColor() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public int getStrokeJointType() {
                Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public List<PatternItem> getStrokePattern() {
                Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
                ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(PatternItem.CREATOR);
                transactAndReadException.recycle();
                return createTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public float getStrokeWidth() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public IObjectWrapper getTag() {
                Parcel transactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public float getZIndex() {
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public int hashCodeRemote() {
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public boolean isClickable() {
                Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public boolean isGeodesic() {
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public boolean isVisible() {
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setClickable(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setFillColor(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setGeodesic(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setHoles(List list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeList(list);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setPoints(List<LatLng> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setStrokeColor(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setStrokeJointType(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setStrokePattern(List<PatternItem> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setStrokeWidth(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setVisible(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setZIndex(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        }

        public static IPolygonDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            if (queryLocalInterface instanceof IPolygonDelegate) {
                return (IPolygonDelegate) queryLocalInterface;
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
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPoints(createTypedArrayList);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    List<LatLng> points = getPoints();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(points);
                    return true;
                case 5:
                    ArrayList b = iax.b(parcel);
                    enforceNoDataAvail(parcel);
                    setHoles(b);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    List holes = getHoles();
                    parcel2.writeNoException();
                    parcel2.writeList(holes);
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
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setGeodesic(g2);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean isGeodesic = isGeodesic();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(isGeodesic ? 1 : 0);
                    return true;
                case 19:
                    IPolygonDelegate asInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean equalsRemote = equalsRemote(asInterface);
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(equalsRemote ? 1 : 0);
                    return true;
                case 20:
                    int hashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(hashCodeRemote);
                    return true;
                case 21:
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setClickable(g3);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean isClickable = isClickable();
                    parcel2.writeNoException();
                    int i6 = iax.a;
                    parcel2.writeInt(isClickable ? 1 : 0);
                    return true;
                case 23:
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setStrokeJointType(readInt3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int strokeJointType = getStrokeJointType();
                    parcel2.writeNoException();
                    parcel2.writeInt(strokeJointType);
                    return true;
                case 25:
                    ArrayList createTypedArrayList2 = parcel.createTypedArrayList(PatternItem.CREATOR);
                    enforceNoDataAvail(parcel);
                    setStrokePattern(createTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    List<PatternItem> strokePattern = getStrokePattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(strokePattern);
                    return true;
                case 27:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setTag(asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    IObjectWrapper tag = getTag();
                    parcel2.writeNoException();
                    iax.f(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IPolygonDelegate iPolygonDelegate);

    int getFillColor();

    List getHoles();

    String getId();

    List<LatLng> getPoints();

    int getStrokeColor();

    int getStrokeJointType();

    List<PatternItem> getStrokePattern();

    float getStrokeWidth();

    IObjectWrapper getTag();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isGeodesic();

    boolean isVisible();

    void remove();

    void setClickable(boolean z);

    void setFillColor(int i);

    void setGeodesic(boolean z);

    void setHoles(List list);

    void setPoints(List<LatLng> list);

    void setStrokeColor(int i);

    void setStrokeJointType(int i);

    void setStrokePattern(List<PatternItem> list);

    void setStrokeWidth(float f);

    void setTag(IObjectWrapper iObjectWrapper);

    void setVisible(boolean z);

    void setZIndex(float f);
}
