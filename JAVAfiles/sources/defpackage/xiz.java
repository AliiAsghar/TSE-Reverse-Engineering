package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xiz implements armf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ xiz(arsb arsbVar, alnu alnuVar, xii xiiVar, armf armfVar, int i) {
        this.e = i;
        this.d = arsbVar;
        this.a = alnuVar;
        this.b = xiiVar;
        this.c = armfVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        if (this.e != 0) {
            TreeSet treeSet = new TreeSet();
            aqjn.aL(this.a, treeSet);
            String obj = treeSet.toString();
            arsb arsbVar = (arsb) this.d;
            arsbVar.a = obj;
            ConversationIdType conversationIdType = (ConversationIdType) ((xii) this.b).b.get(arsbVar.a);
            if (conversationIdType == null) {
                return this.c.b();
            }
            return conversationIdType;
        }
        wye wyeVar = (wye) this.b;
        long j = wyeVar.i;
        xja xjaVar = (xja) this.a;
        xjn c = xjaVar.c(j);
        xhv b = xhv.b(wyeVar.i);
        if (b.c() && xjaVar.u.T(b)) {
            c = xja.h(c);
        }
        Object obj2 = this.d;
        return ((xhz) xjaVar.l.b()).a(c, wyeVar, (alpt) this.c, (alpt) obj2);
    }

    public /* synthetic */ xiz(xja xjaVar, wye wyeVar, alpt alptVar, alpt alptVar2, int i) {
        this.e = i;
        this.a = xjaVar;
        this.b = wyeVar;
        this.c = alptVar;
        this.d = alptVar2;
    }
}
