package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.googlehelp.InProductHelp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhi {
    public static volatile aqux a;

    private abhi() {
    }

    public static void A(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        au(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void B(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int f = f(parcel, i);
        parcel.writeLongArray(jArr);
        g(parcel, f);
    }

    public static void C(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int f = f(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        g(parcel, f);
    }

    public static void D(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        au(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void E(Parcel parcel, PendingIntent pendingIntent) {
        int f = f(parcel, 1);
        PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
        g(parcel, f);
    }

    public static void F(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int f = f(parcel, i);
        parcel.writeStringArray(strArr);
        g(parcel, f);
    }

    public static void G(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int f = f(parcel, i);
        parcel.writeStringList(list);
        g(parcel, f);
    }

    public static void H(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int f = f(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                av(parcel, parcelable, i2);
            }
        }
        g(parcel, f);
    }

    public static byte I(Parcel parcel, int i) {
        aw(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double J(Parcel parcel, int i) {
        aw(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float K(Parcel parcel, int i) {
        aw(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int L(int i) {
        return (char) i;
    }

    public static int M(Parcel parcel) {
        return parcel.readInt();
    }

    public static int N(Parcel parcel, int i) {
        aw(parcel, i, 4);
        return parcel.readInt();
    }

    public static int O(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static int P(Parcel parcel) {
        int readInt = parcel.readInt();
        int O = O(parcel, readInt);
        int L = L(readInt);
        int dataPosition = parcel.dataPosition();
        if (L == 20293) {
            int i = O + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new abuv(a.bU(i, dataPosition, "Size read is invalid start=", " end="), parcel);
        }
        throw new abuv("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static long Q(Parcel parcel, int i) {
        aw(parcel, i, 8);
        return parcel.readLong();
    }

    public static PendingIntent R(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + O);
        return readPendingIntentOrNullFromParcel;
    }

    public static Bundle S(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + O);
        return readBundle;
    }

    public static IBinder T(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + O);
        return readStrongBinder;
    }

    public static Parcel U(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, O);
        parcel.setDataPosition(dataPosition + O);
        return obtain;
    }

    public static Parcelable V(Parcel parcel, int i, Parcelable.Creator creator) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + O);
        return parcelable;
    }

    public static Boolean W(Parcel parcel, int i) {
        boolean z;
        int O = O(parcel, i);
        if (O == 0) {
            return null;
        }
        ax(parcel, O, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Double X(Parcel parcel, int i) {
        int O = O(parcel, i);
        if (O == 0) {
            return null;
        }
        ax(parcel, O, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float Y(Parcel parcel, int i) {
        int O = O(parcel, i);
        if (O == 0) {
            return null;
        }
        ax(parcel, O, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static Integer Z(Parcel parcel, int i) {
        int O = O(parcel, i);
        if (O == 0) {
            return null;
        }
        ax(parcel, O, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Bundle a(ablo abloVar) {
        egy a2 = abloVar.a();
        if (a2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (a2.c) {
            bundle.putInt("authentication_result_type", a2.a.a);
        } else {
            egw egwVar = a2.b;
            bundle.putInt("authentication_error_code", egwVar.a);
            CharSequence charSequence = egwVar.b;
            if (charSequence != null) {
                bundle.putString("authentication_error_message", charSequence.toString());
                return bundle;
            }
        }
        return bundle;
    }

    public static Long aa(Parcel parcel, int i) {
        int O = O(parcel, i);
        if (O == 0) {
            return null;
        }
        ax(parcel, O, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String ab(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + O);
        return readString;
    }

    public static BigDecimal ac(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + O);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigInteger ad(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + O);
        return new BigInteger(createByteArray);
    }

    public static ArrayList ae(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + O);
        return arrayList;
    }

    public static ArrayList af(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + O);
        return arrayList;
    }

    public static ArrayList ag(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + O);
        return createStringArrayList;
    }

    public static ArrayList ah(Parcel parcel, int i, Parcelable.Creator creator) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + O);
        return createTypedArrayList;
    }

    public static short ai(Parcel parcel, int i) {
        aw(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static void aj(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
        } else {
            throw new abuv(a.bV(i, "Overread allowed size end="), parcel);
        }
    }

    public static void ak(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + O(parcel, i));
    }

    public static boolean al(Parcel parcel, int i) {
        aw(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static byte[] am(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + O);
        return createByteArray;
    }

    public static double[] an(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + O);
        return createDoubleArray;
    }

    public static float[] ao(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + O);
        return createFloatArray;
    }

    public static int[] ap(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + O);
        return createIntArray;
    }

    public static long[] aq(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + O);
        return createLongArray;
    }

    public static Object[] ar(Parcel parcel, int i, Parcelable.Creator creator) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + O);
        return createTypedArray;
    }

    public static String[] as(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + O);
        return createStringArray;
    }

    public static byte[][] at(Parcel parcel, int i) {
        int O = O(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (O == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + O);
        return bArr;
    }

    private static void au(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    private static void av(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static void aw(Parcel parcel, int i, int i2) {
        int O = O(parcel, i);
        if (O == i2) {
            return;
        }
        throw new abuv("Expected size " + i2 + " got " + O + " (0x" + Integer.toHexString(O) + ")", parcel);
    }

    private static void ax(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new abuv("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static void b(StringBuilder sb, Object[] objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(objArr[i]);
        }
    }

    public static boolean c(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void d(SafeParcelable safeParcelable, Intent intent) {
        Parcel obtain = Parcel.obtain();
        abzo.a((InProductHelp) safeParcelable, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("EXTRA_IN_PRODUCT_HELP", marshall);
    }

    public static int e(Parcel parcel) {
        return f(parcel, 20293);
    }

    public static int f(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void g(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void h(Parcel parcel, int i, boolean z) {
        au(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void i(Parcel parcel, int i, byte b) {
        au(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void j(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                au(parcel, i, 0);
            }
        } else {
            int f = f(parcel, i);
            parcel.writeByteArray(bArr);
            g(parcel, f);
        }
    }

    public static void k(Parcel parcel, int i, double d) {
        au(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void l(Parcel parcel, int i, float f) {
        au(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void m(Parcel parcel, int i, int i2) {
        au(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void n(Parcel parcel, int i, long j) {
        au(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void o(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                au(parcel, i, 0);
            }
        } else {
            int f = f(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            g(parcel, f);
        }
    }

    public static void p(Parcel parcel, int i, short s) {
        au(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void q(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                au(parcel, i, 0);
            }
        } else {
            int f = f(parcel, i);
            parcel.writeString(str);
            g(parcel, f);
        }
    }

    public static void r(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                au(parcel, i, 0);
                return;
            }
            return;
        }
        int f = f(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                av(parcel, parcelable, 0);
            }
        }
        g(parcel, f);
    }

    public static void s(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        au(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void t(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int f = f(parcel, i);
        parcel.writeBundle(bundle);
        g(parcel, f);
    }

    public static void u(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int f = f(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        g(parcel, f);
    }

    public static void v(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        au(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void w(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        au(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void x(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int f = f(parcel, i);
        parcel.writeStrongBinder(iBinder);
        g(parcel, f);
    }

    public static void y(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int f = f(parcel, i);
        parcel.writeIntArray(iArr);
        g(parcel, f);
    }

    public static void z(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int f = f(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        g(parcel, f);
    }
}
