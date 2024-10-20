package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.Collection;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpn implements qpj {
    public static final xze a;
    public static final alvi b;
    public static final utz c;
    public static final int d;
    public final armf e;
    public final armf f;
    public final anen g;
    private final armf h;
    private final anen i;
    private final ahqr j;

    static {
        xze g = xze.g("Bugle", "ConversationMatcherCache");
        a = g;
        b = alvi.m("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCache");
        utz i = uuh.i(uuh.b, "bcm_detailed_crash_log_on_moat", false);
        c = i;
        d = 1;
        if (((Boolean) i.e()).booleanValue()) {
            g.o("Enabling monitoring for conversations and conversations cache table");
            String[] strArr = sni.a;
            agnb.b("conversations", 1);
            String[] strArr2 = qpw.a;
            agnb.b("conversation_matcher_cache", 1);
        }
    }

    public qpn(armf armfVar, armf armfVar2, armf armfVar3, anen anenVar, anen anenVar2, ahqr ahqrVar) {
        this.h = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = anenVar;
        this.i = anenVar2;
        this.j = ahqrVar;
    }

    public static alog q(qpm qpmVar) {
        Object apply;
        qpu qpuVar = new qpu(qpw.a);
        qpuVar.w("findWithTwoQueries");
        apply = new qcr(qpmVar, 11).apply(new qpv());
        qpuVar.k(new agpw((qpv) apply));
        qpr qprVar = (qpr) qpuVar.b().m((agmh) qpw.d.c);
        try {
            alob alobVar = new alob();
            while (qprVar.moveToNext()) {
                qprVar.f();
                alobVar.h(qprVar.f());
            }
            alog g = alobVar.g();
            qprVar.close();
            return g;
        } catch (Throwable th) {
            try {
                qprVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void r(String str, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        t(new qpm(str), ((smr) optional.get()).x());
    }

    public static void s(alog alogVar, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        t(qpm.a(alogVar), ((smr) optional.get()).x());
    }

    private static void t(qpm qpmVar, ConversationIdType conversationIdType) {
        agnw d2;
        agnw d3;
        String[] strArr = qpw.a;
        int i = qaa.a;
        tof tofVar = new tof(null, null);
        tofVar.k(qpmVar.a);
        tofVar.l(d);
        tofVar.j(conversationIdType);
        qpp i2 = tofVar.i();
        d2 = agnc.d("$primary");
        d3 = agnc.d("$primary");
        agnc.a(d3, "conversation_matcher_cache", i2, new qcr(d2, 13), new qdm(i2, 5));
    }

    @Override // defpackage.qpj
    public final /* synthetic */ smr a(msh mshVar, armf armfVar) {
        return qta.h(this, mshVar, armfVar);
    }

    @Override // defpackage.qpj
    public final smr b(String str, armf armfVar) {
        albo.T(!aiut.g());
        smr p = p(new qpm(str));
        if (p != null) {
            return p;
        }
        return (smr) ((agnq) this.h.b()).c("ConversationMatcherCache#findOrCreate1to1ConversationSync", new mri(this, str, armfVar, 19));
    }

    @Override // defpackage.qpj
    public final /* synthetic */ smr c(Collection collection, armf armfVar) {
        return qta.i(this, collection, armfVar);
    }

    @Override // defpackage.qpj
    public final smr d(alog alogVar, armf armfVar) {
        albo.T(!aiut.g());
        smr p = p(qpm.a(alogVar));
        if (p != null) {
            return p;
        }
        return (smr) ((agnq) this.h.b()).c("ConversationMatcherCache#findOrCreateConversationSync", new mri(this, alogVar, armfVar, 18));
    }

    @Override // defpackage.qpj
    public final /* synthetic */ akul e(msh mshVar) {
        return qta.j(this, mshVar);
    }

    @Override // defpackage.qpj
    public final akul f(String str) {
        return aktp.ai(new qpk(this, str, 0), this.g);
    }

    @Override // defpackage.qpj
    public final akul g(msh mshVar, Collection collection) {
        return ((qpj) this.e.b()).g(mshVar, collection);
    }

    @Override // defpackage.qpj
    public final akul h(alog alogVar) {
        return aktp.ai(new qpk(this, alogVar, 2), this.g).i(new qdl(this, alogVar, 5), this.i);
    }

    @Override // defpackage.qpj
    public final /* synthetic */ akul i(Collection collection) {
        return qta.k(this, collection);
    }

    @Override // defpackage.qpj
    public final /* synthetic */ akul j(msh mshVar, armf armfVar) {
        return qta.l(this, mshVar, armfVar);
    }

    @Override // defpackage.qpj
    public final akul k(String str, armf armfVar) {
        return aktp.ai(new hbd(this, str, armfVar, 20), this.g);
    }

    @Override // defpackage.qpj
    public final /* synthetic */ Optional l(msh mshVar) {
        return qta.m(this, mshVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType] */
    @Override // defpackage.qpj
    public final Optional m(String str) {
        qpm qpmVar = new qpm(str);
        ahqq d2 = this.j.d();
        ashu ashuVar = null;
        try {
            alog q = q(qpmVar);
            if (((alsx) q).c == 1) {
                ?? r1 = (ConversationIdType) q.get(0);
                this.j.f(d2, new ahka("ConversationMatcher#findCachedConversationId"), null, ahqp.SUCCESS);
                ashuVar = r1;
            }
            if (ashuVar != null) {
                return Optional.of(ashuVar);
            }
            Optional m = ((qpj) this.e.b()).m(str);
            if (m.isPresent()) {
                t(new qpm(str), (ConversationIdType) m.get());
            }
            return m;
        } finally {
            this.j.f(d2, new ahka("ConversationMatcher#findCachedConversationId"), null, ahqp.SUCCESS);
        }
    }

    @Override // defpackage.qpj
    public final /* synthetic */ Optional n(msh mshVar) {
        return qta.n(this, mshVar);
    }

    @Override // defpackage.qpj
    public final Optional o(String str) {
        albo.T(!aiut.g());
        smr p = p(new qpm(str));
        if (p != null) {
            return Optional.of(p);
        }
        Optional o = ((qpj) this.e.b()).o(str);
        r(str, o);
        return o;
    }

    public final smr p(final qpm qpmVar) {
        ahqq d2 = this.j.d();
        try {
            return (smr) ((agnq) this.h.b()).c("ConversationMatcherCache#findCachedConversation", new alhr() { // from class: qpl
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.alhr
                public final Object get() {
                    alog alogVar;
                    String str;
                    alog q = qpn.q(qpm.this);
                    alsx alsxVar = (alsx) q;
                    if (alsxVar.c == 1) {
                        xyo a2 = qpn.a.a();
                        a2.H("BCM: Returning conversation from cache");
                        a2.b((ConversationIdType) q.get(0));
                        a2.q();
                        smr smrVar = (smr) sni.g((ConversationIdType) q.get(0), new qcq(20));
                        if (smrVar == null) {
                            if (!((Boolean) qpn.c.e()).booleanValue()) {
                                alogVar = q;
                            } else {
                                alvg alvgVar = (alvg) qpn.b.i();
                                alvgVar.Z(alwk.MEDIUM);
                                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCache", "printConversationsAndConversationsCacheEntry", 240, "ConversationMatcherCache.java")).t("BCM: Conversation found in cache but not found in ConversationsTable for conversation Id: %s", q.get(0));
                                xyo e = qpn.a.e();
                                e.H("Printing conversations");
                                e.x("Cache size", alsxVar.c);
                                e.q();
                                snf e2 = sni.e();
                                e2.w("findWithTwoQueries2");
                                alog t = e2.b().t();
                                alsx alsxVar2 = (alsx) t;
                                int i = alsxVar2.c;
                                int i2 = 0;
                                while (i2 < i) {
                                    smr smrVar2 = (smr) t.get(i2);
                                    xze xzeVar = qpn.a;
                                    String valueOf = String.valueOf(smrVar2.a);
                                    String valueOf2 = String.valueOf(smrVar2.b);
                                    String valueOf3 = String.valueOf(smrVar2.c);
                                    String valueOf4 = String.valueOf(smrVar2.d);
                                    String valueOf5 = String.valueOf(smrVar2.e);
                                    String valueOf6 = String.valueOf(smrVar2.f);
                                    String valueOf7 = String.valueOf(smrVar2.g);
                                    String valueOf8 = String.valueOf(smrVar2.h);
                                    String valueOf9 = String.valueOf(smrVar2.i);
                                    alog alogVar2 = t;
                                    String valueOf10 = String.valueOf(smrVar2.j);
                                    int i3 = i;
                                    String valueOf11 = String.valueOf(smrVar2.k);
                                    alog alogVar3 = q;
                                    String valueOf12 = String.valueOf(smrVar2.l);
                                    alsx alsxVar3 = alsxVar2;
                                    String valueOf13 = String.valueOf(smrVar2.m);
                                    int i4 = i2;
                                    String valueOf14 = String.valueOf(smrVar2.n);
                                    String valueOf15 = String.valueOf(smrVar2.o);
                                    String valueOf16 = String.valueOf(smrVar2.p);
                                    String valueOf17 = String.valueOf(smrVar2.q);
                                    String valueOf18 = String.valueOf(smrVar2.r);
                                    String valueOf19 = String.valueOf(smrVar2.s);
                                    String valueOf20 = String.valueOf(smrVar2.t);
                                    String valueOf21 = String.valueOf(smrVar2.u);
                                    String valueOf22 = String.valueOf(smrVar2.v);
                                    String valueOf23 = String.valueOf(smrVar2.w);
                                    String valueOf24 = String.valueOf(smrVar2.x);
                                    String valueOf25 = String.valueOf(smrVar2.y);
                                    String valueOf26 = String.valueOf(smrVar2.z);
                                    String valueOf27 = String.valueOf(smrVar2.A);
                                    String valueOf28 = String.valueOf(smrVar2.B);
                                    String valueOf29 = String.valueOf(smrVar2.C);
                                    String valueOf30 = String.valueOf(smrVar2.D);
                                    String valueOf31 = String.valueOf(smrVar2.E);
                                    String valueOf32 = String.valueOf(smrVar2.F);
                                    String valueOf33 = String.valueOf(smrVar2.G);
                                    String valueOf34 = String.valueOf(smrVar2.H);
                                    String valueOf35 = String.valueOf(smrVar2.I);
                                    String valueOf36 = String.valueOf(smrVar2.J);
                                    String valueOf37 = String.valueOf(smrVar2.K);
                                    String valueOf38 = String.valueOf(smrVar2.L);
                                    String valueOf39 = String.valueOf(smrVar2.M);
                                    String valueOf40 = String.valueOf(smrVar2.N);
                                    String valueOf41 = String.valueOf(smrVar2.O);
                                    String valueOf42 = String.valueOf(smrVar2.P);
                                    String valueOf43 = String.valueOf(smrVar2.Q);
                                    String valueOf44 = String.valueOf(smrVar2.R);
                                    String valueOf45 = String.valueOf(smrVar2.S);
                                    String valueOf46 = String.valueOf(smrVar2.T);
                                    String valueOf47 = String.valueOf(smrVar2.U);
                                    String valueOf48 = String.valueOf(smrVar2.V);
                                    String valueOf49 = String.valueOf(smrVar2.W);
                                    String valueOf50 = String.valueOf(smrVar2.X);
                                    String valueOf51 = String.valueOf(smrVar2.Y);
                                    String valueOf52 = String.valueOf(smrVar2.Z);
                                    String valueOf53 = String.valueOf(smrVar2.aa);
                                    String valueOf54 = String.valueOf(smrVar2.ab);
                                    byte[] bArr = smrVar2.ac;
                                    if (bArr != null) {
                                        str = String.valueOf(bArr.length);
                                    } else {
                                        str = "NULL";
                                    }
                                    xzeVar.l(String.format(Locale.US, "ConversationsTable [_id: %s, sms_thread_id: %s, name: %s, name_is_automatic: %s, subtitle: %s, latest_message_id: %s, snippet_text: %s, subject_text: %s, preview_uri: %s, preview_content_type: %s, show_draft: %s, draft_snippet_text: %s, draft_subject_text: %s, draft_preview_uri: %s, draft_preview_content_type: %s, etouffee_default: %s, archive_status: %s, sort_timestamp: %s, last_read_timestamp: %s, icon: %s, participant_contact_id: %s, normalized_participant_contact_id: %s, participant_lookup_key: %s, normalized_participant_lookup_key: %s, participant_normalized_destination: %s, participant_comparable_destination: %s, current_self_id: %s, current_my_identity_foreign_key: %s, destination_token: %s, participant_count: %s, notification_enabled: %s, notification_sound_uri: %s, notification_vibration: %s, include_email_addr: %s, sms_service_center: %s, participant_id_list: %s, normalized_participant_id_list: %s, source_type: %s, rcs_session_id: %s, join_state: %s, conv_type: %s, send_mode: %s, IS_ENTERPRISE: %s, has_ea2p_bot_recipient: %s, last_interactive_event_timestamp: %s, participant_display_destination: %s, normalized_participant_display_destination: %s, spam_warning_dismiss_status: %s, open_count: %s, last_logged_scooby_metadata_timestamp: %s, delete_timestamp: %s, cms_id: %s, rcs_group_id: %s, rcs_conference_uri: %s, tachygram_group_routing_info_token: %s, cms_most_recent_read_message_timestamp_ms: %s, rcs_subject_change_timestamp_ms: %s, rcs_session_allows_revocation: %s, rcs_group_capabilities: %s, awaiting_reverse_sync: %s, duplicate_of: %s, new_duplicate_of: %s, error_state: %s, cms_life_cycle: %s, rcs_group_self_msisdn: %s, recipient_offline_timestamp_ms: %s, rcs_group_last_sync_timestamp: %s, has_been_e2ee: %s, marked_as_unread: %s, custom_theme: %s, mms_group_upgrade_status: %s, mms_group_upgrade_retries: %s, encryption_protocol: %s, encryption_id: %s, cms_correlation_id: %s]", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, "BLOB".concat(String.valueOf(str)), String.valueOf(smrVar2.ad), String.valueOf(smrVar2.ae), String.valueOf(smrVar2.af), String.valueOf(smrVar2.ag), String.valueOf(smrVar2.ah), String.valueOf(smrVar2.ai), String.valueOf(smrVar2.aj), String.valueOf(smrVar2.ak), String.valueOf(smrVar2.al), String.valueOf(smrVar2.am), String.valueOf(smrVar2.an), String.valueOf(smrVar2.ao), String.valueOf(smrVar2.ap), String.valueOf(smrVar2.aq), String.valueOf(smrVar2.ar), String.valueOf(smrVar2.as), String.valueOf(smrVar2.at), String.valueOf(smrVar2.au), String.valueOf(smrVar2.av), String.valueOf(smrVar2.aw)));
                                    i2 = i4 + 1;
                                    t = alogVar2;
                                    i = i3;
                                    q = alogVar3;
                                    alsxVar2 = alsxVar3;
                                }
                                alogVar = q;
                                xyo e3 = qpn.a.e();
                                e3.H("Printing Cache");
                                e3.x("Conversations row count", alsxVar2.c);
                                e3.q();
                                qpu qpuVar = new qpu(qpw.a);
                                qpuVar.w("findWithTwoQueries3");
                                alog t2 = qpuVar.b().t();
                                int i5 = ((alsx) t2).c;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    qpp qppVar = (qpp) t2.get(i6);
                                    qpn.a.l(String.format(Locale.US, "ConversationMatcherCacheTable [_id: %s, matcher_version: %s, destination_key: %s, conversation_id: %s]", String.valueOf(qppVar.a), String.valueOf(qppVar.b), String.valueOf(qppVar.c), String.valueOf(qppVar.d)));
                                }
                            }
                            qps qpsVar = new qps();
                            qpsVar.b(new qcr(alogVar, 10));
                            qpsVar.f("removeInvalidConversationFromCache");
                            qpsVar.a().V();
                        } else {
                            return smrVar;
                        }
                    } else {
                        xyo a3 = qpn.a.a();
                        a3.H("BCM: Conversation not found in cache");
                        a3.x("cacheEntry.size()", alsxVar.c);
                        a3.q();
                    }
                    return null;
                }
            });
        } finally {
            this.j.f(d2, new ahka("ConversationMatcher#findCachedConversation"), null, ahqp.SUCCESS);
        }
    }
}
