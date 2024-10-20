package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aqg implements asg<aqf> {
    private final asb a;
    private final int b;
    public final apk f;

    public aqg(apk apkVar, asb asbVar, int i) {
        this.f = apkVar;
        this.a = asbVar;
        this.b = i;
    }

    public abstract aqf a(int i, Object obj, int i2, int i3, List list, long j, int i4, int i5);

    @Override // defpackage.asg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aqf d(int i, int i2, int i3, long j) {
        return c(i, j, i2, i3, this.b);
    }

    public final aqf c(int i, long j, int i2, int i3, int i4) {
        int c;
        apk apkVar = this.f;
        Object g = apkVar.g(i);
        apkVar.f(i);
        boolean j2 = dqs.j(j);
        List a = this.a.a(i, j);
        if (j2) {
            c = dqs.d(j);
        } else {
            if (!dqs.i(j)) {
                aju.c("does not have fixed height");
            }
            c = dqs.c(j);
        }
        return a(i, g, c, i4, a, j, i2, i3);
    }

    public final arv e() {
        return this.f.c();
    }
}
