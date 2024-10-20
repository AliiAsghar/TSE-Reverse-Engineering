package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioo extends RuntimeException {
    private final afsm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioo(afsm afsmVar) {
        super("Attempted to add " + new arrh(afsmVar.getClass()).c() + " with size " + afsmVar.b() + ",but attachments limit was reached.");
        afsmVar.getClass();
        int i = arsc.a;
        this.a = afsmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ioo) && d.F(this.a, ((ioo) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AttachmentsLimitReached(attemptedMediaAdd=" + this.a + ")";
    }
}
