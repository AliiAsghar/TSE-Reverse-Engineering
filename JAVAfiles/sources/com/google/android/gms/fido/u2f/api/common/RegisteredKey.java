package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new abzo(6);
    public final KeyHandle a;
    public final String b;
    final String c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        abhg.m(keyHandle);
        this.a = keyHandle;
        this.c = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.c;
        if (str == null) {
            if (registeredKey.c != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.c)) {
            return false;
        }
        if (!this.a.equals(registeredKey.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (registeredKey.b != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode + 31) * 31) + this.a.hashCode();
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode2 * 31) + i;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.a.b, 11));
            if (this.a.c != ProtocolVersion.UNKNOWN) {
                jSONObject.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, this.a.c.d);
            }
            List list = this.a.d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        KeyHandle keyHandle = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, keyHandle, i, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.b, false);
        abhi.g(parcel, e);
    }
}
