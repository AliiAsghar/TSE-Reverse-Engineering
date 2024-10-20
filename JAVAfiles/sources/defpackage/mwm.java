package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwm implements mwj {
    private final int a;

    public mwm(int i) {
        this.a = i;
    }

    @Override // defpackage.mwj
    public final mwh a(String str) {
        int i;
        int i2;
        aiut.b();
        if (str != null && str.length() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (str != null) {
            i2 = str.length();
        } else {
            str = null;
            i2 = 0;
        }
        int i3 = this.a;
        if (str == null) {
            str = "";
        }
        byte[] bytes = str.getBytes(arul.a);
        bytes.getClass();
        mwg mwgVar = new mwg();
        mwgVar.d(i);
        mwgVar.c(i2);
        mwgVar.b(i3 - bytes.length);
        mwgVar.f(1);
        mwgVar.e(false);
        return mwgVar.a();
    }
}
