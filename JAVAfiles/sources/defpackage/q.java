package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class q {

    @Deprecated
    public final p a;

    @Deprecated
    public final p b;

    @Deprecated
    public q(p pVar, p pVar2) {
        if (pVar.b == pVar2.b) {
            this.a = pVar;
            this.b = pVar2;
            return;
        }
        throw new IllegalArgumentException(a.bY(pVar2, pVar, "Ranges must have the same number of visible decimals: ", "~"));
    }

    @Deprecated
    public final String toString() {
        String concat;
        p pVar = this.b;
        p pVar2 = this.a;
        String obj = pVar2.toString();
        if (pVar == pVar2) {
            concat = "";
        } else {
            concat = "~".concat(pVar.toString());
        }
        return obj.concat(concat);
    }
}
