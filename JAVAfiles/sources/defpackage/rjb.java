package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjb implements rhp {
    public static final xze a = xze.g("Bugle", "NoConfirmationMessageSendAction");
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;

    public rjb() {
        throw null;
    }

    public final void a(wng wngVar, Intent intent) {
        Action b = b();
        if (intent == null) {
            return;
        }
        xze xzeVar = a;
        xzeVar.p("sendMessageFromNotificationIntent.");
        String action = intent.getAction();
        if (!"android.intent.action.RESPOND_VIA_MESSAGE".equals(action)) {
            xyo d = xzeVar.d();
            d.H("onHandleIntent wrong action:");
            d.H(action);
            d.q();
            return;
        }
        if (intent.getExtras() == null) {
            xzeVar.p("Called to send SMS but no extras.");
        } else {
            b.u.t("notification_intent", intent);
            b.r(wngVar);
        }
    }

    public final /* bridge */ /* synthetic */ Action b() {
        Context context = (Context) this.b.b();
        context.getClass();
        qoq qoqVar = (qoq) this.d.b();
        qoqVar.getClass();
        mbl mblVar = (mbl) this.f.b();
        mblVar.getClass();
        vjs vjsVar = (vjs) this.i.b();
        vjsVar.getClass();
        xnv xnvVar = (xnv) this.o.b();
        xnvVar.getClass();
        armf armfVar = this.p;
        armf armfVar2 = this.j;
        armf armfVar3 = this.k;
        armf armfVar4 = this.l;
        armf armfVar5 = this.m;
        armf armfVar6 = this.n;
        armf armfVar7 = this.g;
        armf armfVar8 = this.h;
        return new NoConfirmationMessageSendAction(context, this.c, qoqVar, this.e, mblVar, armfVar7, armfVar8, vjsVar, armfVar2, armfVar3, armfVar4, armfVar5, armfVar6, xnvVar, armfVar);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.b.b();
        context.getClass();
        qoq qoqVar = (qoq) this.d.b();
        qoqVar.getClass();
        mbl mblVar = (mbl) this.f.b();
        mblVar.getClass();
        vjs vjsVar = (vjs) this.i.b();
        vjsVar.getClass();
        xnv xnvVar = (xnv) this.o.b();
        xnvVar.getClass();
        parcel.getClass();
        armf armfVar = this.j;
        armf armfVar2 = this.k;
        armf armfVar3 = this.l;
        armf armfVar4 = this.m;
        armf armfVar5 = this.n;
        armf armfVar6 = this.p;
        armf armfVar7 = this.g;
        armf armfVar8 = this.h;
        return new NoConfirmationMessageSendAction(context, this.c, qoqVar, this.e, mblVar, armfVar7, armfVar8, vjsVar, armfVar, armfVar2, armfVar3, armfVar4, armfVar5, armfVar6, xnvVar, parcel);
    }

    public rjb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.h = armfVar7;
        armfVar8.getClass();
        this.i = armfVar8;
        armfVar9.getClass();
        this.j = armfVar9;
        armfVar10.getClass();
        this.k = armfVar10;
        armfVar11.getClass();
        this.l = armfVar11;
        armfVar12.getClass();
        this.m = armfVar12;
        armfVar13.getClass();
        this.n = armfVar13;
        armfVar14.getClass();
        this.o = armfVar14;
        armfVar15.getClass();
        this.p = armfVar15;
        armfVar16.getClass();
    }
}
