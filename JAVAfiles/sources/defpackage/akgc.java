package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgc extends akfc {
    private final String a;

    public akgc() {
        throw null;
    }

    @Override // defpackage.akfd
    public final alpt b() {
        return new altx(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akgc) {
            return this.a.equals(((akgc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SingleStringKey{stringRepresentation=" + this.a + "}";
    }

    public akgc(String str) {
        if (str == null) {
            throw new NullPointerException("Null stringRepresentation");
        }
        this.a = str;
    }
}
