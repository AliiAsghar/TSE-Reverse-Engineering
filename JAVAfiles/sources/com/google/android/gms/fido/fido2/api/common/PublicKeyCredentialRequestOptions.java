package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abzf;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new abzf(1);
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final TokenBinding f;
    public final AuthenticationExtensions g;
    public final Long h;
    public ResultReceiver i;
    private final UserVerificationRequirement j;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117 A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100 A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0079 A[Catch: abzk -> 0x015b, abzk | JSONException -> 0x015d, TryCatch #3 {abzk | JSONException -> 0x015d, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x0065, B:12:0x0074, B:14:0x0087, B:15:0x008d, B:17:0x0093, B:20:0x00a6, B:22:0x00ac, B:23:0x00b9, B:25:0x00bf, B:27:0x00d1, B:28:0x00d7, B:29:0x00df, B:31:0x00e5, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:38:0x0117, B:39:0x0124, B:42:0x012e, B:47:0x012b, B:49:0x0100, B:51:0x0106, B:58:0x0079, B:60:0x007f, B:62:0x0054, B:64:0x005a), top: B:5:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PublicKeyCredentialRequestOptions(byte[] r28, java.lang.Double r29, java.lang.String r30, java.util.List r31, java.lang.Integer r32, com.google.android.gms.fido.fido2.api.common.TokenBinding r33, java.lang.String r34, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r35, java.lang.Long r36, java.lang.String r37, android.os.ResultReceiver r38) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.<init>(byte[], java.lang.Double, java.lang.String, java.util.List, java.lang.Integer, com.google.android.gms.fido.fido2.api.common.TokenBinding, java.lang.String, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions, java.lang.Long, java.lang.String, android.os.ResultReceiver):void");
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (!Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) || !d.B(this.b, publicKeyCredentialRequestOptions.b) || !d.B(this.c, publicKeyCredentialRequestOptions.c) || ((((list = this.d) != null || publicKeyCredentialRequestOptions.d != null) && (list == null || (list2 = publicKeyCredentialRequestOptions.d) == null || !list.containsAll(list2) || !publicKeyCredentialRequestOptions.d.containsAll(this.d))) || !d.B(this.e, publicKeyCredentialRequestOptions.e) || !d.B(this.f, publicKeyCredentialRequestOptions.f) || !d.B(this.j, publicKeyCredentialRequestOptions.j) || !d.B(this.g, publicKeyCredentialRequestOptions.g) || !d.B(this.h, publicKeyCredentialRequestOptions.h))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.j, this.g, this.h});
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.g;
        UserVerificationRequirement userVerificationRequirement = this.j;
        TokenBinding tokenBinding = this.f;
        List list = this.d;
        return "PublicKeyCredentialRequestOptions{\n challenge=" + abhn.g(this.a) + ", \n timeoutSeconds=" + this.b + ", \n rpId='" + this.c + "', \n allowList=" + String.valueOf(list) + ", \n requestId=" + this.e + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n userVerification=" + String.valueOf(userVerificationRequirement) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + ", \n longRequestId=" + this.h + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, bArr, false);
        abhi.v(parcel, 3, this.b);
        abhi.q(parcel, 4, this.c, false);
        abhi.r(parcel, 5, this.d, false);
        abhi.A(parcel, 6, this.e);
        abhi.o(parcel, 7, this.f, i, false);
        UserVerificationRequirement userVerificationRequirement = this.j;
        if (userVerificationRequirement == null) {
            str = null;
        } else {
            str = userVerificationRequirement.d;
        }
        abhi.q(parcel, 8, str, false);
        abhi.o(parcel, 9, this.g, i, false);
        abhi.D(parcel, 10, this.h);
        abhi.q(parcel, 11, null, false);
        abhi.o(parcel, 12, this.i, i, false);
        abhi.g(parcel, e);
    }
}
