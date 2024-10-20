package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mso implements alhr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mso(int i, String str, int i2) {
        this.c = i2;
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [apwt, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        String b;
        String b2;
        switch (this.c) {
            case 0:
                msq msqVar = (msq) this.b;
                boolean a = ((plo) msqVar.k.b()).a();
                int i = this.a;
                if (a) {
                    b = ((yjy) msqVar.f.b()).h(i).u();
                } else {
                    b = ((yjs) msqVar.c.b()).b(i);
                }
                if (TextUtils.isEmpty(b)) {
                    return Optional.empty();
                }
                return Optional.of(b);
            case 1:
                msq msqVar2 = (msq) this.b;
                boolean a2 = ((plo) msqVar2.c.b()).a();
                int i2 = this.a;
                if (a2) {
                    b2 = ((yjy) msqVar2.f.b()).h(i2).u();
                } else {
                    b2 = ((yjs) msqVar2.j.b()).b(i2);
                }
                if (TextUtils.isEmpty(b2)) {
                    return Optional.empty();
                }
                return Optional.of(b2);
            case 2:
                taz e = ParticipantsTable.e();
                e.w("insertInactiveSelfParticipant2");
                e.q();
                int i3 = this.a;
                e.g(new qqv(i3, 4));
                tav tavVar = (tav) e.b().n();
                try {
                    if (tavVar.getCount() > 0 && tavVar.moveToFirst()) {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) tavVar.cK();
                        ((alwl) qxb.a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "insertInactiveSelfParticipant", 365, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker insertInactiveSelfParticipant quick return participant=%s for subId=%s", bindData.M(), i3);
                        tavVar.close();
                        return bindData;
                    }
                    Object obj = this.b;
                    tavVar.close();
                    tap c = ParticipantsTable.c();
                    c.S(i3);
                    c.R(-1);
                    c.T(0);
                    c.l(-1L);
                    qxb qxbVar = (qxb) obj;
                    qxbVar.g.e(c);
                    ParticipantsTable.BindData a3 = c.a();
                    long b3 = qxbVar.g.b(a3);
                    tki a4 = tkr.a();
                    a4.h(i3);
                    a4.d(String.valueOf(b3));
                    a4.f(-1);
                    long a5 = qyd.a(a4.a());
                    xyo c2 = qxb.b.c();
                    c2.H("insert inactive self participant.");
                    c2.y("participantId", b3);
                    c2.y("selfParticipantId", a5);
                    c2.x("subId", i3);
                    c2.q();
                    return a3;
                } catch (Throwable th) {
                    try {
                        tavVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 3:
                return Boolean.valueOf(((udo) this.b).a.moveToPosition(this.a));
            case 4:
                srj a6 = srm.a();
                a6.w("+getNextGenericWorkerQueueBatch");
                int i4 = this.a;
                ukq ukqVar = (ukq) this.b;
                srl a7 = ukqVar.a(i4);
                a7.f(ukqVar.b.f().toEpochMilli());
                a6.k(new agpw(a7));
                a6.d(new atkn(srm.d.e, (byte[]) null));
                int i5 = 10;
                a6.u(10);
                alog t = a6.b().t();
                if (!t.isEmpty()) {
                    srk srkVar = new srk();
                    srkVar.aj("getNextGenericWorkerQueueBatch");
                    srkVar.af();
                    srkVar.c(true);
                    srkVar.d(new uje(t, i5));
                    srkVar.a().e();
                }
                return t;
            case 5:
                srj a8 = srm.a();
                a8.w("getNextGenericWorkerQueueBatchForSpecificItem1");
                a8.c(new rbe(this.b, this.a, 7));
                a8.d(new atkn(srm.d.e, (byte[]) null));
                alog t2 = a8.b().t();
                if (!t2.isEmpty()) {
                    srk srkVar2 = new srk();
                    srkVar2.aj("getNextGenericWorkerQueueBatchForSpecificItem2");
                    srkVar2.af();
                    srkVar2.c(true);
                    srkVar2.d(new uje(t2, 12));
                    srkVar2.a().e();
                }
                return t2;
            case 6:
                return uvl.h("bug_" + this.a + "_" + ((String) this.b));
            case 7:
                return uvl.g("bug_" + this.a + "_" + ((String) this.b));
            default:
                return ((yjs) this.b).a.d(this.a);
        }
    }

    public /* synthetic */ mso(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
