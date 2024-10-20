package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afor extends afot {
    public final afnb a;
    private final int b;

    public afor(afnb afnbVar, int i) {
        afnbVar.getClass();
        this.a = afnbVar;
        this.b = i;
        afnbVar.a().a().toString();
    }

    @Override // defpackage.afot
    public final int a() {
        return this.b;
    }

    @Override // defpackage.afot
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afor)) {
            return false;
        }
        afor aforVar = (afor) obj;
        if (d.F(this.a, aforVar.a) && this.b == aforVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Emoji(emojiSet=" + this.a + ", categoryId=" + this.b + ")";
    }
}
