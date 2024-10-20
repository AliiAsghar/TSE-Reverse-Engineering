package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsi implements hse {
    public static final hsi a = new hsi(2, null);
    private final /* synthetic */ int b;

    public hsi(int i) {
        this.b = i;
    }

    @Override // defpackage.hse
    public final boolean a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return true;
            }
            return obj.toString().startsWith("data:image");
        }
        return false;
    }

    @Override // defpackage.hse
    public final kkc b(Object obj, int i, int i2, hnj hnjVar) {
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 != 1) {
                return new kkc(new hyf(obj), new hsm(obj, 0));
            }
            return new kkc(new hyf(obj), new hrl(obj.toString()));
        }
        return null;
    }

    @Deprecated
    public hsi(int i, char[] cArr) {
        this.b = i;
    }
}
