package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmc extends asmk {
    public static final aslz a;
    public static final aslz b;
    private static final byte[] c;
    private static final byte[] d;
    private static final byte[] e;
    private final asqx f;
    private final aslz g;
    private final List h;
    private final aslz i;
    private long j;

    static {
        Pattern pattern = aslz.a;
        a = aotl.an("multipart/mixed");
        aotl.an("multipart/alternative");
        aotl.an("multipart/digest");
        aotl.an("multipart/parallel");
        b = aotl.an("multipart/form-data");
        c = new byte[]{58, 32};
        d = new byte[]{13, 10};
        e = new byte[]{45, 45};
    }

    public asmc(asqx asqxVar, aslz aslzVar, List list) {
        aslzVar.getClass();
        this.f = asqxVar;
        this.g = aslzVar;
        this.h = list;
        this.i = aotl.an(aslzVar + "; boundary=" + asqxVar.e());
        this.j = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long d(asqv asqvVar, boolean z) {
        asqu asquVar;
        if (z) {
            asqvVar = new asqu();
            asquVar = asqvVar;
        } else {
            asquVar = 0;
        }
        int size = this.h.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            asmb asmbVar = (asmb) this.h.get(i);
            Object obj = asmbVar.a;
            Object obj2 = asmbVar.b;
            asqvVar.getClass();
            asqvVar.X(e);
            asqvVar.J(this.f);
            asqvVar.X(d);
            aslv aslvVar = (aslv) obj;
            int a2 = aslvVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                asqvVar.Z(aslvVar.c(i2));
                asqvVar.X(c);
                asqvVar.Z(aslvVar.d(i2));
                asqvVar.X(d);
            }
            asmk asmkVar = (asmk) obj2;
            aslz b2 = asmkVar.b();
            if (b2 != null) {
                asqvVar.Z("Content-Type: ");
                asqvVar.Z(b2.c);
                asqvVar.X(d);
            }
            long a3 = asmkVar.a();
            if (a3 != -1) {
                asqvVar.Z("Content-Length: ");
                asqvVar.r(a3).X(d);
            } else if (z) {
                asquVar.getClass();
                asquVar.z();
                return -1L;
            }
            byte[] bArr = d;
            asqvVar.X(bArr);
            if (z) {
                j += a3;
            } else {
                asmkVar.c(asqvVar);
            }
            asqvVar.X(bArr);
        }
        asqvVar.getClass();
        byte[] bArr2 = e;
        asqvVar.X(bArr2);
        asqvVar.J(this.f);
        asqvVar.X(bArr2);
        asqvVar.X(d);
        if (z) {
            asquVar.getClass();
            long j2 = j + asquVar.b;
            asquVar.z();
            return j2;
        }
        return j;
    }

    @Override // defpackage.asmk
    public final long a() {
        long j = this.j;
        if (j == -1) {
            long d2 = d(null, true);
            this.j = d2;
            return d2;
        }
        return j;
    }

    @Override // defpackage.asmk
    public final aslz b() {
        return this.i;
    }

    @Override // defpackage.asmk
    public final void c(asqv asqvVar) {
        d(asqvVar, false);
    }
}
