package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whv implements akgr {
    final /* synthetic */ String a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public whv(Object obj, String str, int i) {
        this.c = i;
        this.b = obj;
        this.a = str;
    }

    @Override // defpackage.akgr
    public final akfd a() {
        if (this.c != 0) {
            return wfw.a;
        }
        return why.b;
    }

    @Override // defpackage.akgr
    public final /* synthetic */ ListenableFuture b() {
        akul c;
        akul c2;
        if (this.c != 0) {
            String str = this.a;
            wfw wfwVar = (wfw) this.b;
            c2 = qjh.c(wfwVar.b, arpj.a, arwf.a, new vpi(wfwVar, str, (arpe) null, 4));
            return c2;
        }
        String str2 = this.a;
        why whyVar = (why) this.b;
        c = qjh.c(whyVar.d, arpj.a, arwf.a, new jvy(str2, whyVar, (arpe) null, 3));
        return c;
    }
}
