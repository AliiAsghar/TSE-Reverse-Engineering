package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class OIDTokenizer {
    private final String a;
    private int b = 0;

    public OIDTokenizer(String str) {
        this.a = str;
    }

    public final String a() {
        int i = this.b;
        if (i == -1) {
            return null;
        }
        int indexOf = this.a.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.a.substring(this.b);
            this.b = -1;
            return substring;
        }
        String substring2 = this.a.substring(this.b, indexOf);
        this.b = indexOf + 1;
        return substring2;
    }

    public final boolean b() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }
}
