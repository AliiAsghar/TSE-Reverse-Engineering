package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abyz;
import defpackage.abzb;
import defpackage.abzi;
import defpackage.abzk;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new abzb(1);
    public final Boolean a;
    private final Attachment b;
    private final UserVerificationRequirement c;
    private final ResidentKeyRequirement d;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment a;
        UserVerificationRequirement a2;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            a = null;
        } else {
            try {
                a = Attachment.a(str);
            } catch (abyz | abzi | abzk e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.b = a;
        this.a = bool;
        if (str2 == null) {
            a2 = null;
        } else {
            a2 = UserVerificationRequirement.a(str2);
        }
        this.c = a2;
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.a(str3);
        }
        this.d = residentKeyRequirement;
    }

    public final ResidentKeyRequirement a() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        if (residentKeyRequirement == null) {
            Boolean bool = this.a;
            if (bool != null && bool.booleanValue()) {
                return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
            }
            return ResidentKeyRequirement.RESIDENT_KEY_DISCOURAGED;
        }
        return residentKeyRequirement;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        if (!d.B(this.b, authenticatorSelectionCriteria.b) || !d.B(this.a, authenticatorSelectionCriteria.a) || !d.B(this.c, authenticatorSelectionCriteria.c) || !d.B(a(), authenticatorSelectionCriteria.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, a()});
    }

    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        UserVerificationRequirement userVerificationRequirement = this.c;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.b) + ", \n requireResidentKey=" + this.a + ", \n requireUserVerification=" + String.valueOf(userVerificationRequirement) + ", \n residentKeyRequirement=" + String.valueOf(residentKeyRequirement) + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int e = abhi.e(parcel);
        Attachment attachment = this.b;
        String str3 = null;
        if (attachment == null) {
            str = null;
        } else {
            str = attachment.c;
        }
        abhi.q(parcel, 2, str, false);
        abhi.s(parcel, 3, this.a);
        UserVerificationRequirement userVerificationRequirement = this.c;
        if (userVerificationRequirement == null) {
            str2 = null;
        } else {
            str2 = userVerificationRequirement.d;
        }
        abhi.q(parcel, 4, str2, false);
        ResidentKeyRequirement a = a();
        if (a != null) {
            str3 = a.d;
        }
        abhi.q(parcel, 5, str3, false);
        abhi.g(parcel, e);
    }
}
