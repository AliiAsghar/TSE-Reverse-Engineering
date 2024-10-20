package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimw extends aimm {
    public int a;

    public aimw() {
        super("Session-Expires");
    }

    @Override // defpackage.aimh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        if (!this.e.h()) {
            stringBuffer.append(";".concat(this.e.c()));
        }
        return stringBuffer.toString();
    }

    public final String b() {
        return this.e.d("refresher");
    }

    public final void e(int i) {
        this.d = String.valueOf(i);
        this.a = i;
    }

    public final void f(String str) {
        this.e.g(new aikz("refresher", str));
    }
}
