package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghv {
    public final gid a;
    public final String[] b;
    public final giw c;
    public final Map d;
    public final ReentrantLock e;
    public final arqg f;
    public final arqg g;
    public ghs h;
    public ghw i;
    public final Object j;
    public final ico k;
    private final Map l;
    private final Map m;

    public ghv(gid gidVar, Map map, Map map2, String... strArr) {
        this.a = gidVar;
        this.l = map;
        this.m = map2;
        this.b = strArr;
        giw giwVar = new giw(gidVar, map, map2, strArr, new ghu(this, 0));
        this.c = giwVar;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new ry(6);
        this.g = new ry(5);
        this.k = new ico(gidVar);
        this.j = new Object();
        giwVar.b = new rd(this, 15);
    }

    public final Object a(arpe arpeVar) {
        Object e;
        if ((!this.a.p() || this.a.r()) && (e = this.c.e(arpeVar)) == arpl.a) {
            return e;
        }
        return arnb.a;
    }
}
