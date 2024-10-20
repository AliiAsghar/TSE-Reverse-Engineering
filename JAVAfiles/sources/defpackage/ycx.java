package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycx {
    private final String a;
    private final boolean b;

    public ycx(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycx)) {
            return false;
        }
        ycx ycxVar = (ycx) obj;
        if (d.F(this.a, ycxVar.a) && this.b == ycxVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + a.v(this.b);
    }

    public final String toString() {
        return "EmojiStatusCacheKey(messageText=" + this.a + ", stopAtFirstNonEmoji=" + this.b + ")";
    }
}
