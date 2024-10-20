package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fme implements fmk {
    public final long a;
    public final atkv b;
    public final atkv c;

    public fme(long[] jArr, long[] jArr2, long j) {
        boolean z;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (length2 > 0 && jArr2[0] > 0) {
            int i = length2 + 1;
            atkv atkvVar = new atkv(i);
            this.b = atkvVar;
            atkv atkvVar2 = new atkv(i);
            this.c = atkvVar2;
            atkvVar.t(0L);
            atkvVar2.t(0L);
        } else {
            this.b = new atkv(length2);
            this.c = new atkv(length2);
        }
        this.b.u(jArr);
        this.c.u(jArr2);
        this.a = j;
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        atkv atkvVar = this.c;
        if (atkvVar.a == 0) {
            fml fmlVar = fml.a;
            return new fmi(fmlVar, fmlVar);
        }
        int i = eul.a;
        int i2 = atkvVar.a - 1;
        int i3 = 0;
        int i4 = 0;
        while (i4 <= i2) {
            int i5 = (i4 + i2) >>> 1;
            if (atkvVar.s(i5) < j) {
                i4 = i5 + 1;
            } else {
                i2 = i5 - 1;
            }
        }
        int i6 = i2 + 1;
        if (i6 < atkvVar.a && atkvVar.s(i6) == j) {
            i3 = i6;
        } else if (i2 != -1) {
            i3 = i2;
        }
        fml fmlVar2 = new fml(this.c.s(i3), this.b.s(i3));
        if (fmlVar2.b != j) {
            atkv atkvVar2 = this.c;
            if (i3 != atkvVar2.a - 1) {
                int i7 = i3 + 1;
                return new fmi(fmlVar2, new fml(atkvVar2.s(i7), this.b.s(i7)));
            }
        }
        return new fmi(fmlVar2, fmlVar2);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        if (this.c.a > 0) {
            return true;
        }
        return false;
    }
}
