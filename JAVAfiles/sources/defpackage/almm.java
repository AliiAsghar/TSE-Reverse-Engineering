package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class almm extends almp {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public almm(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // defpackage.almp
    public final void c(StringBuilder sb) {
        sb.append('(');
        sb.append(this.b);
    }

    @Override // defpackage.almp
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(']');
    }

    @Override // defpackage.almp
    public final boolean e(Comparable comparable) {
        if (alst.c(this.b, comparable) < 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.almp
    public final int hashCode() {
        return ~this.b.hashCode();
    }

    public final String toString() {
        return "/" + this.b.toString() + "\\";
    }
}
