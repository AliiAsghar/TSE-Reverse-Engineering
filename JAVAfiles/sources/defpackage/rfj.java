package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ReplaceSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rfj implements armf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rfj(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [msh, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        Object b;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                int i2 = ahpl.c;
                                if (((Boolean) this.a.b()).booleanValue()) {
                                    b = this.b.get();
                                } else {
                                    b = this.c.b();
                                }
                                return (ahoz) b;
                            }
                            ((AtomicBoolean) this.c).set(true);
                            return tqc.b(((xja) this.a).u.T((xhv) this.b));
                        }
                        return ((msk) ((xja) this.a).y.b()).t((String) this.c, ((wye) this.b).q);
                    }
                    wyh wyhVar = (wyh) this.a;
                    long j = wyhVar.i;
                    xja xjaVar = (xja) this.c;
                    xjn c = xjaVar.c(j);
                    xhv b2 = xhv.b(wyhVar.i);
                    if (b2.c() && xjaVar.u.T(b2)) {
                        c = xja.h(c);
                    }
                    return ((xhz) xjaVar.l.b()).c(c, this.b, wyhVar.m, new xhv(wyhVar.i), true);
                }
                vsb vsbVar = (vsb) this.a;
                xhz xhzVar = (xhz) vsbVar.a.b();
                xhv xhvVar = new xhv();
                boolean z = !((nwo) vsbVar.b.b()).a();
                Object obj = this.b;
                vsj vsjVar = (vsj) this.c;
                return xhzVar.f(null, (ParticipantsTable.BindData) obj, xhvVar, z, vsjVar.s, vsjVar.u);
            }
            muu muuVar = (muu) this.a;
            return Optional.of(new lfl((arwe) ((kru) ((qdq) muuVar.f.b()).a).a.dP.b(), muuVar, (ifs) this.b, (alor) this.c));
        }
        return new ruu(((xhz) ((ReplaceSmsMessageAction) this.a).h.b()).b(this.b, ((ParticipantsTable.BindData) this.c).p(), !((nwo) r0.i.b()).a())).a();
    }

    public /* synthetic */ rfj(xja xjaVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = xjaVar;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ rfj(xja xjaVar, wyh wyhVar, msh mshVar, int i) {
        this.d = i;
        this.c = xjaVar;
        this.a = wyhVar;
        this.b = mshVar;
    }
}
