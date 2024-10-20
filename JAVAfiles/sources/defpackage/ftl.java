package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftl implements ftn {
    private final euf a;
    private final String c;
    private final int d;
    private String e;
    private fmq f;
    private int h;
    private int i;
    private long j;
    private eqn k;
    private int l;
    private int m;
    private int g = 0;
    private long p = -9223372036854775807L;
    private final AtomicInteger b = new AtomicInteger();
    private int n = -1;
    private int o = -1;

    public ftl(String str, int i, int i2) {
        this.a = new euf(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    private final void f(fls flsVar) {
        int i;
        eqm eqmVar;
        int i2 = flsVar.b;
        if (i2 != -2147483647 && (i = flsVar.c) != -1) {
            eqn eqnVar = this.k;
            if (eqnVar == null || i != eqnVar.D || i2 != eqnVar.E || !Objects.equals(flsVar.a, eqnVar.o)) {
                eqn eqnVar2 = this.k;
                if (eqnVar2 == null) {
                    eqmVar = new eqm();
                } else {
                    eqmVar = new eqm(eqnVar2);
                }
                eqmVar.a = this.e;
                eqmVar.b(flsVar.a);
                eqmVar.B = flsVar.c;
                eqmVar.C = flsVar.b;
                eqmVar.d = this.c;
                eqmVar.f = this.d;
                eqn eqnVar3 = new eqn(eqmVar);
                this.k = eqnVar3;
                this.f.h(eqnVar3);
            }
        }
    }

    private final boolean g(euf eufVar, byte[] bArr, int i) {
        int min = Math.min(eufVar.b(), i - this.h);
        eufVar.E(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x048a  */
    @Override // defpackage.ftn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.euf r28) {
        /*
            Method dump skipped, instructions count: 1361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.a(euf):void");
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.e = fuqVar.b();
        this.f = flwVar.p(fuqVar.a(), 1);
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        this.p = j;
    }

    @Override // defpackage.ftn
    public final void e() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
    }
}
