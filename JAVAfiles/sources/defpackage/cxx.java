package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxx {
    public static final boolean a(cxn cxnVar) {
        cxn cxnVar2;
        if (cxnVar.k == null) {
            return false;
        }
        cxn t = cxnVar.t();
        if (t != null) {
            cxnVar2 = t.k;
        } else {
            cxnVar2 = null;
        }
        if (cxnVar2 != null && !cxnVar.x.b) {
            return false;
        }
        return true;
    }
}
