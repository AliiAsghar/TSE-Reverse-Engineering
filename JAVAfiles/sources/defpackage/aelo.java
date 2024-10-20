package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelo implements aelq {
    public final aerb a;

    public aelo(aerb aerbVar) {
        this.a = aerbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aelo) && this.a == ((aelo) obj).a) {
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
