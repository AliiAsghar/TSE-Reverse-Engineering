package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class arxu extends arrm implements arqw {
    public static final arxu a = new arxu();

    public arxu() {
        super(3, arxw.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        arwu u;
        arxw arxwVar = (arxw) obj;
        asgj asgjVar = (asgj) obj2;
        while (true) {
            Object G = arxwVar.G();
            if (!(G instanceof arxi)) {
                if (!(G instanceof arvx)) {
                    G = arxx.b(G);
                }
                asgjVar.d = G;
            } else if (arxwVar.C(G) >= 0) {
                u = arwi.u(arxwVar, true, new arxt(arxwVar, asgjVar));
                asgjVar.c = u;
                break;
            }
        }
        return arnb.a;
    }
}
