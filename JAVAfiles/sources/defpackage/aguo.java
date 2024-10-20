package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aguo {
    public final alor a;
    private final String b;

    public aguo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aguo) {
            aguo aguoVar = (aguo) obj;
            if (this.b.equals(aguoVar.b) && alzz.am(this.a, aguoVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "EmojiVariantDataGlobal{base=" + this.b + ", variantModifierSetsToVariants=" + alzz.ai(this.a) + "}";
    }

    public aguo(String str, alor alorVar) {
        if (str == null) {
            throw new NullPointerException("Null base");
        }
        this.b = str;
        this.a = alorVar;
    }
}
