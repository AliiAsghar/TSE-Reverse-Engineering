package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afpt {
    public final aflw a;
    public final afnb b;

    public afpt(aflw aflwVar, afnb afnbVar) {
        aflwVar.getClass();
        afnbVar.getClass();
        this.a = aflwVar;
        this.b = afnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afpt)) {
            return false;
        }
        afpt afptVar = (afpt) obj;
        if (d.F(this.a, afptVar.a) && d.F(this.b, afptVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EmojiWithEmojiSet(emoji=" + this.a + ", emojiSet=" + this.b + ")";
    }
}
