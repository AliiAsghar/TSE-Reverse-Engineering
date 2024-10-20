package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acsl extends acte {
    private final String a;

    public acsl(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // java.security.Principal
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acte) {
            return this.a.equals(((acte) obj).getName());
        }
        return false;
    }

    @Override // defpackage.acte, java.security.Principal
    public final String getName() {
        return this.a;
    }

    @Override // java.security.Principal
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.security.Principal
    public final String toString() {
        return "GbaPrincipal{name=" + this.a + "}";
    }
}
