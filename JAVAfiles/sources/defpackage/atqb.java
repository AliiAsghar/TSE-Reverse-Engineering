package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqb extends atqh {
    private final String a;
    private final boolean b;

    public atqb(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.atqh
    public final void a(atql atqlVar, Object obj) {
        String obj2;
        if (obj != null && (obj2 = obj.toString()) != null) {
            atqlVar.d(this.a, obj2, this.b);
        }
    }
}
