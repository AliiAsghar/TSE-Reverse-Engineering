package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahml extends ahmj {
    public static final ahml a = new ahml();

    private ahml() {
    }

    @Override // defpackage.ahmj
    public final /* synthetic */ apbt a(String str, Object obj) {
        return ahmc.q(str, d$$ExternalSyntheticApiModelOutline0.m320m(obj));
    }

    @Override // defpackage.ahmj
    public final /* synthetic */ apbt b(apbt apbtVar, apbt apbtVar2) {
        return ahmc.p((ashm) apbtVar, (ashm) apbtVar2);
    }

    @Override // defpackage.ahmj
    public final /* bridge */ /* synthetic */ String c(apbt apbtVar) {
        ashm ashmVar = (ashm) apbtVar;
        ashh ashhVar = ashmVar.e;
        if (ashhVar == null) {
            ashhVar = ashh.a;
        }
        int i = ashhVar.b & 2;
        ashh ashhVar2 = ashmVar.e;
        if (i != 0) {
            if (ashhVar2 == null) {
                ashhVar2 = ashh.a;
            }
            return ashhVar2.d;
        }
        if (ashhVar2 == null) {
            ashhVar2 = ashh.a;
        }
        return Long.toHexString(ashhVar2.c);
    }
}
