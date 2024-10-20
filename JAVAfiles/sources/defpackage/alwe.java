package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alwe {
    public static final alwe c = new alwa();
    public static final alwe d = new alwa();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alwe b(alwe alweVar, alwe alweVar2) {
        alwe alweVar3;
        if (alweVar == null) {
            return alweVar2;
        }
        if (alweVar2 == null) {
            return alweVar;
        }
        alwe alweVar4 = c;
        if (alweVar != alweVar4 && alweVar2 != (alweVar3 = d)) {
            if (alweVar2 != alweVar4 && alweVar != alweVar3) {
                return new alwb(alweVar, alweVar2);
            }
            return alweVar2;
        }
        return alweVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a();
}
