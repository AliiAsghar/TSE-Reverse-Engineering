package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class fnk {
    protected final fmq d;

    /* JADX INFO: Access modifiers changed from: protected */
    public fnk(fmq fmqVar) {
        this.d = fmqVar;
    }

    protected abstract boolean a(euf eufVar);

    protected abstract boolean b(euf eufVar, long j);

    public final boolean c(euf eufVar, long j) {
        if (a(eufVar) && b(eufVar, j)) {
            return true;
        }
        return false;
    }
}
