package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwu {
    public final cws a = new cws();
    public final cws b = new cws();

    public final void a(cxn cxnVar, boolean z) {
        if (z) {
            this.a.b(cxnVar);
            this.b.b(cxnVar);
        } else if (!this.a.c(cxnVar)) {
            this.b.b(cxnVar);
        }
    }

    public final boolean b(cxn cxnVar, boolean z) {
        boolean c = this.a.c(cxnVar);
        if (!z) {
            if (c || this.b.c(cxnVar)) {
                return true;
            }
            return false;
        }
        return c;
    }

    public final boolean c(boolean z) {
        cws cwsVar;
        if (z) {
            cwsVar = this.a;
        } else {
            cwsVar = this.b;
        }
        return cwsVar.d();
    }

    public final boolean d() {
        if (this.b.d() && this.a.d()) {
            return false;
        }
        return true;
    }

    public final void e(cxn cxnVar) {
        this.a.e(cxnVar);
        this.b.e(cxnVar);
    }
}
