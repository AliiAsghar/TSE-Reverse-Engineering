package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1ParsingException extends IllegalStateException {
    private Throwable a;

    public ASN1ParsingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
