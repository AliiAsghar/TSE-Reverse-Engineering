package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekw implements ekv {
    public int a = -1;
    public int b = -1;
    private final int c;

    public ekw(int i) {
        this.c = i;
    }

    @Override // defpackage.ekv
    public final boolean b(CharSequence charSequence, int i, int i2, elg elgVar) {
        int i3 = this.c;
        if (i <= i3 && i3 < i2) {
            this.a = i;
            this.b = i2;
            return false;
        }
        if (i2 > i3) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ekv
    public final /* bridge */ /* synthetic */ Object a() {
        return this;
    }
}
