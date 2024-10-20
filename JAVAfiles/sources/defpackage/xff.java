package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xff {
    public static final alwo a = alwo.o("BugleTachygram");
    public final xfe b;
    public final anen c;
    public final vcj d;
    public final psw e;
    public final qhg f;
    public final armf g;
    public final aneo h;
    public final xnv i;
    public final qco j;
    private final anen k;
    private final Set l;
    private final xel m = new xel();

    public xff(xfe xfeVar, anen anenVar, anen anenVar2, vcj vcjVar, Set set, psw pswVar, qhg qhgVar, qco qcoVar, armf armfVar, aneo aneoVar, xnv xnvVar) {
        this.b = xfeVar;
        this.c = anenVar;
        this.k = anenVar2;
        this.d = vcjVar;
        this.l = set;
        this.e = pswVar;
        this.f = qhgVar;
        this.j = qcoVar;
        this.g = armfVar;
        this.h = aneoVar;
        this.i = xnvVar;
    }

    public final akul a(aniv anivVar, Object obj) {
        if (anivVar instanceof aniq) {
            return e(obj, anivVar.a);
        }
        f("Tachygram user suspended by the server. Triggering re-provisioning.", anivVar);
        ArrayList arrayList = new ArrayList();
        aluq listIterator = ((altx) this.l).listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(((vgv) listIterator.next()).c(yyb.cI(this.b.b(obj))));
        }
        return aktp.am(arrayList).i(new ncx(this, obj, anivVar, 14, (char[]) null), this.c);
    }

    public final akul b(aniv anivVar, Object obj) {
        f("call into chat api to remove user from group.", anivVar);
        qei b = this.b.b(obj);
        aozy createBuilder = qey.c.createBuilder();
        String g = this.b.g(obj);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qey qeyVar = (qey) createBuilder.b;
        g.getClass();
        qeyVar.d |= 1;
        qeyVar.e = g;
        createBuilder.D(b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qey qeyVar2 = (qey) createBuilder.b;
        b.getClass();
        qeyVar2.q = b;
        qeyVar2.d |= 256;
        return this.j.d((qey) createBuilder.s()).i(new vwx(this, obj, anivVar, 14, (short[]) null), this.c);
    }

    public final akul c(uns unsVar, Object obj) {
        return d(obj, unsVar, null).h(new xdh(11), andi.a);
    }

    public final akul d(final Object obj, final uns unsVar, Function function) {
        Object apply;
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "processInternalAndCatch", 129, "TachygramOutgoingOperationTemplate.java")).t("Executing outgoing tachygram operation %s", this.b.h());
        long a2 = this.i.a();
        akrh e = aktp.e("TachygramOutgoingOperationTemplate::process::networkCall");
        try {
            akul d = this.b.d(obj);
            if (function != null) {
                apply = function.apply(d);
                d = (akul) apply;
            }
            akul akulVar = d;
            e.b(akulVar);
            e.close();
            return akulVar.i(new woq(this, a2, obj, 2), this.k).h(new xeu(this, 7), andi.a).f(aniv.class, new ancs() { // from class: xfd
                /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0077. Please report as an issue. */
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj2) {
                    xff xffVar = xff.this;
                    aniv anivVar = (aniv) obj2;
                    Object obj3 = obj;
                    if (xffVar.b.i()) {
                        int ordinal = anivVar.a.c.ordinal();
                        if (ordinal != 0 && ordinal != 1) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        return xffVar.b(anivVar, obj3);
                                    }
                                } else {
                                    albo.U(!xffVar.b.g(obj3).isEmpty(), "Group recovery invoked on a non-group operation");
                                }
                                xffVar.f("call into chat api to maybe try the operation again.", anivVar);
                                return xffVar.e(obj3, anivVar.a);
                            }
                            return xffVar.a(anivVar, obj3);
                        }
                        xffVar.f("call into chat api to maybe try the operation again.", anivVar);
                        return xffVar.e(obj3, anivVar.a);
                    }
                    uns unsVar2 = unsVar;
                    if (unsVar2 != null && !unsVar2.c()) {
                        xffVar.f("call into chat api to maybe try the operation again.", anivVar);
                        return xffVar.e(obj3, anivVar.a);
                    }
                    switch (anivVar.a.c.ordinal()) {
                        case 0:
                            return xffVar.e(obj3, anivVar.a);
                        case 1:
                            xffVar.f("returning work queue result to retry.", anivVar);
                            return aktp.ag(pwh.FAIL_RETRY);
                        case 2:
                            qei b = xffVar.b.b(obj3);
                            if (b.d.isEmpty()) {
                                xffVar.f("attempting to refresh registration but empty chat endpoint is found.", anivVar);
                                return xffVar.e(obj3, anivVar.a);
                            }
                            xffVar.f("refreshing registration and returning work queue result to retry.", anivVar);
                            return xffVar.d.f(b).h(new xdh(10), xffVar.c);
                        case 3:
                            return xffVar.a(anivVar, obj3);
                        case 4:
                            xffVar.f("call into chat api to re-create the group and retry the operation.", anivVar);
                            aozy createBuilder = qey.c.createBuilder();
                            String g = xffVar.b.g(obj3);
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            qey qeyVar = (qey) createBuilder.b;
                            g.getClass();
                            qeyVar.d |= 1;
                            qeyVar.e = g;
                            aozy createBuilder2 = qev.a.createBuilder();
                            qeu qeuVar = qeu.CAUSE_GROUP_NOT_FOUND;
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            qev qevVar = (qev) createBuilder2.b;
                            qevVar.c = qeuVar.d;
                            qevVar.b = 1 | qevVar.b;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            qey qeyVar2 = (qey) createBuilder.b;
                            qev qevVar2 = (qev) createBuilder2.s();
                            qevVar2.getClass();
                            qeyVar2.p = qevVar2;
                            qeyVar2.d |= 128;
                            qei b2 = xffVar.b.b(obj3);
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            qey qeyVar3 = (qey) createBuilder.b;
                            b2.getClass();
                            qeyVar3.q = b2;
                            qeyVar3.d |= 256;
                            return xffVar.j.d((qey) createBuilder.s()).i(new vwx(xffVar, obj3, anivVar, 12, (short[]) null), xffVar.c);
                        case 5:
                            return xffVar.b(anivVar, obj3);
                        case 6:
                            if (xffVar.e.a()) {
                                return xffVar.f.a(new qhe(xffVar.b.a(obj3))).i(new vwx(xffVar, obj3, anivVar, 13, (short[]) null), andi.a);
                            }
                        default:
                            xffVar.f("Unknown Tachygram RecoveryType.", anivVar);
                            return xffVar.e(obj3, anivVar.a);
                    }
                }
            }, this.c);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul e(Object obj, anit anitVar) {
        return this.b.e(obj, this.m.apply(anitVar)).h(new xeu(this, 6), this.c);
    }

    public final void f(String str, aniv anivVar) {
        if (anivVar instanceof ankx) {
            alwl alwlVar = (alwl) ((alwl) a.i()).g(anivVar);
            ankx ankxVar = (ankx) anivVar;
            alwlVar.X(xfu.b, ankxVar.c.r);
            alwlVar.X(xfu.c, ankxVar.c.getDescription());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "logTachygramException", 421, "TachygramOutgoingOperationTemplate.java")).D("%s failed: %s", this.b.h(), str);
            return;
        }
        ((alwl) ((alwl) ((alwl) a.i()).g(anivVar)).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "logTachygramException", 424, "TachygramOutgoingOperationTemplate.java")).D("%s failed: %s", this.b.h(), str);
    }

    public final pwh g(int i, qeg qegVar) {
        if (i == 1) {
            qef b = qef.b(qegVar.c);
            if (b == null) {
                b = qef.UNKNOWN_STATUS;
            }
            if (b.equals(qef.OK)) {
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "handleProcessingComplete", 432, "TachygramOutgoingOperationTemplate.java")).t("Successfully completed %s", this.b.h());
                return pwh.SUCCESS;
            }
        }
        alwl alwlVar = (alwl) a.i();
        alvz alvzVar = qas.b;
        qef b2 = qef.b(qegVar.c);
        if (b2 == null) {
            b2 = qef.UNKNOWN_STATUS;
        }
        alwlVar.X(alvzVar, b2);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "handleProcessingComplete", 438, "TachygramOutgoingOperationTemplate.java")).t("Failed to complete %s, returning work queue result to no retry.", this.b.h());
        return pwh.FAIL_NO_RETRY;
    }
}
