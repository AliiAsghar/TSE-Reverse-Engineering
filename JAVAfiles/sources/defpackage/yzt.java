package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzt implements yzs {
    public final String a;
    public final aesp b;
    public final String c;
    private final yzt d;

    public yzt(String str, aesp aespVar, String str2) {
        str.getClass();
        this.a = str;
        this.b = aespVar;
        this.c = str2;
        this.d = this;
    }

    @Override // defpackage.yzs
    public final yzt a() {
        return this.d;
    }

    @Override // defpackage.yzs
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzt)) {
            return false;
        }
        yzt yztVar = (yzt) obj;
        if (d.F(this.a, yztVar.a) && d.F(this.b, yztVar.b) && d.F(this.c, yztVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactUiData(id=" + this.a + ", itemUiData=" + this.b + ", header=" + this.c + ")";
    }
}
