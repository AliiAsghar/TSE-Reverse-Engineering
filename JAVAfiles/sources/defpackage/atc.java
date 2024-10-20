package defpackage;

import defpackage.ara;
import defpackage.ark;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atc implements arv {
    public final Object[] a;
    public final int b;
    private final uv c;

    /* compiled from: PG */
    /* renamed from: atc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<ara.a<? extends ark.a>, arnb> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ atc c;
        final /* synthetic */ uv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, uv uvVar, atc atcVar) {
            super(1);
            this.a = i;
            this.b = i2;
            this.d = uvVar;
            this.c = atcVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
        
            if (r3 == null) goto L7;
         */
        @Override // defpackage.arqr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r7) {
            /*
                r6 = this;
                ara$a r7 = (ara.a) r7
                java.lang.Object r0 = r7.c
                ark$a r0 = (ark.a) r0
                arqr r0 = r0.a()
                int r1 = r7.a
                int r2 = r6.a
                int r1 = java.lang.Math.max(r2, r1)
                int r2 = r7.a
                int r3 = r7.b
                int r2 = r2 + r3
                int r3 = r6.b
                int r2 = r2 + (-1)
                int r2 = java.lang.Math.min(r3, r2)
                if (r1 > r2) goto L4a
            L21:
                if (r0 == 0) goto L31
                int r3 = r7.a
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.a(r3)
                if (r3 != 0) goto L36
            L31:
                aqy r3 = new aqy
                r3.<init>(r1)
            L36:
                uv r4 = r6.d
                r4.g(r3, r1)
                atc r4 = r6.c
                int r5 = r4.b
                int r5 = r1 - r5
                java.lang.Object[] r4 = r4.a
                r4[r5] = r3
                if (r1 == r2) goto L4a
                int r1 = r1 + 1
                goto L21
            L4a:
                arnb r7 = defpackage.arnb.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.atc.AnonymousClass1.a(java.lang.Object):java.lang.Object");
        }
    }

    public atc(artb artbVar, ark arkVar) {
        ara a = arkVar.a();
        int i = artbVar.a;
        if (i < 0) {
            aju.d("negative nearestRange.first");
        }
        atb atbVar = (atb) a;
        int min = Math.min(artbVar.b, atbVar.b - 1);
        if (min < i) {
            this.c = uw.a();
            this.a = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.a = new Object[i2];
        this.b = i;
        uv uvVar = new uv(i2);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i, min, uvVar, this);
        if (i < 0 || i >= atbVar.b) {
            aju.e("Index " + i + ", size " + atbVar.b);
        }
        if (min < 0 || min >= atbVar.b) {
            aju.e("Index " + min + ", size " + atbVar.b);
        }
        if (min < i) {
            aju.c("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int a2 = arb.a(atbVar.a, i);
        int i3 = ((ara.a) atbVar.a.a[a2]).a;
        while (i3 <= min) {
            ara.a aVar = (ara.a) atbVar.a.a[a2];
            anonymousClass1.a(aVar);
            i3 += aVar.b;
            a2++;
        }
        this.c = uvVar;
    }

    @Override // defpackage.arv
    public final int a(Object obj) {
        uv uvVar = this.c;
        int a = uvVar.a(obj);
        if (a >= 0) {
            return uvVar.c[a];
        }
        return -1;
    }

    @Override // defpackage.arv
    public final Object b(int i) {
        int i2 = i - this.b;
        if (i2 >= 0) {
            Object[] objArr = this.a;
            if (i2 <= aqil.i(objArr)) {
                return objArr[i2];
            }
            return null;
        }
        return null;
    }
}
