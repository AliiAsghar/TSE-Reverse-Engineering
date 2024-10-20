package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahol implements ahlx {
    private final int a;
    private final int b;

    public ahol() {
        throw null;
    }

    public static final ahok c() {
        ahok ahokVar = new ahok();
        ahokVar.a = 10;
        ahokVar.c = 1;
        ahokVar.b = (byte) 3;
        return ahokVar;
    }

    @Override // defpackage.ahlx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        if (this.b == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahol)) {
            return false;
        }
        ahol aholVar = (ahol) obj;
        int i = this.b;
        int i2 = aholVar.b;
        if (i != 0) {
            if (i == i2 && this.a == aholVar.a) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + ahly.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    public ahol(int i, int i2) {
        this.b = i;
        this.a = i2;
    }
}
