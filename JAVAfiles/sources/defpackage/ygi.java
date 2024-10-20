package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygi extends ygk {
    private final String a;

    public ygi(String str) {
        this.a = str;
    }

    @Override // defpackage.ygk, defpackage.yge
    public final String c() {
        return this.a;
    }

    @Override // defpackage.yge
    public final int d() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yge) {
            yge ygeVar = (yge) obj;
            if (ygeVar.d() == 2 && this.a.equals(ygeVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataSource{filePath=" + this.a + "}";
    }
}
