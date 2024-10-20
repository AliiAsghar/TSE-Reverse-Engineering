package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afla {
    public final afnr a;

    public afla(afnr afnrVar) {
        this.a = afnrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afla) && d.F(this.a, ((afla) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComposeEmojiSpan(emojiUsage=" + this.a + ")";
    }
}
