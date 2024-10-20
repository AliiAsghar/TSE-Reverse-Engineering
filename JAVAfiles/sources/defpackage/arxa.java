package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arxa implements Runnable, Comparable, arwu, asfs {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public arxa(long j) {
        this.b = j;
    }

    @Override // defpackage.asfs
    public final int b() {
        return this.a;
    }

    @Override // defpackage.asfs
    public final asfr c() {
        Object obj = this._heap;
        if (obj instanceof asfr) {
            return (asfr) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((arxa) obj).b;
        if (j > 0) {
            return 1;
        }
        if (j >= 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.asfs
    public final void d(asfr asfrVar) {
        if (this._heap != arxd.a) {
            this._heap = asfrVar;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.asfs
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.arwu
    public final void hd() {
        arxb arxbVar;
        synchronized (this) {
            Object obj = this._heap;
            if (obj == arxd.a) {
                return;
            }
            if (obj instanceof arxb) {
                arxbVar = (arxb) obj;
            } else {
                arxbVar = null;
            }
            if (arxbVar != null) {
                synchronized (arxbVar) {
                    if (c() != null) {
                        int b = b();
                        boolean z = arwh.a;
                        arxbVar.d(b);
                    }
                }
            }
            this._heap = arxd.a;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
