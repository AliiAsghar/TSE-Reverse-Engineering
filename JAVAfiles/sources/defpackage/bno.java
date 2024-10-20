package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bno {
    public final dto a;

    public bno(dto dtoVar) {
        this.a = dtoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bno) && this.a == ((bno) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public bno() {
        this(dto.a);
    }
}
