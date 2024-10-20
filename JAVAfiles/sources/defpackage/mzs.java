package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzs implements nah {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/internal/InternalMessagePager");
    public final mzt a;
    final AtomicReference b = new AtomicReference(Optional.empty());
    private final anen d;
    private final anen e;
    private final lfl f;

    public mzs(anen anenVar, anen anenVar2, lfl lflVar, mzt mztVar) {
        this.d = anenVar;
        this.e = anenVar2;
        this.f = lflVar;
        this.a = mztVar;
    }

    private final akul l(akul akulVar, akul akulVar2) {
        akrh e = aktp.e("InternalMessagePager#process");
        try {
            akul g = akul.g(aktp.as(akulVar, akulVar2).m(new hbd(this, akulVar, akulVar2, 12), this.d));
            e.b(g);
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

    private final akul m(int i) {
        akrh e = aktp.e("InternalMessagePager#queryCountFuture");
        try {
            akul ai = aktp.ai(new ijt(this, i, 2), this.e);
            e.b(ai);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjd
    public final mjb a(miz mizVar) {
        return i(mizVar.b(), mizVar.h());
    }

    @Override // defpackage.mjd
    public final mjb b(Integer num) {
        return new mzz(num.intValue());
    }

    @Override // defpackage.mjd
    public final yga c(mjc mjcVar) {
        akrh e = aktp.e("InternalMessagePager#subscribeToChanges");
        try {
            yga g = this.a.g(new mzo(this, mjcVar, 0));
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

    @Override // defpackage.nah
    public final void close() {
        j();
    }

    @Override // defpackage.mjd
    public final akul d(MessageId messageId) {
        akrh e = aktp.e("InternalMessagePager#absoluteOffset");
        try {
            akul aj = aktp.aj(new imi(this, messageId, 6, null), this.e);
            e.b(aj);
            e.close();
            return aj;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjd
    public final akul e(mjb mjbVar, int i) {
        akrh e = aktp.e("InternalMessagePager#loadAppend");
        try {
            j();
            mzt mztVar = this.a;
            BugleConversationId bugleConversationId = ((mui) mztVar).j;
            lxe lxeVar = ((mui) mztVar).u;
            akul C = ((mui) mztVar).C(lxeVar.e(bugleConversationId, (mts) mjbVar, i).b());
            akrh e2 = aktp.e("InternalMessagePager#queryCountAfterKeyFuture");
            try {
                akul ai = aktp.ai(new mzn(this, mjbVar, 0), this.e);
                e2.b(ai);
                e2.close();
                akul h = l(C, ai).h(new mtq(this, mjbVar, i, 2, null), andi.a);
                e.b(h);
                e.close();
                return h;
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
    /* JADX WARN: Type inference failed for: r10v20, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.mjd
    public final akul f(mjb mjbVar, int i) {
        akul akulVar;
        akrh e = aktp.e("InternalMessagePager#loadInitial");
        try {
            alvw g = c.g();
            g.X(alwp.a, "BugleMapi");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/api/messaging/message/internal/InternalMessagePager", "loadInitial", 77, "InternalMessagePager.java")).q("InternalMessagePager loadInitial start.");
            Optional j = j();
            int i2 = 4;
            if (mjbVar == null) {
                if (j.isPresent()) {
                    ?? r10 = ((mzr) j.get()).a;
                    e.b(r10);
                    akulVar = r10;
                } else {
                    akul i3 = l(this.a.D(0, i), m(0)).i(new mhp(this, i, i2), andi.a);
                    e.b(i3);
                    akulVar = i3;
                }
            } else {
                int i4 = 1;
                if (mjbVar instanceof mzz) {
                    int max = Math.max(((mzz) mjbVar).a - (i / 2), 0);
                    akul i5 = l(this.a.D(max, i), m(max)).i(new ryd(this, max, i, i4), andi.a);
                    e.b(i5);
                    akulVar = i5;
                } else {
                    mzt mztVar = this.a;
                    int i6 = i / 2;
                    mts mtsVar = (mts) mjbVar;
                    BugleConversationId bugleConversationId = ((mui) mztVar).j;
                    lxe lxeVar = ((mui) mztVar).u;
                    sxy e2 = lxeVar.e(bugleConversationId, mtsVar, (i % 2) + i6);
                    e2.p(lxeVar.c(bugleConversationId, mtsVar, i6 + 1));
                    akul C = ((mui) mztVar).C(e2.b());
                    akrh e3 = aktp.e("InternalMessagePager#queryCountInitialKeyFuture");
                    try {
                        akul ai = aktp.ai(new mzn(this, mjbVar, i2), this.e);
                        e3.b(ai);
                        e3.close();
                        akul h = l(C, ai).h(new mtq(this, mjbVar, i, 3, null), andi.a);
                        e.b(h);
                        akulVar = h;
                    } finally {
                    }
                }
            }
            e.close();
            return akulVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjd
    public final akul g(mjb mjbVar, int i) {
        akrh e = aktp.e("InternalMessagePager#loadPrepend");
        try {
            j();
            mzt mztVar = this.a;
            BugleConversationId bugleConversationId = ((mui) mztVar).j;
            lxe lxeVar = ((mui) mztVar).u;
            akul C = ((mui) mztVar).C(lxeVar.c(bugleConversationId, (mts) mjbVar, i));
            akrh e2 = aktp.e("InternalMessagePager#queryCountBeforeKeyFuture");
            try {
                akul ai = aktp.ai(new mzn(this, mjbVar, 2), this.e);
                e2.b(ai);
                e2.close();
                akul h = l(C, ai).h(new mtq(this, mjbVar, i, 4, null), andi.a);
                e.b(h);
                e.close();
                return h;
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

    @Override // defpackage.mjd
    public final akul h(MessageId messageId) {
        akrh e = aktp.e("InternalMessagePager#pagingKeyOf");
        try {
            akul ai = aktp.ai(new mzn(this, messageId, 3), this.e);
            e.b(ai);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final mjb i(MessageId messageId, Instant instant) {
        return this.a.A(messageId, instant);
    }

    public final Optional j() {
        Optional optional = (Optional) this.b.getAndSet(Optional.empty());
        optional.ifPresent(new ldx(19));
        return optional;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, utz] */
    @Override // defpackage.nah
    public final void k() {
        akrh e = aktp.e("InternalMessagePager#startPreload");
        try {
            mzr mzrVar = new mzr();
            mzrVar.b = c(new mzq());
            mzt mztVar = this.a;
            Object e2 = this.f.c.e();
            e2.getClass();
            mzrVar.a = l(mztVar.D(0, ((Number) e2).intValue()), m(0));
            albo.T(((Optional) this.b.getAndSet(Optional.of(mzrVar))).isEmpty());
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
