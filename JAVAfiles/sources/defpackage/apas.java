package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apas {
    final /* synthetic */ apal a;
    final /* synthetic */ apak b;

    public apas(apal apalVar, apak apakVar) {
        this.a = apalVar;
        this.b = apakVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        apak a = this.a.a(((Integer) obj).intValue());
        if (a == null) {
            return this.b;
        }
        return a;
    }
}
