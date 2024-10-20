package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackf {
    public final HashMap a = new HashMap();

    public static ackf c(byte[] bArr) {
        try {
            return actx.w(new acak((acmc) apag.parseFrom(acmc.a, bArr), new ArrayList()));
        } catch (apba e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    public static final void q(String str, Object obj, String str2, ClassCastException classCastException) {
        Log.w("DataMap", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value <null> was returned.");
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException);
    }

    public final int a() {
        return this.a.size();
    }

    public final Asset b(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e) {
            q(str, obj, "Asset", e);
            return null;
        }
    }

    public final Object d(String str) {
        return this.a.get(str);
    }

    public final String e(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            q(str, obj, "String", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof ackf)) {
            return false;
        }
        ackf ackfVar = (ackf) obj;
        if (a() != ackfVar.a()) {
            return false;
        }
        for (String str : f()) {
            Object d = d(str);
            Object d2 = ackfVar.d(str);
            if (d instanceof Asset) {
                if (!(d2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) d;
                Asset asset2 = (Asset) d2;
                if (asset != null && asset2 != null) {
                    if (!TextUtils.isEmpty(asset.b)) {
                        String str2 = asset.b;
                        abhg.m(str2);
                        equals = str2.equals(asset2.b);
                    } else {
                        equals = Arrays.equals(asset.a, asset2.a);
                    }
                    if (!equals) {
                        return false;
                    }
                } else if (asset != asset2) {
                    return false;
                }
            } else if (d instanceof String[]) {
                if (!(d2 instanceof String[]) || !Arrays.equals((String[]) d, (String[]) d2)) {
                    return false;
                }
            } else if (d instanceof long[]) {
                if (!(d2 instanceof long[]) || !Arrays.equals((long[]) d, (long[]) d2)) {
                    return false;
                }
            } else if (d instanceof float[]) {
                if (!(d2 instanceof float[]) || !Arrays.equals((float[]) d, (float[]) d2)) {
                    return false;
                }
            } else if (d instanceof byte[]) {
                if (!(d2 instanceof byte[]) || !Arrays.equals((byte[]) d, (byte[]) d2)) {
                    return false;
                }
            } else if (!d.B(d, d2)) {
                return false;
            }
        }
        return true;
    }

    public final Set f() {
        return this.a.keySet();
    }

    public final void g(String str, Asset asset) {
        this.a.put(str, asset);
    }

    public final void h(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    public final int hashCode() {
        return this.a.hashCode() * 29;
    }

    public final void i(String str, byte b) {
        this.a.put(str, Byte.valueOf(b));
    }

    public final void j(String str, byte[] bArr) {
        this.a.put(str, bArr);
    }

    public final void k(String str, ArrayList arrayList) {
        this.a.put(str, arrayList);
    }

    public final void l(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void m(String str, long j) {
        this.a.put(str, Long.valueOf(j));
    }

    public final void n(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void o(String str, ArrayList arrayList) {
        this.a.put(str, arrayList);
    }

    public final int p(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            q(str, obj, "Integer", e);
            return 0;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
