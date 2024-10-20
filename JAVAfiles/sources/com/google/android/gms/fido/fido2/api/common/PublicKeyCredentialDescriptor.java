package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abyv;
import defpackage.abzb;
import defpackage.abzg;
import defpackage.abzl;
import defpackage.alpt;
import defpackage.aozb;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final List a;
    private final PublicKeyCredentialType b;
    private final aozb c;

    static {
        alpt.r(abzl.a, abzl.b);
        CREATOR = new abzb(19);
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        aozb w = aozb.w(bArr);
        abhg.m(str);
        try {
            this.b = PublicKeyCredentialType.a(str);
            this.c = w;
            this.a = list;
        } catch (abzg e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static PublicKeyCredentialDescriptor a(JSONObject jSONObject) {
        String string = jSONObject.getString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        byte[] decode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports")) {
            JSONArray jSONArray = jSONObject.getJSONArray("transports");
            Transport transport = Transport.BLUETOOTH_CLASSIC;
            if (jSONArray != null) {
                HashSet hashSet = new HashSet(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string2 = jSONArray.getString(i);
                    if (string2 != null && !string2.isEmpty()) {
                        try {
                            hashSet.add(Transport.a(string2));
                        } catch (abyv unused) {
                            Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                        }
                    }
                }
                arrayList = new ArrayList(hashSet);
            }
        }
        return new PublicKeyCredentialDescriptor(string, decode, arrayList);
    }

    public final byte[] b() {
        return this.c.H();
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.b.equals(publicKeyCredentialDescriptor.b) || !d.B(this.c, publicKeyCredentialDescriptor.c)) {
            return false;
        }
        List list2 = this.a;
        if (list2 == null && publicKeyCredentialDescriptor.a == null) {
            return true;
        }
        if (list2 == null || (list = publicKeyCredentialDescriptor.a) == null || !list2.containsAll(list) || !publicKeyCredentialDescriptor.a.containsAll(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a});
    }

    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.b) + ", \n id=" + abhn.g(b()) + ", \n transports=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b.b;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.j(parcel, 3, b(), false);
        abhi.r(parcel, 4, this.a, false);
        abhi.g(parcel, e);
    }
}
