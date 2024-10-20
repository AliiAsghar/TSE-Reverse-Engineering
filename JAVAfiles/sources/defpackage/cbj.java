package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbj<T> implements Set<T>, arse {
    public final vh a;

    /* compiled from: PG */
    /* renamed from: cbj$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpv implements arqv<artz<? super T>, arpe<? super arnb>, Object> {
        Object a;
        Object b;
        int c;
        int d;
        int e;
        int f;
        long g;
        int h;
        private /* synthetic */ Object j;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((artz) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x005e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:14:0x0092). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:5:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0065 -> B:4:0x0089). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0085 -> B:4:0x0089). Please report as a decompilation issue!!! */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                arpl r1 = defpackage.arpl.a
                int r2 = r0.h
                r3 = 0
                r4 = 1
                r5 = 8
                if (r2 == 0) goto L23
                int r2 = r0.f
                int r6 = r0.e
                long r7 = r0.g
                int r9 = r0.d
                int r10 = r0.c
                java.lang.Object r11 = r0.b
                java.lang.Object r12 = r0.a
                java.lang.Object r13 = r0.j
                artz r13 = (defpackage.artz) r13
                defpackage.aqil.P(r21)
                goto L89
            L23:
                defpackage.aqil.P(r21)
                java.lang.Object r2 = r0.j
                artz r2 = (defpackage.artz) r2
                cbj r6 = defpackage.cbj.this
                vh r6 = r6.a
                java.lang.Object[] r7 = r6.b
                long[] r6 = r6.a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto L97
                r9 = r3
            L38:
                r10 = r6
                long[] r10 = (long[]) r10
                r11 = r10[r9]
                long r13 = ~r11
                r10 = 7
                long r13 = r13 << r10
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r10 == 0) goto L92
                int r10 = r9 - r8
                int r10 = ~r10
                int r10 = r10 >>> 31
                int r10 = 8 - r10
                r13 = r2
                r2 = r3
                r18 = r11
                r11 = r6
                r12 = r7
                r6 = r10
                r10 = r8
                r7 = r18
            L5c:
                if (r2 >= r6) goto L8c
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L89
                int r14 = r9 << 3
                int r14 = r14 + r2
                r15 = r12
                java.lang.Object[] r15 = (java.lang.Object[]) r15
                r14 = r15[r14]
                r0.j = r13
                r0.a = r12
                r0.b = r11
                r0.c = r10
                r0.d = r9
                r0.g = r7
                r0.e = r6
                r0.f = r2
                r0.h = r4
                java.lang.Object r14 = r13.a(r14, r0)
                if (r14 == r1) goto L88
                goto L89
            L88:
                return r1
            L89:
                long r7 = r7 >> r5
                int r2 = r2 + r4
                goto L5c
            L8c:
                if (r6 != r5) goto L97
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L92:
                if (r9 == r8) goto L97
                int r9 = r9 + 1
                goto L38
            L97:
                arnb r1 = defpackage.arnb.a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cbj.AnonymousClass1.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(arpeVar);
            anonymousClass1.j = obj;
            return anonymousClass1;
        }
    }

    public cbj(vh vhVar) {
        this.a = vhVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return a.h();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        return a.i();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        a.g();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return arrn.b(new AnonymousClass1(null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return a.h();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return a.i();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return a.i();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return arri.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return arri.b(this, objArr);
    }
}
