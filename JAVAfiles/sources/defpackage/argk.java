package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argk extends argi {
    @Override // defpackage.argi
    public final boolean a(argl arglVar) {
        synchronized (arglVar) {
            if (arglVar.a == 0) {
                arglVar.a = -1;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.argi
    public final void b(argl arglVar) {
        synchronized (arglVar) {
            arglVar.a = 0;
        }
    }
}
