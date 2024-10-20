package com.google.android.gms.fido.credentialstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abyw;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class KeyData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyData> CREATOR = new abyw();
    public final boolean a;
    public final byte[] b;
    public final PublicKey c;
    public final PrivateKey d;
    public final String e;
    public final byte[] f;
    public final byte[] g;
    public final Account h;
    public final boolean i;
    public final KeyMetadata j;
    public final boolean k;
    public final byte[] l;
    public final byte[] m;
    public final long n;
    public final boolean o;
    public final int p;

    public KeyData(int i, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, String str, byte[] bArr4, byte[] bArr5, Account account, boolean z2, KeyMetadata keyMetadata, boolean z3, byte[] bArr6, byte[] bArr7, long j, boolean z4) {
        PublicKey publicKey;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            throw new IllegalArgumentException("Value is not a known key type");
                        }
                    }
                }
            }
        }
        this.p = i2;
        this.a = z;
        this.b = bArr;
        this.e = str;
        this.f = bArr4;
        this.g = bArr5;
        this.h = account;
        this.i = z2;
        this.j = keyMetadata;
        this.k = z3;
        this.l = bArr6;
        this.m = bArr7;
        this.n = j;
        this.o = z4;
        PrivateKey privateKey = null;
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            if (bArr2 != null) {
                publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(bArr2));
            } else {
                publicKey = null;
            }
            if (bArr3 != null) {
                try {
                    privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr3));
                } catch (NoSuchAlgorithmException e) {
                    e = e;
                    Log.e("KeyData", "unable to decode key pair", e);
                    this.c = publicKey;
                    this.d = privateKey;
                } catch (InvalidKeySpecException e2) {
                    e = e2;
                    Log.e("KeyData", "unable to decode key pair", e);
                    this.c = publicKey;
                    this.d = privateKey;
                }
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e3) {
            e = e3;
            publicKey = null;
        }
        this.c = publicKey;
        this.d = privateKey;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] encoded;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.p);
        abhi.h(parcel, 2, this.a);
        abhi.j(parcel, 3, this.b, false);
        PublicKey publicKey = this.c;
        byte[] bArr = null;
        if (publicKey == null) {
            encoded = null;
        } else {
            encoded = publicKey.getEncoded();
        }
        abhi.j(parcel, 4, encoded, false);
        PrivateKey privateKey = this.d;
        if (privateKey != null) {
            bArr = privateKey.getEncoded();
        }
        abhi.j(parcel, 5, bArr, false);
        abhi.q(parcel, 6, this.e, false);
        abhi.j(parcel, 7, this.f, false);
        abhi.j(parcel, 8, this.g, false);
        abhi.o(parcel, 9, this.h, i, false);
        abhi.h(parcel, 10, this.i);
        abhi.o(parcel, 11, this.j, i, false);
        abhi.h(parcel, 12, this.k);
        abhi.j(parcel, 13, this.l, false);
        abhi.j(parcel, 14, this.m, false);
        abhi.n(parcel, 15, this.n);
        abhi.h(parcel, 16, this.o);
        abhi.g(parcel, e);
    }
}
