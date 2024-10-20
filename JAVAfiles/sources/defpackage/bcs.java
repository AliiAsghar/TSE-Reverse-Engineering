package defpackage;

import defpackage.bcy;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcs implements bdq {
    private final ud a;
    private final List b;
    private final int c;
    private final int d;
    private final boolean e;
    private final bcy f;

    /* compiled from: PG */
    /* renamed from: bcs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<bcx, arnb> {
        final /* synthetic */ bcy a;
        final /* synthetic */ uf b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(uf ufVar, bcy bcyVar) {
            super(1);
            this.b = ufVar;
            this.a = bcyVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            bcx bcxVar = (bcx) obj;
            bcs.o(this.b, this.a, bcxVar, 0, bcxVar.a());
            return arnb.a;
        }
    }

    public bcs(ud udVar, List list, int i, int i2, boolean z, bcy bcyVar) {
        this.a = udVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = bcyVar;
        if (list.size() > 1) {
            return;
        }
        aju.d("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static final void o(uf ufVar, bcy bcyVar, bcx bcxVar, int i, int i2) {
        bcy d;
        if (bcyVar.c) {
            d = bcxVar.d(i2, i);
        } else {
            d = bcxVar.d(i, i2);
        }
        if (i > i2) {
            Objects.toString(d);
            aju.d("minOffset should be less than or equal to maxOffset: ".concat(d.toString()));
        }
        ufVar.g(bcxVar.a, d);
    }

    private final int p(long j) {
        try {
            return this.a.a(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(a.ck(j, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int q(int i, boolean z) {
        bcn e = e();
        bcn bcnVar = bcn.a;
        int ordinal = e.ordinal();
        int i2 = z;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new armm();
                }
                i2 = 1;
            }
            return (i - (i2 ^ 1)) / 2;
        }
        if (z != 0) {
            i2 = 0;
            return (i - (i2 ^ 1)) / 2;
        }
        i2 = 1;
        return (i - (i2 ^ 1)) / 2;
    }

    @Override // defpackage.bdq
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bdq
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.bdq
    public final int c() {
        return this.c;
    }

    @Override // defpackage.bdq
    public final uf d(bcy bcyVar) {
        bcy.a aVar;
        bcy.a aVar2;
        bcy.a aVar3 = bcyVar.a;
        long j = aVar3.c;
        bcy.a aVar4 = bcyVar.b;
        if (j == aVar4.c) {
            if (!bcyVar.c ? aVar3.b > aVar4.b : aVar3.b < aVar4.b) {
                Objects.toString(bcyVar);
                aju.d("unexpectedly miss-crossed selection: ".concat(bcyVar.toString()));
            }
            return ug.b(bcyVar.a.c, bcyVar);
        }
        uf ufVar = new uf((byte[]) null);
        if (bcyVar.c) {
            aVar = bcyVar.b;
        } else {
            aVar = bcyVar.a;
        }
        o(ufVar, bcyVar, h(), aVar.b, h().a());
        l(new AnonymousClass1(ufVar, bcyVar));
        if (bcyVar.c) {
            aVar2 = bcyVar.a;
        } else {
            aVar2 = bcyVar.b;
        }
        o(ufVar, bcyVar, i(), 0, aVar2.b);
        return ufVar;
    }

    @Override // defpackage.bdq
    public final bcn e() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return bcn.b;
        }
        if (i > i2) {
            return bcn.a;
        }
        return ((bcx) this.b.get(i / 2)).b();
    }

    @Override // defpackage.bdq
    public final bcx f() {
        if (this.e) {
            return j();
        }
        return g();
    }

    @Override // defpackage.bdq
    public final bcx g() {
        return (bcx) this.b.get(q(this.d, false));
    }

    @Override // defpackage.bdq
    public final bcx h() {
        if (e() == bcn.a) {
            return g();
        }
        return j();
    }

    public final bcx i() {
        if (e() == bcn.a) {
            return j();
        }
        return g();
    }

    @Override // defpackage.bdq
    public final bcx j() {
        return (bcx) this.b.get(q(this.c, true));
    }

    @Override // defpackage.bdq
    public final bcy k() {
        return this.f;
    }

    @Override // defpackage.bdq
    public final void l(arqr arqrVar) {
        int p = p(h().a);
        int p2 = p(i().a);
        int i = p + 1;
        if (i < p2) {
            while (i < p2) {
                arqrVar.a(this.b.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.bdq
    public final boolean m() {
        return this.e;
    }

    @Override // defpackage.bdq
    public final boolean n(bdq bdqVar) {
        if (this.f != null && bdqVar != null && (bdqVar instanceof bcs) && this.e == bdqVar.m() && this.c == bdqVar.c() && this.d == bdqVar.a()) {
            bcs bcsVar = (bcs) bdqVar;
            if (b() == bcsVar.b()) {
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    if (((bcx) this.b.get(i)).f((bcx) bcsVar.b.get(i))) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((this.c + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(e());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            bcx bcxVar = (bcx) list.get(i);
            if (!z) {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(bcxVar);
            sb2.append(sb3.toString());
            z = false;
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
