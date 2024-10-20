package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class asge extends arrm implements arqw {
    public static final asge a = new asge();

    public asge() {
        super(3, asgf.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        asgf asgfVar = (asgf) obj;
        asgj asgjVar = (asgj) obj2;
        if (asgfVar.a <= 0) {
            asgjVar.d = arnb.a;
        } else {
            atep atepVar = new atep(asgjVar, asgfVar, 1);
            asgjVar.getClass();
            arpi arpiVar = asgjVar.a;
            asgjVar.c = arwi.o(arpiVar).c(asgfVar.a, atepVar, arpiVar);
        }
        return arnb.a;
    }
}
