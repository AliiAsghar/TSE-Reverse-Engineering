package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.StyleSpan;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPolylineDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPolylineDelegate {
        static final int TRANSACTION_equalsRemote = 15;
        static final int TRANSACTION_getColor = 8;
        static final int TRANSACTION_getEndCap = 22;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getJointType = 24;
        static final int TRANSACTION_getPattern = 26;
        static final int TRANSACTION_getPoints = 4;
        static final int TRANSACTION_getSpans = 30;
        static final int TRANSACTION_getStartCap = 20;
        static final int TRANSACTION_getTag = 28;
        static final int TRANSACTION_getWidth = 6;
        static final int TRANSACTION_getZIndex = 10;
        static final int TRANSACTION_hashCodeRemote = 16;
        static final int TRANSACTION_isClickable = 18;
        static final int TRANSACTION_isGeodesic = 14;
        static final int TRANSACTION_isVisible = 12;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setClickable = 17;
        static final int TRANSACTION_setColor = 7;
        static final int TRANSACTION_setEndCap = 21;
        static final int TRANSACTION_setGeodesic = 13;
        static final int TRANSACTION_setJointType = 23;
        static final int TRANSACTION_setPattern = 25;
        static final int TRANSACTION_setPoints = 3;
        static final int TRANSACTION_setSpans = 29;
        static final int TRANSACTION_setStartCap = 19;
        static final int TRANSACTION_setTag = 27;
        static final int TRANSACTION_setVisible = 11;
        static final int TRANSACTION_setWidth = 5;
        static final int TRANSACTION_setZIndex = 9;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPolylineDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public boolean equalsRemote(IPolylineDelegate iPolylineDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPolylineDelegate);
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public int getColor() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public Cap getEndCap() {
                Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
                Cap cap = (Cap) iax.a(transactAndReadException, Cap.CREATOR);
                transactAndReadException.recycle();
                return cap;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public String getId() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public int getJointType() {
                Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public List<PatternItem> getPattern() {
                Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
                ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(PatternItem.CREATOR);
                transactAndReadException.recycle();
                return createTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public List<LatLng> getPoints() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(LatLng.CREATOR);
                transactAndReadException.recycle();
                return createTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public List<StyleSpan> getSpans() {
                Parcel transactAndReadException = transactAndReadException(30, obtainAndWriteInterfaceToken());
                ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(StyleSpan.CREATOR);
                transactAndReadException.recycle();
                return createTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public Cap getStartCap() {
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                Cap cap = (Cap) iax.a(transactAndReadException, Cap.CREATOR);
                transactAndReadException.recycle();
                return cap;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public IObjectWrapper getTag() {
                Parcel transactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public float getWidth() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public float getZIndex() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public int hashCodeRemote() {
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public boolean isClickable() {
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public boolean isGeodesic() {
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public boolean isVisible() {
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setClickable(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setColor(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setEndCap(Cap cap) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, cap);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setGeodesic(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setJointType(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setPattern(List<PatternItem> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setPoints(List<LatLng> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setSpans(List<StyleSpan> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setStartCap(Cap cap) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, cap);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setVisible(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setWidth(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setZIndex(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        }

        public static IPolylineDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            if (queryLocalInterface instanceof IPolylineDelegate) {
                return (IPolylineDelegate) queryLocalInterface;
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
                    float readFloat = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setWidth(readFloat);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    float width = getWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(width);
                    return true;
                case 7:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setColor(readInt);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    int color = getColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(color);
                    return true;
                case 9:
                    float readFloat2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(readFloat2);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 11:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setVisible(g);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isVisible ? 1 : 0);
                    return true;
                case 13:
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setGeodesic(g2);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    boolean isGeodesic = isGeodesic();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(isGeodesic ? 1 : 0);
                    return true;
                case 15:
                    IPolylineDelegate asInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean equalsRemote = equalsRemote(asInterface);
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(equalsRemote ? 1 : 0);
                    return true;
                case 16:
                    int hashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(hashCodeRemote);
                    return true;
                case 17:
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setClickable(g3);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean isClickable = isClickable();
                    parcel2.writeNoException();
                    int i6 = iax.a;
                    parcel2.writeInt(isClickable ? 1 : 0);
                    return true;
                case 19:
                    Cap cap = (Cap) iax.a(parcel, Cap.CREATOR);
                    enforceNoDataAvail(parcel);
                    setStartCap(cap);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    Cap startCap = getStartCap();
                    parcel2.writeNoException();
                    iax.e(parcel2, startCap);
                    return true;
                case 21:
                    Cap cap2 = (Cap) iax.a(parcel, Cap.CREATOR);
                    enforceNoDataAvail(parcel);
                    setEndCap(cap2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    Cap endCap = getEndCap();
                    parcel2.writeNoException();
                    iax.e(parcel2, endCap);
                    return true;
                case 23:
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setJointType(readInt2);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int jointType = getJointType();
                    parcel2.writeNoException();
                    parcel2.writeInt(jointType);
                    return true;
                case 25:
                    ArrayList createTypedArrayList2 = parcel.createTypedArrayList(PatternItem.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPattern(createTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    List<PatternItem> pattern = getPattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(pattern);
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
                case 29:
                    ArrayList createTypedArrayList3 = parcel.createTypedArrayList(StyleSpan.CREATOR);
                    enforceNoDataAvail(parcel);
                    setSpans(createTypedArrayList3);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    List<StyleSpan> spans = getSpans();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(spans);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IPolylineDelegate iPolylineDelegate);

    int getColor();

    Cap getEndCap();

    String getId();

    int getJointType();

    List<PatternItem> getPattern();

    List<LatLng> getPoints();

    List<StyleSpan> getSpans();

    Cap getStartCap();

    IObjectWrapper getTag();

    float getWidth();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isGeodesic();

    boolean isVisible();

    void remove();

    void setClickable(boolean z);

    void setColor(int i);

    void setEndCap(Cap cap);

    void setGeodesic(boolean z);

    void setJointType(int i);

    void setPattern(List<PatternItem> list);

    void setPoints(List<LatLng> list);

    void setSpans(List<StyleSpan> list);

    void setStartCap(Cap cap);

    void setTag(IObjectWrapper iObjectWrapper);

    void setVisible(boolean z);

    void setWidth(float f);

    void setZIndex(float f);
}
