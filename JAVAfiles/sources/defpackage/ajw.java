package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajw {
    public static final b a = new b() { // from class: ajw.5
        @Override // ajw.b, ajw.e
        public final /* synthetic */ float a() {
            return brg.a;
        }

        @Override // ajw.b
        public final void b(dqv dqvVar, int i, int[] iArr, drk drkVar, int[] iArr2) {
            if (drkVar == drk.a) {
                ajw.b(iArr, iArr2, false);
            } else {
                ajw.c(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    };
    public static final b b = new b() { // from class: ajw.3
        @Override // ajw.b, ajw.e
        public final /* synthetic */ float a() {
            return brg.a;
        }

        @Override // ajw.b
        public final void b(dqv dqvVar, int i, int[] iArr, drk drkVar, int[] iArr2) {
            if (drkVar == drk.a) {
                ajw.c(i, iArr, iArr2, false);
            } else {
                ajw.b(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    };
    public static final e c = new e() { // from class: ajw.6
        @Override // ajw.e
        public final /* synthetic */ float a() {
            return brg.a;
        }

        @Override // ajw.e
        public final void b(dqv dqvVar, int i, int[] iArr, int[] iArr2) {
            ajw.b(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    };
    public static final e d = new e() { // from class: ajw.1
        @Override // ajw.e
        public final /* synthetic */ float a() {
            return brg.a;
        }

        @Override // ajw.e
        public final void b(dqv dqvVar, int i, int[] iArr, int[] iArr2) {
            ajw.c(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    };
    public static final c e = new c() { // from class: ajw.2
        @Override // ajw.b, ajw.e
        public final float a() {
            return brg.a;
        }

        @Override // ajw.b
        public final void b(dqv dqvVar, int i, int[] iArr, drk drkVar, int[] iArr2) {
            if (drkVar == drk.a) {
                ajw.a(i, iArr, iArr2, false);
            } else {
                ajw.a(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Center";
        }

        @Override // ajw.e
        public final void b(dqv dqvVar, int i, int[] iArr, int[] iArr2) {
            ajw.a(i, iArr, iArr2, false);
        }
    };
    public static final c f = new c() { // from class: ajw.4
        @Override // ajw.b, ajw.e
        public final float a() {
            return brg.a;
        }

        @Override // ajw.b
        public final void b(dqv dqvVar, int i, int[] iArr, drk drkVar, int[] iArr2) {
            if (drkVar == drk.a) {
                ajw.d(i, iArr, iArr2, false);
            } else {
                ajw.d(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // ajw.e
        public final void b(dqv dqvVar, int i, int[] iArr, int[] iArr2) {
            ajw.d(i, iArr, iArr2, false);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajw$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqv<Integer, drk, Integer> {
        final /* synthetic */ cfq.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(cfq.b bVar) {
            super(2);
            this.a = bVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(this.a.a(0, ((Number) obj).intValue(), (drk) obj2));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final b a = new b() { // from class: ajw.a.1
            @Override // ajw.b, ajw.e
            public final /* synthetic */ float a() {
                return brg.a;
            }

            @Override // ajw.b
            public final void b(dqv dqvVar, int i, int[] iArr, drk drkVar, int[] iArr2) {
                ajw.b(iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        };
        public static final b b = new b() { // from class: ajw.a.2
            @Override // ajw.b, ajw.e
            public final /* synthetic */ float a() {
                return brg.a;
            }

            @Override // ajw.b
            public final void b(dqv dqvVar, int i, int[] iArr, drk drkVar, int[] iArr2) {
                ajw.c(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        };
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface b {
        float a();

        void b(dqv dqvVar, int i, int[] iArr, drk drkVar, int[] iArr2);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface c extends b, e {
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface e {
        float a();

        void b(dqv dqvVar, int i, int[] iArr, int[] iArr2);
    }

    public static final void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        float f2 = (i - i4) / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        while (true) {
            length--;
            if (length >= 0) {
                int i7 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i7;
            } else {
                return;
            }
        }
    }

    public static final void b(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i3] = i2;
                i2 += i4;
                i++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 >= 0) {
                int i5 = iArr[length2];
                iArr2[length2] = i;
                i += i5;
            } else {
                return;
            }
        }
    }

    public static final void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        int i5 = i - i4;
        if (!z) {
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        while (true) {
            length--;
            if (length >= 0) {
                int i8 = iArr[length];
                iArr2[length] = i5;
                i5 += i8;
            } else {
                return;
            }
        }
    }

    public static final void d(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length != 0) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            float max = (i - i3) / Math.max(aqil.g(iArr), 1);
            float f2 = brg.a;
            if (z && iArr.length == 1) {
                f2 = max;
            }
            if (!z) {
                int length = iArr.length;
                int i5 = 0;
                while (i2 < length) {
                    int i6 = iArr[i2];
                    iArr2[i5] = Math.round(f2);
                    f2 += i6 + max;
                    i2++;
                    i5++;
                }
                return;
            }
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 >= 0) {
                    int i7 = iArr[length2];
                    iArr2[length2] = Math.round(f2);
                    f2 += i7 + max;
                } else {
                    return;
                }
            }
        }
    }

    public static final b e(float f2, cfq.b bVar) {
        return new d(f2, true, new AnonymousClass7(bVar));
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class d implements c {
        public final float a;
        private final float b;
        private final boolean c;
        private final arqv d;

        public d(float f, boolean z, arqv arqvVar) {
            this.b = f;
            this.c = z;
            this.d = arqvVar;
            this.a = f;
        }

        @Override // ajw.b, ajw.e
        public final float a() {
            return this.a;
        }

        @Override // ajw.b
        public final void b(dqv dqvVar, int i, int[] iArr, drk drkVar, int[] iArr2) {
            int i2;
            int i3;
            int i4;
            int length = iArr.length;
            if (length == 0) {
                return;
            }
            int eo = dqvVar.eo(this.b);
            if (this.c && drkVar == drk.b) {
                int i5 = length - 1;
                i2 = 0;
                i3 = 0;
                while (i5 >= 0) {
                    int i6 = iArr[i5];
                    int min = Math.min(i2, i - i6);
                    iArr2[i5] = min;
                    int min2 = Math.min(eo, (i - min) - i6);
                    int i7 = iArr2[i5] + i6 + min2;
                    i5--;
                    i3 = min2;
                    i2 = i7;
                }
            } else {
                i2 = 0;
                i3 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    int i10 = iArr[i8];
                    int min3 = Math.min(i2, i - i10);
                    iArr2[i9] = min3;
                    int min4 = Math.min(eo, (i - min3) - i10);
                    int i11 = iArr2[i9] + i10 + min4;
                    i8++;
                    i9++;
                    i3 = min4;
                    i2 = i11;
                }
            }
            arqv arqvVar = this.d;
            if (arqvVar == null || (i4 = i2 - i3) >= i) {
                return;
            }
            int intValue = ((Number) arqvVar.a(Integer.valueOf(i - i4), drkVar)).intValue();
            int length2 = iArr2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                iArr2[i12] = iArr2[i12] + intValue;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dqy.b(this.b, dVar.b) && this.c == dVar.c && defpackage.d.F(this.d, dVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int floatToIntBits = Float.floatToIntBits(this.b) * 31;
            arqv arqvVar = this.d;
            if (arqvVar == null) {
                hashCode = 0;
            } else {
                hashCode = arqvVar.hashCode();
            }
            return ((floatToIntBits + defpackage.a.v(this.c)) * 31) + hashCode;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            if (true != this.c) {
                str = "Absolute";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) dqy.a(this.b));
            sb.append(", ");
            sb.append(this.d);
            sb.append(')');
            return sb.toString();
        }

        @Override // ajw.e
        public final void b(dqv dqvVar, int i, int[] iArr, int[] iArr2) {
            b(dqvVar, i, iArr, drk.a, iArr2);
        }
    }
}
