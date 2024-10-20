package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqxt implements arhp {
    private InputStream a;
    protected final aqxh b;
    protected final aqrm c;
    final int d;
    protected aqyf e;
    protected arhn f;
    protected arhq g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private aqxr n = aqxr.UNINITIALIZED;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public aqxt(aqxh aqxhVar, aqrm aqrmVar, int i) {
        this.b = aqxhVar;
        this.c = aqrmVar;
        this.d = i;
    }

    private final void f(Status status, Status status2, boolean z) {
        boolean z2;
        if (!p()) {
            if (this.n != aqxr.UNINITIALIZED) {
                z2 = true;
            } else {
                z2 = false;
            }
            m(aqxr.CLOSED);
            if (z2) {
                this.f.h();
            }
            if (!z) {
                aqxh aqxhVar = this.b;
                int i = this.d;
                try {
                    aqyg c = aqyg.c();
                    try {
                        c.a().writeInt(0);
                        aqas.k(c.a(), aqas.i(c.a(), status) | 8);
                        aqxhVar.t(i, c);
                        c.close();
                    } finally {
                    }
                } catch (StatusException e) {
                    aqxh.e.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
                }
            }
            if (z2) {
                a(status2);
            }
            o();
        }
    }

    private final void q() {
        aqxs aqxsVar;
        if (this.i == 0) {
            int i = 0;
            while (i < this.j.size() && (aqxsVar = (aqxs) this.j.get(i)) != null) {
                i++;
                if (aqxsVar.d) {
                    this.i = i;
                    t();
                    return;
                }
            }
        }
    }

    private final boolean r() {
        if (this.a == null && this.i <= 0) {
            return false;
        }
        return true;
    }

    private final boolean s() {
        if (this.k && this.h >= this.l) {
            return true;
        }
        return false;
    }

    private final void t() {
        arhn arhnVar = this.f;
        arhnVar.getClass();
        arhn.f(arhnVar);
        arhn.f(this.f);
        this.o++;
    }

    protected abstract void a(Status status);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel);

    public abstract void d(int i, Parcel parcel);

    public boolean e() {
        return false;
    }

    @Override // defpackage.arhp
    public final synchronized InputStream g() {
        aqxl aqxlVar;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (this.p > 0 && r()) {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                aqxs aqxsVar = (aqxs) this.j.remove(0);
                int i2 = aqxsVar.c;
                InputStream inputStream2 = aqxsVar.a;
                aqxlVar = new aqxl(aqxsVar.b);
            } else {
                byte[][] bArr = new byte[i];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte[] bArr2 = ((aqxs) this.j.remove(0)).b;
                    bArr[i4] = bArr2;
                    i3 += bArr2.length;
                }
                aqxlVar = new aqxl(bArr, i3);
            }
            this.h += i;
            q();
            inputStream = aqxlVar;
        } else {
            inputStream = null;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (s() && !p()) {
                m(aqxr.ALL_MESSAGES_DELIVERED);
                j();
                return null;
            }
        }
        return inputStream;
    }

    public final void h(Status status) {
        f(status, status, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Status status) {
        f(Status.c, status, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r4.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void j() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            aqxr r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L15
            goto L70
        L15:
            arhq r1 = r4.g
            if (r1 == 0) goto L70
            boolean r1 = r4.k
            if (r1 == 0) goto L70
            goto L37
        L1e:
            arhq r1 = r4.g
            if (r1 == 0) goto L70
            boolean r1 = r4.r
            if (r1 != 0) goto L70
            boolean r1 = r4.r()
            if (r1 == 0) goto L31
            int r1 = r4.p
            if (r1 == 0) goto L70
            goto L37
        L31:
            boolean r1 = r4.s()
            if (r1 == 0) goto L70
        L37:
            aqxr r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            goto L63
        L42:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L48:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.r()
            if (r1 == 0) goto L5a
            r4.r = r0
            arhq r1 = r4.g
            r1.d(r4)
            goto L8
        L5a:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            aqxr r1 = defpackage.aqxr.ALL_MESSAGES_DELIVERED
            r4.m(r1)
        L63:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            aqxr r1 = defpackage.aqxr.SUFFIX_DELIVERED
            r4.m(r1)
            r4.b()
            goto L8
        L70:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqxt.j():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void k(Parcel parcel) {
        boolean z;
        boolean z2;
        if (p()) {
            return;
        }
        try {
            int readInt = parcel.readInt();
            if (aqas.l(readInt, 8)) {
                Status j = aqas.j(readInt, parcel);
                f(j, j, true);
                return;
            }
            int readInt2 = parcel.readInt();
            boolean l = aqas.l(readInt, 1);
            boolean l2 = aqas.l(readInt, 2);
            boolean l3 = aqas.l(readInt, 4);
            if (l) {
                c(readInt, parcel);
                m(aqxr.PREFIX_DELIVERED);
            }
            if (l2) {
                if ((readInt & 64) == 0) {
                    int readInt3 = parcel.readInt();
                    byte[] c = aqxm.c(readInt3);
                    if (readInt3 > 0) {
                        parcel.readByteArray(c);
                    }
                    int i = readInt & 128;
                    if (i != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (this.j == null) {
                        if (this.o == 0 && i == 0 && readInt2 == this.h) {
                            if (this.a == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            albo.T(z2);
                            this.a = new aqxl(c);
                            t();
                        } else {
                            this.j = new ArrayList(16);
                        }
                    }
                    aqxs aqxsVar = new aqxs(c, readInt3, z);
                    int i2 = readInt2 - this.h;
                    if (i2 < this.j.size()) {
                        this.j.set(i2, aqxsVar);
                        q();
                    } else {
                        if (i2 <= this.j.size()) {
                            this.j.add(aqxsVar);
                            q();
                        }
                        do {
                            this.j.add(null);
                        } while (i2 > this.j.size());
                        this.j.add(aqxsVar);
                    }
                } else {
                    throw Status.h.withDescription("Parcelable messages not allowed").asException();
                }
            }
            if (l3) {
                d(readInt, parcel);
                this.l = readInt2;
                this.k = true;
            }
            int i3 = this.h;
            if (readInt2 == i3) {
                ArrayList arrayList = this.j;
                if (arrayList == null) {
                    this.h = i3 + 1;
                } else if (!l2 && !l3) {
                    arrayList.remove(0);
                    this.h++;
                }
            }
            int dataSize = this.m + parcel.dataSize();
            this.m = dataSize;
            arhn arhnVar = this.f;
            if (arhnVar != null && dataSize != 0) {
                arhnVar.b(dataSize);
                arhn.f(this.f);
                this.m = 0;
            }
            j();
        } catch (StatusException e) {
            h(e.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(aqyf aqyfVar, arhq arhqVar) {
        this.e = aqyfVar;
        this.f = aqyfVar.f;
        this.g = arhqVar;
        if (!p()) {
            m(aqxr.INITIALIZED);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(aqxr aqxrVar) {
        aqxr aqxrVar2 = this.n;
        int ordinal = aqxrVar.ordinal();
        boolean z = false;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            throw new AssertionError();
                        }
                    } else {
                        if (aqxrVar2 == aqxr.ALL_MESSAGES_DELIVERED) {
                            z = true;
                        }
                        albo.Z(z, "%s -> %s", aqxrVar2, aqxrVar);
                    }
                } else {
                    if (aqxrVar2 == aqxr.PREFIX_DELIVERED) {
                        z = true;
                    }
                    albo.Z(z, "%s -> %s", aqxrVar2, aqxrVar);
                }
            } else {
                if (aqxrVar2 == aqxr.INITIALIZED || aqxrVar2 == aqxr.UNINITIALIZED) {
                    z = true;
                }
                albo.Z(z, "%s -> %s", aqxrVar2, aqxrVar);
            }
        } else {
            if (aqxrVar2 == aqxr.UNINITIALIZED) {
                z = true;
            }
            albo.Z(z, "%s -> %s", aqxrVar2, aqxrVar);
        }
        this.n = aqxrVar;
    }

    public final void n(int i) {
        this.p += i;
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.b.q(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p() {
        if (this.n == aqxr.CLOSED) {
            return true;
        }
        return false;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        boolean z;
        String simpleName = getClass().getSimpleName();
        boolean z2 = this.k;
        String valueOf = String.valueOf(this.n);
        boolean r = r();
        arhq arhqVar = this.g;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z2);
        sb.append("/De=");
        sb.append(valueOf);
        sb.append("/Msg=");
        sb.append(r);
        sb.append("/Lis=");
        if (arhqVar != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }
}
