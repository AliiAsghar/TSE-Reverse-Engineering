package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanu extends arpw implements arqr {
    int a;
    final /* synthetic */ aanw b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aanu(aanw aanwVar, boolean z, arpe arpeVar) {
        super(1, arpeVar);
        this.b = aanwVar;
        this.c = z;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new aanu(this.b, this.c, (arpe) obj).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [arpi, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            aanw aanwVar = this.b;
            boolean z = this.c;
            this.a = 1;
            zof zofVar = (zof) aanwVar.h.b;
            obj = arro.q(zofVar.a, new jmw(zofVar, z, (arpe) null, 11), this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        aaoc.h((Context) this.b.g.a, (Uri) obj, true);
        return arnb.a;
    }
}
