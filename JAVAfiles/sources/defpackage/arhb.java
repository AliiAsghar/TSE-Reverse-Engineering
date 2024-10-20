package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arhb extends apzj {
    public static final Logger d = Logger.getLogger(arhb.class.getName());
    public static final arep e = new arhm(arcb.n, 0);
    public static final aqsx f = new arha();
    private static final aqsp w = aqsp.b;
    private static final aqsb x = aqsb.a;
    private static final long y = TimeUnit.SECONDS.toMillis(120);
    final List g;
    public final List h;
    public final List i;
    public aqsx j;
    public arep k;
    public aqsp l;
    public aqsb m;
    long n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    aqtc s;
    public final atpk t;
    public final atoi u;
    arrj v;

    public arhb(atpk atpkVar) {
        super(null);
        this.u = new atoi(null, null, null);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = f;
        this.k = e;
        this.l = w;
        this.m = x;
        this.n = y;
        this.v = aqsn.c;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = aqtc.b;
        this.t = atpkVar;
        Iterator it = atoi.f().d().iterator();
        while (it.hasNext()) {
            ((aqsc) it.next()).b();
        }
    }
}
