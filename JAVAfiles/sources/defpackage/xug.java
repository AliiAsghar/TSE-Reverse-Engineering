package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xug extends no {
    public boolean c;
    public sar d;
    public saf e;
    private final ahmn f;

    public xug(ahmn ahmnVar) {
        this.f = ahmnVar;
        if (ody.a()) {
            this.e = null;
        } else {
            this.d = null;
        }
        this.c = false;
    }

    @Override // defpackage.no
    public final int b() {
        sar sarVar;
        saf safVar;
        aksa m = this.f.m("RecyclerViewCursorAdapter#getItemCount");
        try {
            int i = 0;
            if (ody.a()) {
                if (this.c && (safVar = this.e) != null && !safVar.isClosed()) {
                    i = this.e.getCount();
                }
            } else if (this.c && (sarVar = this.d) != null && !sarVar.isClosed()) {
                i = this.d.getCount();
            }
            m.close();
            return i;
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
