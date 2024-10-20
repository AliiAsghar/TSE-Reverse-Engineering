package defpackage;

import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysj {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamGrpc");
    public static final utz b = uuh.i(uuh.b, "send_raw_normalized_destination_for_group_member", true);
    public static final alhr c = uuh.y("tachyon_spam_grpc_droid_guard_content_binding_v2");
    public static final alhr d = uuh.y("tachyon_spam_grpc_droid_guard_content_binding_v3");
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final arpi l;
    private final armf m;
    private final armf n;
    private final armf o;

    static {
        uuh.y("tachyon_spam_grpc_send_protocol_for_enforcement_signal");
    }

    public ysj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, arpi arpiVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        arpiVar.getClass();
        this.e = armfVar;
        this.m = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
        this.n = armfVar9;
        this.o = armfVar10;
        this.l = arpiVar;
    }

    public static /* synthetic */ Object h(ysj ysjVar, arpe arpeVar) {
        return ysjVar.b(false, arpeVar);
    }

    public static final String i(String str, String str2) {
        str.getClass();
        str2.getClass();
        int i = ambp.a;
        return ambn.a.c(str2.concat(str), StandardCharsets.UTF_8).toString();
    }

    public static /* synthetic */ Object j(ysj ysjVar, askx askxVar, ParticipantsTable.BindData bindData, List list, ysp yspVar, ypn ypnVar, apzk apzkVar, arpe arpeVar, int i) {
        List list2;
        apzk apzkVar2;
        if ((i & 4) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i & 32) != 0) {
            apzkVar2 = null;
        } else {
            apzkVar2 = apzkVar;
        }
        return arro.q(ysjVar.l, new ysi(askxVar, bindData, ysjVar, list2, yspVar, ypnVar, apzkVar2, null), arpeVar);
    }

    public static final long k(long j) {
        return TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j));
    }

    public static final aqhr n(MessageCoreData messageCoreData, aqfn aqfnVar, aqfn aqfnVar2, String str, int i) {
        int x = yyb.x(messageCoreData.d());
        aozy createBuilder = aqhr.a.createBuilder();
        createBuilder.getClass();
        aojh aojhVar = new aojh(createBuilder);
        aozy aozyVar = (aozy) aojhVar.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqhr aqhrVar = (aqhr) aozyVar.b;
        aqhrVar.f = aqfnVar;
        int i2 = 1;
        aqhrVar.b |= 1;
        aozy aozyVar2 = (aozy) aojhVar.a;
        if (!aozyVar2.b.isMutable()) {
            aozyVar2.u();
        }
        aqhr aqhrVar2 = (aqhr) aozyVar2.b;
        aqhrVar2.g = aqfnVar2;
        aqhrVar2.b |= 2;
        apct a2 = ytf.a(k(messageCoreData.n()));
        a2.getClass();
        aozy aozyVar3 = (aozy) aojhVar.a;
        if (!aozyVar3.b.isMutable()) {
            aozyVar3.u();
        }
        aqhr aqhrVar3 = (aqhr) aozyVar3.b;
        aqhrVar3.h = a2;
        aqhrVar3.b |= 8;
        aozy aozyVar4 = (aozy) aojhVar.a;
        if (!aozyVar4.b.isMutable()) {
            aozyVar4.u();
        }
        ((aqhr) aozyVar4.b).j = a.am(x);
        if (messageCoreData.d() == 3) {
            messageCoreData.E().g(new ytq(aojhVar, i2));
        }
        if (str != null) {
            aozy aozyVar5 = (aozy) aojhVar.a;
            if (!aozyVar5.b.isMutable()) {
                aozyVar5.u();
            }
            aqhr aqhrVar4 = (aqhr) aozyVar5.b;
            aqhrVar4.c = 8;
            aqhrVar4.d = str;
        }
        aozy aozyVar6 = (aozy) aojhVar.a;
        if (!aozyVar6.b.isMutable()) {
            aozyVar6.u();
        }
        ((aqhr) aozyVar6.b).i = a.as(i);
        apag s = ((aozy) aojhVar.a).s();
        s.getClass();
        return (aqhr) s;
    }

    public final aqfn a(String str) {
        asku askuVar;
        aozy createBuilder = aqfn.a.createBuilder();
        createBuilder.getClass();
        xze xzeVar = xca.a;
        if (msx.g(str)) {
            askuVar = asku.EMAIL;
        } else {
            if (msx.i(str)) {
                askuVar = asku.SHORT_CODE;
            } else if (((xca) this.m.b()).h(str)) {
                askuVar = asku.PHONE_NUMBER;
            } else {
                askuVar = asku.NOT_KNOWN;
            }
        }
        aqam.i(askuVar, createBuilder);
        if (str == null) {
            str = "-1";
        }
        aqam.h(str, createBuilder);
        aqam.j(createBuilder);
        return aqam.g(createBuilder);
    }

    public final Object b(boolean z, arpe arpeVar) {
        return arro.q(this.l, new ysc(this, z, null), arpeVar);
    }

    public final Object c(String str, arpe arpeVar) {
        yso ysoVar = (yso) this.j.b();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("REQUEST_ID", str);
        return ysoVar.b(arrayMap, "tachyon_registration", arpeVar);
    }

    public final Object d(aqhg aqhgVar, String str, apzk apzkVar, arpe arpeVar) {
        String str2;
        String str3;
        yso ysoVar = (yso) this.j.b();
        apct apctVar = aqhgVar.f;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        apctVar.getClass();
        String valueOf = String.valueOf(aoue.m(apctVar).toEpochMilli());
        armo[] armoVarArr = new armo[4];
        askx b2 = askx.b(aqhgVar.c);
        if (b2 == null) {
            b2 = askx.UNRECOGNIZED;
        }
        armo armoVar = new armo(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i(valueOf, b2.name()));
        int i = 0;
        armoVarArr[0] = armoVar;
        aqfn aqfnVar = aqhgVar.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        String str4 = aqfnVar.c;
        str4.getClass();
        armoVarArr[1] = new armo("reported_id", i(valueOf, str4));
        armoVarArr[2] = new armo("reporter_id", i(valueOf, str));
        armoVarArr[3] = new armo("salt", i(valueOf, ""));
        Map n = aqjn.n(armoVarArr);
        askx b3 = askx.b(aqhgVar.c);
        if (b3 == null) {
            b3 = askx.UNRECOGNIZED;
        }
        if (b3 == askx.USER_MARKED_AS_SPAM) {
            for (aqhr aqhrVar : aqhgVar.e) {
                int i2 = i + 1;
                String bV = a.bV(i, "content_");
                aqfn aqfnVar2 = aqhrVar.f;
                if (aqfnVar2 == null) {
                    aqfnVar2 = aqfn.a;
                }
                String str5 = aqfnVar2.c;
                if (aqhrVar.c != 8) {
                    str3 = "";
                } else {
                    str3 = (String) aqhrVar.d;
                }
                n.put(bV, i(valueOf, a.co(str3, str5, ":")));
                i = i2;
            }
        }
        if ((aqhgVar.b & 64) != 0) {
            if (((Boolean) ((utz) d.get()).e()).booleanValue()) {
                aqfn aqfnVar3 = aqhgVar.j;
                if (aqfnVar3 == null) {
                    aqfnVar3 = aqfn.a;
                }
                if (!d.F(aqfnVar3.c, "")) {
                    aqfn aqfnVar4 = aqhgVar.j;
                    if (aqfnVar4 == null) {
                        aqfnVar4 = aqfn.a;
                    }
                    String str6 = aqfnVar4.c;
                    str6.getClass();
                    n.put("group_id", i(valueOf, str6));
                }
            } else {
                aqfn aqfnVar5 = aqhgVar.j;
                if (aqfnVar5 == null) {
                    aqfnVar5 = aqfn.a;
                }
                String str7 = aqfnVar5.c;
                str7.getClass();
                n.put("group_id", i(valueOf, str7));
            }
        }
        if (apzkVar != null) {
            int w = yyb.w(apzkVar);
            if (w != 2) {
                if (w != 3) {
                    str2 = "ALLOWLIST";
                } else {
                    str2 = "SPAM_FOLDER";
                }
            } else {
                str2 = "SHOW_WARNING";
            }
            n.put("enforcement_action_type", i(valueOf, str2));
        }
        return ysoVar.b(n, "tachyon_spam_signal", arpeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r7 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r7 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ysd
            if (r0 == 0) goto L13
            r0 = r7
            ysd r0 = (defpackage.ysd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysd r0 = new ysd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.aqil.P(r7)
            goto L4c
        L36:
            defpackage.aqil.P(r7)
            if (r6 == 0) goto L4f
            armf r6 = r5.n
            java.lang.Object r6 = r6.b()
            ynr r6 = (defpackage.ynr) r6
            r0.c = r4
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L4c
            goto L5f
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            goto L62
        L4f:
            armf r6 = r5.n
            java.lang.Object r6 = r6.b()
            ynr r6 = (defpackage.ynr) r6
            r0.c = r3
            java.lang.Object r7 = r6.e(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.String r7 = (java.lang.String) r7
        L62:
            aqfn r6 = defpackage.aqfn.a
            aozy r6 = r6.createBuilder()
            r6.getClass()
            asku r0 = defpackage.asku.OPAQUE_ID
            defpackage.aqam.i(r0, r6)
            defpackage.aqam.h(r7, r6)
            defpackage.aqam.j(r6)
            aqfn r6 = defpackage.aqam.g(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysj.e(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r7 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        if (r7 == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yse
            if (r0 == 0) goto L13
            r0 = r7
            yse r0 = (defpackage.yse) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yse r0 = new yse
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.aqil.P(r7)
            goto L4c
        L36:
            defpackage.aqil.P(r7)
            if (r6 == 0) goto L4f
            armf r6 = r5.n
            java.lang.Object r6 = r6.b()
            ynr r6 = (defpackage.ynr) r6
            r0.c = r4
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L4c
            goto L5f
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            goto L62
        L4f:
            armf r6 = r5.n
            java.lang.Object r6 = r6.b()
            ynr r6 = (defpackage.ynr) r6
            r0.c = r3
            java.lang.Object r7 = r6.e(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.String r7 = (java.lang.String) r7
        L62:
            aqge r6 = defpackage.aqge.a
            aozy r6 = r6.createBuilder()
            r6.getClass()
            aqgd r0 = defpackage.aqgd.a
            aozy r0 = r0.createBuilder()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            aozb r7 = defpackage.aozb.x(r7, r1)
            apag r1 = r0.b
            boolean r1 = r1.isMutable()
            if (r1 != 0) goto L82
            r0.u()
        L82:
            apag r1 = r0.b
            aqgd r1 = (defpackage.aqgd) r1
            r1.b = r7
            utz r7 = defpackage.ynr.a
            java.lang.Object r7 = r7.e()
            r7.getClass()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            apag r1 = r0.b
            boolean r1 = r1.isMutable()
            if (r1 != 0) goto La2
            r0.u()
        La2:
            apag r1 = r0.b
            aqgd r1 = (defpackage.aqgd) r1
            r1.c = r7
            apag r7 = r0.s()
            aqgd r7 = (defpackage.aqgd) r7
            r7.getClass()
            apag r0 = r6.b
            boolean r0 = r0.isMutable()
            if (r0 != 0) goto Lbc
            r6.u()
        Lbc:
            apag r0 = r6.b
            aqge r0 = (defpackage.aqge) r0
            r0.c = r7
            int r7 = r0.b
            r7 = r7 | r4
            r0.b = r7
            apag r6 = r6.s()
            r6.getClass()
            aqge r6 = (defpackage.aqge) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysj.f(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r11, defpackage.ysp r12, defpackage.apzk r13, defpackage.ypn r14, defpackage.arpe r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.ysh
            if (r0 == 0) goto L13
            r0 = r15
            ysh r0 = (defpackage.ysh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysh r0 = new ysh
            r0.<init>(r10, r15)
        L18:
            r8 = r0
            java.lang.Object r15 = r8.a
            arpl r0 = defpackage.arpl.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.aqil.P(r15)
            goto L46
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.aqil.P(r15)
            askx r15 = defpackage.askx.DEVICE_SPAM_SIGNAL
            r8.c = r2
            r4 = 0
            r9 = 4
            r1 = r10
            r2 = r15
            r3 = r11
            r5 = r12
            r6 = r14
            r7 = r13
            java.lang.Object r15 = j(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r15 != r0) goto L46
            return r0
        L46:
            aqhi r15 = (defpackage.aqhi) r15
            arnb r11 = defpackage.arnb.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysj.g(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, ysp, apzk, ypn, arpe):java.lang.Object");
    }

    public final void l(aozy aozyVar, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        ynt b2 = ((ynr) this.n.b()).b(conversationIdType, messageIdType);
        if (b2 == null) {
            return;
        }
        aozy createBuilder = apeh.a.createBuilder();
        createBuilder.getClass();
        String h = b2.h();
        if (h != null && h.length() != 0) {
            String h2 = b2.h();
            h2.getClass();
            aozb M = yyb.M(h2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apeh apehVar = (apeh) createBuilder.b;
            apehVar.b |= 2;
            apehVar.d = M;
        }
        String k = b2.k();
        if (k != null && k.length() != 0) {
            String k2 = b2.k();
            k2.getClass();
            aozb M2 = yyb.M(k2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apeh apehVar2 = (apeh) createBuilder.b;
            apehVar2.b |= 1;
            apehVar2.c = M2;
        }
        apeh apehVar3 = (apeh) createBuilder.s();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apek apekVar = (apek) aozyVar.b;
        apek apekVar2 = apek.a;
        apehVar3.getClass();
        apekVar.l = apehVar3;
        apekVar.b |= 512;
    }

    public final void m(aozy aozyVar) {
        String u = ((yjy) this.o.b()).j().u();
        u.getClass();
        if (u.length() > 0) {
            aozy createBuilder = apeg.a.createBuilder();
            String aq = albo.aq(u);
            aq.getClass();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apeg apegVar = (apeg) createBuilder.b;
            apegVar.b |= 1;
            apegVar.c = aq;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apek apekVar = (apek) aozyVar.b;
            apeg apegVar2 = (apeg) createBuilder.s();
            apek apekVar2 = apek.a;
            apegVar2.getClass();
            apekVar.f = apegVar2;
            apekVar.b |= 8;
        }
    }
}
