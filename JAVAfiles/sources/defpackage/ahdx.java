package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdx implements ahci, ahdu {
    public final anat a;
    public final List b;
    public final ahcs c;
    public final long d;
    public final boolean e;

    public ahdx(anat anatVar, List list, ahcs ahcsVar, long j, boolean z) {
        this.a = anatVar;
        this.b = list;
        this.c = ahcsVar;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.ahdu
    public final /* synthetic */ ahcw a() {
        return ahji.aF(this);
    }

    @Override // defpackage.ahdu
    public final List b() {
        return this.b;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        anas anasVar = ahji.aF(this).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        aj.f("rootVeId", anasVar.d);
        anas anasVar2 = ahji.aG(this).d;
        if (anasVar2 == null) {
            anasVar2 = anas.a;
        }
        aj.f("targetVeId", anasVar2.d);
        return aj.toString();
    }
}
