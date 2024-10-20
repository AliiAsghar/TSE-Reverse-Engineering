package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aor {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aor$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((Number) obj).intValue();
            return null;
        }
    }

    public static /* synthetic */ void a(aos aosVar, Object obj, arqw arqwVar, int i) {
        if (1 == (i & 1)) {
            obj = null;
        }
        aosVar.c(obj, arqwVar);
    }

    public static /* synthetic */ void b(aos aosVar, int i, arqr arqrVar, arqx arqxVar, int i2) {
        if ((i2 & 2) != 0) {
            arqrVar = null;
        }
        aosVar.b(i, arqrVar, AnonymousClass1.a, arqxVar);
    }
}
