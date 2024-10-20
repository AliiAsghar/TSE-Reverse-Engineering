package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvl implements mtn {
    public final mtn a;
    public final hgi b = new hgi((char[]) null, (byte[]) null);
    private final arwe c;

    public mvl(arwe arweVar, mtn mtnVar) {
        this.c = arweVar;
        this.a = mtnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object B(defpackage.mvl r4, int r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.mvi
            if (r0 == 0) goto L13
            r0 = r6
            mvi r0 = (defpackage.mvi) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mvi r0 = new mvi
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mvl r4 = r0.c
            defpackage.aqil.P(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.aqil.P(r6)
            mtn r6 = r4.a
            akul r5 = r6.t(r5)
            r0.c = r4
            r0.b = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            alog r6 = (defpackage.alog) r6
            r6.getClass()
            alog r4 = r4.F(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvl.B(mvl, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object C(defpackage.mvl r4, int r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.mvk
            if (r0 == 0) goto L13
            r0 = r6
            mvk r0 = (defpackage.mvk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mvk r0 = new mvk
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mvl r4 = r0.c
            defpackage.aqil.P(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.aqil.P(r6)
            mtn r6 = r4.a
            akul r5 = r6.u(r5)
            r0.c = r4
            r0.b = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            alog r6 = (defpackage.alog) r6
            r6.getClass()
            alog r4 = r4.F(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvl.C(mvl, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, alrz] */
    private final alog F(alog alogVar) {
        ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
        Iterator<E> it = alogVar.iterator();
        while (it.hasNext()) {
            miz mizVar = (miz) it.next();
            mizVar.getClass();
            for (lga lgaVar : aqjn.ax(this.b.a.z(mizVar.b()))) {
            }
            arrayList.add(mizVar);
        }
        alog n = alog.n(arrayList);
        n.getClass();
        return n;
    }

    @Override // defpackage.mzt
    public final mjb A(MessageId messageId, Instant instant) {
        throw null;
    }

    @Override // defpackage.mzt
    public final akul D(int i, int i2) {
        throw null;
    }

    @Override // defpackage.mzt
    public final Instant E(MessageId messageId) {
        throw null;
    }

    @Override // defpackage.mzt
    public final void G() {
        this.a.G();
    }

    @Override // defpackage.nbs
    public final void H(mzc mzcVar) {
        this.a.H(mzcVar);
    }

    @Override // defpackage.mzt
    public final adlx I() {
        throw null;
    }

    @Override // defpackage.mjg
    public final mja a() {
        return this.a.a();
    }

    @Override // defpackage.mjg
    public final mjd b() {
        return this.a.b();
    }

    @Override // defpackage.mjg
    public final ConversationId c() {
        return ((mui) this.a).j;
    }

    @Override // defpackage.mzt, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.mjg
    public final ncq d(MessageId messageId) {
        return this.a.d(messageId);
    }

    @Override // defpackage.mjg
    public final ncq e() {
        return this.a.e();
    }

    @Override // defpackage.mjg
    public final ncq f() {
        return this.a.f();
    }

    @Override // defpackage.mjg
    public final yga g(mjf mjfVar) {
        throw null;
    }

    @Override // defpackage.mjg
    public final akul h(alog alogVar) {
        return this.a.h(alogVar);
    }

    @Override // defpackage.mjg
    public final akul i() {
        return this.a.i();
    }

    @Override // defpackage.mjg
    public final akul j(MessageId messageId) {
        return this.a.j(messageId);
    }

    @Override // defpackage.mjg
    public final akul k() {
        return this.a.k();
    }

    @Override // defpackage.mjg
    public final akul l() {
        return this.a.l();
    }

    @Override // defpackage.mjg
    public final akul m(MessageId messageId) {
        return this.a.m(messageId);
    }

    @Override // defpackage.mjg
    public final akul n(MessageId messageId) {
        return this.a.n(messageId);
    }

    @Override // defpackage.mjg
    public final akul o(MessageId messageId) {
        return this.a.o(messageId);
    }

    @Override // defpackage.mjg
    public final akul p(MessageId messageId) {
        return this.a.p(messageId);
    }

    @Override // defpackage.mjg
    public final akul q(MessageId messageId, int i) {
        return this.a.q(messageId, i);
    }

    @Override // defpackage.mjg
    public final void r(miz mizVar, int i) {
        this.a.r(mizVar, i);
    }

    @Override // defpackage.mjg
    public final akul s(mty mtyVar) {
        return this.a.s(mtyVar);
    }

    @Override // defpackage.mjg
    public final akul t(int i) {
        return qjh.b(new mvh(this), this.c);
    }

    @Override // defpackage.mjg
    public final akul u(int i) {
        return qjh.b(new mvj(this, i), this.c);
    }

    @Override // defpackage.mjg
    public final akul v(alog alogVar, int i) {
        return this.a.v(alogVar, i);
    }

    @Override // defpackage.mjg
    public final akul w(MessageId messageId, nbg nbgVar, atok atokVar) {
        return this.a.w(messageId, nbgVar, atokVar);
    }

    @Override // defpackage.mjg
    public final akul x(MessageId messageId) {
        return this.a.x(messageId);
    }

    @Override // defpackage.mjg
    public final akul y(MessageId messageId, nbg nbgVar, atok atokVar) {
        return this.a.y(messageId, nbgVar, atokVar);
    }

    @Override // defpackage.mjg
    public final lfx z() {
        return this.a.z();
    }
}
