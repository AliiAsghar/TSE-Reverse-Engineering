package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflz {
    public final boolean a;
    private final boolean b;

    public aflz() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aflz)) {
            return false;
        }
        aflz aflzVar = (aflz) obj;
        boolean z = aflzVar.b;
        if (this.a == aflzVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(false) * 31) + a.v(this.a);
    }

    public final String toString() {
        return "EmojiDataConfiguration(useGboardDefinitionsAndPreferences=false, fixFrecentEmojiVariants=" + this.a + ")";
    }

    public aflz(boolean z) {
        this.b = false;
        this.a = z;
    }

    public /* synthetic */ aflz(byte[] bArr) {
        this(false);
    }
}
