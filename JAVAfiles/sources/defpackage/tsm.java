package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.BaseCryptoBuilder;
import com.google.communication.synapse.security.scytale.KeyPair;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashSet;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tsm implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ tsm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ancs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig defaultInstance;
        int i = 5;
        int i2 = 10;
        int i3 = 19;
        int i4 = 20;
        int i5 = 0;
        byte[] bArr = null;
        int i6 = 1;
        switch (this.c) {
            case 0:
                final Optional optional = (Optional) obj;
                Object obj2 = this.a;
                final tsp tspVar = (tsp) obj2;
                akul b = ((ttj) tspVar.i.b()).b((String) optional.map(new tgn(14)).orElse(""));
                final ConversationIdType conversationIdType = (ConversationIdType) this.b;
                return b.i(new ancs() { // from class: tsn
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj3) {
                        HashSet hashSet;
                        alpt alptVar;
                        akul c;
                        String str;
                        qei qeiVar;
                        String str2;
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        final tsp tspVar2 = tsp.this;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        qei qeiVar2 = null;
                        if (!booleanValue) {
                            tspVar2.j(conversationIdType2, uax.DOWNGRADE_E2EE_NOT_PROVISIONED);
                            return aktp.ag(null);
                        }
                        qei qeiVar3 = (qei) optional.orElse(null);
                        boolean booleanValue2 = ((Boolean) new mss(11).get()).booleanValue();
                        final alog t = ush.h(conversationIdType2).t();
                        if (t.isEmpty()) {
                            tsp.b.l("Conversation participant not found");
                            return aktp.ag(null);
                        }
                        rto z = ((uac) tspVar2.g.b()).z(conversationIdType2);
                        if (z == null) {
                            xyo e = tsp.b.e();
                            e.H("Conversation doesn't exist");
                            e.z("conversationId", conversationIdType2);
                            e.q();
                            return aktp.ag(null);
                        }
                        alsx alsxVar = (alsx) t;
                        if (alsxVar.c <= 1 && !z.S()) {
                            HashSet hashSet2 = new HashSet();
                            if (booleanValue2) {
                                hashSet2 = tspVar2.g(conversationIdType2, t);
                            }
                            HashSet h = tspVar2.h(conversationIdType2, t);
                            if (!booleanValue2 ? h.isEmpty() : hashSet2.isEmpty()) {
                                return aktp.ag(null);
                            }
                            if (booleanValue2 && h.isEmpty()) {
                                str = "";
                            } else {
                                str = (String) h.iterator().next();
                            }
                            if (booleanValue2) {
                                qeiVar = (qei) hashSet2.iterator().next();
                            } else {
                                qeiVar = null;
                            }
                            if (booleanValue2 && qeiVar != null) {
                                str2 = qeiVar.d;
                            } else {
                                str2 = str;
                            }
                            thm a = thu.a(str2);
                            if (a == null) {
                                return tspVar2.a(qeiVar3, conversationIdType2, str, qeiVar, amkd.FIRST_CONVERSATION_OPEN);
                            }
                            if (tspVar2.c.f().isAfter(a.h().plus(Duration.ofMillis(((Long) utw.P.e()).longValue())))) {
                                xyo a2 = tsp.b.a();
                                a2.H("Refreshing remote instance data that is stale");
                                a2.z("conversationId", conversationIdType2);
                                a2.q();
                                return tspVar2.a(qeiVar3, conversationIdType2, str, qeiVar, amkd.STALE_CONVERSATION_OPEN);
                            }
                            if (((nib) tspVar2.p.b()).a()) {
                                xyo a3 = tsp.b.a();
                                a3.H("Remote instance data is still fresh. Not refreshing.");
                                a3.z("conversationId", conversationIdType2);
                                a3.q();
                                return tspVar2.b(conversationIdType2, str, qeiVar);
                            }
                            xyo a4 = tsp.b.a();
                            a4.H("Remote instance data is still fresh. Not refreshing.");
                            a4.z("conversationId", conversationIdType2);
                            a4.q();
                            Optional f = tsp.f(str, qeiVar);
                            if (f.isPresent()) {
                                return tspVar2.c(conversationIdType2, str, qeiVar, (sec) f.get()).h(new rgh(9), tspVar2.f);
                            }
                            return aktp.ai(new qpk(tspVar2, conversationIdType2, 15, null), tspVar2.e);
                        }
                        xyo a5 = tsp.b.a();
                        a5.H("Found group conversation");
                        a5.b(conversationIdType2);
                        a5.q();
                        if (((trz) tspVar2.j.b()).i()) {
                            if (alsxVar.c > ((trz) tspVar2.j.b()).b()) {
                                if (z.E()) {
                                    xyo c2 = tsp.b.c();
                                    c2.H("Downgrading a large conversation");
                                    c2.b(z.L());
                                    c2.q();
                                    ((mbl) tspVar2.k.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", uax.DOWNGRADE_GROUP_TOO_LARGE.t);
                                    return aktp.ai(new qpk(tspVar2, z, 13, null), tspVar2.e);
                                }
                                tsp.b.l("Skip the large group.");
                                return aktp.ag(null);
                            }
                            final boolean booleanValue3 = ((Boolean) new mss(11).get()).booleanValue();
                            final HashSet h2 = tspVar2.h(conversationIdType2, t);
                            if (booleanValue3) {
                                hashSet = tspVar2.g(conversationIdType2, t);
                            } else {
                                hashSet = new HashSet();
                            }
                            final HashSet hashSet3 = hashSet;
                            final boolean E = z.E();
                            if (!booleanValue3 ? h2.isEmpty() : hashSet3.isEmpty()) {
                                if (!E) {
                                    return aktp.ag(null);
                                }
                                xyo c3 = tsp.b.c();
                                c3.H("Taking down encryption for conversation because not all participants are valid.");
                                c3.z("conversationId", conversationIdType2);
                                c3.q();
                                return aktp.ah(new ryv(tspVar2, conversationIdType2, 4, null), tspVar2.e);
                            }
                            vcb vcbVar = (vcb) tspVar2.l.b();
                            alog n = alog.n(h2);
                            alpt alptVar2 = (alpt) Collection.EL.stream(n).filter(new uhe((alpt) Collection.EL.stream(vcbVar.d(n)).map(new vbi(9)).collect(alls.b), 4)).collect(alls.b);
                            if (booleanValue3) {
                                alpt e2 = ((vcb) tspVar2.l.b()).e(alog.n(hashSet3));
                                tspVar2.i(e2.size(), conversationIdType2);
                                alptVar = e2;
                            } else {
                                tspVar2.i(alptVar2.size(), conversationIdType2);
                                alptVar = null;
                            }
                            final String k = tspVar2.h.k();
                            if (booleanValue3) {
                                qeiVar2 = (qei) tspVar2.h.e().orElse(null);
                            }
                            qei qeiVar4 = qeiVar2;
                            if (alptVar2.isEmpty()) {
                                c = aktp.ag(new gsw());
                            } else {
                                c = tspVar2.d.c(k, qeiVar4, alptVar2, alptVar, amkd.FIRST_CONVERSATION_OPEN);
                            }
                            return c.i(new ancs() { // from class: tso
                                /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
                                
                                    r12 = false;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
                                
                                    if (r4.equals(r12) == false) goto L13;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
                                
                                    if (((defpackage.vcb) r7.l.b()).j(r12, r1, new defpackage.tgn(13)) == false) goto L13;
                                 */
                                @Override // defpackage.ancs
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r12) {
                                    /*
                                        Method dump skipped, instructions count: 322
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.tso.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                                }
                            }, tspVar2.e);
                        }
                        if (z.E()) {
                            xyo c4 = tsp.b.c();
                            c4.H("Downgrading a conversation");
                            c4.b(conversationIdType2);
                            c4.q();
                            ((mbl) tspVar2.k.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", uax.DOWNGRADE_GROUP_E2EE_FLAG_OFF.t);
                            return aktp.ai(new qpk(tspVar2, conversationIdType2, 16, null), tspVar2.e);
                        }
                        return aktp.ag(null);
                    }
                }, tspVar.e).h(new ttg(obj2, i6), tspVar.f);
            case 1:
                return this.a.a(this.b);
            case 2:
                anid anidVar = (anid) obj;
                String c = twj.c(anidVar);
                xyo a = ttb.a.a();
                a.H("Building base crypto");
                ?? r4 = this.a;
                a.w("normalizedPhoneNumber", r4, 2);
                a.z("tableNamePrefix", c);
                a.q();
                Object obj3 = this.b;
                ttb ttbVar = (ttb) obj3;
                Scope create = Scope.create(ttbVar.d.b());
                BaseCryptoBuilder createBuilder = BaseCryptoBuilder.createBuilder(ttbVar.b, new KeyPair(anidVar.a.H(), anidVar.b.H()));
                albo.C(createBuilder);
                xze xzeVar = ttd.a;
                try {
                    defaultInstance = ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.parseFrom((byte[]) ttd.e.e(), aozs.a());
                } catch (apba e) {
                    ttd.a.r("Error parsing ScytaleExperimentConfig, using default instance instead", e);
                    defaultInstance = ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.getDefaultInstance();
                }
                BaseCryptoBuilder experimentConfig = createBuilder.setExperimentConfig(defaultInstance);
                albo.C(experimentConfig);
                BaseCryptoBuilder tableNamePrefix = experimentConfig.setTableNamePrefix(c);
                albo.C(tableNamePrefix);
                StatusOr<NativeBaseCrypto> build = tableNamePrefix.build(create);
                if (!build.hasValue) {
                    aqwb aqwbVar = new aqwb(build.status);
                    if (build.status.getCode() == Status.o.getCode()) {
                        xyo a2 = ttb.a.a();
                        a2.H("Resetting database due to a data loss failure");
                        a2.w("normalizedPhoneNumber", r4, 2);
                        a2.q();
                        return ttbVar.e.D((String) r4).i(vec.LOW_PREKEYS).i(new tsm(obj3, r4, i, bArr), andi.a).h(new raw(obj3, r4, i2), andi.a).i(new tsz(aqwbVar, i5), andi.a);
                    }
                    return aktp.af(aqwbVar);
                }
                ttb.a.o("Base crypto created");
                return aktp.ag(build.value);
            case 3:
                return ((ttb) this.b).f.j((String) this.a);
            case 4:
                Throwable th = (Throwable) obj;
                ttb.a.r("Failed to create base crypto", th);
                Object obj4 = this.b;
                ConcurrentMap concurrentMap = ((ttb) obj4).c;
                Object obj5 = this.a;
                synchronized (concurrentMap) {
                    ((ttb) obj4).c.remove(obj5);
                }
                return aktp.af(th);
            case 5:
                return ((ttb) this.b).c((String) this.a);
            case 6:
                return ((ttb) this.b).a((String) this.a);
            case 7:
                return ((tth) this.b).i.b((String) this.a);
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    Object obj6 = this.b;
                    if (tte.f() || tte.g()) {
                        ((uof) ((izc) ((tth) obj6).d.b()).a.b()).b(upk.a("ftd_clean_up_work", und.a));
                    }
                    Object obj7 = this.a;
                    tth tthVar = (tth) obj6;
                    tvl tvlVar = (tvl) tthVar.g.b();
                    tvl.a.l("Checking if any prekeys are present");
                    tvlVar.d.b();
                    return tvlVar.b.a((String) obj7).h(new ttg(Scope.create(tvlVar.e.b()), i2), tvlVar.c).h(new tvd(i), andi.a).h(new ttg(obj6, i5), andi.a).e(aqwb.class, new rgh(15), tthVar.e);
                }
                return aktp.ag(false);
            case 9:
                Object obj8 = this.b;
                ttj ttjVar = (ttj) obj8;
                boolean a3 = ((okg) ttjVar.p.b()).a();
                Object obj9 = this.a;
                if (a3) {
                    return aktp.ai(new qpk(obj8, obj9, 17), ttjVar.m);
                }
                return ((vbu) ttjVar.j.b()).a().h(new raw(obj8, obj9, 11), ttjVar.m);
            case 10:
                ved vedVar = (ved) obj;
                return ((ttj) this.b).e((String) this.a, vedVar, vedVar, 7);
            case 11:
                xyo e2 = ttz.a.e();
                e2.H("Failed to create encrypted display IMDN in XML extension format.");
                e2.L("remote messaging identity destination", this.b.toString());
                e2.z("rcsMessageId", this.a);
                e2.q();
                return aktp.af((Throwable) obj);
            case 12:
                xyo e3 = ttz.a.e();
                e3.H("Failed to send an encrypted message.");
                e3.M("participants messaging identity destinations", Collection.EL.stream(this.a).map(new tgn(i4)));
                e3.z("rcsMessageId", this.b);
                e3.q();
                return aktp.af((Throwable) obj);
            case 13:
                tvf tvfVar = (tvf) obj;
                if (tvfVar.b() == 1) {
                    return aktp.ag(tvfVar.a());
                }
                return ((tum) this.a).c.a((qdk) this.b);
            case 14:
                tvf tvfVar2 = (tvf) obj;
                if (tvfVar2.b() == 1) {
                    return aktp.ag(tvfVar2.a());
                }
                return ((tum) this.a).c.a((qdk) this.b);
            case 15:
                return ((tum) this.a).b((qdk) this.b, ((Boolean) obj).booleanValue());
            case 16:
                return ((tum) this.a).b((qdk) this.b, ((Boolean) obj).booleanValue());
            case 17:
                qeg qegVar = (qeg) obj;
                qef qefVar = qef.OK;
                qef b2 = qef.b(qegVar.c);
                if (b2 == null) {
                    b2 = qef.UNKNOWN_STATUS;
                }
                Object obj10 = this.b;
                if (qefVar.equals(b2)) {
                    alvw e4 = tva.a.e();
                    e4.X(alwp.a, "BugleEtouffee");
                    alvg alvgVar = (alvg) e4;
                    alvgVar.X(ydl.f, obj10);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "restartProcessingIncomingMessage", 448, "IdentityVerificationPendingMessageProcessor.java")).q("Restoring pending message to incoming Chat API path.");
                } else {
                    mbl mblVar = (mbl) ((tva) this.a).g.b();
                    qef b3 = qef.b(qegVar.c);
                    if (b3 == null) {
                        b3 = qef.UNKNOWN_STATUS;
                    }
                    mblVar.e("Bugle.Etouffee.FailedToResumeIncomingChatApiMessageThatWasPendingVerification.Status", b3.f);
                    alvw i7 = tva.a.i();
                    i7.X(alwp.a, "BugleEtouffee");
                    alvg alvgVar2 = (alvg) i7;
                    alvgVar2.X(ydl.f, obj10);
                    alvg alvgVar3 = (alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "restartProcessingIncomingMessage", 457, "IdentityVerificationPendingMessageProcessor.java");
                    qef b4 = qef.b(qegVar.c);
                    if (b4 == null) {
                        b4 = qef.UNKNOWN_STATUS;
                    }
                    qee b5 = qee.b(qegVar.d);
                    if (b5 == null) {
                        b5 = qee.UNKNOWN_CAUSE;
                    }
                    alvgVar3.u("Failed to restore pending message to incoming Chat API path. error status: %d. error cause: %d", b4.f, b5.p);
                }
                return aktp.ag(null);
            case 18:
                NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                Object obj11 = this.b;
                Object obj12 = this.a;
                akrh e5 = aktp.e("IncomingEncryptedMessageProcessor::decryptChatMessage");
                try {
                    vqy b6 = ((tvg) obj12).b((qdk) obj11);
                    akul d = ((tvg) obj12).d(((qdk) obj11).a);
                    iji ijiVar = ((tvg) obj12).p;
                    ijiVar.getClass();
                    akul e6 = d.i(new tsz(ijiVar, 9), ((tvg) obj12).j).i(new mmc(obj12, obj11, b6, nativeMessageEncryptorV2, 13, (short[]) null), ((tvg) obj12).i).e(apba.class, new ttu(i3), ((tvg) obj12).j).e(IllegalArgumentException.class, new ttu(i4), ((tvg) obj12).j);
                    e5.close();
                    return e6;
                } catch (Throwable th2) {
                    try {
                        e5.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 19:
                tvr.a.r("Caught Throwable, failed to retrieve registration Ids from tachyon", (Throwable) obj);
                ((iji) ((tvr) this.b).d.b()).o((amkd) this.a, -1, null);
                return aktp.ag(new gsu());
            default:
                Status status = (Status) obj;
                if (status.f()) {
                    Object obj13 = this.a;
                    Object obj14 = this.b;
                    twf.a.o("Successfully set prekeys");
                    twf twfVar = (twf) obj14;
                    return ((vbs) twfVar.c.b()).d((String) obj13, 8).h(new tvd(12), twfVar.e).i(new jab(i3), twfVar.e);
                }
                xyo e7 = twf.a.e();
                e7.H("Failed to set prekeys");
                e7.z("status", status.toString());
                e7.q();
                return aktp.af(new IllegalStateException("Failed to set prekeys"));
        }
    }

    public /* synthetic */ tsm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
