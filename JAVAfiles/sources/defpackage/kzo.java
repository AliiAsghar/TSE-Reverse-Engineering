package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzo implements ncq {
    public final armf a;
    public final armf b;
    public final armf c;
    public final alhr d;
    private final arwe e;

    public kzo(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.e = arweVar;
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        alhr D = albo.D(new ezp(this, 16));
        D.getClass();
        this.d = D;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        yga a = ((ncq) this.d.get()).a(ncpVar);
        a.getClass();
        return a;
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul c;
        c = qjh.c(this.e, arpj.a, arwf.a, new kbl(this, (arpe) null, 18));
        return c;
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final Integer[] d() {
        List l = ((yjy) this.a.b()).l();
        Integer[] numArr = new Integer[l.size()];
        int size = l.size();
        for (int i = 0; i < size; i++) {
            numArr[i] = Integer.valueOf(((ykb) l.get(i)).a());
        }
        return numArr;
    }
}
