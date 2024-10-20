package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipp implements afkt {
    private final mci a;
    private final Supplier b;
    private final arqr c;

    public ipp(mci mciVar, Supplier supplier, arqr arqrVar) {
        this.a = mciVar;
        this.b = supplier;
        this.c = arqrVar;
    }

    @Override // defpackage.afkt
    public final Object a(afcq afcqVar, arpe arpeVar) {
        Object obj;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.c.a(afcqVar);
        obj = this.b.get();
        int c = ((inq) obj).c(messagePartCoreData);
        this.a.f(messagePartCoreData.N(), c);
        return afky.a;
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void c(afcq afcqVar) {
        afcqVar.getClass();
    }

    @Override // defpackage.afkt
    public final void d(afcq afcqVar) {
        Object obj;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.c.a(afcqVar);
        obj = this.b.get();
        ((inq) obj).h(messagePartCoreData);
        this.a.g(messagePartCoreData.N());
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void b() {
    }
}
