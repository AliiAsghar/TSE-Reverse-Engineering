package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cab implements Iterable, cfm, arse {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public HashMap i;
    public tx j;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList h = new ArrayList();

    public final int a(bwa bwaVar) {
        if (this.f) {
            bwp.i("Use active SlotWriter to determine anchor location instead");
        }
        if (!bwaVar.a()) {
            byy.a("Anchor refers to a group that was removed");
        }
        return bwaVar.a;
    }

    public final caa b() {
        if (!this.f) {
            this.e++;
            return new caa(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final cae c() {
        if (this.f) {
            bwp.i("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            bwp.i("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new cae(this);
    }

    public final void d() {
        this.j = new tx((byte[]) null);
    }

    public final void e() {
        this.i = new HashMap();
    }

    public final boolean f(bwa bwaVar) {
        int i;
        if (bwaVar.a() && (i = cad.i(this.h, bwaVar.a, this.b)) >= 0 && d.F(this.h.get(i), bwaVar)) {
            return true;
        }
        return false;
    }

    public final void g(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap hashMap, tx txVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = hashMap;
        this.j = txVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bxp(this, 0, this.b);
    }
}
