package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aoo implements asg<aon> {
    private final asb a;
    public final anx l;
    public final long m;

    public aoo(long j, boolean z, anx anxVar, asb asbVar) {
        int i;
        this.l = anxVar;
        this.a = asbVar;
        if (z) {
            i = dqs.b(j);
        } else {
            i = Integer.MAX_VALUE;
        }
        this.m = dqt.l(i, z ? Integer.MAX_VALUE : dqs.a(j), 5);
    }

    public abstract aon a(int i, Object obj, Object obj2, List list, long j);

    public final aon b(int i, long j) {
        asb asbVar = this.a;
        anx anxVar = this.l;
        return a(i, anxVar.g(i), anxVar.f(i), asbVar.a(i, j), j);
    }

    public final arv c() {
        return this.l.c();
    }

    @Override // defpackage.asg
    public final /* synthetic */ asd d(int i, int i2, int i3, long j) {
        return b(i, j);
    }
}
