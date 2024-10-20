package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffu extends ezg implements Handler.Callback {
    private final fft j;
    private final Handler k;
    private final fnu l;
    private fnt m;
    private boolean n;
    private boolean o;
    private long p;
    private erk q;
    private long r;
    private final faa s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffu(faa faaVar, Looper looper) {
        super(5);
        Handler handler;
        fft fftVar = fft.a;
        dzg.g(faaVar);
        this.s = faaVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.k = handler;
        this.j = fftVar;
        this.l = new fnu();
        this.r = -9223372036854775807L;
    }

    private final long W(long j) {
        boolean z;
        boolean z2 = true;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        if (this.r == -9223372036854775807L) {
            z2 = false;
        }
        dzg.d(z2);
        return j - this.r;
    }

    private final void X(erk erkVar, List list) {
        for (int i = 0; i < erkVar.a(); i++) {
            eqn a = erkVar.b(i).a();
            if (a != null && this.j.b(a)) {
                fnt a2 = this.j.a(a);
                byte[] c = erkVar.b(i).c();
                dzg.g(c);
                this.l.eO();
                this.l.h(c.length);
                ByteBuffer byteBuffer = this.l.d;
                int i2 = eul.a;
                byteBuffer.put(c);
                this.l.i();
                erk a3 = a2.a(this.l);
                if (a3 != null) {
                    X(a3, list);
                }
            } else {
                list.add(erkVar.b(i));
            }
        }
    }

    private final void Y(erk erkVar) {
        faa faaVar = this.s;
        fad fadVar = faaVar.a;
        erg ergVar = new erg(fadVar.z);
        for (int i = 0; i < erkVar.a(); i++) {
            erkVar.b(i).b(ergVar);
        }
        fadVar.z = new erh(ergVar);
        fad fadVar2 = faaVar.a;
        erh T = fadVar2.T();
        if (!T.equals(fadVar2.r)) {
            fad fadVar3 = faaVar.a;
            fadVar3.r = T;
            fadVar3.f.d(14, new ezu(faaVar, 14));
        }
        fad fadVar4 = faaVar.a;
        fadVar4.f.d(28, new ezu(erkVar, 15));
        faaVar.a.f.c();
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final String R() {
        return "MetadataRenderer";
    }

    @Override // defpackage.fbd
    public final void S(long j, long j2) {
        boolean z;
        do {
            z = false;
            if (!this.n && this.q == null) {
                this.l.eO();
                fqu Q = Q();
                int P = P(Q, this.l, 0);
                if (P == -4) {
                    if (this.l.eR()) {
                        this.n = true;
                    } else {
                        fnu fnuVar = this.l;
                        if (fnuVar.f >= this.f) {
                            fnuVar.h = this.p;
                            fnuVar.i();
                            fnt fntVar = this.m;
                            int i = eul.a;
                            erk a = fntVar.a(this.l);
                            if (a != null) {
                                ArrayList arrayList = new ArrayList(a.a());
                                X(a, arrayList);
                                if (!arrayList.isEmpty()) {
                                    this.q = new erk(W(this.l.f), (erj[]) arrayList.toArray(new erj[0]));
                                }
                            }
                        }
                    }
                } else if (P == -5) {
                    eqn eqnVar = Q.a;
                    dzg.g(eqnVar);
                    this.p = eqnVar.t;
                }
            }
            erk erkVar = this.q;
            if (erkVar != null) {
                if (erkVar.b <= W(j)) {
                    erk erkVar2 = this.q;
                    Handler handler = this.k;
                    if (handler != null) {
                        handler.obtainMessage(1, erkVar2).sendToTarget();
                    } else {
                        Y(erkVar2);
                    }
                    this.q = null;
                    z = true;
                }
            }
            if (this.n && this.q == null) {
                this.o = true;
            }
        } while (z);
    }

    @Override // defpackage.fbd
    public final boolean T() {
        return this.o;
    }

    @Override // defpackage.fbd
    public final boolean U() {
        return true;
    }

    @Override // defpackage.fbf
    public final int V(eqn eqnVar) {
        int i;
        if (this.j.b(eqnVar)) {
            if (eqnVar.L == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return dzn.d(i);
        }
        return dzn.d(0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            Y((erk) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ezg
    protected final void s() {
        this.q = null;
        this.m = null;
        this.r = -9223372036854775807L;
    }

    @Override // defpackage.ezg
    protected final void u(long j, boolean z) {
        this.q = null;
        this.n = false;
        this.o = false;
    }

    @Override // defpackage.ezg
    protected final void z(eqn[] eqnVarArr, long j, long j2, fgv fgvVar) {
        this.m = this.j.a(eqnVarArr[0]);
        erk erkVar = this.q;
        if (erkVar != null) {
            long j3 = this.r;
            long j4 = erkVar.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                erkVar = new erk(j5, erkVar.a);
            }
            this.q = erkVar;
        }
        this.r = j2;
    }
}
