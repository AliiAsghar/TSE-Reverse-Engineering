package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajoo extends ajpb {
    private final String a;

    public ajoo(String str) {
        this.a = str;
    }

    @Override // defpackage.ajpb
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajpb) {
            return this.a.equals(((ajpb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
