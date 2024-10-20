package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akjw implements ancs {
    final /* synthetic */ akjy a;
    final /* synthetic */ aozb b;
    final /* synthetic */ ahtt c;

    public akjw(akjy akjyVar, aozb aozbVar, ahtt ahttVar) {
        this.a = akjyVar;
        this.b = aozbVar;
        this.c = ahttVar;
    }

    @Override // defpackage.ancs
    public final /* bridge */ /* synthetic */ ListenableFuture a(Object obj) {
        akjy akjyVar = this.a;
        return akjyVar.c(this.b, (ajwt) obj, akjyVar.a, this.c);
    }
}
