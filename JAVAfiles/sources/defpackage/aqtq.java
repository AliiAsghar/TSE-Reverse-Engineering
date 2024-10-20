package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqtq extends aqtx {
    private final aqtt a;

    public aqtq(aqtt aqttVar) {
        aqttVar.getClass();
        this.a = aqttVar;
    }

    @Override // defpackage.aqtx
    public final aqtt a(aqtu aqtuVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqtq)) {
            return false;
        }
        return this.a.equals(((aqtq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.a.toString() + ")";
    }
}
