package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgf {
    public final String a;
    private final int b = 0;

    public zgf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgf)) {
            return false;
        }
        zgf zgfVar = (zgf) obj;
        if (!d.F(this.a, zgfVar.a)) {
            return false;
        }
        int i = zgfVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ToastData(text=" + this.a + ", duration=0)";
    }
}
