package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgq implements akfb {
    final /* synthetic */ String a = "LINK_PREVIEW_ENABLED_PREF_DEFAULT_DATASOURCE_KEY";
    final /* synthetic */ arwe b;
    final /* synthetic */ arqr c;
    final /* synthetic */ arqr d;

    public akgq(arwe arweVar, arqr arqrVar, arqr arqrVar2) {
        this.b = arweVar;
        this.c = arqrVar;
        this.d = arqrVar2;
    }

    @Override // defpackage.akfb
    public final andc a() {
        arpj arpjVar = arpj.a;
        arwf arwfVar = arwf.a;
        return new andc(arro.E(arro.r(this.b, aktp.a(arpjVar), arwfVar, new akgp((arpe) null, this.c, 0))));
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        arpj arpjVar = arpj.a;
        arwf arwfVar = arwf.a;
        return arro.E(arro.r(this.b, aktp.a(arpjVar), arwfVar, new akgp((arpe) null, this.d, 1, (byte[]) null)));
    }

    @Override // defpackage.akfb
    public final /* synthetic */ Object c() {
        return this.a;
    }
}
