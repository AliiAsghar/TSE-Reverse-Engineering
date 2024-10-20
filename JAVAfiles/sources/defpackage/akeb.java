package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class akeb extends arrm implements arqw {
    public static final akeb a = new akeb();

    public akeb() {
        super(3, akec.class, "reduceLocal", "reduceLocal(Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;Lcom/google/apps/tiktok/coroutines/flow/LocalReadState;Z)Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;", 1);
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object akemVar;
        akec akecVar = (akec) obj;
        akec akecVar2 = (akec) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        akecVar.getClass();
        akecVar2.getClass();
        if (akecVar2 instanceof akeh) {
            if (akecVar instanceof akej) {
                return new akel(null);
            }
            if (akecVar instanceof akei) {
                akemVar = new akel(((akei) akecVar).a);
            } else if (akecVar instanceof akel) {
                akemVar = new akel(((akel) akecVar).a);
            } else if (akecVar instanceof akek) {
                akemVar = new akem(((akek) akecVar).a, null);
            } else if (akecVar instanceof aken) {
                aken akenVar = (aken) akecVar;
                akemVar = new akem(akenVar.a, akenVar.b);
            } else if (akecVar instanceof akem) {
                akem akemVar2 = (akem) akecVar;
                akemVar = new akem(akemVar2.a, akemVar2.b);
            } else {
                throw new armm();
            }
        } else if (akecVar2 instanceof akeg) {
            akec akecVar3 = ((akeg) akecVar2).a;
            if (akecVar3 instanceof akdn) {
                if (booleanValue) {
                    return new akem(((akdn) akecVar3).a, null);
                }
                return new akek(((akdn) akecVar3).a);
            }
            if (akecVar3 instanceof akdm) {
                if (!(akecVar instanceof akej)) {
                    if (!(akecVar instanceof akei)) {
                        if (akecVar instanceof akel) {
                            if (booleanValue) {
                                akemVar = new akel(((akel) akecVar).a);
                            } else {
                                return new akei(new akeo(((akdm) akecVar3).a));
                            }
                        } else if (!(akecVar instanceof akek)) {
                            if (!(akecVar instanceof aken)) {
                                if (akecVar instanceof akem) {
                                    if (booleanValue) {
                                        akem akemVar3 = (akem) akecVar;
                                        akemVar = new akem(akemVar3.a, akemVar3.b);
                                    } else {
                                        return new aken(((akem) akecVar).a, new akeo(((akdm) akecVar3).a));
                                    }
                                } else {
                                    throw new armm();
                                }
                            } else {
                                throw new akep("Advanced from StaleRead to a failure with no intermediate state.");
                            }
                        } else {
                            throw new akep("Advanced from Read to a failure with no intermediate state.");
                        }
                    } else {
                        throw new akep("Advanced from Failed to another failure with no intermediate state.");
                    }
                } else {
                    throw new akep("Advanced from Idle to a failure with no intermediate state.");
                }
            } else {
                throw new armm();
            }
        } else {
            throw new armm();
        }
        return akemVar;
    }
}
