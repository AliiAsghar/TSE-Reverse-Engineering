package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeza {
    public final String a;
    public final String b;

    public aeza(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeza)) {
            return false;
        }
        aeza aezaVar = (aeza) obj;
        if (d.F(this.a, aezaVar.a) && d.F(this.b, aezaVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "EmojiAnimationFile(emoji=" + this.a + ", animationFileName=" + this.b + ")";
    }
}
