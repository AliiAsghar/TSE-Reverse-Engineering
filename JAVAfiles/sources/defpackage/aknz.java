package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknz {
    public final akpl a;

    public aknz(akpl akplVar) {
        this.a = akplVar;
    }

    public static aknz a(String str) {
        aozy createBuilder = akpl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        akpl akplVar = (akpl) createBuilder.b;
        str.getClass();
        akplVar.b |= 1;
        akplVar.c = str;
        return new aknz((akpl) createBuilder.s());
    }

    public final String b() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aknz) && this.a.c.equals(((aknz) obj).a.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", b());
    }
}
