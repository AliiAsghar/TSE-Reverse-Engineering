package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qcu extends unp {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final anen b;
    public final anen c;
    public final qcb d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final xnv i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    private final ryg n;
    private final uhg o;
    private final armf p;
    private final armf q;

    public qcu(anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, qcb qcbVar, armf armfVar3, armf armfVar4, armf armfVar5, ryg rygVar, uhg uhgVar, armf armfVar6, xnv xnvVar, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        this.b = anenVar;
        this.c = anenVar2;
        this.k = armfVar;
        this.l = armfVar2;
        this.d = qcbVar;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.n = rygVar;
        this.o = uhgVar;
        this.h = armfVar6;
        this.i = xnvVar;
        this.p = armfVar7;
        this.j = armfVar8;
        this.q = armfVar9;
        this.m = armfVar10;
    }

    public static alog k(qez qezVar) {
        Stream map = Collection.EL.stream(qezVar.g).map(new qcq(2));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    public static String l(qfq qfqVar) {
        qey qeyVar;
        qez qezVar;
        int i = qfqVar.b;
        int k = qkq.k(i);
        if (k != 0) {
            int i2 = k - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    return "unknown";
                }
                if (i == 2) {
                    qezVar = (qez) qfqVar.c;
                } else {
                    qezVar = qez.b;
                }
                return qezVar.d;
            }
            if (i == 1) {
                qeyVar = (qey) qfqVar.c;
            } else {
                qeyVar = qey.c;
            }
            return qeyVar.e;
        }
        throw null;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("IncomingGroupChatNotificationRequestHandler");
    }

    @Override // defpackage.unp
    protected final /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        qfq qfqVar = (qfq) apbtVar;
        akrh e = aktp.e("IncomingGroupChatNotificationRequestHandler#processPendingWorkItemAsync");
        try {
            akrh e2 = aktp.e("IncomingGroupChatNotificationRequestHandler#ensureProvisioningEngineIsInitialized");
            try {
                akul g = akul.g(((adjc) this.q.b()).g());
                e2.b(g);
                e2.close();
                akul i = g.i(new pri(this, qfqVar, 18), this.b);
                e.b(i);
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

    @Override // defpackage.unx
    public final apca e() {
        return qfq.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "incoming_chat_api_queue";
    }

    public final ParticipantsTable.BindData j(qei qeiVar, qbs qbsVar) {
        tap g = rxn.g(qeiVar.d);
        if (qeiVar.equals(qbsVar.j)) {
            qwm e = this.n.e(qbsVar.k);
            e.getClass();
            g.S(e.e());
            g.v(((rxq) this.p.b()).h(g));
            return g.a();
        }
        g.v(((rxq) this.p.b()).h(g));
        this.o.g(g, 3);
        return g.a();
    }
}
