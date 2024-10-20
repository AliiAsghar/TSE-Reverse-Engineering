package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpv extends atqh {
    private final String a;

    public atpv(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.atqh
    public final void a(atql atqlVar, Object obj) {
        String obj2;
        if (obj != null && (obj2 = obj.toString()) != null) {
            atqlVar.b(this.a, obj2);
        }
    }
}
