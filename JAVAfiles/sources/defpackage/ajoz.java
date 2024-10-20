package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajoz extends ajpu {
    private final String a;
    private final int b;

    public ajoz(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ajpu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ajpu
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpu) {
            ajpu ajpuVar = (ajpu) obj;
            if (this.b == ajpuVar.b() && this.a.equals(ajpuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }
}
