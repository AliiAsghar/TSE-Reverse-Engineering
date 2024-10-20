package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Duration;
import java.security.InvalidParameterException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nad implements AutoCloseable, nah {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/internal/OptimisticMessagePager");
    public final nah b;
    public final mzt c;
    public final arwe d;
    public final nal e;
    public final mzk f;
    public final AtomicReference g;
    public final qnu h;
    public final lfl i;
    private final arpi j;
    private final hmk k;

    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    public nad(arpi arpiVar, hmk hmkVar, lfl lflVar, nah nahVar, mzt mztVar) {
        this.j = arpiVar;
        this.k = hmkVar;
        this.i = lflVar;
        this.b = nahVar;
        this.c = mztVar;
        arwe e = arwi.e(arpiVar.plus(new aryj(null)));
        this.d = e;
        this.e = new nal(new lnn(this, 12));
        this.f = new mzk(nahVar);
        Duration ofMillis = Duration.ofMillis(((Long) muv.d.e()).longValue());
        xnv xnvVar = (xnv) hmkVar.a.b();
        xnvVar.getClass();
        ofMillis.getClass();
        this.h = new qnu(xnvVar, ofMillis);
        this.g = new AtomicReference(nai.a);
        qjh.l(e, null, new mwv(this, (arpe) null, 4), 3);
    }

    @Override // defpackage.mjd
    public final mjb a(miz mizVar) {
        nah nahVar = this.b;
        return new nam(nahVar.a(mizVar), this.e.a());
    }

    @Override // defpackage.mjd
    public final /* bridge */ /* synthetic */ mjb b(Integer num) {
        nal nalVar = this.e;
        num.intValue();
        return new nam(this.b.b(num), nalVar.a());
    }

    @Override // defpackage.mjd
    public final yga c(mjc mjcVar) {
        boolean add;
        mzk mzkVar = this.f;
        synchronized (mzkVar.a) {
            add = mzkVar.b.add(mjcVar);
        }
        if (add) {
            return new mul(mzkVar, mjcVar, 3);
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.lang.AutoCloseable, defpackage.nah
    public final void close() {
        arwi.g(this.d, null);
        this.f.close();
        ((mzs) this.b).j();
    }

    @Override // defpackage.mjd
    public final akul d(MessageId messageId) {
        messageId.getClass();
        akul d = this.b.d(messageId);
        d.getClass();
        return d;
    }

    @Override // defpackage.mjd
    public final akul e(mjb mjbVar, int i) {
        if (mjbVar instanceof nam) {
            return this.b.e(((nam) mjbVar).a, i);
        }
        throw new InvalidParameterException("wrong PagingKey type, expected VersionedPagingKey");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r7 < (r1.c.a.size() / 2)) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    @Override // defpackage.mjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul f(defpackage.mjb r13, int r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nad.f(mjb, int):akul");
    }

    @Override // defpackage.mjd
    public final akul g(mjb mjbVar, int i) {
        if (mjbVar instanceof nam) {
            return this.b.g(((nam) mjbVar).a, i);
        }
        throw new InvalidParameterException("wrong PagingKey type, expected VersionedPagingKey");
    }

    @Override // defpackage.mjd
    public final akul h(MessageId messageId) {
        return qjh.a(arrn.I(this.d, null, null, new nac(this, messageId, null), 3));
    }

    @Override // defpackage.nah
    public final void k() {
    }
}
