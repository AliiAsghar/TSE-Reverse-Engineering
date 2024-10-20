package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akwh extends Exception {
    private final alog a;

    /* JADX WARN: Multi-variable type inference failed */
    public akwh(alog alogVar) {
        super((Throwable) alogVar.get(0));
        this.a = alogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return alzz.at(this.a, ((akwh) obj).a);
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Combined exception with " + ((alsx) this.a).c + " cause(s). First cause: " + String.valueOf(getCause()) + " All: " + String.valueOf(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
