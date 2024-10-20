package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mrm implements alhr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mrm(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [agnw, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.d) {
            case 0:
                String ap = d.ap(albo.ag(this.c.m()));
                if (!msx.g(ap) && !msx.i(ap)) {
                    int i = this.a;
                    mrq mrqVar = (mrq) this.b;
                    return ((yjr) mrqVar.g.b()).o(((msx) mrqVar.e.b()).d(ap), ((yjs) mrqVar.h.b()).b(i));
                }
                return ap;
            case 1:
                String ap2 = d.ap(albo.ag(this.c.m()));
                if (!msx.g(ap2) && !msx.i(ap2)) {
                    int i2 = this.a;
                    mrk mrkVar = (mrk) this.b;
                    return ((yjr) mrkVar.g.b()).o(((msx) mrkVar.e.b()).d(ap2), ((yjs) mrkVar.h.b()).b(i2));
                }
                return ap2;
            case 2:
                apwt apwtVar = ((msb) this.b).c;
                return apwtVar.b().j(this.c, this.a);
            case 3:
                return ((msq) ((msr) this.b).b.b()).t((String) this.c, this.a);
            case 4:
                return ((qqw) this.b).w((alog) this.c, this.a);
            case 5:
                qxn qxnVar = (qxn) this.b;
                qxnVar.e.d((uci) qxnVar.i.get());
                int i3 = this.a;
                ?? r2 = this.c;
                ((uci) r2).T(new ubv(r2, i3, 0), uci.m(udf.WRITE, new agni("DatabasePlugin#setVersion"), new rxm(17), r2));
                return 1;
            case 6:
                return uci.l((String) this.c, (ContentValues) this.b, this.a);
            default:
                yxx yxxVar = (yxx) this.c;
                rtz rtzVar = (rtz) yxxVar.b.b();
                sng sngVar = new sng();
                sngVar.aj("updateLatch");
                sngVar.P(this.a);
                sngVar.T(yxxVar.c.f().toEpochMilli());
                return Boolean.valueOf(rtzVar.ah((ConversationIdType) this.b, sngVar));
        }
    }

    public /* synthetic */ mrm(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
