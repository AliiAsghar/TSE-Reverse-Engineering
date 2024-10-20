package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itm extends ira {
    private final armf A;
    private final anen B;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final int p;
    public final int q;
    public final int r;
    public akul s;
    public akul t;
    public boolean u;
    public akul v;
    public boolean w;
    public akul x;
    public final gpx y;
    private final Executor z;

    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    public itm(hgj hgjVar, armf armfVar, armf armfVar2, armf armfVar3, aksr aksrVar, armf armfVar4, lgg lggVar, armf armfVar5, anen anenVar, Context context, ConversationIdType conversationIdType, hk hkVar, int i, int i2, int i3) {
        super(aksrVar, context, conversationIdType, hkVar, lggVar);
        this.u = true;
        this.w = true;
        xyl.q(i);
        this.l = armfVar;
        this.n = armfVar2;
        this.o = armfVar3;
        this.m = armfVar4;
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.A = armfVar5;
        this.B = anenVar;
        Executor e = ((rwe) armfVar2.b()).e();
        this.z = e;
        qdq qdqVar = new qdq(this);
        aksr aksrVar2 = (aksr) hgjVar.a.b();
        aksrVar2.getClass();
        e.getClass();
        this.y = new gpx(aksrVar2, context, conversationIdType, e, qdqVar);
    }

    public static boolean o(List list, int i) {
        if (list != null && list.size() >= i) {
            return false;
        }
        return true;
    }

    private final rry p(rry rryVar) {
        rry rryVar2 = (rry) this.g.get(rryVar.u());
        if (rryVar2 == null) {
            return (rry) this.h.get(rryVar.v());
        }
        return rryVar2;
    }

    private final akul q() {
        akul ag;
        akrh e = aktp.e("MessageListWindowManager#loadLatest");
        try {
            xyl.g();
            int i = 0;
            if (!this.i.get() && this.w) {
                m();
                ag = ((rwe) this.n.b()).c(this.c, rvc.a, this.p).h(new itk(this, i), new sp(11));
                this.s = ag;
                e.b(ag);
                e.close();
                return ag;
            }
            xzb.d("BugleDataModel", "Bailing on loadLatest because the object is either destroyed: %b. Or there is no more messages to be loaded: %b.", Boolean.valueOf(this.i.get()), Boolean.valueOf(!this.w));
            ag = aktp.ag(false);
            e.close();
            return ag;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ira
    public final void d() {
        if (this.i.get()) {
            xzb.c("BugleDataModel", "Ignoring onMessageChange because the manager is destroyed.");
        } else {
            qiu.h(aktp.ah(new gtq(this, 17), this.z));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ira
    public final void f(MessageIdType messageIdType, rve rveVar) {
        aiut.a().postAtFrontOfQueue(akto.j(new itl(this, messageIdType, rveVar, 0)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [armf, java.lang.Object] */
    @Override // defpackage.ira
    public final void g(MessageCoreData messageCoreData) {
        akrh akrhVar;
        vid vidVar;
        xvc xvcVar;
        rtb rtbVar;
        rvx rvxVar;
        trz trzVar;
        iew iewVar;
        msk mskVar;
        ?? b;
        ?? r11;
        uli uliVar;
        ujx ujxVar;
        ?? r14;
        ?? b2;
        if (messageCoreData.cI() && !messageCoreData.E().i()) {
            akrh e = aktp.e("MessageListWindowManager::onPendingNewMessage");
            try {
                vidVar = (vid) this.A.b();
                xvcVar = (xvc) vidVar.i.b();
                xvcVar.getClass();
                rtbVar = (rtb) vidVar.g.b();
                rtbVar.getClass();
                rvxVar = (rvx) vidVar.b.b();
                rvxVar.getClass();
                trzVar = (trz) vidVar.f.b();
                trzVar.getClass();
                iewVar = (iew) vidVar.l.b();
                iewVar.getClass();
                mskVar = (msk) vidVar.j.b();
                mskVar.getClass();
                b = vidVar.k.b();
                b.getClass();
                Object obj = vidVar.c;
                r11 = vidVar.n;
                uliVar = (uli) vidVar.e.b();
                uliVar.getClass();
                ujxVar = (ujx) vidVar.m.b();
                ujxVar.getClass();
                r14 = vidVar.a;
                b2 = vidVar.h.b();
                b2.getClass();
                akrhVar = e;
            } catch (Throwable th) {
                th = th;
                akrhVar = e;
            }
            try {
                aktp.ah(new faq(this, messageCoreData, new rry(xvcVar, rtbVar, rvxVar, trzVar, iewVar, mskVar, (apwt) b, (armf) r11, uliVar, ujxVar, (armf) r14, (apwt) b2, (armf) vidVar.d, messageCoreData), 20), this.B);
                akrhVar.close();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    akrhVar.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
    }

    public final rry h() {
        xyl.g();
        hk hkVar = this.f;
        if (hkVar.g == 0) {
            return null;
        }
        return (rry) hkVar.d(0);
    }

    public final rry i() {
        xyl.g();
        hk hkVar = this.f;
        int i = hkVar.g;
        if (i == 0) {
            return null;
        }
        return (rry) hkVar.d(i - 1);
    }

    public final akul j(MessageIdType messageIdType) {
        akul h;
        super.c();
        xyl.g();
        if (!messageIdType.b()) {
            akrh e = aktp.e("MessageListWindowManager#loadAround");
            try {
                xyl.g();
                if (this.i.get()) {
                    xzb.c("BugleDataModel", "Bailing for loadAround because the object is destroyed.");
                    h = aktp.ag(false);
                } else if (((rry) this.g.get(messageIdType)) != null) {
                    xzb.d("BugleDataModel", "Bailing for loadAround because message id %s is already loaded.", messageIdType);
                    h = aktp.ag(false);
                } else {
                    xzb.d("BugleDataModel", "loadAroundFuture starts with conversationId: %s, messageId: %s, chunkSize: %s", this.c, messageIdType, Integer.valueOf(this.p));
                    m();
                    h = ((rwe) this.n.b()).c(this.c, messageIdType, this.p).h(new ijq(this, messageIdType, 2), new sp(11));
                    this.t = h;
                    e.b(h);
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
        return q();
    }

    public final void k(List list, rry rryVar) {
        xyl.g();
        xzb.c("BugleDataModel", "addMessages starts");
        this.f.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rry rryVar2 = (rry) it.next();
            if (p(rryVar2) == null) {
                this.f.a(rryVar2);
                e(rryVar2);
            } else {
                xzb.c("BugleDataModel", String.format("Ignoring modified message %s. Content observer will pick up the change.", rryVar2.u()));
            }
        }
        a(this.f.c(rryVar), rryVar);
        this.f.f();
    }

    public final void l(List list) {
        xyl.g();
        xzb.c("BugleDataModel", "setMessages starts");
        hk hkVar = this.f;
        hkVar.h();
        int i = hkVar.g;
        int i2 = 0;
        if (i != 0) {
            Arrays.fill(hkVar.a, 0, i, (Object) null);
            hkVar.g = 0;
            hkVar.f.d(0, i);
        }
        this.g.clear();
        this.h.clear();
        this.f.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((rry) it.next());
        }
        hk hkVar2 = this.f;
        Object[] array = list.toArray((Object[]) Array.newInstance((Class<?>) hkVar2.h, list.size()));
        hkVar2.h();
        if (array.length != 0) {
            Arrays.sort(array, hkVar2.f);
            int i3 = 1;
            int i4 = 0;
            for (int i5 = 1; i5 < array.length; i5++) {
                Object obj = array[i5];
                if (hkVar2.f.compare(array[i4], obj) == 0) {
                    int i6 = i4;
                    while (true) {
                        if (i6 < i3) {
                            if (hkVar2.f.f(array[i6], obj)) {
                                break;
                            } else {
                                i6++;
                            }
                        } else {
                            i6 = -1;
                            break;
                        }
                    }
                    if (i6 != -1) {
                        array[i6] = obj;
                    } else {
                        int i7 = i3 + 1;
                        if (i3 != i5) {
                            array[i3] = obj;
                        }
                        i3 = i7;
                    }
                } else {
                    int i8 = i3 + 1;
                    if (i3 != i5) {
                        array[i3] = obj;
                    }
                    int i9 = i3;
                    i3 = i8;
                    i4 = i9;
                }
            }
            if (hkVar2.g == 0) {
                hkVar2.a = array;
                hkVar2.g = i3;
                hkVar2.f.b(0, i3);
            } else {
                boolean z = hkVar2.f instanceof hi;
                if (!z) {
                    hkVar2.e();
                }
                hkVar2.b = hkVar2.a;
                hkVar2.c = 0;
                int i10 = hkVar2.g;
                hkVar2.d = i10;
                hkVar2.a = (Object[]) Array.newInstance((Class<?>) hkVar2.h, i10 + i3 + 10);
                hkVar2.e = 0;
                while (true) {
                    int i11 = hkVar2.c;
                    int i12 = hkVar2.d;
                    if (i11 >= i12 && i2 >= i3) {
                        break;
                    }
                    if (i11 == i12) {
                        int i13 = i3 - i2;
                        System.arraycopy(array, i2, hkVar2.a, hkVar2.e, i13);
                        int i14 = hkVar2.e + i13;
                        hkVar2.e = i14;
                        hkVar2.g += i13;
                        hkVar2.f.b(i14 - i13, i13);
                        break;
                    }
                    if (i2 == i3) {
                        int i15 = i12 - i11;
                        System.arraycopy(hkVar2.b, i11, hkVar2.a, hkVar2.e, i15);
                        hkVar2.e += i15;
                        break;
                    }
                    Object obj2 = hkVar2.b[i11];
                    Object obj3 = array[i2];
                    int compare = hkVar2.f.compare(obj2, obj3);
                    if (compare > 0) {
                        i2++;
                        Object[] objArr = hkVar2.a;
                        int i16 = hkVar2.e;
                        hkVar2.e = i16 + 1;
                        objArr[i16] = obj3;
                        hkVar2.g++;
                        hkVar2.f.b(i16, 1);
                    } else if (compare == 0 && hkVar2.f.f(obj2, obj3)) {
                        i2++;
                        Object[] objArr2 = hkVar2.a;
                        int i17 = hkVar2.e;
                        hkVar2.e = i17 + 1;
                        objArr2[i17] = obj3;
                        hkVar2.c++;
                        if (!hkVar2.f.e(obj2, obj3)) {
                            hj hjVar = hkVar2.f;
                            int i18 = hkVar2.e - 1;
                            hjVar.g(obj2, obj3);
                            hjVar.a(i18, 1, null);
                        }
                    } else {
                        Object[] objArr3 = hkVar2.a;
                        int i19 = hkVar2.e;
                        hkVar2.e = i19 + 1;
                        objArr3[i19] = obj2;
                        hkVar2.c++;
                    }
                }
                hkVar2.b = null;
                if (!z) {
                    hkVar2.f();
                }
            }
        }
        this.f.f();
    }

    public final void m() {
        xzb.c("BugleDataModel", "Stopping all background operations. Set thereIsDataAfter true, Set thereIsDataBefore true.");
        this.w = true;
        akul akulVar = this.x;
        if (akulVar != null) {
            akulVar.cancel(true);
            this.x = null;
        }
        this.u = true;
        akul akulVar2 = this.v;
        if (akulVar2 != null) {
            akulVar2.cancel(true);
            this.v = null;
        }
        akul akulVar3 = this.t;
        if (akulVar3 != null) {
            akulVar3.cancel(true);
            this.t = null;
        }
        akul akulVar4 = this.s;
        if (akulVar4 != null) {
            akulVar4.cancel(true);
            this.s = null;
        }
    }

    public final void n(List list, Set set) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xyl.g();
        this.f.e();
        Iterator it = list.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                rry rryVar = (rry) it.next();
                if (!this.c.equals(rryVar.t())) {
                    xzb.k("BugleDataModel", "Message %s moved to another conversation.", rryVar.u());
                } else {
                    if (this.f.g > 0 && rryVar.aA(i())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (this.f.g > 0 && rryVar.ax(h())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    hk hkVar = this.f;
                    int i = hkVar.g;
                    if (i >= 2 ? !(i().ax(rryVar) || h().aA(rryVar)) : !(i != 1 || rryVar.a((rry) hkVar.d(0)) != 0)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    rry p = p(rryVar);
                    if (!z5 && ((!z3 || this.u) && (!z4 || this.w))) {
                        xzb.j("BugleDataModel", "Message " + String.valueOf(rryVar.u()) + " ignore because it falls outside of the maintained window. TimeStamp: " + rryVar.i() + "thereIsDataBefore: " + this.u + "thereIsDataAfter: " + this.w);
                        if (this.f.g > 0) {
                            rry h = h();
                            h.getClass();
                            String valueOf = String.valueOf(h.u());
                            rry h2 = h();
                            h2.getClass();
                            long i2 = h2.i();
                            rry i3 = i();
                            i3.getClass();
                            String valueOf2 = String.valueOf(i3.u());
                            rry i4 = i();
                            i4.getClass();
                            xzb.j("BugleDataModel", "NewestMessage: message " + valueOf + " TimeStamp: " + i2 + "OldestMessage: message " + valueOf2 + " TimeStamp: " + i4.i());
                        }
                    } else {
                        xzb.j("BugleDataModel", "Message " + String.valueOf(rryVar.u()) + " processed.");
                        set.remove(rryVar.u());
                        if (p != null) {
                            int c = this.f.c(p);
                            xyl.g();
                            this.f.i(c, rryVar);
                            e(rryVar);
                            if (p.i() != rryVar.i()) {
                                hk hkVar2 = this.f;
                                hkVar2.h();
                                Object d = hkVar2.d(c);
                                hkVar2.g(c, false);
                                int b = hkVar2.b(d, false);
                                if (c != b) {
                                    hkVar2.f.c(c, b);
                                }
                                int c2 = this.f.c(rryVar);
                                super.b(c);
                                a(c2, rryVar);
                            } else {
                                this.f.i(c, rryVar);
                                a(c, rryVar);
                            }
                        } else {
                            xyl.g();
                            e(rryVar);
                            int a = this.f.a(rryVar);
                            e(rryVar);
                            a(a, rryVar);
                        }
                    }
                    if (this.f.g == 0) {
                        z = true;
                    }
                }
            }
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            MessageIdType messageIdType = (MessageIdType) it2.next();
            rry rryVar2 = (rry) this.g.get(messageIdType);
            if (rryVar2 != null) {
                this.g.remove(messageIdType);
                this.h.remove(rryVar2.v());
                int c3 = this.f.c(rryVar2);
                if (c3 != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xyl.k(z2);
                hk hkVar3 = this.f;
                hkVar3.h();
                hkVar3.d(c3);
                hkVar3.g(c3, true);
                super.b(c3);
            }
        }
        this.f.f();
        if (z) {
            xzb.j("BugleDataModel", "Loading latest because there was no message loaded and we received an update.");
            q();
        }
    }
}
