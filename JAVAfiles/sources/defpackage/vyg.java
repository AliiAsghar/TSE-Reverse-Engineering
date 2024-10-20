package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyg implements vyx {
    public final RcsMessagingService a;
    private final vqu b;
    private final anen c;
    private final qco d;
    private final vyv e;

    public vyg(vyv vyvVar, RcsMessagingService rcsMessagingService, qco qcoVar, vqu vquVar, anen anenVar) {
        this.e = vyvVar;
        this.a = rcsMessagingService;
        this.d = qcoVar;
        this.b = vquVar;
        this.c = anenVar;
    }

    public static final qeo n(qeg qegVar, aozb aozbVar) {
        return (qeo) o(qegVar, aozbVar).s();
    }

    private static aozy o(qeg qegVar, aozb aozbVar) {
        aozy createBuilder = qeo.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qeo qeoVar = (qeo) apagVar;
        qegVar.getClass();
        qeoVar.c = qegVar;
        qeoVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        qeo qeoVar2 = (qeo) apagVar2;
        aozbVar.getClass();
        qeoVar2.b |= 4;
        qeoVar2.e = aozbVar;
        amxo amxoVar = amxo.RCS_SMAPI;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        qeo qeoVar3 = (qeo) createBuilder.b;
        qeoVar3.f = amxoVar.h;
        qeoVar3.b |= 8;
        return createBuilder;
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_create_group_response").putExtra("messaging_service_create_group_extra", ((qen) obj).h.H());
    }

    @Override // defpackage.vyx
    public final qeg b(Intent intent) {
        return wam.g(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ akul c(Object obj) {
        return this.d.c((qeo) obj);
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ akul d(Object obj) {
        return aktp.ai(new vmb(this, (CreateGroupRequest) obj, 20), this.c);
    }

    @Override // defpackage.vyx
    public final aozb e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_create_group_extra");
        if (byteArrayExtra != null) {
            return aozb.w(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.vyx
    public final /* synthetic */ aozb f(Object obj) {
        return ((qen) obj).h;
    }

    @Override // defpackage.vyx
    public final Optional g(Intent intent) {
        return vyi.b(intent);
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Object h(qeg qegVar, aozb aozbVar) {
        return n(qegVar, aozbVar);
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Object i(Object obj, aozb aozbVar) {
        return n(wam.g(((CreateGroupResponse) obj).a()), aozbVar);
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Object j(qeg qegVar, Intent intent, aozb aozbVar) {
        aozy o = o(qegVar, aozbVar);
        if (((Boolean) ((utz) qau.a.get()).e()).booleanValue()) {
            qei b = this.e.b(GroupOperationResult.c(intent).b().a(), true);
            if (!o.b.isMutable()) {
                o.u();
            }
            qeo qeoVar = (qeo) o.b;
            qeo qeoVar2 = qeo.a;
            b.getClass();
            qeoVar.d = b;
            qeoVar.b |= 2;
        }
        return (qeo) o.s();
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        qen qenVar = (qen) obj;
        alob alobVar = new alob();
        apax<qei> apaxVar = qenVar.g;
        if (apaxVar.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "CreateGroupChatRequest must include 2 or more remote participants");
        if ((qenVar.b & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "CreateGroupChatRequest must include sender");
        qei qeiVar = qenVar.f;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        int f = this.b.f(Optional.of(qeiVar)) - 1;
        if (apaxVar.size() <= f) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.L(z3, "CreateGroupChatRequest must include fewer than %s remote participants", f);
        for (qei qeiVar2 : apaxVar) {
            qeh b = qeh.b(qeiVar2.c);
            if (b == null) {
                b = qeh.UNKNOWN_TYPE;
            }
            if (b == qeh.PHONE) {
                z4 = true;
            } else {
                z4 = false;
            }
            d.t(z4, "CreateGroupChatRequest must only include remote participants of type PHONE");
            alobVar.h(vyv.c(qeiVar2));
        }
        asmg asmgVar = new asmg(null, null, null);
        asmgVar.B(qenVar.c);
        asmgVar.F(qenVar.d);
        asmgVar.D(alobVar.g());
        asmgVar.C(pendingIntent);
        if (((Boolean) vyw.b.e()).booleanValue()) {
            asmgVar.E(qenVar.h);
        }
        return asmgVar.A();
    }

    @Override // defpackage.vyx
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        return "RcsConversationId: ".concat(String.valueOf(((qen) obj).c));
    }

    @Override // defpackage.vyx
    public final String m() {
        return "createGroup";
    }
}
