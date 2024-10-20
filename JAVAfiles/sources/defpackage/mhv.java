package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mhv implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mhv(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, mll] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul c;
        int i;
        int aU;
        int aU2;
        akul c2;
        akul ag;
        akul ag2;
        int i2 = 6;
        int i3 = 4;
        int i4 = 15;
        int i5 = 9;
        byte[] bArr = null;
        int i6 = 1;
        int i7 = 1;
        r8 = true;
        boolean z = true;
        int i8 = 0;
        switch (this.d) {
            case 0:
                return ((mie) ((mic) this.a).F.b()).b(this.b, (amgl) this.c);
            case 1:
                ((ahqr) ((lqn) this.a).a).f((ahqq) this.c, (ahka) this.b, null, ahqp.ERROR);
                return aktp.af((Throwable) obj);
            case 2:
                alog alogVar = (alog) obj;
                int h = ((smr) this.c).h();
                Integer valueOf = Integer.valueOf(h);
                if (!((Boolean) ((utz) yig.Z.get()).e()).booleanValue()) {
                    return aktp.ag(new mod(moe.HIDDEN, null));
                }
                Optional h2 = mls.h(alogVar, this.b);
                if (h2.isPresent()) {
                    Object obj2 = this.a;
                    nfw nfwVar = (nfw) h2.get();
                    valueOf.getClass();
                    moc mocVar = ((mls) obj2).p;
                    c = qjh.c(mocVar.a, arpj.a, arwf.a, new mdi(mocVar, nfwVar, h, (arpe) null, 5));
                    return c;
                }
                return aktp.ag(new mod(moe.HIDDEN, null));
            case 3:
                nfb nfbVar = (nfb) obj;
                boolean z2 = nfbVar.d;
                Object obj3 = this.b;
                ?? r4 = this.a;
                if (!z2) {
                    alwl alwlVar = (alwl) mlv.a.g();
                    alwlVar.X(ydl.q, r4);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 171, "BugleConversationUnlatcher.java")).t("Unlatcher: Unlatching because the Recipient is NOT RCS enabled therefore there is no need for a latch. Recipient Capabilities: %s.", nfbVar);
                    return ((mlu) ((mlv) obj3).c.b()).B(r4, amjj.SEND_MODE_AUTO);
                }
                mlv mlvVar = (mlv) obj3;
                Instant f = ((xnv) mlvVar.e.b()).f();
                synchronized (mlvVar.f) {
                    if (Duration.between(((mlv) obj3).g, f).compareTo(mlv.b) < 0) {
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        ((mlv) obj3).g = f;
                    }
                }
                if (i6 == 0) {
                    alwl alwlVar2 = (alwl) mlv.a.g();
                    alwlVar2.X(ydl.q, r4);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 187, "BugleConversationUnlatcher.java")).q("Unlatcher: Skipping Recipient online status check due to rate limiting. Conversation will remain latched.");
                    return aktp.ag(null);
                }
                ?? r0 = this.c;
                alwl alwlVar3 = (alwl) mlv.a.g();
                alwlVar3.X(ydl.q, r4);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 196, "BugleConversationUnlatcher.java")).q("Unlatcher: Calling Recipient.isOnline().");
                return r0.m().i(new ikd(obj3, r4, 14, bArr), andi.a);
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    ?? r02 = this.c;
                    Object obj4 = this.a;
                    return r02.b().i(new ikd(this.b, obj4, i4, bArr), andi.a).f(Throwable.class, new lso(obj4, 12), andi.a);
                }
                return aktp.ag(null);
            case 5:
                Boolean bool = (Boolean) obj;
                mmg mmgVar = (mmg) this.b;
                if (((pja) mmgVar.k.b()).a()) {
                    return aktp.ag(bool);
                }
                if (bool.booleanValue()) {
                    return mmgVar.E((BugleConversationId) this.a, (String) this.c, true);
                }
                return aktp.ag(false);
            case 6:
                int i9 = ((wrw) obj).c;
                int aU3 = a.aU(i9);
                if (aU3 != 0 && aU3 == 4) {
                    return ((mnw) this.a).A((alog) this.b, (String) this.c, false);
                }
                int aU4 = a.aU(i9);
                if (aU4 == 0) {
                    aU4 = 1;
                }
                return aktp.af(new IllegalStateException(String.format("Invalid satellite session status [%s] for creating a conversation with %s", wch.w(aU4), "EMERGENCY+SERVICE+PROVIDER+DEMO")));
            case 7:
                wrw wrwVar = (wrw) obj;
                int aU5 = a.aU(wrwVar.c);
                if (aU5 == 0) {
                    aU5 = 1;
                }
                Object obj5 = this.c;
                Object obj6 = this.b;
                Object obj7 = this.a;
                if (aU5 != 4) {
                    mnw mnwVar = (mnw) obj7;
                    if (mnwVar.B(((Recipient) ((alog) obj6).get(0)).f(), true)) {
                        if (((osi) mnwVar.f.b()).a()) {
                            alvw i10 = mnw.a.i();
                            i10.X(alwp.a, "BugleEmergencySOS");
                            alvg alvgVar = (alvg) ((alvg) i10).h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository", "getOrCreateConversation", 140, "EmergencySosConversationRepository.java");
                            int aU6 = a.aU(wrwVar.c);
                            if (aU6 != 0) {
                                i7 = aU6;
                            }
                            alvgVar.t("Invalid session status [%s] for creating demo conversation, trying syncing session status with Stargate", wch.w(i7));
                            wsl wslVar = (wsl) mnwVar.d.b();
                            c2 = qjh.c(wslVar.a, arpj.a, arwf.a, new vck(wslVar, (arpe) null, 15, (byte[]) null));
                            return c2.i(new mhv(obj7, obj6, obj5, i2), mnwVar.b);
                        }
                        int aU7 = a.aU(wrwVar.c);
                        if (aU7 == 0) {
                            aU7 = 1;
                        }
                        return aktp.af(new IllegalStateException(String.format("Invalid satellite session status [%s] for creating a conversation with %s", wch.w(aU7), "EMERGENCY+SERVICE+PROVIDER+DEMO")));
                    }
                }
                alog alogVar2 = (alog) obj6;
                mnw mnwVar2 = (mnw) obj7;
                if (!mnwVar2.B(((Recipient) alogVar2.get(0)).f(), false) || (((aU = a.aU((i = wrwVar.c))) == 0 || aU != 3) && ((aU2 = a.aU(i)) == 0 || aU2 != 7))) {
                    z = false;
                }
                return mnwVar2.A(alogVar2, (String) obj5, z);
            case 8:
                return ((mlu) ((mnw) this.a).e.b()).k((alog) this.b, (String) this.c);
            case 9:
                Object obj8 = this.b;
                final ?? r15 = this.a;
                mis misVar = (mis) obj;
                final nfw f2 = r15.f();
                final mwf mwfVar = (mwf) obj8;
                mwfVar.f(f2);
                final mwb mwbVar = new mwb();
                mwbVar.g(mit.ONE_ON_ONE);
                mwbVar.n(false);
                int i11 = alog.d;
                mwbVar.l(alsx.a);
                mwbVar.d = 2;
                mwbVar.i(false);
                mwbVar.j(Long.MAX_VALUE);
                mwbVar.d(0);
                mwbVar.m(Integer.MAX_VALUE);
                mwbVar.k(new mod(moe.HIDDEN, null));
                mwbVar.h((amjk) amjk.a.createBuilder().s());
                mwbVar.c = f2;
                BugleConversationId bugleConversationId = mwfVar.h;
                if (bugleConversationId != null) {
                    Object obj9 = this.c;
                    mwbVar.b = bugleConversationId;
                    mwbVar.g(r15.b());
                    mwbVar.n(r15.E());
                    mwbVar.e(mjq.NONE);
                    final alog alogVar3 = (alog) obj9;
                    mwbVar.l(alogVar3);
                    mwbVar.f(misVar);
                    mwbVar.k(r15.u());
                    if (r15.q()) {
                        alwl alwlVar4 = (alwl) mwf.a.d();
                        alwlVar4.X(ydl.q, mwfVar.h);
                        ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "getComposeConstraints", 277, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: Race condition detected deleted conversation.");
                        misVar = mis.CONVERSATION_UNKNOWN;
                        mwbVar.f(misVar);
                    }
                    if (f2 == null && misVar == mis.NONE) {
                        alwl alwlVar5 = (alwl) mwf.a.d();
                        alwlVar5.X(ydl.q, mwfVar.h);
                        ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "getComposeConstraints", 290, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: Race condition detected with null Self Identity.");
                        misVar = mis.SELFIDENTITY_UNAVAILABLE;
                        mwbVar.f(misVar);
                    }
                    if (misVar != mis.NONE) {
                        alwl alwlVar6 = (alwl) mwf.a.i();
                        alwlVar6.X(ydl.q, mwfVar.h);
                        ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "getComposeConstraints", 300, "BugleComposeConstraintsSupplier.java")).t("Compose Constraints: Compose Disabled: %s.", misVar);
                        return aktp.ag(mwbVar.a());
                    }
                    mwbVar.d = 1;
                    mwbVar.i(true);
                    if (f2 != null) {
                        ag = f2.d().b();
                    } else {
                        ag = aktp.ag(ngh.b);
                    }
                    final akul akulVar = ag;
                    if (f2 != null) {
                        ag2 = f2.e().b();
                    } else {
                        ag2 = aktp.ag(false);
                    }
                    final akul akulVar2 = ag2;
                    return aktp.an(akulVar, akulVar2).i(new ancr() { // from class: mwd
                        @Override // defpackage.ancr
                        public final ListenableFuture a() {
                            amfg amfgVar;
                            int i12;
                            boolean z3;
                            boolean z4;
                            boolean z5;
                            mjq mjqVar;
                            akul ag3;
                            mwd mwdVar;
                            akul akulVar3;
                            akul ag4;
                            final aozy createBuilder = amjk.a.createBuilder();
                            ngh nghVar = (ngh) albo.bQ(akulVar);
                            boolean booleanValue = ((Boolean) albo.bQ(akulVar2)).booleanValue();
                            final mll mllVar = r15;
                            amjj x = mllVar.x();
                            int r = mllVar.r();
                            if (r != 0) {
                                if (r != 1) {
                                    if (r != 2) {
                                        amfgVar = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                                    } else {
                                        amfgVar = amfg.CONVERSATION_TYPE_GROUP_RCS;
                                    }
                                } else {
                                    amfgVar = amfg.CONVERSATION_TYPE_GROUP_MMS;
                                }
                            } else {
                                amfgVar = amfg.CONVERSATION_TYPE_ONE_ON_ONE;
                            }
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amjk amjkVar = (amjk) createBuilder.b;
                            amjkVar.f = amfgVar.f;
                            amjkVar.b |= 8;
                            boolean C = mllVar.C();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            apag apagVar = createBuilder.b;
                            amjk amjkVar2 = (amjk) apagVar;
                            amjkVar2.b |= 256;
                            amjkVar2.j = C;
                            int i13 = 3;
                            if (x == amjj.SEND_MODE_XMS_LATCH) {
                                i12 = 3;
                            } else {
                                i12 = 2;
                            }
                            if (!apagVar.isMutable()) {
                                createBuilder.u();
                            }
                            apag apagVar2 = createBuilder.b;
                            amjk amjkVar3 = (amjk) apagVar2;
                            amjkVar3.h = i12 - 1;
                            amjkVar3.b |= 32;
                            if (x != amjj.SEND_MODE_XMS) {
                                i13 = 2;
                            }
                            if (!apagVar2.isMutable()) {
                                createBuilder.u();
                            }
                            apag apagVar3 = createBuilder.b;
                            amjk amjkVar4 = (amjk) apagVar3;
                            amjkVar4.g = i13 - 1;
                            amjkVar4.b |= 16;
                            if (!apagVar3.isMutable()) {
                                createBuilder.u();
                            }
                            final mwb mwbVar2 = mwbVar;
                            final alog alogVar4 = alogVar3;
                            final mwf mwfVar2 = mwf.this;
                            amjk amjkVar5 = (amjk) createBuilder.b;
                            amjkVar5.k = x.e;
                            amjkVar5.b |= 512;
                            if (r == 1) {
                                alwl alwlVar7 = (alwl) mwf.a.g();
                                alwlVar7.X(ydl.q, mwfVar2.h);
                                ((alwl) alwlVar7.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeTransportFeatureSet", 588, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: SIMPLE due to CONVERSATION_TYPE_GROUP_XMS.");
                                ag4 = aktp.ag(new kor(mjq.SIMPLE));
                            } else if (r == 2) {
                                alwl alwlVar8 = (alwl) mwf.a.g();
                                alwlVar8.X(ydl.q, mwfVar2.h);
                                ((alwl) alwlVar8.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeTransportFeatureSet", 597, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: RICH due to CONVERSATION_TYPE_GROUP_RCS.");
                                ag4 = aktp.ag(new kor(mjq.RICH));
                            } else {
                                mit b = mllVar.b();
                                if (b != mit.ONE_ON_ONE && b != mit.RBM) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                albo.T(z3);
                                if (alogVar4.size() == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                d.s(z4);
                                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) alogVar4.get(0);
                                if (((orj) mwfVar2.m.b()).a() && resolvedRecipient.f().B()) {
                                    alwl alwlVar9 = (alwl) mwf.a.g();
                                    alwlVar9.X(ydl.q, mwfVar2.h);
                                    ((alwl) alwlVar9.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeTransportFeatureSet", 614, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: SATELLITE.");
                                    ag4 = aktp.ag(new kor(mjq.SATELLITE));
                                } else {
                                    boolean a = nghVar.a();
                                    aozy createBuilder2 = ammc.a.createBuilder();
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    ammc.a((ammc) createBuilder2.b);
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    apag apagVar4 = createBuilder2.b;
                                    z5 = booleanValue;
                                    ammc ammcVar = (ammc) apagVar4;
                                    ammcVar.b |= 128;
                                    ammcVar.j = a;
                                    if (!apagVar4.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    ammc ammcVar2 = (ammc) createBuilder2.b;
                                    ammcVar2.b |= 1;
                                    ammcVar2.c = a;
                                    ammc ammcVar3 = (ammc) createBuilder2.s();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    amjk amjkVar6 = (amjk) createBuilder.b;
                                    ammcVar3.getClass();
                                    amjkVar6.l = ammcVar3;
                                    amjkVar6.b |= 1024;
                                    if (x == amjj.SEND_MODE_XMS) {
                                        alwl alwlVar10 = (alwl) mwf.a.g();
                                        alwlVar10.X(ydl.q, mwfVar2.h);
                                        ((alwl) alwlVar10.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeTransportFeatureSet", 632, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: SIMPLE due to SEND_MODE_XMS.");
                                        if (((obo) mwfVar2.p.b()).a()) {
                                            mjqVar = mjq.SIMPLE;
                                            ag3 = mwfVar2.d(resolvedRecipient.x(2)).b().h(new tty(mwfVar2, mjqVar, createBuilder, b, mwbVar2, mllVar, alogVar4, 1), mwfVar2.d);
                                            mwdVar = this;
                                            akulVar3 = ag3;
                                        } else {
                                            ag3 = aktp.ag(new kor(mjq.SIMPLE));
                                            mwdVar = this;
                                            akulVar3 = ag3;
                                        }
                                    } else if (x == amjj.SEND_MODE_XMS_LATCH) {
                                        alwl alwlVar11 = (alwl) mwf.a.g();
                                        alwlVar11.X(ydl.q, mwfVar2.h);
                                        ((alwl) alwlVar11.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeTransportFeatureSet", 643, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: SIMPLE due to XMS Latch.");
                                        ((mlw) mwfVar2.f.b()).a(mwfVar2.h).k(qiu.b(), mwfVar2.d);
                                        if (((obo) mwfVar2.p.b()).a()) {
                                            mjqVar = mjq.SIMPLE;
                                            ag3 = mwfVar2.d(resolvedRecipient.x(2)).b().h(new tty(mwfVar2, mjqVar, createBuilder, b, mwbVar2, mllVar, alogVar4, 1), mwfVar2.d);
                                            mwdVar = this;
                                            akulVar3 = ag3;
                                        } else {
                                            ag3 = aktp.ag(new kor(mjq.SIMPLE));
                                            mwdVar = this;
                                            akulVar3 = ag3;
                                        }
                                    } else {
                                        mjqVar = null;
                                        if (!a && b == mit.ONE_ON_ONE) {
                                            alwl alwlVar12 = (alwl) mwf.a.g();
                                            alwlVar12.X(ydl.q, mwfVar2.h);
                                            ((alwl) alwlVar12.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeTransportFeatureSet", 659, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: SIMPLE due to Kind.ONE_ON_ONE and Rcs not enabled for SelfIdentity.");
                                            if (((obo) mwfVar2.p.b()).a()) {
                                                mjqVar = mjq.SIMPLE;
                                            } else {
                                                ag3 = aktp.ag(new kor(mjq.SIMPLE));
                                                mwdVar = this;
                                                akulVar3 = ag3;
                                            }
                                        }
                                        ag3 = mwfVar2.d(resolvedRecipient.x(2)).b().h(new tty(mwfVar2, mjqVar, createBuilder, b, mwbVar2, mllVar, alogVar4, 1), mwfVar2.d);
                                        mwdVar = this;
                                        akulVar3 = ag3;
                                    }
                                    final nfw nfwVar2 = f2;
                                    final boolean z6 = z5;
                                    return akulVar3.i(new ancs() { // from class: mwe
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r1v11, types: [arwe, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Iterable] */
                                        /* JADX WARN: Type inference failed for: r5v13, types: [armf, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r5v9, types: [armf, java.lang.Object] */
                                        @Override // defpackage.ancs
                                        public final ListenableFuture a(Object obj10) {
                                            int d;
                                            akul c3;
                                            int i14;
                                            kor korVar = (kor) obj10;
                                            Object obj11 = korVar.a;
                                            amjk amjkVar7 = (amjk) createBuilder.s();
                                            mwb mwbVar3 = mwbVar2;
                                            mwbVar3.h(amjkVar7);
                                            mwbVar3.b().j(korVar.b);
                                            nfw nfwVar3 = nfwVar2;
                                            mll mllVar2 = mllVar;
                                            alog alogVar5 = alogVar4;
                                            if (nfwVar3 != null && mwf.h(mllVar2, alogVar5)) {
                                                int intValue = ((Long) yig.V.e()).intValue();
                                                mwbVar3.m(nfwVar3.g().d());
                                                mwbVar3.j(r1.c());
                                                mwbVar3.e(mjq.RICH);
                                                if (intValue > 0) {
                                                    i14 = 1;
                                                } else {
                                                    i14 = 2;
                                                }
                                                mwbVar3.d = i14;
                                                mwbVar3.d(intValue);
                                                mwbVar3.i(true);
                                                return aktp.ag(mwbVar3.a());
                                            }
                                            mwf mwfVar3 = mwf.this;
                                            boolean z7 = false;
                                            if (obj11 == mjq.SIMPLE) {
                                                nfwVar3.getClass();
                                                mit b2 = mllVar2.b();
                                                kor korVar2 = mwfVar3.w;
                                                mit mitVar = mit.GROUP;
                                                akul y = korVar2.y(nfwVar3, alogVar5);
                                                if (b2 == mitVar) {
                                                    z7 = true;
                                                }
                                                return y.h(new puq(mwfVar3, z7, mwbVar3, alogVar5, 1), mwfVar3.d);
                                            }
                                            byte[] bArr2 = null;
                                            if (((orj) mwfVar3.m.b()).a() && obj11 == mjq.SATELLITE) {
                                                kor korVar3 = (kor) mwfVar3.n.b();
                                                c3 = qjh.c(korVar3.b, arpj.a, arwf.a, new mwv(korVar3, (arpe) null, 1));
                                                return c3.h(new mmq(mwfVar3, mwbVar3, 6, bArr2), mwfVar3.d);
                                            }
                                            boolean z8 = z6;
                                            albo.T(((mjq) obj11).g);
                                            mjq mjqVar2 = mjq.RICH;
                                            if (z8 && mllVar2.k()) {
                                                mjqVar2 = mjq.RICH_ENCRYPTED;
                                                mwbVar3.b().c(mjqVar2);
                                                alwl alwlVar13 = (alwl) mwf.a.g();
                                                alwlVar13.X(ydl.q, mwfVar3.h);
                                                ((alwl) alwlVar13.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeRichConstraints", 459, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: RICH_ENCRYPTED.");
                                            } else {
                                                alwl alwlVar14 = (alwl) mwf.a.g();
                                                alwlVar14.X(ydl.q, mwfVar3.h);
                                                ((alwl) alwlVar14.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeRichConstraints", 464, "BugleComposeConstraintsSupplier.java")).I("Compose Constraints: Not encrypted. isSelfIdentityEncryptionEnabled=%s, conversation.isEncrypted=%s.", z8, mllVar2.k());
                                            }
                                            nfwVar3.getClass();
                                            ngi g = nfwVar3.g();
                                            if (mllVar2.b() == mit.GROUP) {
                                                z7 = true;
                                            }
                                            if (z7) {
                                                d = g.b();
                                            } else {
                                                d = g.d();
                                            }
                                            if (mjqVar2.h) {
                                                if (z7) {
                                                    hgi s = nfwVar3.s();
                                                    alogVar5.size();
                                                    d = ((trz) s.a.b()).x(d);
                                                } else {
                                                    d = ((trz) nfwVar3.s().a.b()).a(d);
                                                }
                                            }
                                            mwbVar3.m(d);
                                            mwbVar3.e(mjqVar2);
                                            mwfVar3.g(mjqVar2, mwbVar3);
                                            mwbVar3.j(g.c());
                                            if (mwbVar3.c() == 3) {
                                                alwl alwlVar15 = (alwl) mwf.a.g();
                                                alwlVar15.X(ydl.q, mwfVar3.h);
                                                ((alwl) alwlVar15.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeRichConstraints", 494, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: Pre-UP Recipient. Attachments will require MMS downgrade.");
                                                return mwfVar3.w.y(nfwVar3, alogVar5).h(new mmq(mwfVar3, mwbVar3, 5, bArr2), mwfVar3.d);
                                            }
                                            return aktp.ag(mwbVar3.a());
                                        }
                                    }, mwfVar2.d);
                                }
                            }
                            mwdVar = this;
                            akulVar3 = ag4;
                            z5 = booleanValue;
                            final nfw nfwVar22 = f2;
                            final boolean z62 = z5;
                            return akulVar3.i(new ancs() { // from class: mwe
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r1v11, types: [arwe, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Iterable] */
                                /* JADX WARN: Type inference failed for: r5v13, types: [armf, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r5v9, types: [armf, java.lang.Object] */
                                @Override // defpackage.ancs
                                public final ListenableFuture a(Object obj10) {
                                    int d;
                                    akul c3;
                                    int i14;
                                    kor korVar = (kor) obj10;
                                    Object obj11 = korVar.a;
                                    amjk amjkVar7 = (amjk) createBuilder.s();
                                    mwb mwbVar3 = mwbVar2;
                                    mwbVar3.h(amjkVar7);
                                    mwbVar3.b().j(korVar.b);
                                    nfw nfwVar3 = nfwVar22;
                                    mll mllVar2 = mllVar;
                                    alog alogVar5 = alogVar4;
                                    if (nfwVar3 != null && mwf.h(mllVar2, alogVar5)) {
                                        int intValue = ((Long) yig.V.e()).intValue();
                                        mwbVar3.m(nfwVar3.g().d());
                                        mwbVar3.j(r1.c());
                                        mwbVar3.e(mjq.RICH);
                                        if (intValue > 0) {
                                            i14 = 1;
                                        } else {
                                            i14 = 2;
                                        }
                                        mwbVar3.d = i14;
                                        mwbVar3.d(intValue);
                                        mwbVar3.i(true);
                                        return aktp.ag(mwbVar3.a());
                                    }
                                    mwf mwfVar3 = mwf.this;
                                    boolean z7 = false;
                                    if (obj11 == mjq.SIMPLE) {
                                        nfwVar3.getClass();
                                        mit b2 = mllVar2.b();
                                        kor korVar2 = mwfVar3.w;
                                        mit mitVar = mit.GROUP;
                                        akul y = korVar2.y(nfwVar3, alogVar5);
                                        if (b2 == mitVar) {
                                            z7 = true;
                                        }
                                        return y.h(new puq(mwfVar3, z7, mwbVar3, alogVar5, 1), mwfVar3.d);
                                    }
                                    byte[] bArr2 = null;
                                    if (((orj) mwfVar3.m.b()).a() && obj11 == mjq.SATELLITE) {
                                        kor korVar3 = (kor) mwfVar3.n.b();
                                        c3 = qjh.c(korVar3.b, arpj.a, arwf.a, new mwv(korVar3, (arpe) null, 1));
                                        return c3.h(new mmq(mwfVar3, mwbVar3, 6, bArr2), mwfVar3.d);
                                    }
                                    boolean z8 = z62;
                                    albo.T(((mjq) obj11).g);
                                    mjq mjqVar2 = mjq.RICH;
                                    if (z8 && mllVar2.k()) {
                                        mjqVar2 = mjq.RICH_ENCRYPTED;
                                        mwbVar3.b().c(mjqVar2);
                                        alwl alwlVar13 = (alwl) mwf.a.g();
                                        alwlVar13.X(ydl.q, mwfVar3.h);
                                        ((alwl) alwlVar13.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeRichConstraints", 459, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: RICH_ENCRYPTED.");
                                    } else {
                                        alwl alwlVar14 = (alwl) mwf.a.g();
                                        alwlVar14.X(ydl.q, mwfVar3.h);
                                        ((alwl) alwlVar14.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeRichConstraints", 464, "BugleComposeConstraintsSupplier.java")).I("Compose Constraints: Not encrypted. isSelfIdentityEncryptionEnabled=%s, conversation.isEncrypted=%s.", z8, mllVar2.k());
                                    }
                                    nfwVar3.getClass();
                                    ngi g = nfwVar3.g();
                                    if (mllVar2.b() == mit.GROUP) {
                                        z7 = true;
                                    }
                                    if (z7) {
                                        d = g.b();
                                    } else {
                                        d = g.d();
                                    }
                                    if (mjqVar2.h) {
                                        if (z7) {
                                            hgi s = nfwVar3.s();
                                            alogVar5.size();
                                            d = ((trz) s.a.b()).x(d);
                                        } else {
                                            d = ((trz) nfwVar3.s().a.b()).a(d);
                                        }
                                    }
                                    mwbVar3.m(d);
                                    mwbVar3.e(mjqVar2);
                                    mwfVar3.g(mjqVar2, mwbVar3);
                                    mwbVar3.j(g.c());
                                    if (mwbVar3.c() == 3) {
                                        alwl alwlVar15 = (alwl) mwf.a.g();
                                        alwlVar15.X(ydl.q, mwfVar3.h);
                                        ((alwl) alwlVar15.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "computeRichConstraints", 494, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: Pre-UP Recipient. Attachments will require MMS downgrade.");
                                        return mwfVar3.w.y(nfwVar3, alogVar5).h(new mmq(mwfVar3, mwbVar3, 5, bArr2), mwfVar3.d);
                                    }
                                    return aktp.ag(mwbVar3.a());
                                }
                            }, mwfVar2.d);
                        }
                    }, mwfVar.d);
                }
                throw new NullPointerException("Null conversationId");
            case 10:
                Optional optional = (Optional) obj;
                boolean isEmpty = optional.isEmpty();
                ?? r5 = this.b;
                if (!isEmpty && ((Boolean) optional.get()).booleanValue()) {
                    Object obj10 = this.c;
                    Object obj11 = this.a;
                    ncz nczVar = (ncz) obj11;
                    return nczVar.b.c(r5.v()).h(new kxr(obj11, (Object) r5, obj10, 11, (byte[]) null), nczVar.d);
                }
                return aktp.ag(new ncw(r5.B(), 8));
            case 11:
                final prt prtVar = ((prk) this.a).q;
                uie uieVar = (uie) prtVar.d.b();
                Object obj12 = this.b;
                final String str = (String) this.c;
                final BusinessInfoData businessInfoData = (BusinessInfoData) obj12;
                return uieVar.d("UpdateRbmBusinessInfoAuxiliaryData", new Runnable() { // from class: prs
                    @Override // java.lang.Runnable
                    public final void run() {
                        xhv xhvVar;
                        Optional empty;
                        prt prtVar2 = prt.this;
                        BusinessInfoData businessInfoData2 = businessInfoData;
                        String str2 = str;
                        int i12 = 15;
                        try {
                            snf e = sni.e();
                            e.w("+getTelephonyRecipientIdByBotId");
                            e.e(new prj(5));
                            e.h(new nfc(str2, i12));
                            e.i(new atkn((Object) sni.c.r, false));
                            e.u(1);
                            sna snaVar = (sna) e.b().n();
                            try {
                                if (snaVar.moveToFirst()) {
                                    xhvVar = snaVar.L();
                                } else {
                                    xhvVar = null;
                                }
                                snaVar.close();
                                if (xhvVar == null) {
                                    prt.a.o("No conversation exists for this bot");
                                    empty = Optional.empty();
                                } else {
                                    try {
                                        String G = ((wzs) prtVar2.j.b()).G(xhvVar);
                                        if (TextUtils.isEmpty(G)) {
                                            ((mho) prtVar2.e.b()).aM(12, str2);
                                            prt.b(str2, "Cannot find recipient ID for thread ID");
                                            empty = Optional.empty();
                                        } else {
                                            String[] split = TextUtils.split(G, " ");
                                            int length = split.length;
                                            if (length == 0) {
                                                ((mho) prtVar2.e.b()).aM(12, str2);
                                                prt.b(str2, "No recipients for thread ID.");
                                                empty = Optional.empty();
                                            } else if (length > 1) {
                                                ((mho) prtVar2.e.b()).aM(13, str2);
                                                prt.b(str2, "Multiple recipients for thread ID");
                                                empty = Optional.empty();
                                            } else {
                                                empty = Optional.of(split[0]);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        ((mho) prtVar2.e.b()).aM(12, str2);
                                        xyo b = prt.a.b();
                                        b.H("Getting recipient ID string from telephony threw");
                                        b.z("botId", str2);
                                        b.z("exception", th.getMessage());
                                        b.q();
                                        empty = Optional.empty();
                                    }
                                }
                                empty.ifPresent(new ksn(prtVar2, businessInfoData2, 9));
                            } finally {
                            }
                        } catch (Throwable unused) {
                            ((mho) prtVar2.e.b()).aM(15, str2);
                            xyo b2 = prt.a.b();
                            b2.H("Error updating canonical address in Telephony");
                            b2.z("botId", str2);
                            b2.q();
                        }
                        ParticipantsTable.BindData b3 = ((rxq) prtVar2.g.b()).b(businessInfoData2.getRbmBotId());
                        if (b3 == null) {
                            prt.a.o("No existing participants for bot");
                            return;
                        }
                        ParticipantsTable.BindData a = rxn.a(businessInfoData2.getRbmBotId(), businessInfoData2.getName(), businessInfoData2.getColor());
                        tbb f3 = ParticipantsTable.f();
                        f3.aj("updateParticipantAndConversations");
                        f3.m(a.J());
                        f3.n(a.l());
                        f3.e(a.h());
                        f3.f(a.k());
                        String logoImageLocalUri = businessInfoData2.getLogoImageLocalUri();
                        if (logoImageLocalUri != null) {
                            f3.D(Uri.parse(logoImageLocalUri));
                        }
                        boolean d = f3.d(b3.M());
                        xyo c3 = prt.a.c();
                        c3.A("participant updated", d);
                        c3.q();
                        if (d) {
                            ((rtz) prtVar2.h.b()).P(b3.M());
                        }
                        ((ahiy) prtVar2.i.b()).r(aktp.ag(null), BusinessInfoDatabaseConstants.BusinessInfoTableConstants.TABLE_NAME);
                        alvw g = prt.b.g();
                        g.X(alwp.a, "BugleNotifications");
                        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper", "updateParticipantAndConversations", 161, "RbmBusinessInfoUpdateHelper.java")).q("Creating notification from RbmBusinessInfoUpdateHelper");
                        ((wpp) prtVar2.k.b()).J();
                    }
                });
            case 12:
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    Object obj13 = this.b;
                    prk prkVar = (prk) this.a;
                    prkVar.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                    return prkVar.g((prl) obj13);
                }
                Object obj14 = this.c;
                xyo c3 = prk.a.c();
                c3.H("Business info already exists and not expired. Skipping download of business info.");
                c3.z("RBM bot id", obj14);
                c3.q();
                return aktp.ag(upm.b());
            case 13:
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    Object obj15 = this.c;
                    xyo c4 = prk.a.c();
                    c4.H("Business info already exists, and operation mode downloads only if info is unavailable. Skipping download of business info.");
                    c4.z("RBM bot id", obj15);
                    c4.q();
                    return aktp.ag(upm.b());
                }
                Object obj16 = this.b;
                prk prkVar2 = (prk) this.a;
                prkVar2.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return prkVar2.g((prl) obj16);
            case 14:
                boolean booleanValue = ((Boolean) ((utz) pyl.a.get()).e()).booleanValue();
                Object obj17 = this.c;
                Object obj18 = this.b;
                Object obj19 = this.a;
                if (booleanValue) {
                    prk prkVar3 = (prk) obj19;
                    return ((pyk) prkVar3.k.b()).a((String) obj18, Integer.MAX_VALUE, UUID.randomUUID().toString(), Optional.empty(), Optional.empty()).i(new pri(obj17, obj18, i8), prkVar3.g);
                }
                prk prkVar4 = (prk) obj19;
                xpp xppVar = (xpp) prkVar4.j.b();
                return aktp.aj(new ncx(xppVar, obj18, UUID.randomUUID().toString(), i4), xppVar.c).h(new mmq(obj17, obj18, i5), prkVar4.g);
            case 15:
                pto ptoVar = (pto) obj;
                if (ptoVar.b().isAfter(((pto) this.a).b())) {
                    Object obj20 = this.c;
                    Object obj21 = this.b;
                    ((alwl) pus.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 113, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: valid backgroundCapabilities %s", ptoVar);
                    return ((pus) obj21).e.d(new mut(obj20, ptoVar, i5));
                }
                ((alwl) pus.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 122, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: not valid backgroundCapabilities %s", ptoVar);
                return aktp.ag(null);
            case 16:
                alor alorVar = (alor) Collection.EL.stream(((Map) obj).entrySet()).filter(new ncc(this.b, i5)).collect(alor.t());
                ((alwl) pus.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "fetchCapabilitiesInBackgroundIfInvalid", 231, "RcsCapabilitiesBackgroundUpdater.java")).u("RcsCapabilitiesBackgroundUpdater: %d of %d background fetch capabilities are fresher.", alorVar.size(), this.c.size());
                if (alorVar.isEmpty()) {
                    return aktp.ag(null);
                }
                return ((pus) this.a).e.d(new ptm(alorVar, i3));
            case 17:
                qei qeiVar = ((qfl) this.b).k;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                qei qeiVar2 = qeiVar;
                Object obj22 = this.c;
                Object obj23 = this.a;
                qbq qbqVar = (qbq) obj23;
                return qbqVar.f.f((ConversationIdType) obj22).i(new mhv(obj23, obj22, qeiVar2, 18, (char[]) null), qbqVar.b);
            case 18:
                qbs qbsVar = (qbs) obj;
                Object obj24 = this.a;
                qbq qbqVar2 = (qbq) obj24;
                qgr qgrVar = (qgr) qbqVar2.j.fu(yyb.ba());
                akul h3 = aktp.ai(new mzn(obj24, this.c, 18, bArr), qbqVar2.c).h(new mhr(qbqVar2, qbsVar, qgrVar, (qei) this.b, 2), qbqVar2.b);
                pss pssVar = qbqVar2.e;
                pssVar.getClass();
                byte[] bArr2 = null;
                return h3.i(new prf(pssVar, i2), qbqVar2.b).h(new kxr(obj24, qbsVar, qgrVar, 14, bArr2), qbqVar2.b).e(IllegalArgumentException.class, new kxr(obj24, qbsVar, qgrVar, 15, bArr2), qbqVar2.b);
            case 19:
                return qbu.a(((qbu) this.a).b, (ConversationIdType) this.c, (qfl) this.b, (upm) obj);
            default:
                return qbu.a(((qbu) this.a).e, (ConversationIdType) this.c, (qfl) this.b, (upm) obj);
        }
    }

    public /* synthetic */ mhv(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mhv(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
