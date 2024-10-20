package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alod extends alog {
    private final transient alog a;

    public alod(alog alogVar) {
        this.a = alogVar;
    }

    private final int H(int i) {
        return (size() - 1) - i;
    }

    private final int I(int i) {
        return size() - i;
    }

    @Override // defpackage.alog
    public final alog a() {
        return this.a;
    }

    @Override // defpackage.alog
    /* renamed from: b */
    public final alog subList(int i, int i2) {
        albo.S(i, i2, size());
        return this.a.subList(I(i2), I(i)).a();
    }

    @Override // defpackage.alog, defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        albo.ad(i, size());
        return this.a.get(H(i));
    }

    @Override // defpackage.alog, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return H(lastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.alog, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return H(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
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
