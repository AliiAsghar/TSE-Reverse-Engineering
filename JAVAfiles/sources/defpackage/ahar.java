package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahar extends ahat {
    private ahar(algw algwVar, ahau ahauVar) {
        super(algwVar, ahauVar);
    }

    public static ahar b() {
        ahar aharVar = new ahar(alfd.a, ahau.a);
        super.c("");
        return aharVar;
    }

    @Override // defpackage.ahat
    public final /* bridge */ /* synthetic */ Object a(String str) {
        if (!str.isEmpty()) {
            if (str.charAt(str.length() - 1) == '*') {
                return new fwc(str.substring(0, str.length() - 1), 2);
            }
            return new fwc(str, 3);
        }
        throw new IllegalArgumentException("Item is empty");
    }
}
