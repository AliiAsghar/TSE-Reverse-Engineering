package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abye;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticationExtensionsPrfOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsPrfOutputs> CREATOR = new abye(1);
    public final boolean a;
    private final aozb b;

    public AuthenticationExtensionsPrfOutputs(boolean z, aozb aozbVar) {
        this.a = z;
        this.b = aozbVar;
    }

    private static String c(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            byte[] b = b();
            if (b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", c(Arrays.copyOf(b, 32)));
                if (b.length == 64) {
                    jSONObject2.put("second", c(Arrays.copyOfRange(b, 32, 64)));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final byte[] b() {
        aozb aozbVar = this.b;
        if (aozbVar == null) {
            return null;
        }
        return aozbVar.H();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsPrfOutputs)) {
            return false;
        }
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = (AuthenticationExtensionsPrfOutputs) obj;
        if (this.a != authenticationExtensionsPrfOutputs.a || !d.B(this.b, authenticationExtensionsPrfOutputs.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "AuthenticationExtensionsPrfOutputs{" + a().toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.j(parcel, 2, b(), false);
        abhi.g(parcel, e);
    }
}
