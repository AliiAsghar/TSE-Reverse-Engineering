package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class pwf implements pwe {
    private final /* synthetic */ int a;

    public /* synthetic */ pwf(int i) {
        this.a = i;
    }

    @Override // defpackage.pwe
    public final qhl a(qgj qgjVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    qgjVar.getClass();
                    return qhl.b;
                }
                qgjVar.getClass();
                String str = qgjVar.f;
                str.getClass();
                if (str.length() != 0) {
                    String str2 = qgjVar.f;
                    str2.getClass();
                    qei qeiVar = qgjVar.i;
                    if (qeiVar == null) {
                        qeiVar = qei.a;
                    }
                    qeiVar.getClass();
                    return new qhm(str2, qeiVar);
                }
                throw new IllegalStateException("Can't create a group recovery strategy if conversation id is empty.");
            }
            qgjVar.getClass();
            qei qeiVar2 = qgjVar.i;
            if (qeiVar2 == null) {
                qeiVar2 = qei.a;
            }
            String str3 = qeiVar2.d;
            str3.getClass();
            if (str3.length() != 0) {
                qei qeiVar3 = qgjVar.i;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                qeiVar3.getClass();
                return new qhp(qeiVar3);
            }
            throw new IllegalStateException("Can't create a refresh registration recovery strategy if sender's id is empty.");
        }
        qgjVar.getClass();
        qei qeiVar4 = qgjVar.h;
        if (qeiVar4 == null) {
            qeiVar4 = qei.a;
        }
        qeiVar4.getClass();
        return new qhe(qeiVar4);
    }
}
