package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tqa {
    public String a;
    public final int b;

    public tqa(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof tqa)) {
            return false;
        }
        String str = this.a;
        if (str != null) {
            return d.F(str, ((tqa) obj).a);
        }
        if (this.b != ((tqa) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        if (str == null) {
            return String.valueOf(this.b);
        }
        return str;
    }

    public tqa(String str) {
        this.b = -1;
        this.a = str;
    }
}
