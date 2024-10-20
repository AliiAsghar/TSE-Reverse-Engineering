package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afec implements afdz {
    public static final afec a;
    public static final afec b;
    public static final afec c;
    public static final afec d;
    private static final /* synthetic */ afec[] f;
    public final alpt e;
    private final /* synthetic */ afeb g;

    static {
        alpt u = alpt.u(afdw.b, afdw.c, afdw.d, afdw.e, afdw.g);
        u.getClass();
        afec afecVar = new afec("AUDIO", 0, u);
        a = afecVar;
        alpt u2 = alpt.u(afdw.b, afdw.c, afdw.d, afdw.e, afdw.f);
        u2.getClass();
        afec afecVar2 = new afec("IMAGE", 1, u2);
        b = afecVar2;
        alpt v = alpt.v(afdw.b, afdw.c, afdw.d, afdw.e, afdw.f, afdw.g, new afdw[0]);
        v.getClass();
        afec afecVar3 = new afec(VCardConstants.PARAM_TYPE_VIDEO, 2, v);
        c = afecVar3;
        alpt t = alpt.t(afdw.b, afdw.c, afdw.d, afdw.e);
        t.getClass();
        afec afecVar4 = new afec("ARBITRARY_FILE", 3, t);
        d = afecVar4;
        afec[] afecVarArr = {afecVar, afecVar2, afecVar3, afecVar4};
        f = afecVarArr;
        arhi.f(afecVarArr);
    }

    public /* synthetic */ afec(String str, int i, alpt alptVar) {
        this.g = new afeb(afea.a, alptVar);
        this.e = alptVar;
    }

    public static afec[] values() {
        return (afec[]) f.clone();
    }

    @Override // defpackage.afdz
    public final String[] a(afdy afdyVar) {
        afdyVar.getClass();
        return this.g.a(afdyVar);
    }
}
