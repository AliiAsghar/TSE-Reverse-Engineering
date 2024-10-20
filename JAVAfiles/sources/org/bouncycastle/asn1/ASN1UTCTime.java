package org.bouncycastle.asn1;

import defpackage.atdg;
import defpackage.atow;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1UTCTime extends ASN1Primitive {
    final byte[] a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1UTCTime$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1UTCTime(String str) {
        this.a = atdg.d(str);
        try {
            new SimpleDateFormat("yyMMddHHmmssz", LocaleUtil.a).parse(f());
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    private final boolean g(int i) {
        byte b;
        byte[] bArr = this.a;
        if (bArr.length > i && (b = bArr[i]) >= 48 && b <= 57) {
            return true;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.a.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 23, this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UTCTime)) {
            return false;
        }
        return Arrays.equals(this.a, ((ASN1UTCTime) aSN1Primitive).a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final String e() {
        String str;
        String f = f();
        if (f.charAt(0) < '5') {
            str = "20";
        } else {
            str = "19";
        }
        return str.concat(f);
    }

    public final String f() {
        String a = atdg.a(this.a);
        if (a.indexOf(45) < 0 && a.indexOf(43) < 0) {
            if (a.length() == 11) {
                return String.valueOf(a.substring(0, 10)).concat("00GMT+00:00");
            }
            return String.valueOf(a.substring(0, 12)).concat("GMT+00:00");
        }
        int indexOf = a.indexOf(45);
        if (indexOf < 0) {
            indexOf = a.indexOf(43);
        }
        if (indexOf == a.length() - 3) {
            a = a.concat("00");
        }
        if (indexOf == 10) {
            return a.substring(0, 10) + "00GMT" + a.substring(10, 13) + ":" + a.substring(13, 15);
        }
        return a.substring(0, 12) + "GMT" + a.substring(12, 15) + ":" + a.substring(15, 17);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return atow.M(this.a);
    }

    public final String toString() {
        return atdg.a(this.a);
    }

    public ASN1UTCTime(byte[] bArr) {
        if (bArr.length >= 2) {
            this.a = bArr;
            if (!g(0) || !g(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }
}
