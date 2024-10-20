package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxu implements apxw {
    private apya a;

    public static void a(apxu apxuVar, apya apyaVar) {
        apyaVar.getClass();
        if (apxuVar.a == null) {
            apxuVar.a = apyaVar;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        apya apyaVar = this.a;
        if (apyaVar != null) {
            return apyaVar.b();
        }
        throw new IllegalStateException();
    }
}
