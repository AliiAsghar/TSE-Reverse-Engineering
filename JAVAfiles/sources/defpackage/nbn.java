package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbn implements nbd {
    private final String a;
    private final String b;

    public nbn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nbd
    public final String a() {
        return this.a;
    }

    @Override // defpackage.nbd
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        nbn nbnVar;
        String str = null;
        if (obj instanceof nbn) {
            nbnVar = (nbn) obj;
        } else {
            nbnVar = null;
        }
        if (nbnVar != null) {
            str = nbnVar.a;
        }
        return d.F(str, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultEmotifyReactionV2(id=" + this.a + ", uri=" + this.b + ")";
    }
}
