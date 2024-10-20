package defpackage;

import android.util.Patterns;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqw implements qpj, qqr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher");
    static final utz b = uuh.n(uuh.b, "use_guessed_min_match_value", false);
    static final utz c = uuh.i(uuh.b, "crash_on_conversation_creation_mismatch", false);
    public final anen d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    private final armf l;
    private final anen m;
    private final apwt n;
    private final ahqr o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;
    private final armf u;

    public qqw(armf armfVar, anen anenVar, anen anenVar2, apwt apwtVar, armf armfVar2, ahqr ahqrVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14) {
        this.l = armfVar;
        this.m = anenVar;
        this.d = anenVar2;
        this.n = apwtVar;
        this.e = armfVar2;
        this.o = ahqrVar;
        this.i = armfVar3;
        this.p = armfVar4;
        this.f = armfVar5;
        this.q = armfVar6;
        this.g = armfVar7;
        this.r = armfVar8;
        this.s = armfVar9;
        this.t = armfVar10;
        this.u = armfVar11;
        this.j = armfVar12;
        this.k = armfVar13;
        this.h = armfVar14;
    }

    public static boolean C(ParticipantsTable.BindData bindData, String str, int i) {
        if (bindData.O() != null && qqs.e(bindData.O(), str, i)) {
            return true;
        }
        if (bindData.P() != null && qqs.e(bindData.P(), str, i)) {
            return true;
        }
        return false;
    }

    private final akul D() {
        if (((Boolean) b.e()).booleanValue()) {
            return ((qqx) this.l.b()).a().h(new qda(16), andi.a);
        }
        return qqs.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean E(smr smrVar, alog alogVar, int i, qqq qqqVar) {
        boolean z;
        ParticipantsTable.BindData[] bindDataArr = (ParticipantsTable.BindData[]) smrVar.au("participants", new ParticipantsTable.BindData[0]);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (ParticipantsTable.BindData bindData : bindDataArr) {
            if (bindData.O() != null) {
                hashMap.put(bindData.O(), bindData);
            }
            if (bindData.P() != null) {
                hashMap.put(bindData.P(), bindData);
            }
        }
        int size = alogVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) alogVar.get(i2);
            if (hashMap.containsKey(str)) {
                hashSet.add(str);
                hashSet2.add(((ParticipantsTable.BindData) hashMap.get(str)).M());
            }
        }
        for (ParticipantsTable.BindData bindData2 : bindDataArr) {
            int size2 = alogVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = (String) alogVar.get(i3);
                if (!hashSet.contains(str2) && C(bindData2, str2, i)) {
                    hashSet2.add(bindData2.M());
                    hashSet.add(str2);
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, bindData2);
                    }
                }
            }
        }
        HashSet hashSet3 = new HashSet((Collection) DesugarArrays.stream(bindDataArr).map(new qqi(3)).collect(alls.b));
        int size3 = alogVar.size();
        int i4 = 0;
        while (true) {
            if (i4 < size3) {
                String str3 = (String) alogVar.get(i4);
                if (hashSet.contains(str3)) {
                    hashSet.remove(str3);
                    if (hashMap.get(str3) != null) {
                        hashSet3.remove(((ParticipantsTable.BindData) hashMap.get(str3)).M());
                    }
                    i4++;
                } else {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!hashSet3.isEmpty() || !hashSet.isEmpty() || !z) {
            return false;
        }
        alog alogVar2 = (alog) DesugarArrays.stream(bindDataArr).map(new qqi(4)).collect(alls.a);
        alvw d = a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "isMatchingConversation", 908, "TelephonyCompatibleMatcher.java");
        ConversationIdType x = smrVar.x();
        qqn qqnVar = new qqn(qqqVar, alogVar2);
        int length = bindDataArr.length;
        alvgVar.L("ConversationMatcher#findMatchingConversation returning conversation %s because phone numbers %s (%d) participants matched phone numbers %s (%d)", x, qqnVar, Integer.valueOf(length), new qqn(qqqVar, alogVar), Integer.valueOf(alogVar.size()));
        if (length < alogVar.size()) {
            ((mbl) this.p.b()).c("Bugle.TelephonyCompatibleMatcher.FindConversation.DuplicateDestinationsInQuery");
        }
        return true;
    }

    public static int r(Optional optional) {
        if (optional.isPresent() && ((Integer) optional.get()).intValue() >= 6) {
            return ((Integer) optional.get()).intValue();
        }
        return qqs.a();
    }

    public static sne s(Function function) {
        snf e;
        qqi qqiVar = new qqi(14);
        akrh e2 = aktp.e("TelephonyCompatibleMatcher#createQueryForConversationsWithAllParticipant_dsdrGroupsFlag");
        try {
            if (ody.a()) {
                e = sni.e();
                e.w("createQueryForConversationsWithAllParticipant");
                e.h(function);
                e.i(new atkn((Object) sni.c.a, false));
                e.e(qqiVar);
                e.t(sni.c.a);
                smm smmVar = new smm(smp.a);
                taz e3 = ParticipantsTable.e();
                e3.d(new qqi(13));
                agog b2 = agoh.b(e3.b(), ParticipantsTable.c.a, (agmh) smp.d.c);
                b2.f = "participants";
                smmVar.A(b2.a());
                agog b3 = agoh.b(smmVar.b(), (agmh) smp.d.a, sni.c.a);
                b3.f = "conversation_participants";
                e.A(b3.a());
                e.q();
            } else {
                e = sni.e();
                e.w("createQueryForConversationsWithAllParticipant");
                e.h(function);
                e.i(new atkn((Object) sni.c.a, false));
                e.e(qqiVar);
                e.t(sni.c.a);
                sla a2 = sld.a();
                taz e4 = ParticipantsTable.e();
                e4.d(new qqi(9));
                agog b4 = agoh.b(e4.b(), ParticipantsTable.c.a, (agmh) sld.e.e);
                b4.f = "participants";
                a2.A(b4.a());
                agog b5 = agoh.b(a2.b(), (agmh) sld.e.d, sni.c.a);
                b5.f = "conversation_participants";
                e.A(b5.a());
                e.q();
            }
            e2.close();
            return e.b();
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static agpj u(agmh agmhVar) {
        return new agpk("substr($V, -$V)", new Object[]{agmhVar, 4});
    }

    public static String y(String str) {
        if (str.length() <= 4) {
            return str;
        }
        return str.substring(str.length() - 4);
    }

    public final void A(alog alogVar, smr smrVar, qqq qqqVar) {
        int i = 16;
        smr smrVar2 = (smr) ((sna) s(new qcr(smrVar, i)).n()).cO();
        smrVar2.getClass();
        int size = alogVar.size();
        if (!E(smrVar2, alogVar, q(), qqqVar)) {
            alvw i2 = a.i();
            i2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "checkConversationCorrectness", 407, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#checkConversationCorrectness thinks it created conversation %s for %s, but that doesn't exist", smrVar.x(), new qqn(qqqVar, alogVar));
            mbl mblVar = (mbl) this.p.b();
            int i3 = 1;
            if (size != 1) {
                i3 = 2;
            }
            mblVar.e("Bugle.TelephonyCompatibleMatcher.FindOrCreateConversation.ConversationMismatch.Count", i3);
            qpe qpeVar = (qpe) this.r.b();
            ConversationIdType x = smrVar.x();
            if (((Boolean) qpf.e.e()).booleanValue()) {
                qqq b2 = ((qxr) qpeVar.c.b()).b();
                alog n = alog.n(((rtz) qpeVar.b.b()).K(x));
                alog alogVar2 = (alog) Collection.EL.stream(n).filter(new nfp(15)).map(new qcq(14)).collect(alls.a);
                alog alogVar3 = (alog) Collection.EL.stream(n).filter(new nfp(i)).map(new qcq(15)).collect(alls.a);
                alog alogVar4 = (alog) Collection.EL.stream(n).filter(new nfp(17)).map(new qcq(16)).collect(alls.a);
                alvg alvgVar = (alvg) qpe.a.i();
                alvgVar.Z(alwk.FULL);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/conversation/match/ConversationDetailsLogger", "logAnonymousDestinationsForConversationCreationFailures", 73, "ConversationDetailsLogger.java")).K("BCM created a conversation but the query check couldn't find any conversation with matching destinations: Anonymized conversation destinations: [%s] newConversation Comparable Destinations: [%s] newConversation Normalized Destinations: [%s] newConversation Send Destinations: [%s]", qpe.a(alogVar, b2), qpe.a(alogVar2, b2), qpe.a(alogVar3, b2), qpe.a(alogVar4, b2));
            }
            if (((Boolean) c.e()).booleanValue()) {
                albo.A(false, "ConversationMatcher created a new conversation for a phone number, but the conversation doesn't actually match that phone number. Check logcat for \"BCM created a conversation but the query check couldn't find any conversation with\" for more details", new Object[0]);
            }
        }
    }

    public final boolean B(String str, int i, String[] strArr, String str2) {
        for (String str3 : strArr) {
            if (str3 != null && ((qqs) this.n.b()).f(str3.trim(), str.trim(), i, str2) != 4) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qpj
    public final /* synthetic */ smr a(msh mshVar, armf armfVar) {
        return qta.h(this, mshVar, armfVar);
    }

    @Override // defpackage.qpj
    public final smr b(String str, armf armfVar) {
        return (smr) ((agnq) this.e.b()).c("TelephonyCompatibleMatcher#findOrCreate1to1ConversationSync", new mrf(this, ((qxr) this.g.b()).b(), str, armfVar, 20));
    }

    @Override // defpackage.qpj
    public final /* synthetic */ smr c(java.util.Collection collection, armf armfVar) {
        return qta.i(this, collection, armfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qpj
    public final smr d(alog alogVar, armf armfVar) {
        if (alogVar.size() == 1) {
            return b((String) alogVar.get(0), armfVar);
        }
        return (smr) ((agnq) this.e.b()).c("TelephonyCompatibleMatcher#findOrCreateConversationSync", new mrf((Object) this, (Object) alogVar, (Object) ((qxr) this.g.b()).b(), armfVar, 19));
    }

    @Override // defpackage.qpj
    public final /* synthetic */ akul e(msh mshVar) {
        return qta.j(this, mshVar);
    }

    @Override // defpackage.qpj
    public final akul f(String str) {
        return D().h(new mmq(this, str, 17), this.m);
    }

    @Override // defpackage.qpj
    public final akul g(msh mshVar, java.util.Collection collection) {
        qqq b2 = ((qxr) this.g.b()).b();
        if (((pfs) this.q.b()).a() && ((okf) this.f.b()).a()) {
            alob alobVar = new alob();
            alobVar.h(mshVar);
            alobVar.j(collection);
            collection = alobVar.g();
        }
        Stream map = Collection.EL.stream(collection).map(new qqi(5));
        int i = alog.d;
        return D().h(new tul(this, (alog) map.collect(alls.a), b2, 1), this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qpj
    public final akul h(alog alogVar) {
        if (alogVar.size() == 1) {
            return f((String) alogVar.get(0));
        }
        return D().h(new mmq(this, alogVar, 16), this.m);
    }

    @Override // defpackage.qpj
    public final /* synthetic */ akul i(java.util.Collection collection) {
        return qta.k(this, collection);
    }

    @Override // defpackage.qpj
    public final /* synthetic */ akul j(msh mshVar, armf armfVar) {
        return qta.l(this, mshVar, armfVar);
    }

    @Override // defpackage.qpj
    public final akul k(String str, armf armfVar) {
        return aktp.ai(new rbn((Object) this, (Object) str, (Object) armfVar, 1), this.m);
    }

    @Override // defpackage.qpj
    public final /* synthetic */ Optional l(msh mshVar) {
        return qta.m(this, mshVar);
    }

    @Override // defpackage.qpj
    public final Optional m(String str) {
        return o(str).map(new qqi(12));
    }

    @Override // defpackage.qpj
    public final /* synthetic */ Optional n(msh mshVar) {
        return qta.n(this, mshVar);
    }

    @Override // defpackage.qpj
    public final Optional o(String str) {
        albo.T(!aiut.g());
        return v(str, q());
    }

    @Override // defpackage.qqr
    public final akul p(Set set) {
        if (set.isEmpty()) {
            return aktp.ag(new HashMap());
        }
        int i = 6;
        return D().i(new qdl(this, (alor) Collection.EL.stream(set).filter(new nfp(19)).collect(alls.b(new qcr(this, 17), new qqi(i), new mcb(4))), i), this.d);
    }

    public final int q() {
        if (((Boolean) b.e()).booleanValue()) {
            return r(((qqx) this.l.b()).b());
        }
        return qqs.a();
    }

    public final agpj t(agmh agmhVar, String str, String str2, qqq qqqVar) {
        agpj u = u(agmhVar);
        if (qqs.d(str)) {
            anhn anhnVar = (anhn) this.u.b();
            try {
                aodz o = anhnVar.o(str.trim(), str2);
                if (anhnVar.i(o)) {
                    str = anhnVar.p(o, anhl.E164);
                }
            } catch (anhk e) {
                alvw i = a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "maybeParseIntoNormalizedDestination", 618, "TelephonyCompatibleMatcher.java")).t("ConversationMatcher#maybeParseIntoNormalizedDestinationOrEmail failed to parse %s", new qqm(qqqVar, str));
            }
        }
        return new agpk("$V = $V", new Object[]{u, y(str)});
    }

    public final Optional v(final String str, final int i) {
        ahqq d = this.o.d();
        try {
            akrh e = aktp.e("BugleCompatibleConversationMatcher#getConversationId(recipient)");
            try {
                final String a2 = ((yjs) this.s.b()).a();
                Optional optional = (Optional) ((agnq) this.e.b()).c("BugleCompatibleConversationMatcher#getConversationId.txn", new alhr() { // from class: qqt
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
                    
                        r8 = r1.c();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
                    
                        r8 = r1.c();
                     */
                    @Override // defpackage.alhr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instructions count: 563
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqt.get():java.lang.Object");
                    }
                });
                e.close();
                return optional;
            } finally {
            }
        } finally {
            this.o.f(d, new ahka("TelephonyCompatibleMatcher#find1To1ConversationSync"), null, ahqp.SUCCESS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r14 = defpackage.qqw.a.g();
        r14.X(defpackage.alwp.a, "Bugle");
        ((defpackage.alvg) ((defpackage.alvg) r14).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findGroupConversationSyncInTransaction", 788, "TelephonyCompatibleMatcher.java")).B("ConversationMatcher#findGroupConversationSyncInTransaction failed to find any conversations matching phone numbers %s (%d)", new defpackage.qqn(r1, r13), r13.size());
        r10 = j$.util.Optional.empty();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional w(defpackage.alog r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "TelephonyCompatibleMatcher#findGroupConversationSync#withDuplicateHandling"
            int r1 = r13.size()
            r2 = 0
            r3 = 1
            if (r1 == r3) goto Lb
            goto Lc
        Lb:
            r3 = r2
        Lc:
            defpackage.d.s(r3)
            armf r1 = r12.g
            ahqr r3 = r12.o
            ahqq r3 = r3.d()
            java.lang.Object r1 = r1.b()
            qxr r1 = (defpackage.qxr) r1
            qqq r1 = r1.b()
            alvi r4 = defpackage.qqw.a
            alvw r4 = r4.f()
            alvz r5 = defpackage.alwp.a
            java.lang.String r6 = "Bugle"
            r4.X(r5, r6)
            alvg r4 = (defpackage.alvg) r4
            r5 = 759(0x2f7, float:1.064E-42)
            java.lang.String r7 = "com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher"
            java.lang.String r8 = "findGroupConversationSyncInTransaction"
            java.lang.String r9 = "TelephonyCompatibleMatcher.java"
            alvw r4 = r4.h(r7, r8, r5, r9)
            alvg r4 = (defpackage.alvg) r4
            qqn r5 = new qqn
            r5.<init>(r1, r13)
            java.lang.String r10 = "ConversationMatcher#findGroupConversationSyncInTransaction called with %s"
            r4.t(r10, r5)
            int r4 = r13.size()
            r5 = 0
            qqv r10 = new qqv     // Catch: java.lang.Throwable -> Lbd
            r10.<init>(r4, r2)     // Catch: java.lang.Throwable -> Lbd
            sne r2 = s(r10)     // Catch: java.lang.Throwable -> Lbd
            agmq r2 = r2.n()     // Catch: java.lang.Throwable -> Lbd
            sna r2 = (defpackage.sna) r2     // Catch: java.lang.Throwable -> Lbd
            alog r4 = r2.cR()     // Catch: java.lang.Throwable -> Lb3
            alur r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lb3
        L64:
            boolean r10 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb3
            if (r10 == 0) goto L7e
            java.lang.Object r10 = r4.next()     // Catch: java.lang.Throwable -> Lb3
            smr r10 = (defpackage.smr) r10     // Catch: java.lang.Throwable -> Lb3
            j$.util.Optional r10 = r12.x(r10, r13, r14, r1)     // Catch: java.lang.Throwable -> Lb3
            boolean r11 = r10.isPresent()     // Catch: java.lang.Throwable -> Lb3
            if (r11 == 0) goto L64
        L7a:
            r2.close()     // Catch: java.lang.Throwable -> Lbd
            goto La6
        L7e:
            alvi r14 = defpackage.qqw.a     // Catch: java.lang.Throwable -> Lb3
            alvw r14 = r14.g()     // Catch: java.lang.Throwable -> Lb3
            alvz r4 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Lb3
            r14.X(r4, r6)     // Catch: java.lang.Throwable -> Lb3
            alvg r14 = (defpackage.alvg) r14     // Catch: java.lang.Throwable -> Lb3
            r4 = 788(0x314, float:1.104E-42)
            alvw r14 = r14.h(r7, r8, r4, r9)     // Catch: java.lang.Throwable -> Lb3
            alvg r14 = (defpackage.alvg) r14     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "ConversationMatcher#findGroupConversationSyncInTransaction failed to find any conversations matching phone numbers %s (%d)"
            qqn r6 = new qqn     // Catch: java.lang.Throwable -> Lb3
            r6.<init>(r1, r13)     // Catch: java.lang.Throwable -> Lb3
            int r13 = r13.size()     // Catch: java.lang.Throwable -> Lb3
            r14.B(r4, r6, r13)     // Catch: java.lang.Throwable -> Lb3
            j$.util.Optional r10 = j$.util.Optional.empty()     // Catch: java.lang.Throwable -> Lb3
            goto L7a
        La6:
            ahqr r13 = r12.o
            ahka r14 = new ahka
            r14.<init>(r0)
            ahqp r0 = defpackage.ahqp.SUCCESS
            r13.f(r3, r14, r5, r0)
            return r10
        Lb3:
            r13 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r14 = move-exception
            r13.addSuppressed(r14)     // Catch: java.lang.Throwable -> Lbd
        Lbc:
            throw r13     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r13 = move-exception
            ahqr r14 = r12.o
            ahka r1 = new ahka
            r1.<init>(r0)
            ahqp r0 = defpackage.ahqp.SUCCESS
            r14.f(r3, r1, r5, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqw.w(alog, int):j$.util.Optional");
    }

    public final Optional x(smr smrVar, alog alogVar, int i, qqq qqqVar) {
        if (E(smrVar, alogVar, i, qqqVar)) {
            return Optional.ofNullable(sni.a(smrVar.x()));
        }
        return Optional.empty();
    }

    public final String z(String str) {
        int T;
        int T2;
        if (str.contains("@")) {
            str.getClass();
            if (arsd.O(str, "<") && arsd.O(str, ">") && (T = arsd.T(str, "<", 0, 6)) <= (T2 = arsd.T(str, ">", 0, 6))) {
                String substring = str.substring(T + 1, T2);
                substring.getClass();
                if (Patterns.EMAIL_ADDRESS.matcher(substring).matches()) {
                    return substring;
                }
            }
        }
        return str;
    }
}
