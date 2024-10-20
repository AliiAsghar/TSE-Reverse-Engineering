package defpackage;

import android.util.SparseIntArray;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abul {
    public final Object a;
    public Object b;

    public abul(Optional optional, znl znlVar) {
        this.b = optional;
        this.a = znlVar;
    }

    public static abul d(Optional optional) {
        return new abul(optional, new znl() { // from class: znk
            @Override // defpackage.znl
            public final void a(Optional optional2) {
            }
        });
    }

    public final void a() {
        synchronized (this.a) {
            ((SparseIntArray) this.a).clear();
        }
    }

    public final int b(int i) {
        int i2;
        synchronized (this.a) {
            i2 = ((SparseIntArray) this.a).get(i, -1);
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [znl, java.lang.Object] */
    public final void c(Optional optional) {
        this.b = optional;
        this.a.a(optional);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arwe, java.lang.Object] */
    public final synchronized boolean e(long j) {
        if (this.b == null) {
            this.b = qjh.m(this.a, new qvt(j, this, (arpe) null, 3));
            return false;
        }
        return true;
    }

    public abul() {
        this(abqa.a);
    }

    public abul(arwe arweVar) {
        arweVar.getClass();
        this.a = arweVar;
    }

    public abul(abqb abqbVar) {
        this.a = new SparseIntArray();
        abhg.m(abqbVar);
        this.b = abqbVar;
    }
}
