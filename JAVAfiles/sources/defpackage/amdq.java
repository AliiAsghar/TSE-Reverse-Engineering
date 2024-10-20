package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class amdq extends amdr {
    final int a = amdr.c(48);

    @Override // defpackage.amdr
    public final long a(int i) {
        amdr.e(i);
        if (i < this.a) {
            return 0L;
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amdq) || this.a != ((amdq) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
