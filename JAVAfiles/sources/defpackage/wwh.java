package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wwh extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(wwc wwcVar, wwd wwdVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = wwcVar;
        this.b = wwdVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((wwh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        wwk wwkVar = null;
        switch (this.d) {
            case 0:
                arpl arplVar = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    wwj.a.m().q("Received work request. Starting internal work.");
                    Object obj2 = this.b;
                    Object obj3 = this.c;
                    this.a = 1;
                    obj = ((wwj) obj2).f((WorkerParameters) obj3, this);
                    if (obj == arplVar) {
                        return arplVar;
                    }
                }
                return obj;
            case 1:
                arpl arplVar2 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj4 = this.c;
                    Object obj5 = this.b;
                    this.a = 1;
                    wwd wwdVar = (wwd) obj5;
                    int i = wwdVar.c;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    wwkVar = wwk.WORK_TYPE_UPDATE_PHONE_SIMS_STATE;
                                }
                            } else {
                                wwkVar = wwk.WORK_TYPE_VERIFY_SIM_REMOVAL;
                            }
                        } else {
                            wwkVar = wwk.WORK_TYPE_VERIFY_UNSTABLE_SUBSCRIPTION;
                        }
                    } else {
                        wwkVar = wwk.WORK_TYPE_UNKNOWN;
                    }
                    if (wwkVar == null) {
                        wwkVar = wwk.UNRECOGNIZED;
                    }
                    wwkVar.getClass();
                    ((alvg) wwc.a.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleSimStateUpdateInternal", 65, "SimStateUpdateHandler.kt")).t("Handling SimStateUpdate. Request for %s work type received.", wwkVar);
                    int ordinal = wwkVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                obj = upm.b();
                            } else {
                                obj = ((wwc) obj4).j(this);
                            }
                        } else {
                            ((alvg) wwc.a.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleSimRemoval", 94, "SimStateUpdateHandler.kt")).q("Handling SIM removal verification.");
                            wwc wwcVar = (wwc) obj4;
                            ((wvm) wwcVar.b.b()).c();
                            wwcVar.k(wwk.WORK_TYPE_VERIFY_SIM_REMOVAL);
                            obj = upm.b();
                        }
                    } else {
                        apao apaoVar = wwdVar.d;
                        apaoVar.getClass();
                        if (apaoVar.isEmpty()) {
                            ((alvg) wwc.a.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleUnstableSubscription", 79, "SimStateUpdateHandler.kt")).q("No unstable subscriptions to reverify.");
                            obj = upm.b();
                        } else {
                            ((alvg) wwc.a.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleUnstableSubscription", 84, "SimStateUpdateHandler.kt")).t("Handling unstable subscriptions reverification: %s", apaoVar);
                            wwc wwcVar2 = (wwc) obj4;
                            wvm wvmVar = (wvm) wwcVar2.b.b();
                            ArrayList arrayList = new ArrayList(aqjn.J(apaoVar, 10));
                            Iterator<E> it = apaoVar.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new adix(((Number) it.next()).intValue()));
                            }
                            wvmVar.b(arrayList);
                            wwcVar2.k(wwk.WORK_TYPE_VERIFY_UNSTABLE_SUBSCRIPTION);
                            obj = upm.b();
                        }
                    }
                    if (obj == arplVar2) {
                        return arplVar2;
                    }
                }
                return obj;
            case 2:
                arpl arplVar3 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj6 = this.b;
                    Object obj7 = this.c;
                    this.a = 1;
                    obj = ((wws) obj6).l((wwm) obj7, this);
                    if (obj == arplVar3) {
                        return arplVar3;
                    }
                }
                return Optional.ofNullable(obj);
            case 3:
                arpl arplVar4 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    znj znjVar = (znj) ((wws) this.c).a.b();
                    Object obj8 = this.b;
                    this.a = 1;
                    if (znjVar.Z((amvy) obj8, this) == arplVar4) {
                        return arplVar4;
                    }
                }
                return arnb.a;
            case 4:
                arpl arplVar5 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj9 = this.b;
                    ?? r1 = this.c;
                    this.a = 1;
                    obj = ((wzi) obj9).b(r1, this);
                    if (obj == arplVar5) {
                        return arplVar5;
                    }
                }
                return obj;
            case 5:
                arpl arplVar6 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj10 = this.c;
                    Object obj11 = this.b;
                    this.a = 1;
                    obj = ((xez) obj10).j((aqds) obj11, this);
                    if (obj == arplVar6) {
                        return arplVar6;
                    }
                }
                return obj;
            case 6:
                arpl arplVar7 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj12 = this.c;
                    Object obj13 = this.b;
                    this.a = 1;
                    if (((xga) obj12).b.b((aqds) obj13, this) == arplVar7) {
                        return arplVar7;
                    }
                }
                return null;
            case 7:
                arpl arplVar8 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj14 = this.c;
                    Object obj15 = this.b;
                    this.a = 1;
                    String i2 = aogy.i();
                    anjb anjbVar = (anjb) obj15;
                    ankz ankzVar = new ankz(apts.CREATE_GROUP, i2, anjbVar.d);
                    aogy aogyVar = (aogy) ((znj) obj14).a;
                    obj = aogyVar.b(ankzVar, new anlg(aogyVar, i2, anjbVar, ankzVar, null), this);
                    if (obj == arplVar8) {
                        return arplVar8;
                    }
                }
                return obj;
            case 8:
                arpl arplVar9 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj16 = this.c;
                    Object obj17 = this.b;
                    this.a = 1;
                    obj = ((aogy) ((znj) obj16).a).e((anji) obj17, this);
                    if (obj == arplVar9) {
                        return arplVar9;
                    }
                }
                return obj;
            case 9:
                arpl arplVar10 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj18 = this.c;
                    Object obj19 = this.b;
                    this.a = 1;
                    if (((aogy) ((znj) obj18).a).g((anjw) obj19, this) == arplVar10) {
                        return arplVar10;
                    }
                }
                return arnb.a;
            case 10:
                arpl arplVar11 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj20 = this.c;
                    Object obj21 = this.b;
                    this.a = 1;
                    obj = ankt.k((ankt) obj20, (aqgk) obj21, this);
                    if (obj == arplVar11) {
                        return arplVar11;
                    }
                }
                return obj;
            case 11:
                arpl arplVar12 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj22 = this.c;
                    Object obj23 = this.b;
                    this.a = 1;
                    obj = ankt.l((ankt) obj22, (aqgp) obj23, this);
                    if (obj == arplVar12) {
                        return arplVar12;
                    }
                }
                return obj;
            case 12:
                arpl arplVar13 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj24 = this.c;
                    Object obj25 = this.b;
                    this.a = 1;
                    obj = ankt.m((ankt) obj24, (aqgs) obj25, this);
                    if (obj == arplVar13) {
                        return arplVar13;
                    }
                }
                return obj;
            case 13:
                arpl arplVar14 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj26 = this.c;
                    Object obj27 = this.b;
                    this.a = 1;
                    obj = ankt.n((ankt) obj26, (aqgu) obj27, this);
                    if (obj == arplVar14) {
                        return arplVar14;
                    }
                }
                return obj;
            case 14:
                arpl arplVar15 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj28 = this.c;
                    Object obj29 = this.b;
                    this.a = 1;
                    obj = ankt.o((ankt) obj28, (aqia) obj29, this);
                    if (obj == arplVar15) {
                        return arplVar15;
                    }
                }
                return obj;
            case 15:
                arpl arplVar16 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj30 = this.c;
                    Object obj31 = this.b;
                    this.a = 1;
                    obj = ankt.p((ankt) obj30, (aqdv) obj31, this);
                    if (obj == arplVar16) {
                        return arplVar16;
                    }
                }
                return obj;
            case 16:
                arpl arplVar17 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj32 = this.c;
                    Object obj33 = this.b;
                    this.a = 1;
                    obj = ankt.q((ankt) obj32, (aqdy) obj33, this);
                    if (obj == arplVar17) {
                        return arplVar17;
                    }
                }
                return obj;
            case 17:
                arpl arplVar18 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj34 = this.c;
                    Object obj35 = this.b;
                    this.a = 1;
                    obj = ankt.r((ankt) obj34, (aqha) obj35, this);
                    if (obj == arplVar18) {
                        return arplVar18;
                    }
                }
                return obj;
            case 18:
                arpl arplVar19 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj36 = this.c;
                    Object obj37 = this.b;
                    this.a = 1;
                    obj = ankt.s((ankt) obj36, (aqeu) obj37, this);
                    if (obj == arplVar19) {
                        return arplVar19;
                    }
                }
                return obj;
            case 19:
                arpl arplVar20 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj38 = this.c;
                    Object obj39 = this.b;
                    this.a = 1;
                    obj = ankt.t((ankt) obj38, (aqdt) obj39, this);
                    if (obj == arplVar20) {
                        return arplVar20;
                    }
                }
                return obj;
            default:
                arpl arplVar21 = arpl.a;
                int i3 = this.a;
                aqil.P(obj);
                if (i3 == 0) {
                    Object obj40 = this.b;
                    Object obj41 = this.c;
                    this.a = 1;
                    obj = ((xgj) obj40).c((qei) obj41, null, this);
                    if (obj == arplVar21) {
                        return arplVar21;
                    }
                }
                return new znj((aogy) obj, (arwe) ((xgj) this.b).g, (char[]) null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.d) {
            case 0:
                return new wwh((wwj) this.b, (WorkerParameters) this.c, arpeVar, 0);
            case 1:
                return new wwh((wwc) this.c, (wwd) this.b, arpeVar, 1);
            case 2:
                return new wwh((wws) this.b, (wwm) this.c, arpeVar, 2);
            case 3:
                return new wwh((wws) this.c, (amvy) this.b, arpeVar, 3);
            case 4:
                return new wwh((wzi) this.b, (MessageCoreData) this.c, arpeVar, 4);
            case 5:
                return new wwh((xez) this.c, (aqds) this.b, arpeVar, 5);
            case 6:
                return new wwh((xga) this.c, (aqds) this.b, arpeVar, 6);
            case 7:
                return new wwh((znj) this.c, (anjb) this.b, arpeVar, 7);
            case 8:
                return new wwh((znj) this.c, (anji) this.b, arpeVar, 8);
            case 9:
                return new wwh((znj) this.c, (anjw) this.b, arpeVar, 9);
            case 10:
                return new wwh((xgf) this.c, (aqgk) this.b, arpeVar, 10);
            case 11:
                return new wwh((xgf) this.c, (aqgp) this.b, arpeVar, 11);
            case 12:
                return new wwh((xgf) this.c, (aqgs) this.b, arpeVar, 12);
            case 13:
                return new wwh((xgf) this.c, (aqgu) this.b, arpeVar, 13);
            case 14:
                return new wwh((xgf) this.c, (aqia) this.b, arpeVar, 14);
            case 15:
                return new wwh((xgf) this.c, (aqdv) this.b, arpeVar, 15);
            case 16:
                return new wwh((xgf) this.c, (aqdy) this.b, arpeVar, 16);
            case 17:
                return new wwh((xgf) this.c, (aqha) this.b, arpeVar, 17);
            case 18:
                return new wwh((xgf) this.c, (aqeu) this.b, arpeVar, 18);
            case 19:
                return new wwh((xgf) this.c, (aqdt) this.b, arpeVar, 19);
            default:
                return new wwh((xgj) this.b, (qei) this.c, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(wwj wwjVar, WorkerParameters workerParameters, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = wwjVar;
        this.c = workerParameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(wws wwsVar, amvy amvyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = wwsVar;
        this.b = amvyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(wws wwsVar, wwm wwmVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = wwsVar;
        this.c = wwmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(wzi wziVar, MessageCoreData messageCoreData, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = wziVar;
        this.c = messageCoreData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xez xezVar, aqds aqdsVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xezVar;
        this.b = aqdsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xga xgaVar, aqds aqdsVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgaVar;
        this.b = aqdsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqdt aqdtVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqdtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqdv aqdvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqdvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqdy aqdyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqdyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqeu aqeuVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqeuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqgk aqgkVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqgkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqgp aqgpVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqgpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqgs aqgsVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqgsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqgu aqguVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqguVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqha aqhaVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqhaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgf xgfVar, aqia aqiaVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = xgfVar;
        this.b = aqiaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(xgj xgjVar, qei qeiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = xgjVar;
        this.c = qeiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(znj znjVar, anjb anjbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = znjVar;
        this.b = anjbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(znj znjVar, anji anjiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = znjVar;
        this.b = anjiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwh(znj znjVar, anjw anjwVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = znjVar;
        this.b = anjwVar;
    }
}
