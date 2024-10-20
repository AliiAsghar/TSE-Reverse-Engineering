package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efe extends efg {
    final WindowInsets.Builder a;

    public efe() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.efg
    public efo a() {
        WindowInsets build;
        h();
        build = this.a.build();
        efo o = efo.o(build);
        o.r(this.b);
        return o;
    }

    @Override // defpackage.efg
    public void b(eaq eaqVar) {
        this.a.setStableInsets(eaqVar.a());
    }

    @Override // defpackage.efg
    public void c(eaq eaqVar) {
        this.a.setSystemWindowInsets(eaqVar.a());
    }

    @Override // defpackage.efg
    public void d(eaq eaqVar) {
        this.a.setMandatorySystemGestureInsets(eaqVar.a());
    }

    @Override // defpackage.efg
    public void e(eaq eaqVar) {
        this.a.setSystemGestureInsets(eaqVar.a());
    }

    @Override // defpackage.efg
    public void f(eaq eaqVar) {
        this.a.setTappableElementInsets(eaqVar.a());
    }

    public efe(efo efoVar) {
        super(efoVar);
        WindowInsets.Builder builder;
        WindowInsets e = efoVar.e();
        if (e != null) {
            builder = new WindowInsets.Builder(e);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
