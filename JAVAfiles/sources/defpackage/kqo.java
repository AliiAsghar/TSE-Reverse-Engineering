package defpackage;

import android.app.Service;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqo implements aksu, apxp {
    public final Service a;
    public final krv b;
    public apya c;
    public apya d;
    public apya e;
    public apya f;
    public apya g;
    public apya h;
    public apya i;
    public apya j;
    public apya k;
    public apya l;
    public apya m;
    public apya n;
    public apya o;
    private final kqo p;

    public kqo() {
        throw null;
    }

    @Override // defpackage.aksw
    public final Set A() {
        return altg.a;
    }

    @Override // defpackage.aksw
    public final aksr a() {
        return (aksr) this.b.at.b();
    }

    public kqo(krv krvVar, Service service) {
        this.p = this;
        this.b = krvVar;
        this.a = service;
        this.c = new kre(krvVar, this, 0);
        this.d = new kre(krvVar, this, 2);
        this.e = new kre(krvVar, this, 4);
        this.f = new kre(krvVar, this, 3);
        this.g = new kre(krvVar, this, 5);
        this.h = new kre(krvVar, this, 1);
        this.i = new kre(krvVar, this, 8);
        this.j = new kre(krvVar, this, 9);
        this.k = new kre(krvVar, this, 7);
        this.l = new kre(krvVar, this, 6);
        this.m = new kre(krvVar, this, 11);
        this.n = new kre(krvVar, this, 10);
        this.o = new kre(krvVar, this, 12);
    }
}
