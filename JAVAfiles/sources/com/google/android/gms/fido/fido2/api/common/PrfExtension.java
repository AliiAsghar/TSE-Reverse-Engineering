package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abzb;
import defpackage.albo;
import defpackage.ambl;
import defpackage.ambn;
import defpackage.ambp;
import defpackage.d;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PrfExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PrfExtension> CREATOR = new abzb(16);
    private static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public PrfExtension(byte[][] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        d.s(z2);
        for (int i = 0; i < bArr.length; i += 2) {
            if (i != 0 && bArr[i] == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            d.s(z3);
            int i2 = i + 1;
            if (bArr[i2] != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            d.s(z4);
            int length = bArr[i2].length;
            if (length != 32 && length != 64) {
                z5 = false;
            } else {
                z5 = true;
            }
            d.s(z5);
        }
        this.a = bArr;
    }

    public static PrfExtension a(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(d(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(abhn.h(next));
                    if (z) {
                        arrayList.add(d(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new PrfExtension((byte[][]) arrayList.toArray(new byte[0]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    private static JSONObject b(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", abhn.g(bArr));
        } else {
            jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
            jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        }
        return jSONObject;
    }

    private static byte[] c(byte[] bArr) {
        int i = ambp.a;
        ambl f = ambn.a.f();
        f.j(b);
        f.j(bArr);
        return f.q().e();
    }

    private static byte[] d(JSONObject jSONObject) {
        byte[] h = abhn.h(jSONObject.getString("first"));
        if (h.length == 32) {
            if (!jSONObject.has("second")) {
                return h;
            }
            byte[] h2 = abhn.h(jSONObject.getString("second"));
            if (h2.length == 32) {
                return albo.cE(h, h2);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    private static byte[] e(JSONObject jSONObject) {
        byte[] c = c(abhn.h(jSONObject.getString("first")));
        if (!jSONObject.has("second")) {
            return c;
        }
        return albo.cE(c, c(abhn.h(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PrfExtension)) {
            return false;
        }
        return Arrays.deepEquals(this.a, ((PrfExtension) obj).a);
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.a;
                if (i < bArr.length) {
                    if (bArr[i] == null) {
                        jSONObject.put("eval", b(bArr[i + 1]));
                    } else {
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                            jSONObject.put("evalByCredential", jSONObject2);
                        }
                        jSONObject2.put(abhn.g(this.a[i]), b(this.a[i + 1]));
                    }
                    i += 2;
                } else {
                    return a.bX(jSONObject, "PrfExtension{", "}");
                }
            }
        } catch (JSONException e) {
            return "PrfExtension{Exception:" + e.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[][] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.u(parcel, 1, bArr);
        abhi.g(parcel, e);
    }
}
