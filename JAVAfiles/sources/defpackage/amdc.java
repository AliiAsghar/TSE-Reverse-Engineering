package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amdc {
    private static final algc a;
    private static final algc b;

    static {
        alga algaVar = new alga(new alfr('a', 'z'), new alfr('A', 'Z'));
        a = algaVar;
        alfr alfrVar = new alfr('0', '9');
        b = alfrVar;
        new alga(new alga(algaVar, alfrVar), new alfs('_'));
    }

    public static amdb a() {
        return new amcz("/".charAt(0));
    }
}
