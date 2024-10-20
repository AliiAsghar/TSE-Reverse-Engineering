package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erg {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Boolean k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public Integer w;
    public final alog x;

    public erg(erh erhVar) {
        this.a = erhVar.b;
        this.b = erhVar.c;
        this.c = erhVar.d;
        this.d = erhVar.e;
        this.e = erhVar.f;
        this.f = erhVar.g;
        this.g = erhVar.h;
        this.h = erhVar.i;
        this.i = erhVar.j;
        this.j = erhVar.k;
        this.k = erhVar.l;
        this.l = erhVar.n;
        this.m = erhVar.o;
        this.n = erhVar.p;
        this.o = erhVar.q;
        this.p = erhVar.r;
        this.q = erhVar.s;
        this.r = erhVar.t;
        this.s = erhVar.u;
        this.t = erhVar.v;
        this.u = erhVar.w;
        this.v = erhVar.x;
        this.w = erhVar.y;
        this.x = erhVar.z;
    }

    public final void a(byte[] bArr, int i) {
        if (this.f != null && !Objects.equals(Integer.valueOf(i), 3) && Objects.equals(this.g, 3)) {
            return;
        }
        this.f = (byte[]) bArr.clone();
        this.g = Integer.valueOf(i);
    }

    public erg() {
        int i = alog.d;
        this.x = alsx.a;
    }
}
