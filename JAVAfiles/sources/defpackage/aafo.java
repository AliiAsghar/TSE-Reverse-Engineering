package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aafo implements abce {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aafo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.abce
    public final void a(Uri uri) {
        if (this.b != 0) {
            Object obj = this.a;
            ixd ixdVar = (ixd) obj;
            ixdVar.c(ixdVar.cE.a(uri, ameb.CONTACT_SUGGESTION).b());
            return;
        }
        Object obj2 = this.a;
        ((ixd) ((aafr) obj2).o.a).c(((aant) ((aafp) obj2).j.b()).a(uri, ameb.CONTACT_SUGGESTION).b());
    }
}
