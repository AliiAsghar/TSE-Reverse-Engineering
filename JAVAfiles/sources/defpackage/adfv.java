package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfv implements adfb {
    private final aneo a;
    private final Context b;
    private final adtn c;
    private final acoc d;
    private final acnx e;
    private final adfq f;
    private final adwg g;

    public adfv(Context context, adtn adtnVar, adwg adwgVar, acoc acocVar, acnx acnxVar, aneo aneoVar, adfq adfqVar) {
        this.b = context;
        this.c = adtnVar;
        this.g = adwgVar;
        this.d = acocVar;
        this.e = acnxVar;
        this.a = aneoVar;
        this.f = adfqVar;
    }

    @Override // defpackage.adfb
    public final adfa a(String str, adev adevVar, adif adifVar, adwe adweVar, adfk adfkVar, aikc aikcVar, aijx aijxVar, adjv adjvVar, adjq adjqVar, acqj acqjVar, armf armfVar, advp advpVar) {
        advp advpVar2 = new advp(String.format("%s [%s]", advpVar, "SR"));
        Object b = armfVar.b();
        adih adihVar = new adih(this.b, (Object) this.d);
        adfr adfrVar = new adfr(this.b, this.d);
        addp addpVar = new addp(this.b, this.d);
        InstantMessageConfiguration instantMessageConfiguration = (InstantMessageConfiguration) b;
        acnx acnxVar = this.e;
        aneo aneoVar = this.a;
        adwg adwgVar = this.g;
        return new adfu(advpVar2, new adgq(this.b, adfkVar, aikcVar, this.f, aijxVar, this.c, advpVar2, aneoVar, adwgVar, adjvVar, adjqVar, instantMessageConfiguration, acqjVar, adihVar, adfrVar, adweVar, acnxVar, addpVar), this.g, adjvVar, adjqVar, this.e);
    }
}
