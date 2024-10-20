package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarg implements aaqn {
    public final String a;

    public aarg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aarg) {
            return this.a.equals(((aarg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "EmojiContentItem{text=" + this.a + "}";
    }

    public aarg(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
    }
}
