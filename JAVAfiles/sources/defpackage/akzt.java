package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzt extends akzv {
    private final Enum a;

    public akzt(Enum r1) {
        this.a = r1;
    }

    @Override // defpackage.akzv, defpackage.alaq
    public final Enum a() {
        return this.a;
    }

    @Override // defpackage.alaq
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alaq) {
            alaq alaqVar = (alaq) obj;
            if (alaqVar.b() == 2 && this.a.equals(alaqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringOrEnumValue{enumValue=" + this.a.toString() + "}";
    }
}
