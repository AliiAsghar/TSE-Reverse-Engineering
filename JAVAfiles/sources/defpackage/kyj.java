package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyj extends nq {
    private static final xze a = xze.g("Bugle", "ConversationListAdapter");

    @Override // defpackage.nq
    public final void dA(int i, int i2) {
        xyo d = a.d();
        d.H("onItemRangeChanged");
        d.x("positionStart", i);
        d.x("itemCount", i2);
        d.q();
    }

    @Override // defpackage.nq
    public final void dB(int i, int i2, Object obj) {
        xyo d = a.d();
        d.H("onItemRangeChanged");
        d.x("positionStart", i);
        d.x("itemCount", i2);
        d.z("payload", obj);
        d.q();
    }

    @Override // defpackage.nq
    public final void dC(int i, int i2) {
        xyo d = a.d();
        d.H("onItemRangeInserted");
        d.x("positionStart", i);
        d.x("itemCount", i2);
        d.q();
    }

    @Override // defpackage.nq
    public final void dD(int i, int i2) {
        xyo d = a.d();
        d.H("onItemRangeRemoved");
        d.x("positionStart", i);
        d.x("itemCount", i2);
        d.q();
    }

    @Override // defpackage.nq
    public final void dF(int i, int i2) {
        xyo d = a.d();
        d.H("onItemRangeMoved");
        d.x("fromPosition", i);
        d.x("toPosition", i2);
        d.x("itemCount", 1);
        d.q();
    }

    @Override // defpackage.nq
    public final void dz() {
        a.p("onChanged");
    }
}
