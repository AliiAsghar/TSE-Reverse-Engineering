package defpackage;

import android.content.Context;
import android.util.LruCache;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mui implements mtn, yfx {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository");
    private final alhr A;
    private final armf B;
    private final armf C;
    private final armf D;
    private final armf E;
    private mvv F;
    private final anen G;
    private final ncq H;
    private final alhr I;
    private final Optional J;
    private final mvn K;
    private final mvn L;
    private final armf M;
    private final armf N;
    private final armf O;
    private final alhr P;
    private final armf Q;
    private final ConcurrentHashMap R = new ConcurrentHashMap();
    private final mue S = new mue(this);
    private yga T;
    private final lru U;
    private final kor V;
    private final yyt W;
    public final anen b;
    public final anen c;
    public final alhr d;
    public final armf e;
    public final muu f;
    public final mtr g;
    public final alhr h;
    public final armf i;
    public final BugleConversationId j;
    public final armf k;
    public final armf l;
    public final alhr m;
    public final armf n;
    public final armf o;
    public final alhr p;
    public final boolean q;
    public boolean r;
    public boolean s;
    public final kjp t;
    public final lxe u;
    private final muw v;
    private final alhr w;
    private final alhr x;
    private final ncq y;
    private final ncq z;

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [armf, java.lang.Object] */
    public mui(wfh wfhVar, anen anenVar, anen anenVar2, anen anenVar3, rae raeVar, kjp kjpVar, muw muwVar, kor korVar, armf armfVar, rtb rtbVar, lxe lxeVar, lxe lxeVar2, armf armfVar2, armf armfVar3, armf armfVar4, kor korVar2, kor korVar3, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, lru lruVar, kjp kjpVar2, armf armfVar13, lrf lrfVar, Optional optional, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, BugleConversationId bugleConversationId, ncq ncqVar, ncq ncqVar2, ncq ncqVar3, mtc mtcVar, boolean z, boolean z2) {
        this.W = wfhVar.Y(this);
        this.b = anenVar;
        this.c = anenVar2;
        this.G = anenVar3;
        this.v = muwVar;
        this.V = korVar;
        this.e = armfVar;
        this.u = lxeVar.n(z2);
        lxe lxeVar3 = (lxe) lxeVar2.b.b();
        lxeVar3.getClass();
        anen anenVar4 = (anen) lxeVar2.a.b();
        anenVar4.getClass();
        this.g = new mtr(lxeVar3, anenVar4, this, z2);
        this.h = albo.D(new nfd(armfVar2, 1));
        this.i = armfVar4;
        this.o = armfVar15;
        this.M = armfVar16;
        this.x = albo.D(new msp(this, bugleConversationId, 13, null));
        this.U = lruVar;
        this.q = z2;
        this.A = albo.D(new muc(this, armfVar3, z, bugleConversationId, armfVar8, 0));
        this.j = bugleConversationId;
        this.y = korVar2.u(new ncs(ncqVar2, new mds(korVar3, 17), anenVar));
        this.z = ncqVar3;
        this.B = armfVar5;
        this.C = armfVar6;
        this.D = armfVar7;
        this.k = armfVar9;
        this.l = armfVar10;
        this.E = armfVar11;
        this.J = optional;
        mvn i = lrfVar.i();
        this.K = i;
        this.L = lrfVar.i();
        Optional of = Optional.of(i);
        Context context = (Context) rtbVar.e.b();
        context.getClass();
        mtg mtgVar = (mtg) rtbVar.h.b();
        mtgVar.getClass();
        ?? r5 = rtbVar.l;
        myj myjVar = (myj) rtbVar.m.b();
        myjVar.getClass();
        alor alorVar = (alor) rtbVar.i.b();
        alorVar.getClass();
        ?? r14 = rtbVar.d;
        ?? r15 = rtbVar.k;
        ?? r12 = rtbVar.b;
        ?? r13 = rtbVar.a;
        ?? r2 = rtbVar.g;
        ((lga) rtbVar.j.b()).getClass();
        ((lga) rtbVar.f.b()).getClass();
        this.f = new muu(context, mtgVar, r5, myjVar, alorVar, r14, r15, r12, r13, r2, rtbVar.c, z2, mtcVar, of);
        this.m = albo.D(new msp(armfVar12, bugleConversationId, 11, null));
        this.t = kjpVar2;
        this.H = ncqVar;
        this.d = albo.D(new mrj(this, bugleConversationId, ncqVar, ncqVar2, raeVar, 11));
        this.w = albo.D(new msp(this, kjpVar, 12));
        this.I = albo.D(new mrf(this, armfVar13, ncqVar, ncqVar2, 14));
        this.n = armfVar14;
        this.N = armfVar17;
        this.p = albo.D(new aarr(armfVar18, z2, 1));
        this.O = armfVar19;
        this.P = albo.D(new mma(this, armfVar20, bugleConversationId, z2, 6));
        this.Q = armfVar21;
    }

    public static MessageIdType B(MessageId messageId) {
        if (messageId instanceof mvb) {
            return ((mvb) messageId).c();
        }
        throw new IllegalStateException("Unsupported message id type.");
    }

    public static String F(MessageId messageId) {
        if (messageId instanceof BugleMessageId) {
            return String.valueOf(((BugleMessageId) messageId).b());
        }
        throw new IllegalStateException("Unsupported message id type.");
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    private final akul K(agpj agpjVar, final boolean z) {
        akrh e = aktp.e("MessageRepository#getMessagesInternal");
        try {
            alvw g = a.g();
            g.X(alwp.a, "BugleMapi");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.q, this.j);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getMessagesInternal", 1127, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository getMessagesInternal start");
            final alog alogVar = (alog) this.h.get();
            final akul ai = aktp.ai(new mti(alogVar, z, agpjVar, 0), this.u.a);
            final akul b = this.y.b();
            akrh e2 = aktp.e("MessageRepository#getSelfIdentitiesFuture");
            try {
                final akul h = this.z.b().h(new mme(7), this.b);
                e2.close();
                e2 = aktp.e("MessageRepository#getConversationPropertiesFuture");
                try {
                    final akul b2 = this.H.b();
                    e2.b(b2);
                    e2.close();
                    ai.k(new vdc("BugleMessagePagerQueries#loadMessages succeeded.", this.j, "BugleMessagePagerQueries#loadMessages failed.", 1), andi.a);
                    b.k(new vdc("recipients#getAsync succeeded.", this.j, "recipients#getAsync failed.", 1), andi.a);
                    h.k(new vdc("getSelfIdentitiesFuture succeeded.", this.j, "getSelfIdentitiesFuture failed.", 1), andi.a);
                    b2.k(new vdc("getConversationPropertiesFuture succeeded.", this.j, "getConversationPropertiesFuture failed.", 1), andi.a);
                    akul g2 = akul.g(aktp.as(ai, b, h, b2).m(new Callable() { // from class: mub
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Code restructure failed: missing block: B:106:0x0527, code lost:
                        
                            if (defpackage.qrl.a() == false) goto L152;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
                        
                            if (defpackage.d.F(((com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) defpackage.aqjn.ag(r12)).f().m(), "EMERGENCY+SERVICE+PROVIDER+DEMO") != false) goto L28;
                         */
                        /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0518. Please report as an issue. */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:116:0x05d9  */
                        /* JADX WARN: Removed duplicated region for block: B:117:0x0416  */
                        /* JADX WARN: Removed duplicated region for block: B:125:0x027b  */
                        /* JADX WARN: Removed duplicated region for block: B:53:0x026d  */
                        /* JADX WARN: Removed duplicated region for block: B:59:0x0466  */
                        /* JADX WARN: Removed duplicated region for block: B:78:0x05f2  */
                        /* JADX WARN: Removed duplicated region for block: B:79:0x0623 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:88:0x04fa  */
                        /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r0v21, types: [armf, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r0v37, types: [armf, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r12v14, types: [armf, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r12v21, types: [armf, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r6v31, types: [armf, java.lang.Object] */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instructions count: 2032
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.mub.call():java.lang.Object");
                        }
                    }, this.c));
                    e.close();
                    return g2;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [alhr, java.lang.Object] */
    private final akul L(final nbk nbkVar) {
        akrh e = aktp.e("MessageRepository#react");
        try {
            final lfx lfxVar = (lfx) this.d.get();
            final long epochMilli = ((xnv) lfxVar.f.b()).f().toEpochMilli();
            final long a2 = ((xnv) lfxVar.f.b()).a();
            akul i = ((ncq) lfxVar.e.get()).b().i(new ancs() { // from class: mwa
                /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    mwc mwcVar = (mwc) obj;
                    return ((mzg) lfx.this.h.b()).b(nbkVar, mwcVar, epochMilli, a2);
                }
            }, lfxVar.c).i(new lso(this, 15), andi.a);
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mzt
    public final mjb A(MessageId messageId, Instant instant) {
        if (messageId instanceof CoreBuglePartialMessageId) {
            CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) messageId;
            long epochMilli = instant.toEpochMilli();
            MessageIdType messageIdType = coreBuglePartialMessageId.a;
            return new mts(epochMilli, messageIdType.a, coreBuglePartialMessageId.b);
        }
        return new mts(instant.toEpochMilli(), Long.parseLong(messageId.a()), 0L);
    }

    public final akul C(agpj agpjVar) {
        return K(agpjVar, false);
    }

    @Override // defpackage.mzt
    public final akul D(int i, int i2) {
        return C(this.u.d(this.j, i, i2));
    }

    @Override // defpackage.mzt
    public final Instant E(MessageId messageId) {
        Long l;
        albo.T(messageId instanceof mvb);
        MessageIdType c = ((mvb) messageId).c();
        akrh e = aktp.e("MessageTableOperations#getMessageTimeStamp");
        try {
            sxy d = MessagesTable.d();
            d.w("getMessageTimeStamp");
            d.e(new mva(17));
            d.g(new mvp(c, 8));
            sxt sxtVar = (sxt) d.b().n();
            try {
                if (sxtVar.moveToNext()) {
                    l = Long.valueOf(sxtVar.s());
                    sxtVar.close();
                } else {
                    sxtVar.close();
                    l = 0L;
                }
                e.close();
                return Instant.ofEpochMilli(l.longValue());
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mzt
    public final void G() {
        akrh e = aktp.e("MessageRepository#startPreload");
        try {
            alvw g = a.g();
            g.X(alwp.a, "BugleMapi");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.q, this.j);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "startPreload", 1285, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository startPreload");
            ((nah) this.A.get()).k();
            e.close();
            mvn mvnVar = this.K;
            if (!((Boolean) muv.e.e()).booleanValue()) {
                return;
            }
            yga ygaVar = mvnVar.c;
            if (ygaVar != null) {
                yyb.aJ(ygaVar);
            }
            mvnVar.c = g(new mvu(mvnVar, 1));
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee A[Catch: all -> 0x01d5, TryCatch #0 {all -> 0x01d5, blocks: (B:3:0x000a, B:5:0x0012, B:7:0x0016, B:9:0x002d, B:10:0x01b2, B:11:0x01b8, B:14:0x01bf, B:15:0x01c0, B:18:0x01cf, B:19:0x01d0, B:21:0x0034, B:23:0x0047, B:24:0x005c, B:26:0x0062, B:27:0x006c, B:29:0x0070, B:31:0x007e, B:35:0x0088, B:37:0x0090, B:39:0x0098, B:40:0x00e4, B:42:0x00ee, B:43:0x012a, B:44:0x0133, B:46:0x0139, B:48:0x015f, B:50:0x0166, B:54:0x019d, B:55:0x00d1, B:58:0x0054, B:13:0x01b9), top: B:2:0x000a, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r6v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
    @Override // defpackage.nbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(defpackage.mzc r34) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mui.H(mzc):void");
    }

    @Override // defpackage.mzt
    public final adlx I() {
        return (adlx) this.P.get();
    }

    public final lfl J() {
        return (lfl) this.m.get();
    }

    @Override // defpackage.mjg
    public final mja a() {
        return (mja) this.w.get();
    }

    @Override // defpackage.mjg
    public final mjd b() {
        return (mjd) this.A.get();
    }

    @Override // defpackage.mjg
    public final ConversationId c() {
        return this.j;
    }

    @Override // defpackage.mzt, java.lang.AutoCloseable
    public final void close() {
        ((nah) this.A.get()).close();
        this.K.close();
        this.L.close();
    }

    @Override // defpackage.mjg
    public final ncq d(MessageId messageId) {
        akrh e = aktp.e("MessageRepository#getMessageObservable");
        try {
            muz muzVar = new muz(this, messageId);
            e.close();
            return muzVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final ncq e() {
        akrh e = aktp.e("MessageRepository#getNumberOfUnreadMessages");
        try {
            if (this.F == null) {
                this.F = new mvv(this, this.G, this.j);
            }
            mvv mvvVar = this.F;
            e.close();
            return mvvVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    @Override // defpackage.mjg
    public final ncq f() {
        lru lruVar = this.U;
        iew iewVar = (iew) lruVar.c.b();
        iewVar.getClass();
        kor korVar = (kor) lruVar.b.b();
        korVar.getClass();
        arwe arweVar = (arwe) lruVar.a.b();
        arweVar.getClass();
        BugleConversationId bugleConversationId = this.j;
        bugleConversationId.getClass();
        return new mvq(iewVar, korVar, arweVar, bugleConversationId);
    }

    @Override // defpackage.yfx
    public final void fs() {
        boolean z;
        alvw g = a.g();
        g.X(alwp.a, "BugleMapi");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.q, this.j);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "onFirstRegister", 640, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository: onFirstRegister, Starting tombstone updater.");
        ncl nclVar = (ncl) this.I.get();
        synchronized (nclVar.f) {
            if (nclVar.g == null) {
                if (nclVar.e.compareAndSet(false, true)) {
                    nclVar.g = nclVar.d.a(new mlq(nclVar, 11));
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.T == null) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        alob alobVar = new alob();
        alog alogVar = (alog) this.x.get();
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            mzm mzmVar = (mzm) alogVar.get(i);
            alobVar.h(mzmVar.b(new muh(this.j, new muf(this, mzmVar.a(), this.S), 0)));
        }
        muw muwVar = this.v;
        muh muhVar = new muh(this.j, new muh(this.K, new muf(this, "messages table", this.S), 1), 0);
        synchronized (muwVar.e) {
            muwVar.d.add(muhVar);
            if (muwVar.d.size() == 1) {
                muwVar.c.E(muwVar.a);
            }
        }
        alobVar.h(new mul(muwVar, muhVar, 2));
        alobVar.h(((mzv) this.V.b).b(new muh(this.j, new muf(this, "message parts table", this.S), 0)));
        alobVar.h(this.y.a(new mug(this, "recipients", this.S)));
        alobVar.h(this.z.a(new mug(this, "self identity", this.S)));
        alobVar.h(((yyt) J().b).w(new kzq(new muf(this, "reactions cache", this.S), 10), "DefaultOptimisticReactionsCache::register", "DefaultOptimisticReactionsCache::callback", "DefaultOptimisticReactionsCache::unregister"));
        this.T = yfy.b(alobVar.g());
    }

    @Override // defpackage.yfx
    public final void ft() {
        yga ygaVar;
        alvw g = a.g();
        g.X(alwp.a, "BugleMapi");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.q, this.j);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "onLastUnregister", 678, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository: onLastUnregister, Stopping tombstone updater.");
        yga ygaVar2 = this.T;
        if (ygaVar2 != null) {
            ygaVar2.a();
            this.T = null;
        }
        ncl nclVar = (ncl) this.I.get();
        synchronized (nclVar.f) {
            nclVar.e.set(false);
            ygaVar = nclVar.g;
            nclVar.g = null;
        }
        if (ygaVar != null) {
            ygaVar.a();
        }
    }

    @Override // defpackage.mjg
    public final yga g(mjf mjfVar) {
        akrh e = aktp.e("MessageRepository#subscribeToChangesToAllMessages");
        try {
            alob alobVar = new alob();
            alobVar.h(this.W.w(new kzq(mjfVar, 9), "CoreBugleMessageRepository::register", "CoreBugleMessageRepository::callback", "CoreBugleMessageRepository::unregister"));
            mue mueVar = this.S;
            synchronized (mueVar.a) {
                mueVar.b.add(mjfVar);
            }
            alobVar.h(new mul(mueVar, mjfVar, 1));
            mud mudVar = new mud(this, yfy.b(alobVar.g()));
            e.close();
            return mudVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul h(alog alogVar) {
        akrh e = aktp.e("MessageRepository#deleteMessages");
        try {
            mkp mkpVar = (mkp) this.i.b();
            Stream map = Collection.EL.stream(alogVar).map(new mtm(2));
            int i = alog.d;
            akul b = mkpVar.b((List) map.collect(alls.a));
            e.close();
            return b;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul i() {
        akrh e = aktp.e("MessageRepository#getLatestReadMessage");
        try {
            lxe lxeVar = this.u;
            BugleConversationId bugleConversationId = this.j;
            sxy d = MessagesTable.d();
            d.w("getLatestReadMessage");
            d.e(new mtm(0));
            d.h((atkn[]) mvg.a.b.toArray(new atkn[0]));
            d.g(new mtl(bugleConversationId, 2));
            d.u(1);
            akul h = C(((akip) lxeVar.b).b(d).b()).h(new mme(6), andi.a);
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul j(MessageId messageId) {
        akul h;
        akrh e = aktp.e("MessageRepository#getMessage");
        try {
            if (!(messageId instanceof CoreBugleMessageId) && !(messageId instanceof CoreBuglePartialMessageId)) {
                h = aktp.af(new IllegalArgumentException("CoreBugleMessageId or CoreBuglePartialMessageId should be provided"));
            } else {
                h = C(new agpk("($V)", new Object[]{B(messageId).a()})).h(new mds(messageId, 18), andi.a);
            }
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul k() {
        return aktp.ai(new mig(this, 5), this.G);
    }

    @Override // defpackage.mjg
    public final akul l() {
        akrh e = aktp.e("MessageRepository#markAllMessagesAsRead");
        try {
            ((vco) this.B.b()).u(vlm.NT_INCOMING_MESSAGE, ((vjs) this.C.b()).s(this.j.a));
            akul d = ((rix) this.D.b()).d(this.j.a);
            e.close();
            return d;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    @Override // defpackage.mjg
    public final akul m(MessageId messageId) {
        akrh e = aktp.e("MessageRepository#pauseFileTransfer");
        try {
            lru lruVar = (lru) this.k.b();
            akul g = akul.g(((rbh) lruVar.c.b()).a(B(messageId)).t());
            e.close();
            return g;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul n(MessageId messageId) {
        if (!(messageId instanceof BugleMessageId)) {
            return aktp.af(new IllegalArgumentException("BugleMessageId should be provided"));
        }
        BugleMessageId bugleMessageId = (BugleMessageId) messageId;
        akul j = j(messageId);
        akul b = this.H.b();
        return akul.g(akul.g(aktp.as(j, b).n(new mtz((Object) this, j, (Object) b, (Object) bugleMessageId, 0), this.b)).h(new mmq(this, bugleMessageId, 4, null), this.b));
    }

    @Override // defpackage.mjg
    public final akul o(MessageId messageId) {
        if (!(messageId instanceof CoreBugleMessageId)) {
            return aktp.af(new IllegalArgumentException("CoreBugleMessageId should be provided"));
        }
        return j(messageId).h(new mmq(this, messageId, 3, null), this.b);
    }

    @Override // defpackage.mjg
    public final akul p(MessageId messageId) {
        akrh e = aktp.e("MessageRepository#resumeFileTransfer");
        try {
            akul i = j(messageId).i(new ikd(this, messageId, 17, null), andi.a);
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul q(MessageId messageId, int i) {
        return aktp.ah(new ebm(i, messageId, 5), this.G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [int] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v2, types: [akrh] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r2v11, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [arwe, java.lang.Object] */
    @Override // defpackage.mjg
    public final void r(miz mizVar, int i) {
        akrh akrhVar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        ((lfl) this.Q.b()).C(mizVar.b());
                        return;
                    }
                    ((lfl) this.Q.b()).C(mizVar.b());
                    return;
                }
                ((lfl) this.Q.b()).C(mizVar.b());
                return;
            }
            lfl lflVar = (lfl) this.Q.b();
            Object obj = lflVar.c;
            MessageId b = mizVar.b();
            synchronized (obj) {
                if (((LruCache) lflVar.c).get(b) == null) {
                    synchronized (lflVar.d) {
                        if (((LruCache) lflVar.d).get(b) != null) {
                            ((LruCache) lflVar.c).put(b, true);
                            ((LruCache) lflVar.d).remove(b);
                            qjh.l(lflVar.a, null, new kca(lflVar, mizVar, (arpe) null, 19), 3);
                        }
                    }
                }
            }
            return;
        }
        akrh e = aktp.e("MessageRepository#reportAnalyticsWithMetricExtension");
        try {
            if (mizVar instanceof mvt) {
                mje c = mizVar.c();
                mvt mvtVar = (mvt) mizVar;
                int v = mvtVar.v();
                atok x = mvtVar.x();
                mizVar.e();
                if (c.d() == 1 && (mizVar instanceof mtb)) {
                    ((mtb) mizVar).w().g(new mua(this, mizVar, v, 0));
                } else if (c.d() == 2 && x != null) {
                    String str = x.b;
                    xcs xcsVar = (xcs) this.l.b();
                    xcsVar.m(str, ((kor) xcsVar.r.b()).n(mizVar, this.r, this.s), v);
                    mjl mjlVar = (mjl) c;
                    try {
                        if (mjlVar.a() == mix.SENT) {
                            xcs xcsVar2 = (xcs) this.l.b();
                            xcsVar2.l(str, ((kor) xcsVar2.r.b()).n(mizVar, this.r, this.s), v);
                            ifq ifqVar = (ifq) this.N.b();
                            i = e;
                            qjh.l(ifqVar.a, ifqVar.c, new mdi(ifqVar, x, v, null, 3, null), 2);
                        } else {
                            akrh akrhVar2 = e;
                            i = akrhVar2;
                            if (mjlVar.a() == mix.DELIVERED) {
                                xcs xcsVar3 = (xcs) this.l.b();
                                xcsVar3.k(str, ((kor) xcsVar3.r.b()).n(mizVar, this.r, this.s), v);
                                ifq ifqVar2 = (ifq) this.N.b();
                                qjh.l(ifqVar2.a, ifqVar2.c, new mdi(ifqVar2, x, v, (arpe) null, 2), 2);
                                i = akrhVar2;
                            }
                        }
                        if (!mizVar.b().a().isEmpty()) {
                            xcs xcsVar4 = (xcs) this.l.b();
                            xcsVar4.n(str, ((kor) xcsVar4.r.b()).n(mizVar, this.r, this.s), v);
                        }
                        mix mixVar = (mix) this.R.get(x);
                        mix a2 = mjlVar.a();
                        if (mixVar != null && mixVar != a2 && (mizVar.b() instanceof mvb)) {
                            if (a2 == mix.SENT) {
                                qiu.h(((mgt) this.E.b()).a(mizVar, 30));
                            } else if (a2 == mix.DELIVERED) {
                                qiu.h(((mgt) this.E.b()).a(mizVar, 31));
                            }
                        }
                        if (this.R.mappingCount() > 300) {
                            alvw i3 = a.i();
                            i3.X(alwp.a, "BugleMapi");
                            alvg alvgVar = (alvg) i3;
                            alvgVar.X(ydl.q, this.j);
                            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "reportAnalyticsWithMetricExtension", 1423, "CoreBugleMessageRepository.java")).q("Exceeded limit of tracked messages");
                            this.R.clear();
                        }
                        this.R.put(x, a2);
                        akrhVar = i;
                        akrhVar.close();
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            i.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
            }
            akrhVar = e;
            akrhVar.close();
        } catch (Throwable th4) {
            th = th4;
            i = e;
        }
    }

    @Override // defpackage.mjg
    public final akul s(mty mtyVar) {
        wtg wtgVar = (wtg) this.J.get();
        ScheduledSendTable.BindData bindData = mtyVar.a.d;
        bindData.ao(0, "_id");
        bindData.a.getClass();
        return wtgVar.e().h(new mme(5), andi.a);
    }

    @Override // defpackage.mjg
    public final akul t(int i) {
        akrh e = aktp.e("MessageRepository#getEarliestMessages");
        try {
            sxy f = this.u.f(this.j, 0, i);
            f.h((atkn[]) mvg.a.c.toArray(new atkn[0]));
            akul i2 = K(f.b(), true).i(new mhp(this, i, 3), andi.a);
            e.close();
            return i2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul u(int i) {
        akrh e = aktp.e("MessageRepository#getLatestMessages");
        try {
            akul i2 = C(this.u.d(this.j, 0, i)).i(new mhp(this, i, 2), andi.a);
            e.close();
            return i2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul v(alog alogVar, int i) {
        akrh e = aktp.e("MessageRepository#deleteMessagesWithReason");
        try {
            mkp mkpVar = (mkp) this.i.b();
            Stream map = Collection.EL.stream(alogVar).map(new mtm(2));
            int i2 = alog.d;
            akul h = mkpVar.h((List) map.collect(alls.a), i);
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul w(MessageId messageId, nbg nbgVar, atok atokVar) {
        return L(new nbi(messageId, nbgVar, atokVar));
    }

    @Override // defpackage.mjg
    public final akul x(MessageId messageId) {
        akrh e = aktp.e("MessageRepository#loadLinkPreview");
        try {
            MessageIdType B = B(messageId);
            akrh e2 = aktp.e("MessageRepository#getSenderOfMessage");
            try {
                sxy d = MessagesTable.d();
                d.w("CoreBugleMessageRepository#getSenderOfMessage");
                d.d(new mtm(6));
                d.g(new mtl(B, 4));
                akul h = d.b().s().h(new mds(messageId, 19), this.G);
                e2.b(h);
                e2.close();
                akul i = h.i(new ikd(this, B, 16), this.b);
                e.close();
                return i;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjg
    public final akul y(MessageId messageId, nbg nbgVar, atok atokVar) {
        return L(new nbj(messageId, nbgVar, atokVar));
    }

    @Override // defpackage.mjg
    public final lfx z() {
        return (lfx) this.d.get();
    }
}
