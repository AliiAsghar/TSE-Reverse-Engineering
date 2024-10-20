package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rik {
    private static final xze a = xze.g("BugleAction", "ParcelSerializer");
    private static final amcn b = amcn.e;

    public static Object a(String str, Class cls, String str2) {
        Object obj = null;
        if (TextUtils.isEmpty(str2)) {
            xyo e = a.e();
            e.H("No className found when unparceling");
            e.H(cls.toString());
            e.H(". Must be parceled via old way.");
            e.q();
            return null;
        }
        if (str == null) {
            xyo e2 = a.e();
            e2.H("No byteString found when unparceling");
            e2.H(str2);
            e2.H(". Must be parceled via old way.");
            e2.q();
            return null;
        }
        byte[] k = b.k(str);
        int length = k.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(k, 0, length);
        obtain.setDataPosition(0);
        try {
            try {
                obj = cls.cast(obtain.readParcelable(cls.getClassLoader()));
            } catch (BadParcelableException | ClassCastException | NullPointerException e3) {
                String str3 = new String(k, 0, Math.min(k.length, 500), StandardCharsets.UTF_16LE);
                xyo b2 = a.b();
                b2.H("Caught exception when unparceling an");
                b2.H(str2);
                b2.H("parceled data:");
                b2.H(str3);
                b2.r(e3);
            }
            return obj;
        } finally {
            obtain.recycle();
        }
    }

    public static String b(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        String j = b.j(obtain.marshall());
        obtain.recycle();
        return j;
    }

    public static String c(Parcel parcel) {
        String j = b.j(parcel.marshall());
        if (j.length() < 1000) {
            return j;
        }
        return j.substring(0, 1000);
    }
}
