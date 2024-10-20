package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prw implements akfb {
    public final String a;
    final /* synthetic */ prz b;

    public prw(prz przVar, String str) {
        this.b = przVar;
        this.a = str;
    }

    @Override // defpackage.akfb
    public final andc a() {
        akul c;
        prz przVar = this.b;
        c = qjh.c(przVar.c, arpj.a, arwf.a, new naw(przVar, this, (arpe) null, 6));
        return new andc(c);
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        akul c;
        prz przVar = this.b;
        c = qjh.c(przVar.c, arpj.a, arwf.a, new prv(przVar, this, null));
        return c;
    }

    @Override // defpackage.akfb
    public final /* bridge */ /* synthetic */ Object c() {
        return prz.a;
    }
}
