package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amda implements CharSequence {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    private String e;

    public amda(String str, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = str;
        this.b = i;
        int i4 = i + i2;
        this.c = i4;
        this.d = i3;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.V(z, "Invalid index: %s", i);
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.V(z2, "Invalid length: %s", i2);
        if (i4 <= str.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.V(z3, "Invalid endIndex: %s", i4);
        albo.V(i3 >= i4, "Invalid repetitionStartIndex: %s", i3);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0) {
            if (i < length()) {
                return this.a.charAt(this.b + i);
            }
            throw new IndexOutOfBoundsException("Invalid index (" + i + ") >= length (" + length() + ")");
        }
        throw new IndexOutOfBoundsException(a.cb(i, "Invalid index (", ") < 0"));
    }

    public final boolean isEmpty() {
        if (length() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c - this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0) {
            if (i2 <= length()) {
                if (i <= i2) {
                    return new amda(this.a, this.b + i, i2 - i, this.d);
                }
                throw new IndexOutOfBoundsException(a.cl(i2, i, "Invalid index: begin (", ") > end (", ")"));
            }
            throw new IndexOutOfBoundsException("Invalid index: end (" + i2 + ") > length (" + length() + ")");
        }
        throw new IndexOutOfBoundsException(a.cb(i, "Invalid index: begin (", ") < 0"));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.e;
        if (str == null) {
            String substring = this.a.substring(this.b, this.c);
            this.e = substring;
            return substring;
        }
        return str;
    }
}
