package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vep implements vfc {
    public final long a;
    public final Optional b;
    public final Callable c;
    public final wpp d;
    private final akul e;
    private final vgp f;
    private final anen g;
    private String h = "";
    private long i = 0;

    public vep(wpp wppVar, anen anenVar, long j, Optional optional, Callable callable, akul akulVar, vgp vgpVar) {
        this.d = wppVar;
        this.b = optional;
        this.a = j;
        this.c = callable;
        this.e = akulVar;
        this.f = vgpVar;
        this.g = anenVar;
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.i;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        return this.f;
    }

    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        this.h = aqgbVar.c;
        return this.e.i(new vbl(this, aqgbVar, 20, null), this.g);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        return veoVar.c().z().b((aqeq) apbtVar);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqer aqerVar = (aqer) apbtVar;
        if (aqerVar != null) {
            aqgc aqgcVar = aqerVar.c;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.i = j;
        return albo.bI(aqerVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "RegisterRefreshRpcHandler";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.h;
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void h(Throwable th) {
        vht.c(this);
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void i() {
        vht.a(this);
    }

    @Override // defpackage.vgq
    public final /* synthetic */ void j() {
        vht.b(this);
    }
}
