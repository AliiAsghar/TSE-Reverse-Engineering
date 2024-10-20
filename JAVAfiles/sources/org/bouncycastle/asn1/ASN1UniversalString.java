package org.bouncycastle.asn1;

import defpackage.atow;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1UniversalString extends ASN1Primitive implements ASN1String {
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1UniversalString$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1UniversalString(byte[] bArr) {
        this.a = bArr;
    }

    private static void f(StringBuffer stringBuffer, int i) {
        char[] cArr = b;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.a.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 28, this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UniversalString)) {
            return false;
        }
        return Arrays.equals(this.a, ((ASN1UniversalString) aSN1Primitive).a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003f A[LOOP:0: B:5:0x003d->B:6:0x003f, LOOP_END] */
    @Override // org.bouncycastle.asn1.ASN1String
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r10 = this;
            byte[] r0 = r10.a
            int r0 = r0.length
            int r1 = org.bouncycastle.asn1.ASN1OutputStream.a(r0)
            int r1 = r1 + r0
            int r1 = r1 + r1
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            int r1 = r1 + 3
            r2.<init>(r1)
            java.lang.String r1 = "#1C"
            r2.append(r1)
            r1 = 0
            r3 = 128(0x80, float:1.8E-43)
            if (r0 >= r3) goto L1e
            f(r2, r0)
            goto L3d
        L1e:
            r4 = 5
            byte[] r5 = new byte[r4]
            r7 = r0
            r6 = r4
        L23:
            int r8 = r6 + (-1)
            byte r9 = (byte) r7
            r5[r8] = r9
            int r7 = r7 >>> 8
            if (r7 != 0) goto L50
            int r7 = 5 - r8
            int r6 = r6 + (-2)
            r3 = r3 | r7
            byte r3 = (byte) r3
            r5[r6] = r3
        L34:
            int r3 = r6 + 1
            r6 = r5[r6]
            f(r2, r6)
            if (r3 < r4) goto L4e
        L3d:
            if (r1 >= r0) goto L49
            byte[] r3 = r10.a
            r3 = r3[r1]
            f(r2, r3)
            int r1 = r1 + 1
            goto L3d
        L49:
            java.lang.String r0 = r2.toString()
            return r0
        L4e:
            r6 = r3
            goto L34
        L50:
            r6 = r8
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1UniversalString.e():java.lang.String");
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return atow.M(this.a);
    }

    public final String toString() {
        return e();
    }
}
