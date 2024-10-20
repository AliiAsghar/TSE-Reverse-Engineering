package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crq {
    private final int a;

    public final boolean equals(Object obj) {
        if ((obj instanceof crq) && this.a == ((crq) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
