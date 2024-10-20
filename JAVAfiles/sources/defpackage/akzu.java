package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzu extends akzv {
    private final String a;

    public akzu(String str) {
        this.a = str;
    }

    @Override // defpackage.alaq
    public final int b() {
        return 1;
    }

    @Override // defpackage.akzv, defpackage.alaq
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alaq) {
            alaq alaqVar = (alaq) obj;
            if (alaqVar.b() == 1 && this.a.equals(alaqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringOrEnumValue{stringValue=" + this.a + "}";
    }
}
