package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.rcs.client.messaging.MessagingResult;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wam {
    public wam() {
    }

    public static /* synthetic */ void A(Object obj) {
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amkv amkvVar = (amkv) aozyVar.b;
        amkv amkvVar2 = amkv.a;
        amkvVar.b |= 256;
        amkvVar.k = 1;
    }

    public static /* synthetic */ void B(Object obj) {
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amkv amkvVar = (amkv) aozyVar.b;
        amkv amkvVar2 = amkv.a;
        amkvVar.h = 2;
        amkvVar.b |= 32;
    }

    public static /* synthetic */ void C(Object obj) {
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amkv amkvVar = (amkv) aozyVar.b;
        amkv amkvVar2 = amkv.a;
        amkvVar.h = 3;
        amkvVar.b |= 32;
    }

    public static /* synthetic */ void D(Object obj) {
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amkv amkvVar = (amkv) aozyVar.b;
        amkv amkvVar2 = amkv.a;
        amkvVar.h = 1;
        amkvVar.b |= 32;
    }

    public static final vry E(alog alogVar, Optional optional, Optional optional2, Optional optional3) {
        return new vry(alogVar, optional, optional2, optional3);
    }

    public static agna F() {
        agmy a = agna.a();
        a.f("bugle_db");
        a.c("$primary");
        a.b(60460);
        a.g(0);
        alob alobVar = new alob();
        alobVar.h(alst.e(Integer.MIN_VALUE, 0));
        alobVar.h(alst.e(3030, 3031));
        alobVar.h(alst.e(69, 1000));
        alobVar.h(alst.e(5000, 5001));
        a.e(alobVar.g());
        a.a = new tda();
        return a.a();
    }

    public static agmh[] G() {
        return (agmh[]) sld.e.a;
    }

    public static final void H(agpc agpcVar, boolean z, yiy yiyVar, xnv xnvVar, agmh agmhVar, agmh agmhVar2, agmh agmhVar3, agmh agmhVar4) {
        String str;
        yiyVar.getClass();
        xnvVar.getClass();
        agpj I = I(agmhVar3, z);
        agpj N = N(agmhVar, agmhVar2, agmhVar3, yiyVar, xnvVar);
        if (true != z) {
            str = "DESC";
        } else {
            str = "ASC";
        }
        agpcVar.y(new agpk("$V, $V", new Object[]{I(agmhVar4, z), new agpk("$V $R, $V", new Object[]{N, str, I})}));
    }

    public static final agpj I(agmh agmhVar, boolean z) {
        String str;
        if (true != z) {
            str = "DESC";
        } else {
            str = "ASC";
        }
        return new agpk("$V $R", new Object[]{agmhVar, str});
    }

    public static final agpj J(agmh agmhVar, agmh agmhVar2, yiy yiyVar, xnv xnvVar) {
        Object apply;
        Integer valueOf;
        Object apply2;
        String str;
        yiyVar.getClass();
        xnvVar.getClass();
        int i = 1;
        if (!yig.e()) {
            return new agpk("$V", new Object[]{0});
        }
        Long l = (Long) yig.J.e();
        Long l2 = (Long) yig.K.e();
        long epochMilli = xnvVar.f().toEpochMilli();
        stz a = sub.a();
        a.w("getIsNudgeableExpression");
        apply = new sho(i).apply(sub.d);
        stv[] stvVarArr = {(stv) apply};
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (((Integer) sub.b.getOrDefault(stvVarArr[0].toString(), -1)).intValue() > intValue) {
            agnc.t("columnReference.toString()", intValue);
        }
        a.m(stvVarArr);
        apply2 = new ryu(agmhVar2, 15).apply(new sua());
        a.k(new agpw((sua) apply2));
        sty b = a.b();
        if (true != yiyVar.b) {
            str = "0";
        } else {
            str = "1";
        }
        agpk agpkVar = new agpk(str, new Object[0]);
        Long valueOf2 = Long.valueOf(epochMilli);
        return new agpk("$V AND $V AND EXISTS $V AND $V", new Object[]{new agpk("$V >= ($V + $V)", new Object[]{valueOf2, agmhVar, l}), new agpk("$V <= ($V + $V + $V)", new Object[]{valueOf2, agmhVar, l, l2}), b, agpkVar});
    }

    public static final agpj K(agmh agmhVar, xnv xnvVar, yiy yiyVar) {
        Object apply;
        Integer valueOf;
        xnvVar.getClass();
        yiyVar.getClass();
        if (ier.a()) {
            Object e = ((utz) ier.c.get()).e();
            e.getClass();
            if (!((Boolean) e).booleanValue() || yiyVar.d) {
                String monthDay = hlc.v(xnvVar).toString();
                monthDay.getClass();
                sjs a = sjv.a();
                a.w("getBirthdayExpression");
                apply = new sal(20).apply(sjv.d);
                sjo[] sjoVarArr = {(sjo) apply};
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (((Integer) sjv.b.getOrDefault(sjoVarArr[0].toString(), -1)).intValue() > intValue) {
                    agnc.t("columnReference.toString()", intValue);
                }
                a.m(sjoVarArr);
                a.c(new rbp(agmhVar, monthDay, 19));
                return new agpk("EXISTS $V", new Object[]{a.b()});
            }
        }
        return new agpk("$V", new Object[]{0});
    }

    public static final agpj L(agmh agmhVar, agmh agmhVar2, xnv xnvVar) {
        xnvVar.getClass();
        if (!abal.c()) {
            return new agpk("$V", new Object[]{0});
        }
        tgo a = tgr.a();
        a.w("getReminderNudgeExpression");
        a.c(new sal(19));
        a.d(new kzr(agmhVar, xnvVar, agmhVar2, 12, null));
        return new agpk("EXISTS $V", new Object[]{a.b()});
    }

    public static final agpj M(agmh agmhVar) {
        wtc b = ScheduledSendTable.b();
        b.w("getScheduledMessageExpression");
        b.c((wsz) ScheduledSendTable.d.g);
        b.d(new ryu(agmhVar, 14));
        return new agpk("EXISTS $V", new Object[]{b.b()});
    }

    public static final agpj N(agmh agmhVar, agmh agmhVar2, agmh agmhVar3, yiy yiyVar, xnv xnvVar) {
        char c;
        String str;
        yiyVar.getClass();
        xnvVar.getClass();
        int i = 0;
        agpk agpkVar = new agpk("WHEN 1 THEN '$R'", new Object[]{"NUDGE"});
        if (yig.d()) {
            agpkVar = new agpk("WHEN $V THEN '$R'", new Object[]{M(agmhVar3), "NONE"});
        }
        agpk agpkVar2 = new agpk("", new Object[0]);
        if (yig.e()) {
            agpkVar2 = new agpk("WHEN $V THEN '$R'", new Object[]{J(agmhVar, agmhVar2, yiyVar, xnvVar), "NUDGE"});
        }
        agpk agpkVar3 = new agpk("", new Object[0]);
        if (ier.a()) {
            agpj K = K(agmhVar3, xnvVar, yiyVar);
            if (((Boolean) ((utz) ier.c.get()).e()).booleanValue() && !yiyVar.d) {
                str = "0";
            } else {
                str = "1";
            }
            agpkVar3 = new agpk("WHEN $R AND $V THEN '$R'", new Object[]{str, K, "BIRTHDAY"});
        }
        agpk agpkVar4 = new agpk("", new Object[0]);
        if (abal.c()) {
            agpkVar4 = new agpk("WHEN $V THEN '$R'", new Object[]{L(agmhVar3, agmhVar, xnvVar), "REMINDER"});
            c = 2;
        } else {
            c = 2;
        }
        Object[] objArr = new Object[5];
        objArr[0] = agpkVar;
        objArr[1] = agpkVar4;
        objArr[c] = agpkVar3;
        objArr[3] = agpkVar2;
        objArr[4] = "NONE";
        agpk agpkVar5 = new agpk("CASE $V $V $V $V ELSE '$R' END", objArr);
        Long valueOf = Long.valueOf(hlc.t(xnvVar));
        agpk agpkVar6 = new agpk("CASE WHEN $V > $V THEN $V ELSE $V END", new Object[]{valueOf, agmhVar, valueOf, agmhVar});
        agpk agpkVar7 = new agpk("($V + $V)", new Object[]{agmhVar, (Long) yig.J.e()});
        if (((Boolean) ((utz) lpk.a.get()).e()).booleanValue()) {
            Long l = (Long) lpk.b.e();
            agpkVar7 = new agpk("($V + $V)", new Object[]{agpkVar7, new agpk("(($V / $V) * $V)", new Object[]{new agpk("($V - $V)", new Object[]{Long.valueOf(xnvVar.f().toEpochMilli()), agpkVar7}), l, l})});
        }
        tgo a = tgr.a();
        a.w("getLatestReminderTimestampSql");
        a.c(new aand(7));
        a.d(new yuq(agmhVar3, xnvVar, 9));
        a.z((String) DesugarArrays.stream(new atkn[]{new atkn(tgr.d.f, false)}).map(new tgn(i)).collect(Collectors.joining(", ")));
        a.u(1);
        return new agpk("CASE $V WHEN '$R' THEN $V WHEN '$R' THEN $V WHEN '$R' THEN $V ELSE $V END", new Object[]{agpkVar5, "REMINDER", a.b(), "BIRTHDAY", agpkVar6, "NUDGE", agpkVar7, agmhVar});
    }

    public static qei a(wbk wbkVar, wcz wczVar) {
        wcx wcxVar;
        qeh qehVar;
        wed wedVar;
        aozy createBuilder = qei.a.createBuilder();
        int i = wczVar.b;
        int k = wch.k(i);
        if (k != 0) {
            int i2 = k - 1;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (i == 2) {
                        wedVar = (wed) wczVar.c;
                    } else {
                        wedVar = wed.a;
                    }
                    String str = wedVar.c;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    qei qeiVar = (qei) createBuilder.b;
                    str.getClass();
                    qeiVar.b |= 2;
                    qeiVar.d = str;
                    int Y = a.Y(wbkVar.c);
                    if (Y != 0 && Y == 4) {
                        if (str.startsWith("sip")) {
                            str = str.substring(4);
                        }
                        int indexOf = str.indexOf(59);
                        if (indexOf >= 0) {
                            str = str.substring(0, indexOf);
                        }
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qei qeiVar2 = (qei) createBuilder.b;
                        str.getClass();
                        qeiVar2.b |= 2;
                        qeiVar2.d = str;
                    }
                } else {
                    throw new IllegalArgumentException("Conversation type not supported");
                }
            } else {
                if (i == 1) {
                    wcxVar = (wcx) wczVar.c;
                } else {
                    wcxVar = wcx.a;
                }
                String str2 = wcxVar.c;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qei qeiVar3 = (qei) createBuilder.b;
                str2.getClass();
                qeiVar3.b |= 2;
                qeiVar3.d = str2;
            }
            int i3 = wczVar.b;
            if (i3 == 1) {
                qehVar = qeh.PHONE;
            } else {
                if (i3 == 2) {
                    int i4 = wbkVar.c;
                    int Y2 = a.Y(i4);
                    if (Y2 != 0 && Y2 == 4) {
                        qehVar = qeh.BOT;
                    } else {
                        int Y3 = a.Y(i4);
                        if (Y3 != 0 && Y3 == 3) {
                            qehVar = qeh.GROUP;
                        }
                    }
                }
                qehVar = qeh.UNKNOWN_TYPE;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qei qeiVar4 = (qei) createBuilder.b;
            qeiVar4.c = qehVar.e;
            qeiVar4.b |= 1;
            return (qei) createBuilder.s();
        }
        throw null;
    }

    public static wcz b(qei qeiVar) {
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                qeh b2 = qeh.b(qeiVar.c);
                if (b2 == null) {
                    b2 = qeh.UNKNOWN_TYPE;
                }
                throw new IllegalArgumentException("ChatEndpoint type not supported: " + b2.e);
            }
            aozy createBuilder = wcz.a.createBuilder();
            aozy createBuilder2 = wed.a.createBuilder();
            String str = qeiVar.d;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            wed wedVar = (wed) createBuilder2.b;
            str.getClass();
            wedVar.b = 1 | wedVar.b;
            wedVar.c = str;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcz wczVar = (wcz) createBuilder.b;
            wed wedVar2 = (wed) createBuilder2.s();
            wedVar2.getClass();
            wczVar.c = wedVar2;
            wczVar.b = 2;
            return (wcz) createBuilder.s();
        }
        aozy createBuilder3 = wcz.a.createBuilder();
        aozy createBuilder4 = wcx.a.createBuilder();
        String str2 = qeiVar.d;
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        wcx wcxVar = (wcx) createBuilder4.b;
        str2.getClass();
        wcxVar.b |= 1;
        wcxVar.c = str2;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        wcz wczVar2 = (wcz) createBuilder3.b;
        wcx wcxVar2 = (wcx) createBuilder4.s();
        wcxVar2.getClass();
        wczVar2.c = wcxVar2;
        wczVar2.b = 1;
        return (wcz) createBuilder3.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wbk c(defpackage.qei r6, java.lang.String r7) {
        /*
            wbk r0 = defpackage.wbk.a
            aozy r0 = r0.createBuilder()
            wcz r1 = b(r6)
            apag r2 = r0.b
            boolean r2 = r2.isMutable()
            if (r2 != 0) goto L15
            r0.u()
        L15:
            apag r2 = r0.b
            wbk r2 = (defpackage.wbk) r2
            r1.getClass()
            r2.d = r1
            int r1 = r2.b
            r3 = 2
            r1 = r1 | r3
            r2.b = r1
            wcy r1 = defpackage.wcy.a
            aozy r1 = r1.createBuilder()
            apag r2 = r1.b
            boolean r2 = r2.isMutable()
            if (r2 != 0) goto L35
            r1.u()
        L35:
            apag r2 = r1.b
            wcy r2 = (defpackage.wcy) r2
            r7.getClass()
            int r4 = r2.b
            r5 = 1
            r4 = r4 | r5
            r2.b = r4
            r2.c = r7
            apag r7 = r0.b
            boolean r7 = r7.isMutable()
            if (r7 != 0) goto L4f
            r0.u()
        L4f:
            apag r7 = r0.b
            wbk r7 = (defpackage.wbk) r7
            apag r1 = r1.s()
            wcy r1 = (defpackage.wcy) r1
            r1.getClass()
            r7.e = r1
            int r1 = r7.b
            r2 = 4
            r1 = r1 | r2
            r7.b = r1
            int r6 = r6.c
            qeh r6 = defpackage.qeh.b(r6)
            if (r6 != 0) goto L6e
            qeh r6 = defpackage.qeh.UNKNOWN_TYPE
        L6e:
            int r6 = r6.ordinal()
            if (r6 == 0) goto L80
            if (r6 == r5) goto L81
            r7 = 3
            if (r6 == r3) goto L7e
            if (r6 == r7) goto L7c
            goto L80
        L7c:
            r3 = r2
            goto L81
        L7e:
            r3 = r7
            goto L81
        L80:
            r3 = r5
        L81:
            apag r6 = r0.b
            boolean r6 = r6.isMutable()
            if (r6 != 0) goto L8c
            r0.u()
        L8c:
            apag r6 = r0.b
            wbk r6 = (defpackage.wbk) r6
            int r3 = r3 + (-1)
            r6.c = r3
            int r7 = r6.b
            r7 = r7 | r5
            r6.b = r7
            apag r6 = r0.s()
            wbk r6 = (defpackage.wbk) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wam.c(qei, java.lang.String):wbk");
    }

    public static qeg d(wcq wcqVar) {
        qef qefVar;
        qee qeeVar;
        aozy createBuilder = qeg.a.createBuilder();
        wbr b = wbr.b(wcqVar.c);
        if (b == null) {
            b = wbr.ERROR_CODE_UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                qefVar = qef.UNKNOWN_STATUS;
            } else {
                wdg wdgVar = wcqVar.e;
                if (wdgVar == null) {
                    wdgVar = wdg.a;
                }
                int Y = a.Y(wdgVar.c);
                if (Y != 0 && Y == 2) {
                    qefVar = qef.FAILED_TRANSIENTLY;
                } else {
                    qefVar = qef.FAILED_PERMANENTLY;
                }
            }
        } else {
            qefVar = qef.OK;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeg qegVar = (qeg) createBuilder.b;
        qegVar.c = qefVar.f;
        qegVar.b |= 1;
        wbq b2 = wbq.b(wcqVar.d);
        if (b2 == null) {
            b2 = wbq.ERROR_CAUSE_UNKNOWN;
        }
        switch (b2) {
            case ERROR_CAUSE_UNKNOWN:
                qeeVar = qee.UNKNOWN_CAUSE;
                break;
            case ERROR_CAUSE_GROUP_TOO_FEW_PARTICIPANTS:
                qeeVar = qee.GROUP_TOO_FEW_PARTICIPANTS;
                break;
            case ERROR_CAUSE_GROUP_TOO_MANY_PARTICIPANTS:
                qeeVar = qee.GROUP_TOO_MANY_PARTICIPANTS;
                break;
            case ERROR_CAUSE_USER_NOT_A_GROUP_PARTICIPANT:
            case ERROR_CAUSE_NOT_AUTHORIZED_TO_RESTART_GROUP:
                qeeVar = qee.USER_NOT_A_GROUP_PARTICIPANT;
                break;
            case ERROR_CAUSE_GROUP_SESSION_NOT_FOUND:
                qeeVar = qee.GROUP_NOT_FOUND;
                break;
            case ERROR_CAUSE_LOW_PRIORITY_MESSAGE_REJECTED:
                qeeVar = qee.LOW_PRIORITY_MESSAGE_REJECTED;
                break;
            case ERROR_CAUSE_TRANSPORT_INTERNAL_ERROR:
                qeeVar = qee.TRANSPORT_INTERNAL_ERROR;
                break;
            default:
                qeeVar = qee.UNKNOWN_CAUSE;
                break;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeg qegVar2 = (qeg) createBuilder.b;
        qegVar2.d = qeeVar.p;
        qegVar2.b |= 2;
        return (qeg) createBuilder.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object e(Object obj) {
        wxl wxlVar = (wxl) obj;
        int ordinal = wxlVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return wcp.FALLBACK_NOT_ALLOWED;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(wxlVar.toString()));
                }
                return wcp.FALLBACK_REQUIRED;
            }
            return wcp.FALLBACK_DEFAULT;
        }
        return wcp.FALLBACK_UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object f(Object obj) {
        wcp wcpVar = (wcp) obj;
        int ordinal = wcpVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return wxl.FALLBACK_NOT_ALLOWED;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(wcpVar.toString()));
                }
                return wxl.FALLBACK_REQUIRED;
            }
            return wxl.FALLBACK_DEFAULT;
        }
        return wxl.FALLBACK_UNKNOWN;
    }

    public static final qeg g(MessagingResult messagingResult) {
        qef qefVar;
        int b;
        qee qeeVar;
        aozy createBuilder = qeg.a.createBuilder();
        if (messagingResult.equals(MessagingResult.d)) {
            qefVar = qef.OK;
        } else if (messagingResult.equals(MessagingResult.e)) {
            qefVar = qef.PENDING;
        } else if (messagingResult.equals(MessagingResult.f)) {
            qefVar = qef.FAILED_PERMANENTLY;
        } else if (aczx.s() && ((b = messagingResult.b()) == 14 || b == 15)) {
            qefVar = qef.FAILED_PERMANENTLY;
        } else {
            qefVar = qef.FAILED_TRANSIENTLY;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeg qegVar = (qeg) createBuilder.b;
        qegVar.c = qefVar.f;
        qegVar.b |= 1;
        int a = messagingResult.a();
        if (aczx.s()) {
            switch (a) {
                case 1:
                    qeeVar = qee.GROUP_TOO_FEW_PARTICIPANTS;
                    break;
                case 2:
                    qeeVar = qee.GROUP_TOO_MANY_PARTICIPANTS;
                    break;
                case 3:
                case 5:
                    qeeVar = qee.USER_NOT_A_GROUP_PARTICIPANT;
                    break;
                case 4:
                    qeeVar = qee.GROUP_NOT_FOUND;
                    break;
                case 6:
                    qeeVar = qee.LOW_PRIORITY_MESSAGE_REJECTED;
                    break;
                case 7:
                    qeeVar = qee.TRANSPORT_INTERNAL_ERROR;
                    break;
                default:
                    qeeVar = qee.UNKNOWN_CAUSE;
                    break;
            }
        } else {
            qeeVar = qee.UNKNOWN_CAUSE;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeg qegVar2 = (qeg) createBuilder.b;
        qegVar2.d = qeeVar.p;
        qegVar2.b |= 2;
        return (qeg) createBuilder.s();
    }

    public static final qga h(MessagingResult messagingResult) {
        boolean z;
        if (messagingResult.b() != 14 && messagingResult.b() != 16) {
            z = false;
        } else {
            z = true;
        }
        aozy createBuilder = qga.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qga qgaVar = (qga) createBuilder.b;
        qgaVar.b = 1 | qgaVar.b;
        qgaVar.c = z;
        aozn i = aotl.i(messagingResult.c());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qga qgaVar2 = (qga) createBuilder.b;
        i.getClass();
        qgaVar2.d = i;
        qgaVar2.b |= 2;
        return (qga) createBuilder.s();
    }

    public static Optional i(apwq apwqVar, vxt vxtVar, String str) {
        if (apwqVar == null) {
            return Optional.empty();
        }
        vxtVar.getClass();
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(apwqVar.b).entrySet()) {
            if (albo.ar(vxtVar.m, (String) entry.getKey())) {
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((apws) entry.getValue()).b).entrySet()) {
                    if (albo.ar(str, (String) entry2.getKey())) {
                        return Optional.of((String) entry2.getValue());
                    }
                }
            }
        }
        return Optional.empty();
    }

    public static final /* synthetic */ vwk j(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (vwk) s;
    }

    public static final void k(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        vwk vwkVar = (vwk) aozyVar.b;
        vwk vwkVar2 = vwk.a;
        vwkVar.e = i;
    }

    public static final void l(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        vwk vwkVar = (vwk) aozyVar.b;
        vwk vwkVar2 = vwk.a;
        vwkVar.b = str;
    }

    public static final void m(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        vwk vwkVar = (vwk) aozyVar.b;
        vwk vwkVar2 = vwk.a;
        vwkVar.f = i;
    }

    public static final /* synthetic */ void n(Iterable iterable, aozy aozyVar) {
        iterable.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        vwk vwkVar = (vwk) aozyVar.b;
        vwk vwkVar2 = vwk.a;
        apax apaxVar = vwkVar.c;
        if (!apaxVar.c()) {
            vwkVar.c = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, vwkVar.c);
    }

    public static final void o(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        vwk vwkVar = (vwk) aozyVar.b;
        vwk vwkVar2 = vwk.a;
        vwkVar.d = a.ap(i);
    }

    public static final void p(aozy aozyVar) {
        DesugarCollections.unmodifiableList(((vwk) aozyVar.b).c).getClass();
    }

    public static /* synthetic */ String q(int i) {
        if (i != 2) {
            if (i != 3) {
                return "UNRECOGNIZED";
            }
            return "TELEPHONY";
        }
        return "UNKNOWN";
    }

    public static final syc r() {
        syc sycVar = new syc();
        sycVar.K();
        sycVar.b(new vvi(0), new vvi(2));
        sycVar.x(1, 2);
        return sycVar;
    }

    public static final boolean s(String str, String str2, tqh tqhVar) {
        if (str.isEmpty() && tqhVar == tqh.NAME_IS_AUTOMATIC) {
            return false;
        }
        if (!str.isEmpty() && tqhVar == tqh.NAME_IS_MANUAL && str.equals(str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean t(msh mshVar, List list) {
        Optional e;
        qei qeiVar;
        String str = null;
        if (mshVar != null && (e = mshVar.e()) != null && (qeiVar = (qei) arsd.k(e)) != null) {
            str = qeiVar.d;
        }
        if (mshVar == null || list.isEmpty()) {
            return false;
        }
        alur it = ((alog) list).iterator();
        while (it.hasNext()) {
            if (d.F(((ParticipantsTable.BindData) it.next()).O(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int u(List list, Set set) {
        int i = 0;
        alpt alptVar = (alpt) Collection.EL.stream(set).map(new vte(vnk.f, i)).collect(alls.b);
        if (!list.isEmpty()) {
            alur it = ((alog) list).iterator();
            while (it.hasNext()) {
                if (alptVar.contains(((ParticipantsTable.BindData) it.next()).O()) && (i = i + 1) < 0) {
                    aqjn.F();
                }
            }
        }
        return i;
    }

    public static final boolean v(msh mshVar, List list) {
        Optional e;
        qei qeiVar;
        String str = null;
        if (mshVar != null && (e = mshVar.e()) != null && (qeiVar = (qei) arsd.k(e)) != null) {
            str = qeiVar.d;
        }
        if (mshVar == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (d.F(((qei) it.next()).d, str)) {
                return true;
            }
        }
        return false;
    }

    public static final int w(List list, Set set) {
        int i = 0;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (set.contains((qei) it.next()) && (i = i + 1) < 0) {
                    aqjn.F();
                }
            }
        }
        return i;
    }

    public static final /* synthetic */ vso x(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (vso) s;
    }

    public static final /* synthetic */ vsn y(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (vsn) s;
    }

    public static final void z(vso vsoVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        vsn vsnVar = (vsn) aozyVar.b;
        vsn vsnVar2 = vsn.a;
        vsnVar.c = vsoVar;
        vsnVar.b = 11;
    }

    public wam(armf armfVar) {
        armfVar.getClass();
    }
}
