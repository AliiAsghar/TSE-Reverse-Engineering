package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezm implements fan {
    public final ezl b;
    public fbd c;
    public fan d;
    public boolean f;
    public final fbj a = new fbj();
    public boolean e = true;

    public ezm(ezl ezlVar) {
        this.b = ezlVar;
    }

    @Override // defpackage.fan
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        fan fanVar = this.d;
        dzg.g(fanVar);
        return fanVar.a();
    }

    @Override // defpackage.fan
    public final ero b() {
        fan fanVar = this.d;
        if (fanVar != null) {
            return fanVar.b();
        }
        return this.a.a;
    }

    @Override // defpackage.fan
    public final void c(ero eroVar) {
        fan fanVar = this.d;
        if (fanVar != null) {
            fanVar.c(eroVar);
            eroVar = this.d.b();
        }
        this.a.c(eroVar);
    }

    public final void d() {
        this.f = true;
        this.a.e();
    }

    public final void e() {
        this.f = false;
        this.a.g();
    }

    @Override // defpackage.fan
    public final boolean f() {
        if (this.e) {
            return false;
        }
        fan fanVar = this.d;
        dzg.g(fanVar);
        return fanVar.f();
    }
}
