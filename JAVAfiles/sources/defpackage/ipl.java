package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipl implements afkt {
    private final /* synthetic */ ipp a;
    private final mci b;
    private final Supplier c;
    private final ifb d;

    public ipl(mci mciVar, ifb ifbVar, Supplier supplier) {
        this.a = new ipp(mciVar, supplier, new ipk(ifbVar, 0));
        this.b = mciVar;
        this.d = ifbVar;
        this.c = supplier;
    }

    @Override // defpackage.afkt
    public final /* synthetic */ Object a(afcq afcqVar, arpe arpeVar) {
        Object obj;
        ind indVar = (ind) afcqVar;
        MessagePartCoreData d = this.d.d(indVar, ipm.a());
        obj = this.c.get();
        inq inqVar = (inq) obj;
        if (!inqVar.e().b()) {
            inqVar.g(indVar.a);
        } else {
            inqVar.f(d);
        }
        this.b.f(d.N(), -1);
        return afky.a;
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ void c(afcq afcqVar) {
        ((ind) afcqVar).getClass();
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ void d(afcq afcqVar) {
        this.a.d((ind) afcqVar);
    }

    @Override // defpackage.afkt
    public final void b() {
    }
}
