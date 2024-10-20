package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arrs implements arrg {
    private final Class a;

    public arrs(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.arrg
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof arrs) && d.F(this.a, ((arrs) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a.toString()).concat(" (Kotlin reflection is not available)");
    }
}
