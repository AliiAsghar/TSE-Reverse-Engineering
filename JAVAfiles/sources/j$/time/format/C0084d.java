package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0084d implements InterfaceC0086f {
    private final char a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0084d(char c) {
        this.a = c;
    }

    @Override // j$.time.format.InterfaceC0086f
    public final boolean n(z zVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.InterfaceC0086f
    public final int t(w wVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.a;
        if (charAt != c && (wVar.k() || (Character.toUpperCase(charAt) != Character.toUpperCase(c) && Character.toLowerCase(charAt) != Character.toLowerCase(c)))) {
            return ~i;
        }
        return i + 1;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
