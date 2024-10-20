package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpd extends cpf implements Iterable<cpf>, arse {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    /* compiled from: PG */
    /* renamed from: cpd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 implements Iterator<cpf>, arse {
        private final Iterator a;

        public AnonymousClass1(cpd cpdVar) {
            this.a = cpdVar.j.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ cpf next() {
            return (cpf) this.a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            a.g();
        }
    }

    public cpd(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof cpd)) {
            cpd cpdVar = (cpd) obj;
            if (d.F(this.a, cpdVar.a) && this.b == cpdVar.b && this.c == cpdVar.c && this.d == cpdVar.d && this.e == cpdVar.e && this.f == cpdVar.f && this.g == cpdVar.g && this.h == cpdVar.h && d.F(this.i, cpdVar.i) && d.F(this.j, cpdVar.j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<cpf> iterator() {
        return new AnonymousClass1(this);
    }

    public cpd() {
        this("", brg.a, brg.a, brg.a, 1.0f, 1.0f, brg.a, brg.a, cpe.a, arnv.a);
    }
}
