package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ijv implements tra {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ijv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.tra
    public final akul a(Object obj) {
        int i = this.b;
        int i2 = 4;
        if (i != 0) {
            int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    int i4 = 3;
                    if (i != 3) {
                        if (i != 4) {
                            int i5 = 0;
                            ancx f = akto.f(new lff((scm) obj, i5));
                            lxe lxeVar = (lxe) this.a;
                            return akul.g(andc.b(f, lxeVar.a).d(akto.g(new lfg(i5)), lxeVar.a).l());
                        }
                        kws kwsVar = (kws) this.a;
                        scm scmVar = (scm) obj;
                        if (!kwsVar.g.get()) {
                            int i6 = alog.d;
                            return aktp.ag(alsx.a);
                        }
                        return akul.g(andc.b(akto.f(new lff(scmVar, i3)), kwsVar.a).d(akto.g(new lfg(i3)), kwsVar.a).l());
                    }
                    return aktp.ai(new kva((tay) obj, i4), ((kws) this.a).b);
                }
                return aktp.ai(akto.k(new gvk((sne) obj, 11)), ((tby) this.a).l);
            }
            return aktp.ai(new gvk((sxx) obj, 7), ((ijw) this.a).c);
        }
        Object obj2 = this.a;
        return aktp.ai(new haw(obj2, (sbe) obj, i2), ((ijw) obj2).c);
    }
}
