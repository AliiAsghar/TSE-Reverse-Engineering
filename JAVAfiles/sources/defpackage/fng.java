package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fng extends fnk {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    public fng(fmq fmqVar) {
        super(fmqVar);
    }

    @Override // defpackage.fnk
    protected final boolean a(euf eufVar) {
        String str;
        if (!this.b) {
            int j = eufVar.j();
            int i = j >> 4;
            this.e = i;
            if (i == 2) {
                int i2 = a[(j >> 2) & 3];
                eqm eqmVar = new eqm();
                eqmVar.b("audio/mpeg");
                eqmVar.B = 1;
                eqmVar.C = i2;
                this.d.h(new eqn(eqmVar));
                this.c = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new fnj(a.bV(i, "Audio format not supported: "));
                }
            } else {
                eqm eqmVar2 = new eqm();
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                eqmVar2.b(str);
                eqmVar2.B = 1;
                eqmVar2.C = 8000;
                this.d.h(new eqn(eqmVar2));
                this.c = true;
            }
            this.b = true;
        } else {
            eufVar.K(1);
        }
        return true;
    }

    @Override // defpackage.fnk
    protected final boolean b(euf eufVar, long j) {
        if (this.e == 2) {
            int b = eufVar.b();
            this.d.l(eufVar, b);
            this.d.n(j, 1, b, 0, null);
            return true;
        }
        int j2 = eufVar.j();
        if (j2 == 0 && !this.c) {
            int b2 = eufVar.b();
            byte[] bArr = new byte[b2];
            eufVar.E(bArr, 0, b2);
            hyh a2 = fla.a(bArr);
            eqm eqmVar = new eqm();
            eqmVar.b("audio/mp4a-latm");
            eqmVar.j = (String) a2.c;
            eqmVar.B = a2.b;
            eqmVar.C = a2.a;
            eqmVar.p = Collections.singletonList(bArr);
            this.d.h(new eqn(eqmVar));
            this.c = true;
            return false;
        }
        if (this.e == 10 && j2 != 1) {
            return false;
        }
        int b3 = eufVar.b();
        this.d.l(eufVar, b3);
        this.d.n(j, 1, b3, 0, null);
        return true;
    }
}
