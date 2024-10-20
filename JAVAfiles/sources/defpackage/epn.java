package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epn extends eor {
    public static final eov a = new epm(0);
    public final vm b = new vm();
    public boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final epk a(int i) {
        return (epk) vn.a(this.b, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eor
    public final void gi() {
        int c = this.b.c();
        for (int i = 0; i < c; i++) {
            ((epk) this.b.e(i)).m();
        }
        vm vmVar = this.b;
        int i2 = vmVar.d;
        Object[] objArr = vmVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        vmVar.d = 0;
        vmVar.a = false;
    }
}
