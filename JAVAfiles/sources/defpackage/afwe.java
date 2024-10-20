package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwe implements agea {
    final /* synthetic */ afwf a;
    private final /* synthetic */ agea b;

    public afwe(agea ageaVar, afwf afwfVar) {
        this.a = afwfVar;
        this.b = ageaVar;
    }

    @Override // defpackage.agea
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.agea
    public final /* bridge */ /* synthetic */ View b() {
        afwf afwfVar = this.a;
        if (afwfVar.g == 3) {
            return afwfVar.c;
        }
        return null;
    }

    @Override // defpackage.agea
    public final void c(int i) {
        this.b.c(i);
    }

    @Override // defpackage.agea
    public final void d() {
        ((afwk) this.a.i.b).f();
    }

    @Override // defpackage.agea
    public final void e(int i) {
        this.b.e(i);
    }

    @Override // defpackage.agea
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.agea
    public final boolean g() {
        return this.b.g();
    }

    @Override // defpackage.agea
    public final boolean h(int i) {
        afwk afwkVar = (afwk) this.a.i.b;
        afwkVar.f = false;
        if (!afwkVar.a(-i, true) && afwkVar.b()) {
            afwkVar.f = true;
            if (((afwk) this.a.i.b).b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.agea
    public final void i(int i) {
        this.b.i(i);
    }

    @Override // defpackage.agea
    public final void j(boolean z) {
        this.b.j(z);
    }

    @Override // defpackage.agea
    public final aazm k() {
        return this.b.k();
    }
}
