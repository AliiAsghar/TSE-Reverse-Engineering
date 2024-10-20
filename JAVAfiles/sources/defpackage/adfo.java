package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfo implements adfb {
    private final Context a;
    private final adtg b;
    private final adov c;
    private final acqj d;
    private final acnx e;
    private final adom f;
    private final aiot g;
    private final adfq h;
    private final afxz i;

    public adfo(Context context, adtg adtgVar, adov adovVar, acqj acqjVar, acnx acnxVar, adom adomVar, aiot aiotVar, afxz afxzVar, adfq adfqVar) {
        this.a = context;
        this.b = adtgVar;
        this.c = adovVar;
        this.d = acqjVar;
        this.e = acnxVar;
        this.f = adomVar;
        this.g = aiotVar;
        this.i = afxzVar;
        this.h = adfqVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.adfb
    public final adfa a(String str, adev adevVar, adif adifVar, adwe adweVar, adfk adfkVar, aikc aikcVar, aijx aijxVar, adjv adjvVar, adjq adjqVar, acqj acqjVar, armf armfVar, advp advpVar) {
        Optional ofNullable;
        advr.l(advpVar, "Creating RegistrationEngine.", new Object[0]);
        adweVar.b.b = Optional.of("-regv2");
        afxz afxzVar = this.i;
        advr.d((advp) afxzVar.c, "Creating ImsNetworkInterfaces.", new Object[0]);
        afxzVar.a.put(0, new adey((Context) afxzVar.f, 1, new acmp((Context) afxzVar.f), (advp) afxzVar.c, (acnx) afxzVar.e));
        afxzVar.a.put(1, new adey((Context) afxzVar.f, 2, new acmq(), (advp) afxzVar.c, (acnx) afxzVar.e));
        Context context = (Context) afxzVar.f;
        afxzVar.a.put(17, new adey(context, 5, new acmp(context), (advp) afxzVar.c, (acnx) afxzVar.e));
        acqj acqjVar2 = this.d;
        adtg adtgVar = this.b;
        acnx acnxVar = this.e;
        adom adomVar = this.f;
        Context context2 = this.a;
        adhy adhyVar = new adhy(context2, str, aikcVar, this.h, adjvVar, adjqVar, this.c, aijxVar, afxzVar, adifVar, adfkVar, adevVar, advpVar, acqjVar2, adtgVar, acnxVar, adomVar, this.g, adweVar, armfVar);
        synchronized (acrj.a) {
            ofNullable = Optional.ofNullable(acrj.b);
        }
        anen u = ((acrh) ofNullable.get()).u();
        return new adgz(adjvVar, adjqVar, armfVar, adhyVar, new adid(context2, u), u, advpVar);
    }
}
