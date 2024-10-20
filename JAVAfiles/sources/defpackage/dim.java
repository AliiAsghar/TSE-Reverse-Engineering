package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dim {
    public static final dim a = new dim(false);
    public final boolean b;
    public final int c;

    public dim(boolean z) {
        this.b = z;
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dim)) {
            return false;
        }
        dim dimVar = (dim) obj;
        if (this.b != dimVar.b) {
            return false;
        }
        int i = dimVar.c;
        if (a.bA(0, 0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.b) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.b + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public dim(byte[] bArr) {
        this.b = false;
        this.c = 0;
    }

    public dim() {
        this(false);
    }
}
