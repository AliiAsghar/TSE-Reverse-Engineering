package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sa extends rw {
    final /* synthetic */ sb a;
    final /* synthetic */ String b;
    final /* synthetic */ se c;

    public sa(sb sbVar, String str, se seVar) {
        this.a = sbVar;
        this.b = str;
        this.c = seVar;
    }

    @Override // defpackage.rw
    public final void a() {
        this.a.d(this.b);
    }

    @Override // defpackage.rw
    public final void b(Object obj, efu efuVar) {
        Object obj2 = this.a.b.get(this.b);
        if (obj2 != null) {
            int intValue = ((Number) obj2).intValue();
            this.a.c.add(this.b);
            try {
                this.a.f(intValue, this.c, obj, efuVar);
                return;
            } catch (Exception e) {
                this.a.c.remove(this.b);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.c + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
