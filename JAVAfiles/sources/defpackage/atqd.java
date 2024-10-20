package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqd extends atqh {
    private final boolean a;

    public atqd(boolean z) {
        this.a = z;
    }

    @Override // defpackage.atqh
    public final void a(atql atqlVar, Object obj) {
        if (obj == null) {
            return;
        }
        atqlVar.d(obj.toString(), null, this.a);
    }
}
