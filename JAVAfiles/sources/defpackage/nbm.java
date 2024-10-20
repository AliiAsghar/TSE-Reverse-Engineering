package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbm implements nbd {
    private final afqc a;
    private final String b;
    private final String c;

    public nbm(afqc afqcVar) {
        this.a = afqcVar;
        this.b = afqcVar.a;
        this.c = afqcVar.b;
    }

    @Override // defpackage.nbd
    public final String a() {
        return this.b;
    }

    @Override // defpackage.nbd
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        nbm nbmVar;
        String str = null;
        if (obj instanceof nbm) {
            nbmVar = (nbm) obj;
        } else {
            nbmVar = null;
        }
        if (nbmVar != null) {
            str = nbmVar.a.a;
        }
        return d.F(str, this.a.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultEmotifyReaction(customSticker=" + this.a + ")";
    }
}
