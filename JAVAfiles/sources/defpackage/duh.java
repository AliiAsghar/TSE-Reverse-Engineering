package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duh implements bzt {
    public Handler a;
    public final cfc b = new cfc(new rh(this, 8));
    public boolean c = true;
    public final arqr d = new rh(this, 9);
    public final List e = new ArrayList();
    public final duc f;

    public duh(duc ducVar) {
        this.f = ducVar;
    }

    public final void a() {
        this.c = true;
    }

    @Override // defpackage.bzt
    public final void h() {
        this.b.e();
        this.b.a();
    }

    @Override // defpackage.bzt
    public final void i() {
        this.b.d();
    }

    @Override // defpackage.bzt
    public final void g() {
    }
}
