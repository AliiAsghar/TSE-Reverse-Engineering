package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qcb {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter");
    public final anen b;
    public final anen c;
    public final anen d;
    public final vsh e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final ryg l;
    public final msk m;
    public final Set n;
    private final vbu o;
    private final vpk p;
    private final armf q;
    private final armf r;
    private final adji s;
    private final vtj t;
    private final adae u;

    public qcb(anen anenVar, anen anenVar2, anen anenVar3, vsh vshVar, armf armfVar, vbu vbuVar, armf armfVar2, vtj vtjVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, ryg rygVar, vpk vpkVar, adji adjiVar, adae adaeVar, armf armfVar7, msk mskVar, armf armfVar8, Set set) {
        this.b = anenVar;
        this.c = anenVar2;
        this.d = anenVar3;
        this.e = vshVar;
        this.f = armfVar;
        this.o = vbuVar;
        this.g = armfVar2;
        this.t = vtjVar;
        this.h = armfVar3;
        this.i = armfVar5;
        this.j = armfVar4;
        this.k = armfVar6;
        this.l = rygVar;
        this.p = vpkVar;
        this.s = adjiVar;
        this.u = adaeVar;
        this.q = armfVar7;
        this.m = mskVar;
        this.r = armfVar8;
        this.n = set;
    }

    private final akul i() {
        return this.o.c().i(new prf(this, 7), this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qbs a(defpackage.qei r21, defpackage.smr r22) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcb.a(qei, smr):qbs");
    }

    public final qwm b(qei qeiVar, smr smrVar) {
        Optional map = this.s.h(this.u.d(qeiVar.d)).map(new qbb(15));
        ryg rygVar = this.l;
        rygVar.getClass();
        return (qwm) map.map(new qcr(rygVar, 1)).orElseGet(new mau(this, smrVar, 11, null));
    }

    public final vtm c(qez qezVar) {
        vtk vtkVar = new vtk(0L);
        for (qes qesVar : new apaq(qezVar.f, qez.a)) {
            vtl vtlVar = (vtl) this.t.fu(qesVar);
            if (vtlVar == null) {
                alvw d = a.d();
                d.X(alwp.a, "BugleGroupManagement");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getRcsGroupCapability", 630, "IncomingRcsGroupNotificationConversationGetter.java")).t("Received a server capability not supported by the client: %s", qesVar.name());
            } else {
                vtkVar.c(vtlVar);
            }
        }
        return vtkVar.a();
    }

    public final akul d(qez qezVar, alog alogVar, qei qeiVar) {
        return aktp.ai(new imh(this, qezVar, alogVar, qeiVar, 2, null), this.d);
    }

    public final akul e(qei qeiVar, String str) {
        akul i;
        vsi a2 = vsj.a();
        a2.b(false);
        a2.g(false);
        a2.h(true);
        a2.n(amku.GROUP_NOTIFICATION);
        a2.k(str);
        akul d = this.e.d(a2.a());
        if (((okf) this.k.b()).a()) {
            i = aktp.ag(qeiVar);
        } else {
            i = i();
        }
        return aktp.ap(d, i).h(new hbd(this, d, i, 19), this.c);
    }

    public final akul f(ConversationIdType conversationIdType) {
        return i().i(new pri(this, conversationIdType, 16), this.b);
    }

    public final boolean g(qez qezVar) {
        if (((ojs) this.q.b()).a()) {
            qfd qfdVar = qezVar.l;
            if (qfdVar == null) {
                qfdVar = qfd.a;
            }
            if (qfdVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (((ojs) this.q.b()).a() && !((Boolean) this.r.b()).booleanValue()) {
            return true;
        }
        return false;
    }
}
