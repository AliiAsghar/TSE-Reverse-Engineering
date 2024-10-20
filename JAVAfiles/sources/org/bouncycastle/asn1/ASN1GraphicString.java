package org.bouncycastle.asn1;

import defpackage.atdg;
import defpackage.atow;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1GraphicString extends ASN1Primitive implements ASN1String {
    final byte[] a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1GraphicString$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1GraphicString(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw new NullPointerException("'contents' cannot be null");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.a.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 25, this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1GraphicString)) {
            return false;
        }
        return Arrays.equals(this.a, ((ASN1GraphicString) aSN1Primitive).a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String e() {
        return atdg.a(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return atow.M(this.a);
    }
}
