package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaoy implements emx {
    final /* synthetic */ cg a;
    final /* synthetic */ abdc b;
    final /* synthetic */ znj c;
    final /* synthetic */ afmd d;
    final /* synthetic */ aqws e;

    public aaoy(afmd afmdVar, cg cgVar, znj znjVar, aqws aqwsVar, abdc abdcVar) {
        this.a = cgVar;
        this.c = znjVar;
        this.e = aqwsVar;
        this.b = abdcVar;
        this.d = afmdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    @Override // defpackage.emx
    public final void d(enm enmVar) {
        Window window;
        View decorView;
        cj fe = this.a.fe();
        if (fe != null && (window = fe.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            this.d.d = decorView.getViewTreeObserver();
            afmd afmdVar = this.d;
            if (afmdVar.d != null) {
                afmdVar.e = this.c.a(fe, decorView, this.e.a);
                afmd afmdVar2 = this.d;
                ((ViewTreeObserver) afmdVar2.d).addOnGlobalLayoutListener(afmdVar2.e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        afmd afmdVar;
        ?? r0;
        Object obj = this.d.d;
        if (obj != null && ((ViewTreeObserver) obj).isAlive() && (r0 = (afmdVar = this.d).e) != 0) {
            ((ViewTreeObserver) afmdVar.d).removeOnGlobalLayoutListener(r0);
        }
        afmd afmdVar2 = this.d;
        abdc abdcVar = this.b;
        Stream stream = Collection.EL.stream(afmdVar2.c);
        abdcVar.getClass();
        stream.forEach(new aakw(abdcVar, 17));
        afmd afmdVar3 = this.d;
        abdc abdcVar2 = this.b;
        Stream stream2 = Collection.EL.stream(afmdVar3.a);
        abdcVar2.getClass();
        stream2.forEach(new aakw(abdcVar2, 18));
        this.d.c.clear();
        this.d.a.clear();
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
