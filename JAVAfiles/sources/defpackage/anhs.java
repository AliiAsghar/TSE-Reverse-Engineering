package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anhs {
    private final CharSequence a;
    private final String b;

    public anhs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anhs) {
            anhs anhsVar = (anhs) obj;
            if (this.a.equals(anhsVar.a)) {
                String str = this.b;
                String str2 = anhsVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "ParseParameters{input=" + ((String) this.a) + ", country=" + this.b + "}";
    }

    public anhs(CharSequence charSequence, String str) {
        if (charSequence == null) {
            throw new NullPointerException("Null input");
        }
        this.a = charSequence;
        this.b = str;
    }
}
