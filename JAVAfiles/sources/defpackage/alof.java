package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alof extends alog {
    final transient int a;
    final transient int b;
    final /* synthetic */ alog c;

    public alof(alog alogVar, int i, int i2) {
        this.c = alogVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.alog
    /* renamed from: b */
    public final alog subList(int i, int i2) {
        albo.S(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.alnu
    public final int e() {
        return this.c.f() + this.a + this.b;
    }

    @Override // defpackage.alnu
    public final int f() {
        return this.c.f() + this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        albo.ad(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return true;
    }

    @Override // defpackage.alnu
    public final Object[] m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.alog, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.alog, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }
}
