package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipn implements afkt {
    private final /* synthetic */ ipp a;
    private final mci b;
    private final Supplier c;
    private final ifb d;

    public ipn(mci mciVar, ifb ifbVar, Supplier supplier) {
        this.a = new ipp(mciVar, supplier, new ipk(ifbVar, 2));
        this.b = mciVar;
        this.d = ifbVar;
        this.c = supplier;
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ Object a(afcq afcqVar, arpe arpeVar) {
        Object obj;
        LocationContentItem locationContentItem = (LocationContentItem) afcqVar;
        MessagePartCoreData e = this.d.e(locationContentItem, ipo.a());
        obj = this.c.get();
        inq inqVar = (inq) obj;
        if (!inqVar.e().b()) {
            inqVar.g(locationContentItem.a.V());
        } else {
            inqVar.f(e);
        }
        this.b.f(e.N(), -1);
        return afky.a;
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ void c(afcq afcqVar) {
        ((LocationContentItem) afcqVar).getClass();
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ void d(afcq afcqVar) {
        this.a.d((LocationContentItem) afcqVar);
    }

    @Override // defpackage.afkt
    public final void b() {
    }
}
