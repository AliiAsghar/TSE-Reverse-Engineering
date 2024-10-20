package defpackage;

import android.content.Context;
import android.os.Process;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmt {
    public static final Duration a = Duration.ofDays(6);
    public static final advp b = new advp("SystemBindingMonitor");
    public final Context c;
    public final aneo d;
    public final aegu e;
    public final alhp f;
    public final long g;
    public final acnz j;
    public boolean h = false;
    public acms i = null;
    private int n = 1;
    private Duration k = Duration.ZERO;
    private Duration l = Duration.ZERO;
    private Duration m = Duration.ZERO;

    public acmt(Context context, aneo aneoVar, aegu aeguVar, acnz acnzVar) {
        long startElapsedRealtime;
        this.c = context;
        this.d = aneoVar;
        this.e = aeguVar;
        this.j = acnzVar;
        startElapsedRealtime = Process.getStartElapsedRealtime();
        this.g = startElapsedRealtime;
        this.f = new alhp(alfb.a);
    }

    public final synchronized Duration a() {
        d(this.n);
        return this.k;
    }

    public final synchronized Duration b() {
        d(this.n);
        return this.l;
    }

    public final synchronized Duration c() {
        d(this.n);
        return this.m;
    }

    public final synchronized void d(int i) {
        int i2 = this.n;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        this.m = this.m.plus(this.f.c());
                    }
                } else {
                    this.l = this.l.plus(this.f.c());
                }
            } else {
                this.k = this.k.plus(this.f.c());
            }
            if (a.compareTo(this.k.plus(this.l).plus(this.m)) <= 0) {
                this.k = Duration.ZERO;
                this.l = Duration.ZERO;
                this.m = Duration.ZERO;
                acnz acnzVar = this.j;
                acnzVar.a(new aakf(acnzVar, this.c, 8), new acnk(7));
            }
            this.n = i;
            alhp alhpVar = this.f;
            alhpVar.d();
            alhpVar.e();
        } else {
            throw null;
        }
    }
}
