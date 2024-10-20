package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxe {
    public final Object a;
    public final Object b;

    public lxe(anen anenVar, boolean z) {
        this.a = anenVar;
        this.b = new akip(z);
    }

    public static final snf l(snh snhVar) {
        snhVar.getClass();
        snf e = sni.e();
        e.w("ConversationsSummary");
        e.h(new mjz(snhVar, 18));
        smu smuVar = sni.c;
        e.i(new atkn((Object) smuVar.r, false), new atkn((Object) smuVar.a, false));
        e.t(sni.c.a);
        e.e(new mmv(8));
        sxy d = MessagesTable.d();
        d.d(new mmv(7));
        taz e2 = ParticipantsTable.e();
        e2.d(new mmv(6));
        d.C(agoh.b(e2.b(), ParticipantsTable.c.a, MessagesTable.c.c));
        tpy tpyVar = new tpy(VmtTable.a);
        tpyVar.c(new mmv(9));
        tbs d2 = PartsTable.d();
        d2.d(new mmv(10));
        d2.C(agoh.b(tpyVar.b(), (agmh) VmtTable.d.c, PartsTable.d.a));
        d.C(agoh.b(d2.b(), PartsTable.d.b, MessagesTable.c.a));
        e.C(agoh.b(d.b(), MessagesTable.c.a, sni.c.f));
        return e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, trz] */
    public final Intent a(Context context, lrn lrnVar) {
        if (this.a.p()) {
            Intent intent = new Intent(context, (Class<?>) IdentityDetailsActivity.class);
            aowt.h(intent, "arguments", lrnVar);
            return intent;
        }
        throw new UnsupportedOperationException("Configuration disabled for etouffee");
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.util.Map, java.lang.Object] */
    public final kzx b(kzd kzdVar, Map map, kzh kzhVar) {
        kzw kzwVar;
        alnu values;
        if (ofn.a()) {
            kzwVar = new kzw();
            kzwVar.h(8);
            kzwVar.k(8);
            kzwVar.f();
            kzwVar.d(false);
            kzwVar.e(false);
            kzwVar.c(false);
            kzwVar.j(8);
            kzwVar.g(false);
            kzwVar.b(false);
            kzwVar.Q = null;
        } else {
            kzwVar = new kzw();
        }
        if (kzdVar != null) {
            kzwVar.a = kzdVar;
            kzwVar.l = lga.G(kzdVar);
            kzwVar.S = 8 | kzwVar.S;
            kzwVar.m = lga.K(kzdVar);
            kzwVar.S |= 16;
            kzwVar.B = (ryi) map.get(kzdVar.l);
            kzwVar.q = TextUtils.equals(kzdVar.d("conversation_contains_vsms_participant"), "1");
            kzwVar.S |= 128;
            kzwVar.G = kzdVar.e();
            kzwVar.S |= 16384;
            kzwVar.K = "";
            kzwVar.Q = null;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((kzg) it.next()).a().a(kzwVar, kzdVar, kzhVar);
            }
            if (!ofn.a()) {
                values = ((alor) this.b).values();
            } else if (kzdVar.ac == mmy.c) {
                kzy kzyVar = (kzy) this.b.get(kzz.SNIPPET);
                kzyVar.getClass();
                kzy kzyVar2 = (kzy) this.b.get(kzz.AVATAR);
                kzyVar2.getClass();
                kzy kzyVar3 = (kzy) this.b.get(kzz.NAME);
                kzyVar3.getClass();
                kzy kzyVar4 = (kzy) this.b.get(kzz.STATUS);
                kzyVar4.getClass();
                kzy kzyVar5 = (kzy) this.b.get(kzz.TIMESTAMP);
                kzyVar5.getClass();
                kzy kzyVar6 = (kzy) this.b.get(kzz.CONTENT_DESCRIPTION);
                kzyVar6.getClass();
                values = alog.w(kzyVar, kzyVar2, kzyVar3, kzyVar4, kzyVar5, kzyVar6);
            } else {
                values = ((alor) this.b).values();
            }
            Iterator<E> it2 = values.iterator();
            while (it2.hasNext()) {
                ((kzy) it2.next()).e(kzwVar, kzdVar);
            }
            return kzwVar.a();
        }
        throw new NullPointerException("Null bindData");
    }

    public final sxx c(BugleConversationId bugleConversationId, mts mtsVar, int i) {
        sxy d = MessagesTable.d();
        d.w("getIdsBeforeKeyQuery");
        d.e(new mqm(19));
        d.g(new ivj(bugleConversationId, mtsVar, 18));
        d.h((atkn[]) mvg.a.c.toArray(new atkn[0]));
        d.u(i);
        return ((akip) this.b).b(d).b();
    }

    public final sxx d(BugleConversationId bugleConversationId, int i, int i2) {
        sxy f = f(bugleConversationId, i, i2);
        f.h((atkn[]) mvg.a.b.toArray(new atkn[0]));
        return f.b();
    }

    public final sxy e(BugleConversationId bugleConversationId, mts mtsVar, int i) {
        sxy d = MessagesTable.d();
        d.w("getIdsAfterKeyQueryInternal");
        d.e(new mtm(1));
        d.g(new ivj(bugleConversationId, mtsVar, 19));
        d.h((atkn[]) mvg.a.b.toArray(new atkn[0]));
        d.u(i);
        return ((akip) this.b).b(d);
    }

    public final sxy f(BugleConversationId bugleConversationId, int i, int i2) {
        sxy d = MessagesTable.d();
        d.w("getIdsWithOffsetLimitQuery");
        d.e(new mqm(18));
        d.g(new mtl(bugleConversationId, 1));
        d.u(i2);
        sxy b = ((akip) this.b).b(d);
        if (i > 0) {
            b.x(i);
        }
        return b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul g(final BugleConversationId bugleConversationId, final MessageIdType messageIdType, final long j, final long j2, final boolean z) {
        return aktp.ai(new Callable() { // from class: mtk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sxy d = MessagesTable.d();
                d.w("partOffsetQuery");
                d.s();
                d.n(new agpl("COUNT(*)"), "count");
                tbs d2 = PartsTable.d();
                d2.e(new mqm(20));
                d.D(agoh.b(d2.b(), PartsTable.d.b, MessagesTable.c.a).a());
                final BugleConversationId bugleConversationId2 = BugleConversationId.this;
                final long j3 = j2;
                final MessageIdType messageIdType2 = messageIdType;
                final long j4 = j;
                if (z) {
                    final int i = 1;
                    d.g(new Function() { // from class: mtj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo416andThen(Function function) {
                            if (i != 0) {
                                return Function$CC.$default$andThen(this, function);
                            }
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            if (i != 0) {
                                syc sycVar = (syc) obj;
                                akip.c(sycVar, bugleConversationId2);
                                long j5 = j3;
                                MessageIdType messageIdType3 = messageIdType2;
                                sycVar.b(new ilg(j5, 14), new lce(j5, messageIdType3, 7), new mth(j5, messageIdType3, j4, 2));
                                return sycVar;
                            }
                            syc sycVar2 = (syc) obj;
                            akip.c(sycVar2, bugleConversationId2);
                            long j6 = j3;
                            MessageIdType messageIdType4 = messageIdType2;
                            sycVar2.b(new ilg(j6, 15), new lce(j6, messageIdType4, 5), new mth(j6, messageIdType4, j4, 0));
                            return sycVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            if (i != 0) {
                                return Function$CC.$default$compose(this, function);
                            }
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                } else {
                    final int i2 = 0;
                    d.g(new Function() { // from class: mtj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo416andThen(Function function) {
                            if (i2 != 0) {
                                return Function$CC.$default$andThen(this, function);
                            }
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            if (i2 != 0) {
                                syc sycVar = (syc) obj;
                                akip.c(sycVar, bugleConversationId2);
                                long j5 = j3;
                                MessageIdType messageIdType3 = messageIdType2;
                                sycVar.b(new ilg(j5, 14), new lce(j5, messageIdType3, 7), new mth(j5, messageIdType3, j4, 2));
                                return sycVar;
                            }
                            syc sycVar2 = (syc) obj;
                            akip.c(sycVar2, bugleConversationId2);
                            long j6 = j3;
                            MessageIdType messageIdType4 = messageIdType2;
                            sycVar2.b(new ilg(j6, 15), new lce(j6, messageIdType4, 5), new mth(j6, messageIdType4, j4, 0));
                            return sycVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            if (i2 != 0) {
                                return Function$CC.$default$compose(this, function);
                            }
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
                sxt sxtVar = (sxt) d.b().n();
                try {
                    if (sxtVar.moveToNext()) {
                        Integer valueOf = Integer.valueOf(Integer.parseInt(sxtVar.cX("count")));
                        sxtVar.close();
                        return valueOf;
                    }
                    throw new IllegalStateException("cannot determine the absolute offset of a message part");
                } catch (Throwable th) {
                    try {
                        sxtVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final msg h(msh mshVar, alhr alhrVar) {
        ?? b = this.a.b();
        b.getClass();
        mshVar.getClass();
        return new msg((apwt) b, (armf) this.b, mshVar, alhrVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final msg i(msh mshVar, String str) {
        ?? b = this.a.b();
        b.getClass();
        mshVar.getClass();
        str.getClass();
        return new msg((apwt) b, (armf) this.b, mshVar, str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    public final msg j(alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4, alhr alhrVar5, alhr alhrVar6, alhr alhrVar7, alhr alhrVar8, alhr alhrVar9, alhr alhrVar10) {
        ?? b = this.a.b();
        b.getClass();
        alhrVar.getClass();
        alhrVar2.getClass();
        alhrVar3.getClass();
        alhrVar4.getClass();
        alhrVar5.getClass();
        alhrVar6.getClass();
        alhrVar7.getClass();
        alhrVar8.getClass();
        alhrVar9.getClass();
        alhrVar10.getClass();
        return new msg(b, this.b, alhrVar, alhrVar2, alhrVar3, alhrVar4, alhrVar5, alhrVar6, alhrVar7, alhrVar8, alhrVar9, alhrVar10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.snh r27, defpackage.arpe r28) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxe.k(snh, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    public final agoe m(int i, String str, String str2, String str3) {
        Context context = (Context) this.a.b();
        context.getClass();
        msk mskVar = (msk) this.b.b();
        mskVar.getClass();
        str2.getClass();
        str3.getClass();
        return new agoe(context, mskVar, i, str, str2, str3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final lxe n(boolean z) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        ((lgc) this.b.b()).getClass();
        return new lxe(anenVar, z);
    }

    public lxe(armf armfVar, trz trzVar) {
        this.b = armfVar;
        this.a = trzVar;
    }

    public lxe(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public lxe(Context context, armf armfVar) {
        context.getClass();
        armfVar.getClass();
        this.b = context;
        this.a = armfVar;
    }

    public lxe(apwt apwtVar, apwt apwtVar2) {
        apwtVar.getClass();
        apwtVar2.getClass();
        this.a = apwtVar;
        this.b = apwtVar2;
    }

    public lxe(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public lxe(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public lxe(arwe arweVar, ifq ifqVar) {
        arweVar.getClass();
        ifqVar.getClass();
        this.b = arweVar;
        akul c = ifqVar.c();
        c.getClass();
        lhh lhhVar = new lhh(twd.c(c).a(), 4);
        int i = ascp.a;
        ascp a = asco.a(0L, 3);
        int i2 = alog.d;
        alog alogVar = alsx.a;
        alogVar.getClass();
        this.a = arrn.T(lhhVar, arweVar, a, new lid(alogVar));
    }

    public lxe(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public lxe(armf armfVar, armf armfVar2, short[] sArr) {
        armfVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.a = armfVar2;
    }

    public lxe(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversations._id";
        a.c = new wsy();
        a.a();
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "conversations.name";
        a2.c = new wsy();
        a2.a();
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "conversations.name_is_automatic";
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.c(true);
        a4.a = "conversations.sort_timestamp";
        a4.c = new wsy();
        this.b = new mqk(a4.a());
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "conversations.conv_type";
        a5.c = new wsy();
        this.a = new mqk(a5.a());
        agmi a6 = agmk.a();
        a6.d = 1;
        a6.c(true);
        a6.a = "conversations.sms_thread_id";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "conversations.subtitle";
        a7.c = new wsy();
        a7.a();
        agmi a8 = agmk.a();
        a8.d = 1;
        a8.a = "conversations.latest_message_id";
        a8.c = new wsy();
        a8.a();
        agmi a9 = agmk.a();
        a9.d = 4;
        a9.a = "conversations.snippet_text";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "conversations.subject_text";
        a10.c = new wsy();
        a10.a();
        agmi a11 = agmk.a();
        a11.d = 4;
        a11.a = "conversations.preview_uri";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 4;
        a12.a = "conversations.preview_content_type";
        a12.c = new wsy();
        a12.a();
        agmi a13 = agmk.a();
        a13.d = 1;
        a13.a = "conversations.show_draft";
        a13.c = new wsy();
        a13.a();
        agmi a14 = agmk.a();
        a14.d = 4;
        a14.a = "conversations.draft_snippet_text";
        a14.c = new wsy();
        a14.a();
        agmi a15 = agmk.a();
        a15.d = 4;
        a15.a = "conversations.draft_subject_text";
        a15.c = new wsy();
        a15.a();
        agmi a16 = agmk.a();
        a16.d = 4;
        a16.a = "conversations.draft_preview_uri";
        a16.c = new wsy();
        a16.a();
        agmi a17 = agmk.a();
        a17.d = 4;
        a17.a = "conversations.draft_preview_content_type";
        a17.c = new wsy();
        a17.a();
        agmi a18 = agmk.a();
        a18.d = 1;
        a18.a = "conversations.etouffee_default";
        a18.c = new wsy();
        a18.a();
        agmi a19 = agmk.a();
        a19.d = 1;
        a19.c(true);
        a19.a = "conversations.archive_status";
        a19.c = new wsy();
        a19.a();
        agmi a20 = agmk.a();
        a20.d = 1;
        a20.a = "conversations.last_read_timestamp";
        a20.c = new wsy();
        a20.a();
        agmi a21 = agmk.a();
        a21.d = 4;
        a21.a = "conversations.icon";
        a21.c = new wsy();
        a21.a();
        agmi a22 = agmk.a();
        a22.d = 1;
        a22.a = "conversations.participant_contact_id";
        a22.c = new wsy();
        a22.a();
        agmi a23 = agmk.a();
        a23.d = 1;
        a23.a = "conversations.normalized_participant_contact_id";
        a23.c = new wsy();
        a23.a();
        agmi a24 = agmk.a();
        a24.d = 4;
        a24.a = "conversations.participant_lookup_key";
        a24.c = new wsy();
        a24.a();
        agmi a25 = agmk.a();
        a25.d = 4;
        a25.a = "conversations.normalized_participant_lookup_key";
        a25.c = new wsy();
        a25.a();
        agmi a26 = agmk.a();
        a26.d = 4;
        a26.c(true);
        a26.a = "conversations.participant_normalized_destination";
        a26.c = new wsy();
        a26.a();
        agmi a27 = agmk.a();
        a27.d = 4;
        a27.j(true);
        a27.c(true);
        a27.a = "conversations.participant_comparable_destination";
        a27.e(true);
        a27.c = new wsy();
        a27.a();
        agmi a28 = agmk.a();
        a28.d = 4;
        a28.a = "conversations.current_self_id";
        a28.c = new wsy();
        a28.a();
        agmi a29 = agmk.a();
        a29.d = 4;
        a29.a = "conversations.current_my_identity";
        a29.c = new wsy();
        a29.a();
        agmi a30 = agmk.a();
        a30.d = 4;
        a30.c(true);
        a30.d(true);
        a30.b = new mcw(17);
        a30.a = "conversations.current_my_identity_foreign_key";
        a30.c = new wsy();
        a30.a();
        agmi a31 = agmk.a();
        a31.d = 4;
        a31.c(true);
        a31.d(true);
        a31.b = new mcw(18);
        a31.a = "conversations.destination_token";
        a31.c = new wsy();
        a31.a();
        agmi a32 = agmk.a();
        a32.d = 1;
        a32.a = "conversations.participant_count";
        a32.c = new wsy();
        a32.a();
        agmi a33 = agmk.a();
        a33.d = 1;
        a33.a = "conversations.notification_enabled";
        a33.c = new wsy();
        a33.a();
        agmi a34 = agmk.a();
        a34.d = 4;
        a34.a = "conversations.notification_sound_uri";
        a34.c = new wsy();
        a34.a();
        agmi a35 = agmk.a();
        a35.d = 1;
        a35.a = "conversations.notification_vibration";
        a35.c = new wsy();
        a35.a();
        agmi a36 = agmk.a();
        a36.d = 1;
        a36.a = "conversations.include_email_addr";
        a36.c = new wsy();
        a36.a();
        agmi a37 = agmk.a();
        a37.d = 4;
        a37.a = "conversations.sms_service_center";
        a37.c = new wsy();
        a37.a();
        agmi a38 = agmk.a();
        a38.d = 4;
        a38.a = "conversations.participant_id_list";
        a38.c = new wsy();
        a38.a();
        agmi a39 = agmk.a();
        a39.d = 4;
        a39.j(true);
        a39.c(true);
        a39.a = "conversations.normalized_participant_id_list";
        a39.e(true);
        a39.c = new wsy();
        a39.a();
        agmi a40 = agmk.a();
        a40.d = 1;
        a40.a = "conversations.source_type";
        a40.c = new wsy();
        a40.a();
        agmi a41 = agmk.a();
        a41.d = 1;
        a41.c(true);
        a41.a = "conversations.rcs_session_id";
        a41.c = new wsy();
        a41.a();
        agmi a42 = agmk.a();
        a42.d = 1;
        a42.a = "conversations.join_state";
        a42.c = new wsy();
        a42.a();
        agmi a43 = agmk.a();
        a43.d = 1;
        a43.a = "conversations.send_mode";
        a43.c = new wsy();
        a43.a();
        agmi a44 = agmk.a();
        a44.d = 1;
        a44.a = "conversations.IS_ENTERPRISE";
        a44.c = new wsy();
        a44.a();
        agmi a45 = agmk.a();
        a45.d = 1;
        a45.a = "conversations.has_ea2p_bot_recipient";
        a45.c = new wsy();
        a45.a();
        agmi a46 = agmk.a();
        a46.d = 1;
        a46.a = "conversations.last_interactive_event_timestamp";
        a46.c = new wsy();
        a46.a();
        agmi a47 = agmk.a();
        a47.d = 4;
        a47.a = "conversations.participant_display_destination";
        a47.c = new wsy();
        a47.a();
        agmi a48 = agmk.a();
        a48.d = 4;
        a48.a = "conversations.normalized_participant_display_destination";
        a48.c = new wsy();
        a48.a();
        agmi a49 = agmk.a();
        a49.d = 1;
        a49.a = "conversations.spam_warning_dismiss_status";
        a49.c = new wsy();
        a49.a();
        agmi a50 = agmk.a();
        a50.d = 1;
        a50.a = "conversations.open_count";
        a50.c = new wsy();
        a50.a();
        agmi a51 = agmk.a();
        a51.d = 1;
        a51.a = "conversations.last_logged_scooby_metadata_timestamp";
        a51.c = new wsy();
        a51.a();
        agmi a52 = agmk.a();
        a52.d = 1;
        a52.c(true);
        a52.a = "conversations.delete_timestamp";
        a52.c = new wsy();
        a52.a();
        agmi a53 = agmk.a();
        a53.d = 4;
        a53.j(true);
        a53.c(true);
        a53.a = "conversations.cms_id";
        a53.e(true);
        a53.c = new wsy();
        a53.a();
        agmi a54 = agmk.a();
        a54.d = 4;
        a54.c(true);
        a54.a = "conversations.rcs_group_id";
        a54.c = new wsy();
        a54.a();
        agmi a55 = agmk.a();
        a55.d = 4;
        a55.a = "conversations.rcs_conference_uri";
        a55.c = new wsy();
        a55.a();
        agmi a56 = agmk.a();
        a56.d = 5;
        a56.a = "conversations.tachygram_group_routing_info_token";
        a56.c = new wsy();
        a56.a();
        agmi a57 = agmk.a();
        a57.d = 1;
        a57.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        a57.c = new wsy();
        a57.a();
        agmi a58 = agmk.a();
        a58.d = 2;
        a58.a = "conversations.rcs_subject_change_timestamp_ms";
        a58.c = new wsy();
        a58.a();
        agmi a59 = agmk.a();
        a59.d = 1;
        a59.a = "conversations.rcs_session_allows_revocation";
        a59.c = new wsy();
        a59.a();
        agmi a60 = agmk.a();
        a60.d = 2;
        a60.a = "conversations.rcs_group_capabilities";
        a60.c = new wsy();
        a60.a();
        agmi a61 = agmk.a();
        a61.d = 1;
        a61.a = "conversations.awaiting_reverse_sync";
        a61.c = new wsy();
        a61.a();
        agmi a62 = agmk.a();
        a62.d = 2;
        a62.c(true);
        a62.d(true);
        a62.b = new mcw(19);
        a62.a = "conversations.duplicate_of";
        a62.c = new wsy();
        a62.a();
        agmi a63 = agmk.a();
        a63.d = 2;
        a63.c(true);
        a63.d(true);
        a63.b = new mcw(20);
        a63.a = "conversations.new_duplicate_of";
        a63.c = new wsy();
        a63.a();
        agmi a64 = agmk.a();
        a64.d = 1;
        a64.a = "conversations.error_state";
        a64.c = new wsy();
        a64.a();
        agmi a65 = agmk.a();
        a65.d = 1;
        a65.a = "conversations.cms_life_cycle";
        a65.c = new wsy();
        a65.a();
        agmi a66 = agmk.a();
        a66.d = 4;
        a66.a = "conversations.rcs_group_self_msisdn";
        a66.c = new wsy();
        a66.a();
        agmi a67 = agmk.a();
        a67.d = 2;
        a67.a = "conversations.recipient_offline_timestamp_ms";
        a67.c = new wsy();
        a67.a();
        agmi a68 = agmk.a();
        a68.d = 2;
        a68.a = "conversations.rcs_group_last_sync_timestamp";
        a68.c = new wsy();
        a68.a();
        agmi a69 = agmk.a();
        a69.d = 1;
        a69.a = "conversations.has_been_e2ee";
        a69.c = new wsy();
        a69.a();
        agmi a70 = agmk.a();
        a70.d = 1;
        a70.a = "conversations.marked_as_unread";
        a70.c = new wsy();
        a70.a();
        agmi a71 = agmk.a();
        a71.d = 5;
        a71.a = "conversations.custom_theme";
        a71.c = new wsy();
        a71.a();
        agmi a72 = agmk.a();
        a72.d = 2;
        a72.a = "conversations.mms_group_upgrade_status";
        a72.c = new wsy();
        a72.a();
        agmi a73 = agmk.a();
        a73.d = 2;
        a73.a = "conversations.mms_group_upgrade_retries";
        a73.c = new wsy();
        a73.a();
        agmi a74 = agmk.a();
        a74.d = 2;
        a74.a = "conversations.encryption_protocol";
        a74.c = new wsy();
        a74.a();
        agmi a75 = agmk.a();
        a75.d = 4;
        a75.a = "conversations.encryption_id";
        a75.c = new wsy();
        a75.a();
        agmi a76 = agmk.a();
        a76.d = 4;
        a76.j(true);
        a76.c(true);
        a76.a = "conversations.cms_correlation_id";
        a76.e(true);
        a76.c = new wsy();
        a76.a();
        agmi a77 = agmk.a();
        a77.d = 1;
        a77.j(true);
        a77.i(true);
        a77.f(true);
        a77.c(true);
        a77.d(true);
        a77.a = "conversation_to_participants.participant_id";
        a77.e(true);
        a77.c = new wsy();
        a77.a();
        agmi a78 = agmk.a();
        a78.d = 8;
        a78.a = "conversation_to_participants__ROWID";
        a78.c = new wsy();
        a78.a();
        agmi a79 = agmk.a();
        a79.d = 1;
        a79.j(true);
        a79.i(true);
        a79.f(true);
        a79.c(true);
        a79.d(true);
        a79.a = "conversation_to_participants.conversation_id";
        a79.e(true);
        a79.c = new wsy();
        a79.a();
        agmi a80 = agmk.a();
        a80.d = 1;
        a80.i(true);
        a80.a = "conversation_to_participants.rcs_group_join_status";
        a80.c = new wsy();
        a80.a();
        agmi a81 = agmk.a();
        a81.d = 4;
        a81.a = "conversation_to_participants.last_modified_by_key";
        a81.c = new wsy();
        a81.a();
        agmi a82 = agmk.a();
        a82.d = 2;
        a82.j(true);
        a82.f(true);
        a82.c(true);
        a82.a = "participants._id";
        a82.c = new wsy();
        a82.a();
        agmi a83 = agmk.a();
        a83.d = 4;
        a83.c(true);
        a83.a = "participants.normalized_destination";
        a83.e(true);
        a83.c = new wsy();
        a83.a();
        agmi a84 = agmk.a();
        a84.d = 4;
        a84.a = "participants.send_destination";
        a84.c = new wsy();
        a84.a();
        agmi a85 = agmk.a();
        a85.d = 4;
        a85.j(true);
        a85.c(true);
        a85.a = "participants.comparable_destination";
        a85.e(true);
        a85.c = new wsy();
        a85.a();
        agmi a86 = agmk.a();
        a86.d = 8;
        a86.a = "participants__ROWID";
        a86.c = new wsy();
        a86.a();
        agmi a87 = agmk.a();
        a87.d = 4;
        a87.c(true);
        a87.a = "participants.my_identity_token";
        a87.c = new wsy();
        a87.a();
        agmi a88 = agmk.a();
        a88.d = 4;
        a88.c(true);
        a88.d(true);
        a88.b = new mcw(15);
        a88.a = "participants.my_identity_token_foreign_key";
        a88.c = new wsy();
        a88.a();
        agmi a89 = agmk.a();
        a89.d = 1;
        a89.c(true);
        a89.a = "participants.sub_id";
        a89.e(true);
        a89.c = new wsy();
        a89.a();
        agmi a90 = agmk.a();
        a90.d = 1;
        a90.a = "participants.sim_slot_id";
        a90.c = new wsy();
        a90.a();
        agmi a91 = agmk.a();
        a91.d = 4;
        a91.a = "participants.display_destination";
        a91.c = new wsy();
        a91.a();
        agmi a92 = agmk.a();
        a92.d = 4;
        a92.a = "participants.country_code";
        a92.c = new wsy();
        a92.a();
        agmi a93 = agmk.a();
        a93.d = 2;
        a93.j(true);
        a93.c(true);
        a93.a = "participants.recipient_id";
        a93.e(true);
        a93.c = new wsy();
        a93.a();
        agmi a94 = agmk.a();
        a94.d = 4;
        a94.a = "participants.recipient_canonical_address";
        a94.c = new wsy();
        a94.a();
        agmi a95 = agmk.a();
        a95.d = 4;
        a95.a = "participants.full_name";
        a95.c = new wsy();
        a95.a();
        agmi a96 = agmk.a();
        a96.d = 4;
        a96.a = "participants.first_name";
        a96.c = new wsy();
        a96.a();
        agmi a97 = agmk.a();
        a97.d = 4;
        a97.a = "participants.profile_photo_uri";
        a97.c = new wsy();
        a97.a();
        agmi a98 = agmk.a();
        a98.d = 4;
        a98.a = "participants.contact_photo_uri";
        a98.c = new wsy();
        a98.a();
        agmi a99 = agmk.a();
        a99.d = 1;
        a99.a = "participants.contact_id";
        a99.c = new wsy();
        a99.a();
        agmi a100 = agmk.a();
        a100.d = 4;
        a100.a = "participants.lookup_key";
        a100.c = new wsy();
        a100.a();
        agmi a101 = agmk.a();
        a101.d = 1;
        a101.a = "participants.color_palette_index";
        a101.c = new wsy();
        a101.a();
        agmi a102 = agmk.a();
        a102.d = 1;
        a102.a = "participants.color_type";
        a102.c = new wsy();
        a102.a();
        agmi a103 = agmk.a();
        a103.d = 1;
        a103.a = "participants.extended_color";
        a103.c = new wsy();
        a103.a();
        agmi a104 = agmk.a();
        a104.d = 1;
        a104.a = "participants.blocked";
        a104.c = new wsy();
        a104.a();
        agmi a105 = agmk.a();
        a105.d = 4;
        a105.a = "participants.subscription_name";
        a105.c = new wsy();
        a105.a();
        agmi a106 = agmk.a();
        a106.d = 1;
        a106.a = "participants.subscription_color";
        a106.c = new wsy();
        a106.a();
        agmi a107 = agmk.a();
        a107.d = 4;
        a107.a = "participants.contact_destination";
        a107.c = new wsy();
        a107.a();
        agmi a108 = agmk.a();
        a108.d = 1;
        a108.a = "participants.participant_type";
        a108.c = new wsy();
        a108.a();
        agmi a109 = agmk.a();
        a109.d = 1;
        a109.a = "participants.video_reachability";
        a109.c = new wsy();
        a109.a();
        agmi a110 = agmk.a();
        a110.d = 4;
        a110.a = "participants.alias";
        a110.c = new wsy();
        a110.a();
        agmi a111 = agmk.a();
        a111.d = 1;
        a111.a = "participants.is_spam";
        a111.c = new wsy();
        a111.a();
        agmi a112 = agmk.a();
        a112.d = 1;
        a112.a = "participants.is_rcs_available";
        a112.c = new wsy();
        a112.a();
        agmi a113 = agmk.a();
        a113.d = 1;
        a113.a = "participants.is_spam_source";
        a113.c = new wsy();
        a113.a();
        agmi a114 = agmk.a();
        a114.d = 4;
        a114.j(true);
        a114.c(true);
        a114.a = "participants.cms_id";
        a114.e(true);
        a114.c = new wsy();
        a114.a();
        agmi a115 = agmk.a();
        a115.d = 1;
        a115.a = "participants.latest_verification_status";
        a115.c = new wsy();
        a115.a();
        agmi a116 = agmk.a();
        a116.d = 4;
        a116.a = "participants.profile_photo_blob_id";
        a116.c = new wsy();
        a116.a();
        agmi a117 = agmk.a();
        a117.d = 5;
        a117.a = "participants.profile_photo_encryption_key";
        a117.c = new wsy();
        a117.a();
        agmi a118 = agmk.a();
        a118.d = 1;
        a118.a = "participants.directory_id";
        a118.c = new wsy();
        a118.a();
        agmi a119 = agmk.a();
        a119.d = 1;
        a119.a = "participants.is_check_constraint_enabled_via_phenotype";
        a119.c = new wsy();
        a119.a();
        agmi a120 = agmk.a();
        a120.d = 1;
        a120.a = "participants.is_valid_phone_number_data";
        a120.c = new wsy();
        a120.a();
        agmi a121 = agmk.a();
        a121.d = 2;
        a121.c(true);
        a121.d(true);
        a121.b = new mcw(16);
        a121.a = "participants.duplicate_of";
        a121.c = new wsy();
        a121.a();
        agmi a122 = agmk.a();
        a122.d = 1;
        a122.a = "participants.cms_life_cycle";
        a122.c = new wsy();
        a122.a();
        agmi a123 = agmk.a();
        a123.d = 1;
        a123.a = "participants.norm_ui_status";
        a123.c = new wsy();
        a123.a();
        agmi a124 = agmk.a();
        a124.d = 4;
        a124.a = "participants.last_modified_by_key";
        a124.c = new wsy();
        a124.a();
        agmi a125 = agmk.a();
        a125.d = 1;
        a125.a = "participants.name_source";
        a125.c = new wsy();
        a125.a();
        agmi a126 = agmk.a();
        a126.d = 1;
        a126.a = "participants.photo_source";
        a126.c = new wsy();
        a126.a();
        agmi a127 = agmk.a();
        a127.d = 1;
        a127.a = "participants.profile_photo_user_preference";
        a127.c = new wsy();
        a127.a();
        agmi a128 = agmk.a();
        a128.d = 5;
        a128.a = "participants.contact_metadata";
        a128.c = new wsy();
        a128.a();
    }

    public lxe(Context context, arwe arweVar, lgd lgdVar, armf armfVar) {
        context.getClass();
        arweVar.getClass();
        lgdVar.getClass();
        armfVar.getClass();
        this.a = arweVar;
        jeo jeoVar = new jeo((asai) lgdVar.c, context, armfVar, lgdVar, 2);
        int i = ascp.a;
        this.b = arrn.T(jeoVar, arweVar, asco.a(0L, 3), arnv.a);
    }

    public lxe() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversations._id";
        a.c = new wsy();
        a.a();
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "conversations.name";
        a2.c = new wsy();
        a2.a();
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "conversations.name_is_automatic";
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.c(true);
        a4.a = "conversations.sort_timestamp";
        a4.c = new wsy();
        this.b = new mqs(a4.a());
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "conversations.conv_type";
        a5.c = new wsy();
        this.a = new mqs(a5.a());
        agmi a6 = agmk.a();
        a6.d = 1;
        a6.c(true);
        a6.a = "conversations.sms_thread_id";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "conversations.subtitle";
        a7.c = new wsy();
        a7.a();
        agmi a8 = agmk.a();
        a8.d = 1;
        a8.a = "conversations.latest_message_id";
        a8.c = new wsy();
        a8.a();
        agmi a9 = agmk.a();
        a9.d = 4;
        a9.a = "conversations.snippet_text";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "conversations.subject_text";
        a10.c = new wsy();
        a10.a();
        agmi a11 = agmk.a();
        a11.d = 4;
        a11.a = "conversations.preview_uri";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 4;
        a12.a = "conversations.preview_content_type";
        a12.c = new wsy();
        a12.a();
        agmi a13 = agmk.a();
        a13.d = 1;
        a13.a = "conversations.show_draft";
        a13.c = new wsy();
        a13.a();
        agmi a14 = agmk.a();
        a14.d = 4;
        a14.a = "conversations.draft_snippet_text";
        a14.c = new wsy();
        a14.a();
        agmi a15 = agmk.a();
        a15.d = 4;
        a15.a = "conversations.draft_subject_text";
        a15.c = new wsy();
        a15.a();
        agmi a16 = agmk.a();
        a16.d = 4;
        a16.a = "conversations.draft_preview_uri";
        a16.c = new wsy();
        a16.a();
        agmi a17 = agmk.a();
        a17.d = 4;
        a17.a = "conversations.draft_preview_content_type";
        a17.c = new wsy();
        a17.a();
        agmi a18 = agmk.a();
        a18.d = 1;
        a18.a = "conversations.etouffee_default";
        a18.c = new wsy();
        a18.a();
        agmi a19 = agmk.a();
        a19.d = 1;
        a19.c(true);
        a19.a = "conversations.archive_status";
        a19.c = new wsy();
        a19.a();
        agmi a20 = agmk.a();
        a20.d = 1;
        a20.a = "conversations.last_read_timestamp";
        a20.c = new wsy();
        a20.a();
        agmi a21 = agmk.a();
        a21.d = 4;
        a21.a = "conversations.icon";
        a21.c = new wsy();
        a21.a();
        agmi a22 = agmk.a();
        a22.d = 1;
        a22.a = "conversations.participant_contact_id";
        a22.c = new wsy();
        a22.a();
        agmi a23 = agmk.a();
        a23.d = 1;
        a23.a = "conversations.normalized_participant_contact_id";
        a23.c = new wsy();
        a23.a();
        agmi a24 = agmk.a();
        a24.d = 4;
        a24.a = "conversations.participant_lookup_key";
        a24.c = new wsy();
        a24.a();
        agmi a25 = agmk.a();
        a25.d = 4;
        a25.a = "conversations.normalized_participant_lookup_key";
        a25.c = new wsy();
        a25.a();
        agmi a26 = agmk.a();
        a26.d = 4;
        a26.c(true);
        a26.a = "conversations.participant_normalized_destination";
        a26.c = new wsy();
        a26.a();
        agmi a27 = agmk.a();
        a27.d = 4;
        a27.j(true);
        a27.c(true);
        a27.a = "conversations.participant_comparable_destination";
        a27.e(true);
        a27.c = new wsy();
        a27.a();
        agmi a28 = agmk.a();
        a28.d = 4;
        a28.a = "conversations.current_self_id";
        a28.c = new wsy();
        a28.a();
        agmi a29 = agmk.a();
        a29.d = 4;
        a29.a = "conversations.current_my_identity";
        a29.c = new wsy();
        a29.a();
        agmi a30 = agmk.a();
        a30.d = 4;
        a30.c(true);
        a30.d(true);
        a30.b = new mqr(2);
        a30.a = "conversations.current_my_identity_foreign_key";
        a30.c = new wsy();
        a30.a();
        agmi a31 = agmk.a();
        a31.d = 4;
        a31.c(true);
        a31.d(true);
        a31.b = new mqr(3);
        a31.a = "conversations.destination_token";
        a31.c = new wsy();
        a31.a();
        agmi a32 = agmk.a();
        a32.d = 1;
        a32.a = "conversations.participant_count";
        a32.c = new wsy();
        a32.a();
        agmi a33 = agmk.a();
        a33.d = 1;
        a33.a = "conversations.notification_enabled";
        a33.c = new wsy();
        a33.a();
        agmi a34 = agmk.a();
        a34.d = 4;
        a34.a = "conversations.notification_sound_uri";
        a34.c = new wsy();
        a34.a();
        agmi a35 = agmk.a();
        a35.d = 1;
        a35.a = "conversations.notification_vibration";
        a35.c = new wsy();
        a35.a();
        agmi a36 = agmk.a();
        a36.d = 1;
        a36.a = "conversations.include_email_addr";
        a36.c = new wsy();
        a36.a();
        agmi a37 = agmk.a();
        a37.d = 4;
        a37.a = "conversations.sms_service_center";
        a37.c = new wsy();
        a37.a();
        agmi a38 = agmk.a();
        a38.d = 4;
        a38.a = "conversations.participant_id_list";
        a38.c = new wsy();
        a38.a();
        agmi a39 = agmk.a();
        a39.d = 4;
        a39.j(true);
        a39.c(true);
        a39.a = "conversations.normalized_participant_id_list";
        a39.e(true);
        a39.c = new wsy();
        a39.a();
        agmi a40 = agmk.a();
        a40.d = 1;
        a40.a = "conversations.source_type";
        a40.c = new wsy();
        a40.a();
        agmi a41 = agmk.a();
        a41.d = 1;
        a41.c(true);
        a41.a = "conversations.rcs_session_id";
        a41.c = new wsy();
        a41.a();
        agmi a42 = agmk.a();
        a42.d = 1;
        a42.a = "conversations.join_state";
        a42.c = new wsy();
        a42.a();
        agmi a43 = agmk.a();
        a43.d = 1;
        a43.a = "conversations.send_mode";
        a43.c = new wsy();
        a43.a();
        agmi a44 = agmk.a();
        a44.d = 1;
        a44.a = "conversations.IS_ENTERPRISE";
        a44.c = new wsy();
        a44.a();
        agmi a45 = agmk.a();
        a45.d = 1;
        a45.a = "conversations.has_ea2p_bot_recipient";
        a45.c = new wsy();
        a45.a();
        agmi a46 = agmk.a();
        a46.d = 1;
        a46.a = "conversations.last_interactive_event_timestamp";
        a46.c = new wsy();
        a46.a();
        agmi a47 = agmk.a();
        a47.d = 4;
        a47.a = "conversations.participant_display_destination";
        a47.c = new wsy();
        a47.a();
        agmi a48 = agmk.a();
        a48.d = 4;
        a48.a = "conversations.normalized_participant_display_destination";
        a48.c = new wsy();
        a48.a();
        agmi a49 = agmk.a();
        a49.d = 1;
        a49.a = "conversations.spam_warning_dismiss_status";
        a49.c = new wsy();
        a49.a();
        agmi a50 = agmk.a();
        a50.d = 1;
        a50.a = "conversations.open_count";
        a50.c = new wsy();
        a50.a();
        agmi a51 = agmk.a();
        a51.d = 1;
        a51.a = "conversations.last_logged_scooby_metadata_timestamp";
        a51.c = new wsy();
        a51.a();
        agmi a52 = agmk.a();
        a52.d = 1;
        a52.c(true);
        a52.a = "conversations.delete_timestamp";
        a52.c = new wsy();
        a52.a();
        agmi a53 = agmk.a();
        a53.d = 4;
        a53.j(true);
        a53.c(true);
        a53.a = "conversations.cms_id";
        a53.e(true);
        a53.c = new wsy();
        a53.a();
        agmi a54 = agmk.a();
        a54.d = 4;
        a54.c(true);
        a54.a = "conversations.rcs_group_id";
        a54.c = new wsy();
        a54.a();
        agmi a55 = agmk.a();
        a55.d = 4;
        a55.a = "conversations.rcs_conference_uri";
        a55.c = new wsy();
        a55.a();
        agmi a56 = agmk.a();
        a56.d = 5;
        a56.a = "conversations.tachygram_group_routing_info_token";
        a56.c = new wsy();
        a56.a();
        agmi a57 = agmk.a();
        a57.d = 1;
        a57.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        a57.c = new wsy();
        a57.a();
        agmi a58 = agmk.a();
        a58.d = 2;
        a58.a = "conversations.rcs_subject_change_timestamp_ms";
        a58.c = new wsy();
        a58.a();
        agmi a59 = agmk.a();
        a59.d = 1;
        a59.a = "conversations.rcs_session_allows_revocation";
        a59.c = new wsy();
        a59.a();
        agmi a60 = agmk.a();
        a60.d = 2;
        a60.a = "conversations.rcs_group_capabilities";
        a60.c = new wsy();
        a60.a();
        agmi a61 = agmk.a();
        a61.d = 1;
        a61.a = "conversations.awaiting_reverse_sync";
        a61.c = new wsy();
        a61.a();
        agmi a62 = agmk.a();
        a62.d = 2;
        a62.c(true);
        a62.d(true);
        a62.b = new mqr(4);
        a62.a = "conversations.duplicate_of";
        a62.c = new wsy();
        a62.a();
        agmi a63 = agmk.a();
        a63.d = 2;
        a63.c(true);
        a63.d(true);
        a63.b = new mqr(5);
        a63.a = "conversations.new_duplicate_of";
        a63.c = new wsy();
        a63.a();
        agmi a64 = agmk.a();
        a64.d = 1;
        a64.a = "conversations.error_state";
        a64.c = new wsy();
        a64.a();
        agmi a65 = agmk.a();
        a65.d = 1;
        a65.a = "conversations.cms_life_cycle";
        a65.c = new wsy();
        a65.a();
        agmi a66 = agmk.a();
        a66.d = 4;
        a66.a = "conversations.rcs_group_self_msisdn";
        a66.c = new wsy();
        a66.a();
        agmi a67 = agmk.a();
        a67.d = 2;
        a67.a = "conversations.recipient_offline_timestamp_ms";
        a67.c = new wsy();
        a67.a();
        agmi a68 = agmk.a();
        a68.d = 2;
        a68.a = "conversations.rcs_group_last_sync_timestamp";
        a68.c = new wsy();
        a68.a();
        agmi a69 = agmk.a();
        a69.d = 1;
        a69.a = "conversations.has_been_e2ee";
        a69.c = new wsy();
        a69.a();
        agmi a70 = agmk.a();
        a70.d = 1;
        a70.a = "conversations.marked_as_unread";
        a70.c = new wsy();
        a70.a();
        agmi a71 = agmk.a();
        a71.d = 5;
        a71.a = "conversations.custom_theme";
        a71.c = new wsy();
        a71.a();
        agmi a72 = agmk.a();
        a72.d = 2;
        a72.a = "conversations.mms_group_upgrade_status";
        a72.c = new wsy();
        a72.a();
        agmi a73 = agmk.a();
        a73.d = 2;
        a73.a = "conversations.mms_group_upgrade_retries";
        a73.c = new wsy();
        a73.a();
        agmi a74 = agmk.a();
        a74.d = 2;
        a74.a = "conversations.encryption_protocol";
        a74.c = new wsy();
        a74.a();
        agmi a75 = agmk.a();
        a75.d = 4;
        a75.a = "conversations.encryption_id";
        a75.c = new wsy();
        a75.a();
        agmi a76 = agmk.a();
        a76.d = 4;
        a76.j(true);
        a76.c(true);
        a76.a = "conversations.cms_correlation_id";
        a76.e(true);
        a76.c = new wsy();
        a76.a();
        agmi a77 = agmk.a();
        a77.d = 1;
        a77.c(true);
        a77.d(true);
        a77.a = "conversation_participants.participant_id";
        a77.e(true);
        a77.c = new wsy();
        a77.a();
        agmi a78 = agmk.a();
        a78.d = 8;
        a78.a = "conversation_participants__ROWID";
        a78.c = new wsy();
        a78.a();
        agmi a79 = agmk.a();
        a79.d = 2;
        a79.j(true);
        a79.f(true);
        a79.c(true);
        a79.a = "conversation_participants._id";
        a79.c = new wsy();
        a79.a();
        agmi a80 = agmk.a();
        a80.d = 1;
        a80.c(true);
        a80.d(true);
        a80.a = "conversation_participants.conversation_id";
        a80.e(true);
        a80.c = new wsy();
        a80.a();
        agmi a81 = agmk.a();
        a81.d = 1;
        a81.c(true);
        a81.a = "conversation_participants.is_normalized";
        a81.e(true);
        a81.c = new wsy();
        a81.a();
        agmi a82 = agmk.a();
        a82.d = 1;
        a82.a = "conversation_participants.rcs_group_join_status";
        a82.c = new wsy();
        a82.a();
        agmi a83 = agmk.a();
        a83.d = 4;
        a83.a = "conversation_participants.last_modified_by_key";
        a83.c = new wsy();
        a83.a();
        agmi a84 = agmk.a();
        a84.d = 2;
        a84.j(true);
        a84.f(true);
        a84.c(true);
        a84.a = "participants._id";
        a84.c = new wsy();
        a84.a();
        agmi a85 = agmk.a();
        a85.d = 4;
        a85.c(true);
        a85.a = "participants.normalized_destination";
        a85.e(true);
        a85.c = new wsy();
        a85.a();
        agmi a86 = agmk.a();
        a86.d = 4;
        a86.a = "participants.send_destination";
        a86.c = new wsy();
        a86.a();
        agmi a87 = agmk.a();
        a87.d = 4;
        a87.j(true);
        a87.c(true);
        a87.a = "participants.comparable_destination";
        a87.e(true);
        a87.c = new wsy();
        a87.a();
        agmi a88 = agmk.a();
        a88.d = 8;
        a88.a = "participants__ROWID";
        a88.c = new wsy();
        a88.a();
        agmi a89 = agmk.a();
        a89.d = 4;
        a89.c(true);
        a89.a = "participants.my_identity_token";
        a89.c = new wsy();
        a89.a();
        agmi a90 = agmk.a();
        a90.d = 4;
        a90.c(true);
        a90.d(true);
        a90.b = new mqr(1);
        a90.a = "participants.my_identity_token_foreign_key";
        a90.c = new wsy();
        a90.a();
        agmi a91 = agmk.a();
        a91.d = 1;
        a91.c(true);
        a91.a = "participants.sub_id";
        a91.e(true);
        a91.c = new wsy();
        a91.a();
        agmi a92 = agmk.a();
        a92.d = 1;
        a92.a = "participants.sim_slot_id";
        a92.c = new wsy();
        a92.a();
        agmi a93 = agmk.a();
        a93.d = 4;
        a93.a = "participants.display_destination";
        a93.c = new wsy();
        a93.a();
        agmi a94 = agmk.a();
        a94.d = 4;
        a94.a = "participants.country_code";
        a94.c = new wsy();
        a94.a();
        agmi a95 = agmk.a();
        a95.d = 2;
        a95.j(true);
        a95.c(true);
        a95.a = "participants.recipient_id";
        a95.e(true);
        a95.c = new wsy();
        a95.a();
        agmi a96 = agmk.a();
        a96.d = 4;
        a96.a = "participants.recipient_canonical_address";
        a96.c = new wsy();
        a96.a();
        agmi a97 = agmk.a();
        a97.d = 4;
        a97.a = "participants.full_name";
        a97.c = new wsy();
        a97.a();
        agmi a98 = agmk.a();
        a98.d = 4;
        a98.a = "participants.first_name";
        a98.c = new wsy();
        a98.a();
        agmi a99 = agmk.a();
        a99.d = 4;
        a99.a = "participants.profile_photo_uri";
        a99.c = new wsy();
        a99.a();
        agmi a100 = agmk.a();
        a100.d = 4;
        a100.a = "participants.contact_photo_uri";
        a100.c = new wsy();
        a100.a();
        agmi a101 = agmk.a();
        a101.d = 1;
        a101.a = "participants.contact_id";
        a101.c = new wsy();
        a101.a();
        agmi a102 = agmk.a();
        a102.d = 4;
        a102.a = "participants.lookup_key";
        a102.c = new wsy();
        a102.a();
        agmi a103 = agmk.a();
        a103.d = 1;
        a103.a = "participants.color_palette_index";
        a103.c = new wsy();
        a103.a();
        agmi a104 = agmk.a();
        a104.d = 1;
        a104.a = "participants.color_type";
        a104.c = new wsy();
        a104.a();
        agmi a105 = agmk.a();
        a105.d = 1;
        a105.a = "participants.extended_color";
        a105.c = new wsy();
        a105.a();
        agmi a106 = agmk.a();
        a106.d = 1;
        a106.a = "participants.blocked";
        a106.c = new wsy();
        a106.a();
        agmi a107 = agmk.a();
        a107.d = 4;
        a107.a = "participants.subscription_name";
        a107.c = new wsy();
        a107.a();
        agmi a108 = agmk.a();
        a108.d = 1;
        a108.a = "participants.subscription_color";
        a108.c = new wsy();
        a108.a();
        agmi a109 = agmk.a();
        a109.d = 4;
        a109.a = "participants.contact_destination";
        a109.c = new wsy();
        a109.a();
        agmi a110 = agmk.a();
        a110.d = 1;
        a110.a = "participants.participant_type";
        a110.c = new wsy();
        a110.a();
        agmi a111 = agmk.a();
        a111.d = 1;
        a111.a = "participants.video_reachability";
        a111.c = new wsy();
        a111.a();
        agmi a112 = agmk.a();
        a112.d = 4;
        a112.a = "participants.alias";
        a112.c = new wsy();
        a112.a();
        agmi a113 = agmk.a();
        a113.d = 1;
        a113.a = "participants.is_spam";
        a113.c = new wsy();
        a113.a();
        agmi a114 = agmk.a();
        a114.d = 1;
        a114.a = "participants.is_rcs_available";
        a114.c = new wsy();
        a114.a();
        agmi a115 = agmk.a();
        a115.d = 1;
        a115.a = "participants.is_spam_source";
        a115.c = new wsy();
        a115.a();
        agmi a116 = agmk.a();
        a116.d = 4;
        a116.j(true);
        a116.c(true);
        a116.a = "participants.cms_id";
        a116.e(true);
        a116.c = new wsy();
        a116.a();
        agmi a117 = agmk.a();
        a117.d = 1;
        a117.a = "participants.latest_verification_status";
        a117.c = new wsy();
        a117.a();
        agmi a118 = agmk.a();
        a118.d = 4;
        a118.a = "participants.profile_photo_blob_id";
        a118.c = new wsy();
        a118.a();
        agmi a119 = agmk.a();
        a119.d = 5;
        a119.a = "participants.profile_photo_encryption_key";
        a119.c = new wsy();
        a119.a();
        agmi a120 = agmk.a();
        a120.d = 1;
        a120.a = "participants.directory_id";
        a120.c = new wsy();
        a120.a();
        agmi a121 = agmk.a();
        a121.d = 1;
        a121.a = "participants.is_check_constraint_enabled_via_phenotype";
        a121.c = new wsy();
        a121.a();
        agmi a122 = agmk.a();
        a122.d = 1;
        a122.a = "participants.is_valid_phone_number_data";
        a122.c = new wsy();
        a122.a();
        agmi a123 = agmk.a();
        a123.d = 2;
        a123.c(true);
        a123.d(true);
        a123.b = new mqr(0);
        a123.a = "participants.duplicate_of";
        a123.c = new wsy();
        a123.a();
        agmi a124 = agmk.a();
        a124.d = 1;
        a124.a = "participants.cms_life_cycle";
        a124.c = new wsy();
        a124.a();
        agmi a125 = agmk.a();
        a125.d = 1;
        a125.a = "participants.norm_ui_status";
        a125.c = new wsy();
        a125.a();
        agmi a126 = agmk.a();
        a126.d = 4;
        a126.a = "participants.last_modified_by_key";
        a126.c = new wsy();
        a126.a();
        agmi a127 = agmk.a();
        a127.d = 1;
        a127.a = "participants.name_source";
        a127.c = new wsy();
        a127.a();
        agmi a128 = agmk.a();
        a128.d = 1;
        a128.a = "participants.photo_source";
        a128.c = new wsy();
        a128.a();
        agmi a129 = agmk.a();
        a129.d = 1;
        a129.a = "participants.profile_photo_user_preference";
        a129.c = new wsy();
        a129.a();
        agmi a130 = agmk.a();
        a130.d = 5;
        a130.a = "participants.contact_metadata";
        a130.c = new wsy();
        a130.a();
    }

    public lxe(armf armfVar, armf armfVar2, char[] cArr) {
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }
}
