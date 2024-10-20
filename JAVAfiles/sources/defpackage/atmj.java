package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmj extends atmx {
    private static final long serialVersionUID = -8851454400765507520L;
    private atmk a;
    private BitSet b;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        int length = this.b.length();
        for (short s = 0; s < length; s = (short) (s + 1)) {
            if (this.b.get(s)) {
                stringBuffer.append(" ");
                stringBuffer.append(atnu.a(s));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmj();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = new atmk(atktVar);
        this.b = new BitSet();
        int d = atktVar.d();
        for (int i = 0; i < d; i++) {
            int c = atktVar.c();
            for (int i2 = 0; i2 < 8; i2++) {
                if (((1 << (7 - i2)) & c) != 0) {
                    this.b.set((i * 8) + i2);
                }
            }
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        int i;
        this.a.h(atkvVar, null, z);
        int length = this.b.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.b.get(i3)) {
                i = 1 << (7 - (i3 % 8));
            } else {
                i = 0;
            }
            i2 |= i;
            if (i3 % 8 == 7 || i3 == length - 1) {
                atkvVar.g(i2);
                i2 = 0;
            }
        }
    }
}
