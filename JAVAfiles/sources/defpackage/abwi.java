package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwi {
    public final String a;

    public abwi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abwi) {
            return this.a.equals(((abwi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
