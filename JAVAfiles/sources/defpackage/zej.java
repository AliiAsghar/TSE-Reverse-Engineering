package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zej {
    public final ascv a;
    public final ascv b;
    public final ascv c;
    public final zei d;
    private final boolean e;

    public zej(ascv ascvVar, ascv ascvVar2, ascv ascvVar3, zei zeiVar) {
        ascvVar.getClass();
        ascvVar2.getClass();
        ascvVar3.getClass();
        this.a = ascvVar;
        this.b = ascvVar2;
        this.c = ascvVar3;
        this.d = zeiVar;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zej)) {
            return false;
        }
        zej zejVar = (zej) obj;
        if (!d.F(this.a, zejVar.a) || !d.F(this.b, zejVar.b) || !d.F(this.c, zejVar.c) || !d.F(this.d, zejVar.d)) {
            return false;
        }
        boolean z = zejVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "StartChatTopAppBarUiData(autoCompleteContactBarUiData=" + this.a + ", extendedTopAppBarUiData=" + this.b + ", simSelectorRowUiData=" + this.c + ", flags=" + this.d + ", focusTextField=true)";
    }
}
