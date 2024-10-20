package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Arrays;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rhq implements Predicate {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rhq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.c) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        switch (this.c) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.c) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Object apply;
        int T;
        int af;
        int i = 1;
        switch (this.c) {
            case 0:
                String str = (String) obj;
                return Objects.equals(((rhs) this.a).g(str), ((rhs) this.b).g(str));
            case 1:
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                msh f = resolvedRecipient.f();
                alor alorVar = (alor) this.b;
                if (alorVar.containsKey(f) && ((Instant) alorVar.get(resolvedRecipient.f())).isAfter(((mxc) this.a).c.f())) {
                    return true;
                }
                return false;
            case 2:
                xze xzeVar = rul.a;
                apply = this.b.apply(obj);
                return this.a.add(apply);
            case 3:
                qei qeiVar = (qei) obj;
                Optional e = ((msk) ((rul) this.a).i.b()).s((ParticipantsTable.BindData) this.b).e();
                qeiVar.getClass();
                return e.filter(new qxp(qeiVar, 13)).isPresent();
            case 4:
                Optional i2 = ((nfw) obj).i();
                if (i2.isEmpty()) {
                    return false;
                }
                Object obj2 = this.a;
                Object obj3 = this.b;
                return Collection.EL.stream(((rur) ((uhg) obj3).j.b()).e(((sna) obj2).C())).map(new tyl(obj3, 12)).anyMatch(new uhe(i2, i));
            case 5:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                alvi alviVar = ujv.a;
                if (this.a.cI() || !bindData.M().equals(((ParticipantsTable.BindData) this.b).M())) {
                    return true;
                }
                return false;
            case 6:
                sqf sqfVar = (sqf) obj;
                if (sqfVar.k() == this.a && ((uac) this.b).l(sqfVar)) {
                    return true;
                }
                return false;
            case 7:
                vxc vxcVar = (vxc) this.a;
                if (((xtj) vxcVar.c.b()).c((qei) obj) == xtg.c) {
                    Optional optional = (Optional) this.b;
                    if (optional.isEmpty() || vxcVar.d.f().isAfter(((Instant) optional.get()).plus(Duration.ofDays(((Integer) vxc.b.e()).intValue())))) {
                        return true;
                    }
                }
                return false;
            case 8:
                wfq wfqVar = (wfq) obj;
                long longValue = ((Long) wft.d((alog) this.b).orElse(0L)).longValue();
                int aT = a.aT(wfqVar.c);
                if (aT != 0 && aT == 3 && (T = a.T(wfqVar.e)) != 0 && T == 4) {
                    wfp b = wfp.b(wfqVar.d);
                    if (b == null) {
                        b = wfp.UNRECOGNIZED;
                    }
                    if (((wfp) this.a).equals(b)) {
                        apct apctVar = wfqVar.f;
                        if (apctVar == null) {
                            apctVar = apct.a;
                        }
                        if (apdr.a(apctVar, apds.b(longValue)) > 0) {
                            return true;
                        }
                    }
                }
                return false;
            case 9:
                wfy wfyVar = (wfy) obj;
                long longValue2 = ((Long) wgd.g((alog) this.b).orElse(0L)).longValue();
                int Z = a.Z(wfyVar.c);
                if (Z != 0 && Z == 3) {
                    wfx b2 = wfx.b(wfyVar.h);
                    if (b2 == null) {
                        b2 = wfx.UNRECOGNIZED;
                    }
                    if (((wfx) this.a).equals(b2) && (af = a.af(wfyVar.d)) != 0 && af == 4) {
                        apct apctVar2 = wfyVar.e;
                        if (apctVar2 == null) {
                            apctVar2 = apct.a;
                        }
                        if (apds.a(apctVar2) > longValue2) {
                            return true;
                        }
                    }
                }
                return false;
            case 10:
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                alvi alviVar2 = xgw.a;
                if (!bindData2.M().equals(this.b) && !bindData2.M().equals(((ParticipantsTable.BindData) this.a).M())) {
                    return true;
                }
                return false;
            case 11:
                agoz agozVar = (agoz) obj;
                if (agozVar.H((String) this.b) && !agozVar.J(Arrays.asList((agpw) this.a))) {
                    return true;
                }
                return false;
            case 12:
                agpr agprVar = (agpr) this.a;
                agoz agozVar2 = (agoz) obj;
                String[] strArr = (String[]) agprVar.a.keySet().toArray(new String[0]);
                adwp adwpVar = agozVar2.m;
                String str2 = (String) this.b;
                if ((adwpVar.p(str2, strArr) && !agozVar2.J(agprVar.e)) || agozVar2.U().p(str2, (String[]) agprVar.a.keySet().toArray(new String[0]))) {
                    return true;
                }
                return false;
            default:
                aiim aiimVar = (aiim) obj;
                alor alorVar2 = ahab.a;
                if (aiimVar.b == this.b && aiimVar.a == this.a) {
                    return true;
                }
                return false;
        }
    }

    public /* synthetic */ rhq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
