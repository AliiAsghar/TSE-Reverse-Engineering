package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class krf implements akjz {
    final /* synthetic */ krg a;

    public krf(krg krgVar) {
        this.a = krgVar;
    }

    @Override // defpackage.akjz
    public final akjy a(String str) {
        ajwt ajwtVar = (ajwt) this.a.b.b.b();
        ahiy ahiyVar = (ahiy) this.a.a.tE.b();
        krv krvVar = this.a.a;
        krvVar.QC();
        krx krxVar = krvVar.a;
        ahlp QI = krvVar.QI();
        akka akkaVar = (akka) krxVar.bT.b();
        krg krgVar = this.a;
        apya apyaVar = krgVar.b.c;
        Executor executor = (Executor) krgVar.a.m.b();
        krv.OE();
        return new akjy(ajwtVar, ahiyVar, QI, akkaVar, apyaVar, executor, str);
    }
}
