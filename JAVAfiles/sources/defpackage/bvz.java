package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvz<T> implements bwc<T> {
    public final Object a;
    public Object b;
    private final List c = new ArrayList();

    public bvz(Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.bwc
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.bwc
    public final /* synthetic */ void b(arqv arqvVar, Object obj) {
        bwb.a(this, arqvVar, obj);
    }

    @Override // defpackage.bwc
    public final void c() {
        this.c.clear();
        this.b = this.a;
        e();
    }

    @Override // defpackage.bwc
    public final void d(Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void e();

    @Override // defpackage.bwc
    public /* synthetic */ void g() {
        throw null;
    }

    @Override // defpackage.bwc
    public final void h() {
        if (this.c.isEmpty()) {
            byy.b("empty stack");
        }
        this.b = this.c.remove(r0.size() - 1);
    }

    @Override // defpackage.bwc
    public /* synthetic */ void f() {
    }
}
