package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apu extends aqg {
    final /* synthetic */ asb a;
    final /* synthetic */ aqr b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apu(apk apkVar, asb asbVar, int i, aqr aqrVar, int i2, int i3, long j) {
        super(apkVar, asbVar, i);
        this.a = asbVar;
        this.b = aqrVar;
        this.c = i2;
        this.d = i3;
        this.e = j;
    }

    @Override // defpackage.aqg
    public final aqf a(int i, Object obj, int i2, int i3, List list, long j, int i4, int i5) {
        drk q = this.a.q();
        int i6 = this.c;
        aqr aqrVar = this.b;
        return new aqf(i, obj, i2, i3, q, i6, this.d, list, this.e, aqrVar.j, j, i4, i5);
    }
}
