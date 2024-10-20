package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agun {
    public final String a;
    public final alog b;

    public agun() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agun) {
            agun agunVar = (agun) obj;
            if (this.a.equals(agunVar.a) && alzz.at(this.b, agunVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "EmojiVariantData{primary=" + this.a + ", secondaries=" + this.b.toString() + "}";
    }

    public agun(String str, alog alogVar) {
        if (str == null) {
            throw new NullPointerException("Null primary");
        }
        this.a = str;
        if (alogVar != null) {
            this.b = alogVar;
            return;
        }
        throw new NullPointerException("Null secondaries");
    }
}
