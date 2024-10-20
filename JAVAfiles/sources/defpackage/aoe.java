package defpackage;

import defpackage.cfq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoe extends aoo {
    final /* synthetic */ boolean a;
    final /* synthetic */ asb b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ cfq.b e;
    final /* synthetic */ cfq.c f;
    final /* synthetic */ boolean g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ long j;
    final /* synthetic */ aov k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoe(long j, boolean z, anx anxVar, asb asbVar, int i, int i2, cfq.b bVar, cfq.c cVar, boolean z2, int i3, int i4, long j2, aov aovVar) {
        super(j, z, anxVar, asbVar);
        this.a = z;
        this.b = asbVar;
        this.c = i;
        this.d = i2;
        this.e = bVar;
        this.f = cVar;
        this.g = z2;
        this.h = i3;
        this.i = i4;
        this.j = j2;
        this.k = aovVar;
    }

    @Override // defpackage.aoo
    public final aon a(int i, Object obj, Object obj2, List list, long j) {
        int i2;
        if (i == this.c - 1) {
            i2 = 0;
        } else {
            i2 = this.d;
        }
        int i3 = i2;
        return new aon(i, list, this.a, this.e, this.f, this.b.q(), this.g, this.h, this.i, i3, this.j, obj, obj2, this.k.l, j);
    }
}
