package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mie {
    public static final /* synthetic */ int d = 0;
    private final armf A;
    private final armf B;
    private final armf C;
    private final armf D;
    private final pnp E;
    private final armf F;
    private final xyt G;
    private final hgj H;
    public final armf b;
    public final qsa c;
    private final armf f;
    private final armf g;
    private final armf h;
    private final apwt i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final apwt m;
    private final armf n;
    private final apwt o;
    private final armf p;
    private final armf q;
    private final anen r;
    private final anen s;
    private final apwt t;
    private final Context u;
    private final apwt v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;
    private static final xze e = xze.g("BugleUsageStatistics", "UsageStatsMessageEventBuilder");
    static final utz a = uuh.c(uuh.b, "carrier_config_logging_sampling_percent", 1.0d);

    public mie(Context context, armf armfVar, armf armfVar2, armf armfVar3, apwt apwtVar, armf armfVar4, armf armfVar5, armf armfVar6, apwt apwtVar2, armf armfVar7, apwt apwtVar3, armf armfVar8, armf armfVar9, anen anenVar, anen anenVar2, apwt apwtVar4, hgj hgjVar, apwt apwtVar5, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, qsa qsaVar, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, pnp pnpVar, armf armfVar19, xyt xytVar) {
        this.u = context;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.i = apwtVar;
        this.j = armfVar4;
        this.k = armfVar5;
        this.l = armfVar6;
        this.m = apwtVar2;
        this.n = armfVar7;
        this.o = apwtVar3;
        this.p = armfVar8;
        this.q = armfVar9;
        this.r = anenVar;
        this.s = anenVar2;
        this.t = apwtVar4;
        this.H = hgjVar;
        this.v = apwtVar5;
        this.w = armfVar10;
        this.x = armfVar11;
        this.y = armfVar12;
        this.z = armfVar13;
        this.A = armfVar14;
        this.c = qsaVar;
        this.B = armfVar15;
        this.b = armfVar16;
        this.C = armfVar17;
        this.D = armfVar18;
        this.E = pnpVar;
        this.F = armfVar19;
        this.G = xytVar;
    }

    public final akul a(int i) {
        if (((ansy) ((pno) this.E).a.b()).e("bugle.enable_gemini_settings_logging") && ((Optional) ((apxx) this.F).a).isPresent()) {
            akul m = ((znj) this.h.b()).m();
            akul a2 = ((vno) ((Optional) ((apxx) this.F).a).get()).a();
            return aktp.ap(m, a2).h(new mid(this, m, a2, i, 0), this.r);
        }
        return ((znj) this.h.b()).m().h(new ikg(this, i, 2), this.r);
    }

    public final akul b(MessageCoreData messageCoreData, amgl amglVar) {
        akul c;
        akul h;
        int i = 7;
        if (!messageCoreData.cD()) {
            h = aktp.ag(messageCoreData.ac());
        } else {
            rur rurVar = (rur) this.B.b();
            ConversationIdType z = messageCoreData.z();
            z.getClass();
            c = qjh.c(rurVar.f, arpj.a, arwf.a, new rdx(rurVar, z, (arpe) null, 7));
            h = c.h(new mds(this, 8), this.s);
        }
        return h.i(new lso(this, 10), this.s).h(new mds(amglVar, i), this.s);
    }

    public final Optional c() {
        if (((Optional) this.i.b()).isPresent()) {
            return Optional.empty();
        }
        try {
            return Optional.of(this.u.getPackageManager().getPackageInfo("com.google.android.ims", 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return Optional.empty();
        }
    }

    public final String d() {
        return (String) c().map(new mfk(9)).orElse("NOT_AVAILABLE");
    }

    public final void e(amgl amglVar, int i) {
        Optional of;
        boolean z;
        boolean z2;
        boolean z3;
        aozy createBuilder = amig.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amig amigVar = (amig) createBuilder.b;
        boolean z4 = true;
        amigVar.b |= 1;
        amigVar.c = i;
        amig amigVar2 = (amig) createBuilder.s();
        Optional i2 = ((wwn) this.z.b()).i(i);
        if (i2.isEmpty()) {
            xyo a2 = e.a();
            a2.H("No subscription found for subId");
            a2.x("subId", i);
            a2.q();
            of = Optional.empty();
        } else {
            of = Optional.of(((wxb) i2.get()).p);
        }
        if (((pcf) this.D.b()).a()) {
            aozy builder = amigVar2.toBuilder();
            amwt amwtVar = ((adjc) this.C.b()).d(i).a;
            if (!builder.b.isMutable()) {
                builder.u();
            }
            amig amigVar3 = (amig) builder.b;
            amigVar3.j = amwtVar.E;
            amigVar3.b |= 64;
            amigVar2 = (amig) builder.s();
        }
        if (of.isPresent()) {
            aozy builder2 = amigVar2.toBuilder();
            Object obj = of.get();
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            amig amigVar4 = (amig) builder2.b;
            amigVar4.b |= 32;
            amigVar4.i = (String) obj;
            amigVar2 = (amig) builder2.s();
        }
        int d2 = ((yjy) this.f.b()).d();
        int c = ((yjy) this.f.b()).c();
        int b = ((yjy) this.f.b()).b();
        aozy builder3 = amigVar2.toBuilder();
        amif amifVar = amigVar2.f;
        if (amifVar == null) {
            amifVar = amif.a;
        }
        if (i == d2) {
            z = true;
        } else {
            z = false;
        }
        aozy builder4 = amifVar.toBuilder();
        if (!builder4.b.isMutable()) {
            builder4.u();
        }
        apag apagVar = builder4.b;
        amif amifVar2 = (amif) apagVar;
        amifVar2.b |= 1;
        amifVar2.c = z;
        if (i == c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!apagVar.isMutable()) {
            builder4.u();
        }
        apag apagVar2 = builder4.b;
        amif amifVar3 = (amif) apagVar2;
        amifVar3.b |= 2;
        amifVar3.d = z2;
        if (i == b) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!apagVar2.isMutable()) {
            builder4.u();
        }
        amif amifVar4 = (amif) builder4.b;
        amifVar4.b |= 4;
        amifVar4.e = z3;
        if (!((pcf) this.D.b()).a() || i != ((yjy) this.f.b()).f()) {
            z4 = false;
        }
        if (!builder4.b.isMutable()) {
            builder4.u();
        }
        amif amifVar5 = (amif) builder4.b;
        amifVar5.b |= 8;
        amifVar5.f = z4;
        amif amifVar6 = (amif) builder4.s();
        if (!builder3.b.isMutable()) {
            builder3.u();
        }
        amig amigVar5 = (amig) builder3.b;
        amifVar6.getClass();
        amigVar5.f = amifVar6;
        amigVar5.b |= 8;
        amig amigVar6 = (amig) builder3.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amigVar6.getClass();
        amguVar.l = amigVar6;
        amguVar.b |= 32;
    }

    public final void f(amgl amglVar) {
        int t = ((yaq) this.G.a()).t();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgu amguVar2 = amgu.a;
        amguVar.aD = t - 1;
        amguVar.d |= 262144;
    }

    public final void g(MessageCoreData messageCoreData, amgl amglVar) {
        if (messageCoreData.cI()) {
            int T = ((vqu) this.j.b()).T();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar = (amgu) amglVar.b;
            amgu amguVar2 = amgu.a;
            amguVar.ae = T - 1;
            amguVar.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
    }

    public final void h(MessageCoreData messageCoreData, amgl amglVar) {
        amgu amguVar = (amgu) amglVar.b;
        if ((amguVar.c & 2097152) != 0) {
            amxo b = amxo.b(amguVar.aa);
            if (b == null) {
                b = amxo.UNKNOWN_RCS_TYPE;
            }
            if (b != amxo.UNKNOWN_RCS_TYPE) {
                return;
            }
        }
        if (messageCoreData != null && !messageCoreData.cI()) {
            amxo amxoVar = amxo.NOT_RCS;
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar2 = (amgu) amglVar.b;
            amguVar2.aa = amxoVar.h;
            amguVar2.c |= 2097152;
            return;
        }
        amxo n = this.H.n();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.aa = n.h;
        amguVar3.c |= 2097152;
    }

    public final void i(MessageCoreData messageCoreData, amgl amglVar, Optional optional) {
        optional.ifPresent(new mht(amglVar, 8));
        h(messageCoreData, amglVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final amgw j(List list, int i) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            aozy createBuilder = amec.a.createBuilder();
            String U = messagePartCoreData.U();
            if (U != null) {
                i2 = yyb.aQ(U);
            } else {
                i2 = 2;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amec amecVar = (amec) createBuilder.b;
            amecVar.c = a.au(i2);
            amecVar.b |= 1;
            ameb M = messagePartCoreData.M();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amec amecVar2 = (amec) createBuilder.b;
            amecVar2.d = M.a();
            int i5 = 4;
            amecVar2.b |= 4;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amec.a((amec) createBuilder.b);
            int i6 = 13;
            if (i == 13) {
                if (((Boolean) ((utz) mho.e.get()).e()).booleanValue()) {
                    long bK = messagePartCoreData.bK();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amec amecVar3 = (amec) createBuilder.b;
                    amecVar3.b |= 32;
                    amecVar3.g = bK;
                }
            } else {
                i6 = i;
            }
            if (messagePartCoreData.bg()) {
                aozy createBuilder2 = amdz.a.createBuilder();
                if (true != messagePartCoreData.aU()) {
                    i3 = 3;
                } else {
                    i3 = 4;
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amdz amdzVar = (amdz) createBuilder2.b;
                amdzVar.c = a.an(i3);
                amdzVar.b |= 1;
                if (messagePartCoreData.p() >= 0) {
                    i4 = 4;
                } else {
                    i4 = 3;
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amdz amdzVar2 = (amdz) createBuilder2.b;
                amdzVar2.d = a.an(i4);
                amdzVar2.b |= 2;
                amdz amdzVar3 = (amdz) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amec amecVar4 = (amec) createBuilder.b;
                amdzVar3.getClass();
                amecVar4.e = amdzVar3;
                amecVar4.b |= 8;
                int aR = yyb.aR(messagePartCoreData.p());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amec amecVar5 = (amec) createBuilder.b;
                amecVar5.f = a.aq(aR);
                amecVar5.b |= 16;
            } else {
                aozy createBuilder3 = amdz.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                amdz amdzVar4 = (amdz) createBuilder3.b;
                amdzVar4.c = a.an(2);
                amdzVar4.b |= 1;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                amdz amdzVar5 = (amdz) createBuilder3.b;
                amdzVar5.d = a.an(2);
                amdzVar5.b |= 2;
                amdz amdzVar6 = (amdz) createBuilder3.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amec amecVar6 = (amec) createBuilder.b;
                amdzVar6.getClass();
                amecVar6.e = amdzVar6;
                amecVar6.b |= 8;
            }
            if (i6 == 2 || i6 == 6) {
                ameb M2 = messagePartCoreData.M();
                if (!((mho) this.x.b()).al()) {
                    ((mho) this.x.b()).r();
                } else {
                    int ordinal = M2.ordinal();
                    if (ordinal != 34) {
                        if (ordinal != 46 && ordinal != 42 && ordinal != 43) {
                            switch (ordinal) {
                                case 3:
                                case 4:
                                case 5:
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                    i5 = 6;
                                    break;
                                case 10:
                                    i5 = 5;
                                    break;
                                case 11:
                                    break;
                                default:
                                    switch (ordinal) {
                                        case 26:
                                        case 27:
                                        case 28:
                                            break;
                                        default:
                                            i5 = 1;
                                            break;
                                    }
                            }
                            i5 = 8;
                        }
                    } else {
                        i5 = 9;
                    }
                    if (i5 != 1) {
                        amfq amfqVar = (amfq) amfr.a.createBuilder();
                        aozy createBuilder4 = amga.a.createBuilder();
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apag apagVar = createBuilder4.b;
                        amga amgaVar = (amga) apagVar;
                        amgaVar.c = 3;
                        amgaVar.b = 1 | amgaVar.b;
                        if (!apagVar.isMutable()) {
                            createBuilder4.u();
                        }
                        amga amgaVar2 = (amga) createBuilder4.b;
                        amgaVar2.d = i5 - 1;
                        amgaVar2.b = 2 | amgaVar2.b;
                        if (!amfqVar.b.isMutable()) {
                            amfqVar.u();
                        }
                        amfr amfrVar = (amfr) amfqVar.b;
                        amga amgaVar3 = (amga) createBuilder4.s();
                        amgaVar3.getClass();
                        amfrVar.t = amgaVar3;
                        amfrVar.b |= 8192;
                        ((maq) this.q.b()).j(amfqVar);
                        continue;
                    }
                }
            }
            arrayList.add((amec) createBuilder.s());
        }
        aozy createBuilder5 = amgw.a.createBuilder();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        amgw amgwVar = (amgw) createBuilder5.b;
        amgwVar.a();
        aoyj.addAll(arrayList, amgwVar.b);
        return (amgw) createBuilder5.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x003a, code lost:
    
        if (r13 != 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x003e, code lost:
    
        if (r12 == 3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0ab2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.amgl r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 2758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mie.k(amgl, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x065b, code lost:
    
        if (r13 != 1) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0695  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aozy l(int r13) {
        /*
            Method dump skipped, instructions count: 1701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mie.l(int):aozy");
    }
}
