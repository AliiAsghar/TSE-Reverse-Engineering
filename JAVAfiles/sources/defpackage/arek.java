package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arek extends OutputStream {
    public final List a = new ArrayList();
    final /* synthetic */ aren b;
    private arhv c;

    public arek(aren arenVar) {
        this.b = arenVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        arhv arhvVar = this.c;
        if (arhvVar != null && arhvVar.b() > 0) {
            this.c.c(b);
        } else {
            write(new byte[]{b}, 0, 1);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            arhv a = this.b.f.a(i2);
            this.c = a;
            this.a.add(a);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.c.b());
            if (min == 0) {
                int a2 = this.c.a();
                arhv a3 = this.b.f.a(Math.max(i2, a2 + a2));
                this.c = a3;
                this.a.add(a3);
            } else {
                this.c.d(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
