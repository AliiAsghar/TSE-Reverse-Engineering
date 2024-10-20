package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asee extends ascj implements ascv {
    public asee(int i) {
        super(1, Integer.MAX_VALUE, 2);
        h(Integer.valueOf(i));
    }

    @Override // defpackage.ascv
    public final /* bridge */ /* synthetic */ Object c() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) i()).intValue());
        }
        return valueOf;
    }

    public final void p(int i) {
        synchronized (this) {
            h(Integer.valueOf(((Number) i()).intValue() + i));
        }
    }
}
