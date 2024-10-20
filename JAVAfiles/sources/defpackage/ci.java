package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ci extends cn implements eab, eac, dq, dr, eoz, ro, sc, gjz, dd, edb {
    final /* synthetic */ cj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(cj cjVar) {
        super(cjVar, cjVar, new Handler());
        this.a = cjVar;
    }

    @Override // defpackage.enm
    public final enh N() {
        return this.a.a;
    }

    @Override // defpackage.cn, defpackage.cl
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.gjz
    public final iba aK() {
        return this.a.aK();
    }

    @Override // defpackage.eoz
    public final efu aL() {
        return this.a.aL();
    }

    @Override // defpackage.cn, defpackage.cl
    public final boolean b() {
        Window window = this.a.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ro
    public final rm c() {
        return this.a.c();
    }

    @Override // defpackage.cn
    public final void f() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.eab
    public final void g(ecd ecdVar) {
        throw null;
    }

    @Override // defpackage.sc
    public final sb gR() {
        return this.a.g;
    }

    @Override // defpackage.eab
    public final void gS(ecd ecdVar) {
        this.a.gS(ecdVar);
    }

    @Override // defpackage.dd
    public final void h(cg cgVar) {
        this.a.h(cgVar);
    }
}
