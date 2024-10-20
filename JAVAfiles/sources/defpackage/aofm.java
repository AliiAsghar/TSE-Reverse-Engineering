package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aofm implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aofm(aofp aofpVar, Callable callable, asqc asqcVar, int i) {
        this.d = i;
        this.a = aofpVar;
        this.b = callable;
        this.c = asqcVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, arqr] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.d != 0) {
            Object obj = this.a;
            obj.getClass();
            return (Uri) this.c.a(this.b.a(obj));
        }
        return ((aofp) this.a).a.submit(new aofk(this.b, this.c, 2, null));
    }

    public /* synthetic */ aofm(arqr arqrVar, arqr arqrVar2, String str, int i) {
        this.d = i;
        this.c = arqrVar;
        this.b = arqrVar2;
        this.a = str;
    }
}
