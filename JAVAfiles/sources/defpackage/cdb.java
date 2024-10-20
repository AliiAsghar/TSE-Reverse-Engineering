package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdb {
    public final Object a;
    public final Object b;

    public cdb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final cdb a(Object obj) {
        return new cdb(this.a, obj);
    }

    public final boolean b() {
        if (this.b != cdf.a) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.a != cdf.a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cdb() {
        /*
            r1 = this;
            cdf r0 = defpackage.cdf.a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdb.<init>():void");
    }
}
