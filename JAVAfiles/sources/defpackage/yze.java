package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yze extends arrp implements arqg {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ zep c;
    final /* synthetic */ mkh d;
    final /* synthetic */ yyz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yze(yyz yyzVar, mkh mkhVar, boolean z, int i, zep zepVar) {
        super(0);
        this.e = yyzVar;
        this.d = mkhVar;
        this.a = z;
        this.b = i;
        this.c = zepVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r2v8, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [msh, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        yyz yyzVar = this.e;
        akrc b = ((aksr) yyzVar.c).b("StartChat#contactClicked");
        mkh mkhVar = this.d;
        try {
            alog alogVar = mkhVar.e;
            if (((alsx) alogVar).c >= 0) {
                int i = this.b;
                if (this.a) {
                    Object obj = yyzVar.k;
                    ijp.e((ijp) ((zbk) obj).b, 7, i, ((zbk) obj).a, 8);
                    ((zbk) obj).g(false);
                } else {
                    Object obj2 = yyzVar.k;
                    ijp.e((ijp) ((zbk) obj2).b, 6, i, ((zbk) obj2).a, 8);
                    ((zbk) obj2).g(false);
                }
                if (((alsx) alogVar).c > 1) {
                    alogVar.getClass();
                    ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
                    alur it = alogVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((agoe) it.next()).b);
                    }
                    if (aqjn.ak(arrayList).size() > 1) {
                        Object obj3 = yyzVar.f;
                        if (((alsx) mkhVar.e).c > 1) {
                            ((zap) obj3).c.f(mkhVar);
                            armd.i(b, null);
                            return arnb.a;
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                alogVar.getClass();
                ?? r3 = ((agoe) aqjn.X(alogVar)).b;
                ((zen) yyzVar.e).b(yzc.a(mkhVar, r3));
                if (this.c == zep.a) {
                    Object obj4 = ((zbk) yyzVar.k).d;
                    if (obj4 != null) {
                        ((mdg) obj4).b();
                    }
                    qjh.l(yyzVar.g, null, new jog(yyzVar, (msh) r3, (arpe) null, 8), 3);
                }
                armd.i(b, null);
                return arnb.a;
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(b, th);
                throw th2;
            }
        }
    }
}
