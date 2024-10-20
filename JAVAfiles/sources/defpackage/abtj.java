package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtj extends cg implements abst {
    public static final WeakHashMap a = new WeakHashMap();
    private final absv b = new absv();

    @Override // defpackage.cg
    public final void U(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.U(str, fileDescriptor, printWriter, strArr);
        this.b.i();
    }

    @Override // defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        super.X(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    @Override // defpackage.abst
    public final Activity a() {
        return fe();
    }

    @Override // defpackage.cg
    public final void aa() {
        super.aa();
        this.b.c();
    }

    @Override // defpackage.cg
    public final void af() {
        super.af();
        this.b.d();
    }

    @Override // defpackage.abst
    public final void b(abss abssVar) {
        this.b.h(abssVar);
    }

    @Override // defpackage.abst
    public final abss c(Class cls) {
        return this.b.j(cls);
    }

    @Override // defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.b.b(bundle);
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        this.b.e(bundle);
    }

    @Override // defpackage.cg
    public final void k() {
        super.k();
        this.b.f();
    }

    @Override // defpackage.cg
    public final void l() {
        super.l();
        this.b.g();
    }
}
