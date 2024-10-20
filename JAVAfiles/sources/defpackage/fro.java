package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fro implements fmq {
    public final fmq a;
    public eqn c;
    private final frj d;
    private frl h;
    private int e = 0;
    private int f = 0;
    private byte[] g = eul.f;
    public final euf b = new euf();

    public fro(fmq fmqVar, frj frjVar) {
        this.a = fmqVar;
        this.d = frjVar;
    }

    private final void a(int i) {
        byte[] bArr;
        int length = this.g.length;
        int i2 = this.f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.e;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr2 = this.g;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.e, bArr, 0, i3);
        this.e = 0;
        this.f = i3;
        this.g = bArr;
    }

    @Override // defpackage.fmq
    public final /* synthetic */ int d(eqe eqeVar, int i, boolean z) {
        return dxt.C(this, eqeVar, i, z);
    }

    @Override // defpackage.fmq
    public final void h(eqn eqnVar) {
        boolean z;
        frl frlVar;
        dzg.g(eqnVar.o);
        if (erl.b(eqnVar.o) == 3) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (!eqnVar.equals(this.c)) {
            this.c = eqnVar;
            if (this.d.c(eqnVar)) {
                frlVar = this.d.b(eqnVar);
            } else {
                frlVar = null;
            }
            this.h = frlVar;
        }
        if (this.h == null) {
            this.a.h(eqnVar);
            return;
        }
        fmq fmqVar = this.a;
        eqm eqmVar = new eqm(eqnVar);
        eqmVar.b("application/x-media3-cues");
        eqmVar.j = eqnVar.o;
        eqmVar.r = Long.MAX_VALUE;
        eqmVar.H = this.d.a(eqnVar);
        fmqVar.h(new eqn(eqmVar));
    }

    @Override // defpackage.fmq
    public final /* synthetic */ void l(euf eufVar, int i) {
        dxt.D(this, eufVar, i);
    }

    @Override // defpackage.fmq
    public final void m(euf eufVar, int i, int i2) {
        if (this.h == null) {
            this.a.m(eufVar, i, i2);
            return;
        }
        a(i);
        eufVar.E(this.g, this.f, i);
        this.f += i;
    }

    @Override // defpackage.fmq
    public final void n(final long j, final int i, int i2, int i3, fmp fmpVar) {
        boolean z;
        if (this.h == null) {
            this.a.n(j, i, i2, i3, fmpVar);
            return;
        }
        if (fmpVar == null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "DRM on subtitles is not supported");
        int i4 = (this.f - i3) - i2;
        this.h.b(this.g, i4, i2, frk.a, new etm() { // from class: frn
            /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.lang.Object] */
            @Override // defpackage.etm
            public final void a(Object obj) {
                long j2;
                boolean z2;
                fro froVar = fro.this;
                xab xabVar = (xab) obj;
                dzg.h(froVar.c);
                ?? r1 = xabVar.d;
                long j3 = xabVar.b;
                ezr ezrVar = new ezr(9);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(r1.size());
                Iterator it = r1.iterator();
                while (it.hasNext()) {
                    arrayList.add(ezrVar.apply(it.next()));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("c", arrayList);
                bundle.putLong("d", j3);
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                froVar.b.G(marshall);
                int length = marshall.length;
                froVar.a.l(froVar.b, length);
                long j4 = xabVar.c;
                long j5 = j;
                if (j4 == -9223372036854775807L) {
                    if (froVar.c.t == Long.MAX_VALUE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dzg.d(z2);
                } else {
                    long j6 = froVar.c.t;
                    if (j6 == Long.MAX_VALUE) {
                        j5 += j4;
                    } else {
                        j2 = j4 + j6;
                        froVar.a.n(j2, i, length, 0, null);
                    }
                }
                j2 = j5;
                froVar.a.n(j2, i, length, 0, null);
            }
        });
        int i5 = i4 + i2;
        this.e = i5;
        if (i5 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    @Override // defpackage.fmq
    public final int u(eqe eqeVar, int i, boolean z) {
        if (this.h == null) {
            return this.a.u(eqeVar, i, z);
        }
        a(i);
        int a = eqeVar.a(this.g, this.f, i);
        if (a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.f += a;
        return a;
    }
}
