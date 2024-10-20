package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkq extends ezg {
    private final ewl j;
    private final euf k;
    private fkp l;
    private long m;

    public fkq() {
        super(6);
        this.j = new ewl(1);
        this.k = new euf();
    }

    private final void W() {
        fkp fkpVar = this.l;
        if (fkpVar != null) {
            fkpVar.b();
        }
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final String R() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.fbd
    public final void S(long j, long j2) {
        float[] fArr;
        while (!K() && this.m < 100000 + j) {
            this.j.eO();
            if (P(Q(), this.j, 0) == -4) {
                ewl ewlVar = this.j;
                if (!ewlVar.eR()) {
                    long j3 = ewlVar.f;
                    this.m = j3;
                    long j4 = this.f;
                    if (this.l != null && j3 >= j4) {
                        ewlVar.i();
                        ByteBuffer byteBuffer = this.j.d;
                        int i = eul.a;
                        if (byteBuffer.remaining() != 16) {
                            fArr = null;
                        } else {
                            this.k.H(byteBuffer.array(), byteBuffer.limit());
                            this.k.J(byteBuffer.arrayOffset() + 4);
                            float[] fArr2 = new float[3];
                            for (int i2 = 0; i2 < 3; i2++) {
                                fArr2[i2] = Float.intBitsToFloat(this.k.f());
                            }
                            fArr = fArr2;
                        }
                        if (fArr != null) {
                            this.l.a(this.m - this.e, fArr);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.fbd
    public final boolean T() {
        return K();
    }

    @Override // defpackage.fbd
    public final boolean U() {
        return true;
    }

    @Override // defpackage.fbf
    public final int V(eqn eqnVar) {
        int i;
        if (true != "application/x-camera-motion".equals(eqnVar.o)) {
            i = 0;
        } else {
            i = 4;
        }
        return dzn.d(i);
    }

    @Override // defpackage.ezg, defpackage.fba
    public final void p(int i, Object obj) {
        if (i == 8) {
            this.l = (fkp) obj;
        }
    }

    @Override // defpackage.ezg
    protected final void s() {
        W();
    }

    @Override // defpackage.ezg
    protected final void u(long j, boolean z) {
        this.m = Long.MIN_VALUE;
        W();
    }
}
