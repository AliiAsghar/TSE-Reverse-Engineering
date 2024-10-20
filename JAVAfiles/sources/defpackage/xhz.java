package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xhz {
    public static final alwo a = alwo.o("BugleBackup");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final Context g;
    public final nds h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    private final agnq m;

    public xhz(armf armfVar, armf armfVar2, armf armfVar3, agnq agnqVar, Context context, armf armfVar4, armf armfVar5, nds ndsVar, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.m = agnqVar;
        this.g = context;
        this.e = armfVar4;
        this.f = armfVar5;
        this.i = armfVar6;
        this.h = ndsVar;
        this.j = armfVar7;
        this.k = armfVar8;
        this.l = armfVar9;
    }

    public static ruu e(xjn xjnVar, xhv xhvVar, alog alogVar, boolean z, boolean z2, int i) {
        ruu a2;
        if (xjnVar != null) {
            a2 = ruv.b(xjnVar);
        } else {
            a2 = ruv.a();
        }
        int i2 = 1;
        if (z2) {
            a2.q(true);
        }
        a2.f(false);
        a2.e(z);
        if (true == z) {
            i2 = 2;
        }
        a2.p(i2);
        a2.s(xhvVar);
        a2.j(alogVar);
        a2.t(i);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ruv a(final xjn xjnVar, final wye wyeVar, final alpt alptVar, final alpt alptVar2) {
        return (ruv) this.m.c("ConversationParametersCreator#createMmsConversationParameters", new alhr() { // from class: xhw
            @Override // defpackage.alhr
            public final Object get() {
                xaz a2;
                Optional of;
                vqc vqcVar;
                ParticipantsTable.BindData c;
                vqd vqdVar;
                wye wyeVar2 = wyeVar;
                xhv xhvVar = new xhv(wyeVar2.i);
                int i = alog.d;
                ruu e = xhz.e(xjnVar, xhvVar, alsx.a, true, false, 3);
                alog alogVar = alsx.a;
                boolean isEmpty = TextUtils.isEmpty(wyeVar2.o);
                final xhz xhzVar = xhz.this;
                if (!isEmpty) {
                    vre a3 = vrf.a(wyeVar2.o);
                    if (a3 != null) {
                        alpt alptVar3 = (alpt) Collection.EL.stream(alptVar2).map(new xgv(6)).map(new xgv(7)).collect(alls.b);
                        if (a3.b.isPresent()) {
                            e.f(true);
                            e.l(((vrb) a3.b.get()).a);
                        } else if (a3.c.isPresent()) {
                            if (((vqe) a3.c.get()).c == 2) {
                                e.f(true);
                                vqe vqeVar = (vqe) a3.c.get();
                                if (vqeVar.c == 2) {
                                    vqdVar = (vqd) vqeVar.d;
                                } else {
                                    vqdVar = vqd.a;
                                }
                                e.d = Optional.of(vqdVar.c);
                                e.c(vqdVar.d);
                                e.l(vqdVar.f);
                                if (!((okf) xhzVar.f.b()).a()) {
                                    e.e = Optional.of(vqdVar.e);
                                }
                            } else if (((vqe) a3.c.get()).c == 3) {
                                alvw n = xhz.a.n();
                                n.V(1, TimeUnit.SECONDS);
                                ((alwl) n.h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createConversationParametersWithTransactionId", 323, "ConversationParametersCreator.java")).q("Creating participant for RBM conversation");
                                vqe vqeVar2 = (vqe) a3.c.get();
                                if (vqeVar2.c == 3) {
                                    vqcVar = (vqc) vqeVar2.d;
                                } else {
                                    vqcVar = vqc.a;
                                }
                                e.s(((vqm) xhzVar.b.b()).j(new wyj(vqcVar.b, vqcVar.c, vqcVar.d)));
                                if (((Boolean) xhzVar.i.b()).booleanValue()) {
                                    c = rxn.f(vqcVar.b, vqcVar.c, vqcVar.d).a();
                                    ((rxq) xhzVar.c.b()).g(c);
                                } else {
                                    c = rxn.f(vqcVar.b, vqcVar.c, vqcVar.d).c();
                                }
                                alogVar = alog.r(c);
                            } else if (((Boolean) ((utz) yig.U.get()).e()).booleanValue() && (((vqe) a3.c.get()).b & 1) != 0) {
                                vpx vpxVar = ((vqe) a3.c.get()).f;
                                if (vpxVar == null) {
                                    vpxVar = vpx.a;
                                }
                                String str = vpxVar.b;
                                albo.T(!str.isEmpty());
                                alogVar = alog.r(xhzVar.h.a(((msk) xhzVar.e.b()).n(str)));
                            } else {
                                e.s(new xhv(((wzs) xhzVar.d.b()).g(xhzVar.g, wxr.b, alptVar3)));
                            }
                        } else if (!a3.a.isPresent() && !a3.d.isPresent() && !a3.e.isPresent()) {
                            ((alwl) ((alwl) xhz.a.i()).h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createConversationParametersWithTransactionId", 399, "ConversationParametersCreator.java")).t("Unknown message type  transactionId=%s", a3);
                        } else {
                            e.s(new xhv(((wzs) xhzVar.d.b()).g(xhzVar.g, wxr.a, alptVar3)));
                        }
                    }
                } else {
                    final String str2 = wyeVar2.a;
                    if (str2 != null) {
                        final long j = wyeVar2.i;
                        if (((ogn) xhzVar.j.b()).a()) {
                            a2 = ((xii) xhzVar.l.b()).b(new xhv(j), new armf() { // from class: xhy
                                @Override // defpackage.armf, defpackage.arme
                                public final Object b() {
                                    return ((xae) xhz.this.k.b()).a(wxr.a, j, str2);
                                }
                            });
                        } else {
                            a2 = ((xae) xhzVar.k.b()).a(wxr.a, j, str2);
                        }
                        String str3 = a2.c;
                        if (str3 == null) {
                            of = Optional.empty();
                        } else if (str3.isEmpty()) {
                            of = Optional.empty();
                        } else {
                            of = Optional.of(str3);
                        }
                        if (of.isPresent()) {
                            e.c((String) of.get());
                        }
                    }
                }
                if (alogVar.isEmpty()) {
                    alpt alptVar4 = alptVar;
                    alvw n2 = xhz.a.n();
                    n2.V(1, TimeUnit.SECONDS);
                    ((alwl) n2.h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createMmsConversationParametersForForwardSync", 276, "ConversationParametersCreator.java")).r("Creating [%s] participants for MMS or RCS conversation", alptVar4.size());
                    ((Boolean) new mst(15).get()).booleanValue();
                    alogVar = xhzVar.d(wyeVar2.q, alptVar4);
                }
                e.j(alogVar);
                return e.a();
            }
        });
    }

    public final ruv b(msh mshVar, int i, boolean z) {
        return c(null, mshVar, i, new xhv(), z);
    }

    public final ruv c(xjn xjnVar, msh mshVar, int i, xhv xhvVar, boolean z) {
        return f(xjnVar, rxn.c(mshVar, i), xhvVar, z, false, 3);
    }

    public final alog d(int i, alpt alptVar) {
        Stream map = Collection.EL.stream(alptVar).map(new rbe(this, i, 10));
        int i2 = alog.d;
        return (alog) map.collect(alls.a);
    }

    public final ruv f(final xjn xjnVar, final ParticipantsTable.BindData bindData, final xhv xhvVar, final boolean z, final boolean z2, final int i) {
        return (ruv) this.m.c("ConversationParametersCreator#createSmsConversationParameters", new alhr() { // from class: xhx
            @Override // defpackage.alhr
            public final Object get() {
                alog r = alog.r(ParticipantsTable.b(((rxq) xhz.this.c.b()).g(bindData)));
                boolean z3 = z;
                return xhz.e(xjnVar, xhvVar, r, z3, z2, i).a();
            }
        });
    }

    public final ruv g(alpt alptVar, int i, boolean z) {
        ((Boolean) new mst(15).get()).booleanValue();
        d.s(!alptVar.isEmpty());
        xhv xhvVar = new xhv();
        ((Boolean) new mst(15).get()).booleanValue();
        return e(null, xhvVar, d(i, alptVar), z, false, 3).a();
    }
}
