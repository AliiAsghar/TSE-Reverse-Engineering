package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abuv;
import defpackage.abuz;
import defpackage.abvi;
import defpackage.d;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new abuz(3);
    public final int a;
    public final FieldMappingDictionary b;
    private final Parcel c;
    private final String d;
    private int e;
    private int f;

    public SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        String str;
        this.a = i;
        abhg.m(parcel);
        this.c = parcel;
        this.b = fieldMappingDictionary;
        if (fieldMappingDictionary == null) {
            str = null;
        } else {
            str = fieldMappingDictionary.b;
        }
        this.d = str;
        this.e = 2;
    }

    private final void h(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).g, entry);
        }
        sb.append('{');
        int P = abhi.P(parcel);
        boolean z = false;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get(abhi.L(readInt));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.k != null) {
                    int i = field.d;
                    switch (i) {
                        case 0:
                            j(sb, field, d(field, Integer.valueOf(abhi.N(parcel, readInt))));
                            break;
                        case 1:
                            j(sb, field, d(field, abhi.ad(parcel, readInt)));
                            break;
                        case 2:
                            j(sb, field, d(field, Long.valueOf(abhi.Q(parcel, readInt))));
                            break;
                        case 3:
                            j(sb, field, d(field, Float.valueOf(abhi.K(parcel, readInt))));
                            break;
                        case 4:
                            j(sb, field, d(field, Double.valueOf(abhi.J(parcel, readInt))));
                            break;
                        case 5:
                            j(sb, field, d(field, abhi.ac(parcel, readInt)));
                            break;
                        case 6:
                            j(sb, field, d(field, Boolean.valueOf(abhi.al(parcel, readInt))));
                            break;
                        case 7:
                            j(sb, field, d(field, abhi.ab(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            j(sb, field, d(field, abhi.am(parcel, readInt)));
                            break;
                        case 10:
                            Bundle S = abhi.S(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str2 : S.keySet()) {
                                String string = S.getString(str2);
                                abhg.m(string);
                                hashMap.put(str2, string);
                            }
                            j(sb, field, d(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(a.bV(i, "Unknown field out type = "));
                    }
                } else if (field.e) {
                    sb.append("[");
                    BigInteger[] bigIntegerArr = null;
                    Parcel[] parcelArr = null;
                    boolean[] zArr = null;
                    BigDecimal[] bigDecimalArr = null;
                    switch (field.d) {
                        case 0:
                            int[] ap = abhi.ap(parcel, readInt);
                            int length = ap.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 != 0) {
                                    sb.append(",");
                                }
                                sb.append(ap[i2]);
                            }
                            break;
                        case 1:
                            int O = abhi.O(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (O != 0) {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i3 = 0; i3 < readInt2; i3++) {
                                    bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition + O);
                            }
                            abhi.b(sb, bigIntegerArr);
                            break;
                        case 2:
                            long[] aq = abhi.aq(parcel, readInt);
                            int length2 = aq.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (i4 != 0) {
                                    sb.append(",");
                                }
                                sb.append(aq[i4]);
                            }
                            break;
                        case 3:
                            float[] ao = abhi.ao(parcel, readInt);
                            int length3 = ao.length;
                            for (int i5 = 0; i5 < length3; i5++) {
                                if (i5 != 0) {
                                    sb.append(",");
                                }
                                sb.append(ao[i5]);
                            }
                            break;
                        case 4:
                            double[] an = abhi.an(parcel, readInt);
                            int length4 = an.length;
                            for (int i6 = 0; i6 < length4; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(an[i6]);
                            }
                            break;
                        case 5:
                            int O2 = abhi.O(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (O2 != 0) {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i7 = 0; i7 < readInt3; i7++) {
                                    bigDecimalArr[i7] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition2 + O2);
                            }
                            abhi.b(sb, bigDecimalArr);
                            break;
                        case 6:
                            int O3 = abhi.O(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (O3 != 0) {
                                zArr = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition3 + O3);
                            }
                            int length5 = zArr.length;
                            for (int i8 = 0; i8 < length5; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(zArr[i8]);
                            }
                            break;
                        case 7:
                            String[] as = abhi.as(parcel, readInt);
                            int length6 = as.length;
                            for (int i9 = 0; i9 < length6; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(as[i9]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int O4 = abhi.O(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (O4 != 0) {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i10 = 0; i10 < readInt4; i10++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition5 = parcel.dataPosition();
                                        Parcel obtain = Parcel.obtain();
                                        obtain.appendFrom(parcel, dataPosition5, readInt5);
                                        parcelArr2[i10] = obtain;
                                        parcel.setDataPosition(dataPosition5 + readInt5);
                                    } else {
                                        parcelArr2[i10] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition4 + O4);
                                parcelArr = parcelArr2;
                            }
                            int length7 = parcelArr.length;
                            for (int i11 = 0; i11 < length7; i11++) {
                                if (i11 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i11].setDataPosition(0);
                                h(sb, field.b(), parcelArr[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.d) {
                        case 0:
                            sb.append(abhi.N(parcel, readInt));
                            break;
                        case 1:
                            sb.append(abhi.ad(parcel, readInt));
                            break;
                        case 2:
                            sb.append(abhi.Q(parcel, readInt));
                            break;
                        case 3:
                            sb.append(abhi.K(parcel, readInt));
                            break;
                        case 4:
                            sb.append(abhi.J(parcel, readInt));
                            break;
                        case 5:
                            sb.append(abhi.ac(parcel, readInt));
                            break;
                        case 6:
                            sb.append(abhi.al(parcel, readInt));
                            break;
                        case 7:
                            String ab = abhi.ab(parcel, readInt);
                            sb.append("\"");
                            sb.append(abvi.a(ab));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] am = abhi.am(parcel, readInt);
                            sb.append("\"");
                            sb.append(abhn.e(am));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] am2 = abhi.am(parcel, readInt);
                            sb.append("\"");
                            sb.append(abhn.f(am2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle S2 = abhi.S(parcel, readInt);
                            Set<String> keySet = S2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(abvi.a(S2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel U = abhi.U(parcel, readInt);
                            U.setDataPosition(0);
                            h(sb, field.b(), U);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == P) {
            sb.append('}');
            return;
        }
        throw new abuv(a.bV(P, "Overread allowed size end="), parcel);
    }

    private static final void i(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                abhg.m(obj);
                sb.append(abvi.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(abhn.e((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(abhn.f((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                abhg.m(obj);
                abhn.b(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.bV(i, "Unknown type = "));
        }
    }

    private static final void j(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (field.c) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                i(sb, field.b, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        i(sb, field.b, obj);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map b() {
        FieldMappingDictionary fieldMappingDictionary = this.b;
        if (fieldMappingDictionary == null) {
            return null;
        }
        String str = this.d;
        abhg.m(str);
        return fieldMappingDictionary.a(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final void e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final void f() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel g() {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                abhi.g(this.c, this.f);
                this.e = 2;
            }
        } else {
            int e = abhi.e(this.c);
            this.f = e;
            abhi.g(this.c, e);
            this.e = 2;
        }
        return this.c;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        d.aC(this.b, "Cannot convert to JSON on client side.");
        Parcel g = g();
        g.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.d;
        abhg.m(str);
        Map a = this.b.a(str);
        abhg.m(a);
        h(sb, a, g);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        Parcel g = g();
        int f = abhi.f(parcel, 2);
        parcel.appendFrom(g, 0, g.dataSize());
        abhi.g(parcel, f);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
