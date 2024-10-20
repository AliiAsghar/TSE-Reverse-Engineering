package j$.time.format;

/* loaded from: classes5.dex */
final class l implements InterfaceC0086f {
    private final InterfaceC0086f a;
    private final int b;
    private final char c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(InterfaceC0086f interfaceC0086f, int i, char c) {
        this.a = interfaceC0086f;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC0086f
    public final boolean n(z zVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.n(zVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new RuntimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    @Override // j$.time.format.InterfaceC0086f
    public final int t(w wVar, CharSequence charSequence, int i) {
        boolean l = wVar.l();
        if (i <= charSequence.length()) {
            if (i == charSequence.length()) {
                return ~i;
            }
            int i2 = this.b + i;
            if (i2 > charSequence.length()) {
                if (l) {
                    return ~i;
                }
                i2 = charSequence.length();
            }
            int i3 = i;
            while (i3 < i2 && wVar.b(charSequence.charAt(i3), this.c)) {
                i3++;
            }
            int t = this.a.t(wVar, charSequence.subSequence(0, i2), i3);
            if (t != i2 && l) {
                return ~(i + i3);
            }
            return t;
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + valueOf + "," + this.b + str;
    }
}
