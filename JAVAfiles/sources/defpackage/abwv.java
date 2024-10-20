package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwv {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public abwv(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (this.a) {
            if (this.c) {
                return 4;
            }
            if (this.b) {
                return 3;
            }
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        if (!c() && a() != 3) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (a() == 4) {
            return true;
        }
        return false;
    }

    public abwv(boolean z, boolean z2, boolean z3, byte[] bArr) {
        this.b = z;
        this.c = z2;
        this.a = z3;
    }
}
