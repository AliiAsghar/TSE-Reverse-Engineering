package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ieg implements iei {
    public final aerb a;

    public ieg(aerb aerbVar) {
        aerbVar.getClass();
        this.a = aerbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ieg) && this.a == ((ieg) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
