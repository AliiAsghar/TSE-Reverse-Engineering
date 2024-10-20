package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class muh implements mjf {
    private final mjf a;
    private final /* synthetic */ int b;
    private final Object c;

    public muh(Object obj, mjf mjfVar, int i) {
        this.b = i;
        this.c = obj;
        this.a = mjfVar;
    }

    @Override // defpackage.yfv
    public final /* synthetic */ akul a(Object obj) {
        int i;
        List list;
        if (this.b != 0) {
            mzi mziVar = (mzi) obj;
            if ((mziVar instanceof mzi) && ((i = mziVar.e) == 2 || i == 11 || i == 5 || i == 6 || i == 14 || i == 1)) {
                Object obj2 = this.c;
                MessageIdType c = ((BugleMessageId) mziVar.b).c();
                c.getClass();
                mvn mvnVar = (mvn) obj2;
                synchronized (mvnVar.b) {
                    list = (List) ((mvn) obj2).b.get(c);
                }
                if (list != null && !list.isEmpty()) {
                    qjh.l(mvnVar.a, null, new kca(c, list, (arpe) null, 18), 3);
                }
            }
            return this.a.a(mziVar);
        }
        mzi mziVar2 = (mzi) obj;
        if (!mziVar2.c.equals(this.c)) {
            return aktp.ag(null);
        }
        return this.a.a(mziVar2);
    }

    @Override // defpackage.mjf
    public final akul b() {
        if (this.b != 0) {
            return this.a.b();
        }
        return this.a.b();
    }
}
